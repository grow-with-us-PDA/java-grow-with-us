package model;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Store {
    CropModel[] seed;
    DateModel dateModel;
    UserModel userModel;
    FarmModel farmModel;

    public Store(DateModel dateModel, UserModel userModel, FarmModel farmModel){

        this.userModel = userModel;
        this.dateModel = dateModel;
        this.farmModel = farmModel;

        seed = new CropModel[]{
                new Corn(dateModel),
                new Tomato(dateModel),
                new Strawberry(dateModel),
                new Basil(dateModel),
                new Lettuce(dateModel),
                new Broccoli(dateModel),
                new Apple(dateModel),
                new Pear(dateModel),
                new Rice(dateModel)
        };
        Arrays.sort(seed, Comparator.comparingInt(crop -> crop.seedPrice));


    }

    // 유저 보유자산 조회
    public int getMoney(){return userModel.getMoney();}
    public HashMap<Integer, CropModel> getFarm(){return farmModel.getFarm();}

    // 작물 배열 반환 (이름, 씨앗가격, 씨앗이미지, 살 수 있는지 여부)
    public CropDetails[] getCrops() {
        CropDetails[] cropDetailsArray = new CropDetails[seed.length];
        int userMoney = getMoney();
        for (int i = 0; i < seed.length; i++) {
            CropModel crop = seed[i];
            CropDetails cropDetails = new CropDetails();
            cropDetails.name = crop.name;
            cropDetails.seedPrice = crop.seedPrice;
            cropDetails.image = crop.img[0];
            if(crop.seedPrice > userMoney){
                cropDetails.money = false;
            }else{
                cropDetails.money = true;
            }
            cropDetailsArray[i] = cropDetails;
        }


        return cropDetailsArray;
    }

    public class CropDetails {
        public String name;
        public int seedPrice;
        public String image;
        public boolean money;
    }

    // 현재 내가 가지고 있는 작물 이름과 갯수

        public Map<String, Integer> calculateFarmNameAndCount() {
            farmModel.buyCorn();
            farmModel.buyCorn();
            HashMap<Integer, CropModel> farm = getFarm();
            Map<String, Integer> nameAndCountMap = new HashMap<>();
            // Farm에 있는 각 CropModel을 순회하며 이름과 갯수를 계산합니다.
            for (CropModel crop : farm.values()) {
                String cropName = crop.name;
                // 맵에 이미 같은 이름의 작물이 있는지 확인하고, 없으면 1을 넣고 있으면 기존 값에서 1을 더합니다.
                nameAndCountMap.put(cropName, nameAndCountMap.getOrDefault(cropName, 0) + 1);
            }

            return nameAndCountMap;
        }





}