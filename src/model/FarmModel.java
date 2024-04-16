package model;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;

public class FarmModel {
    HashMap<Integer, CropModel> farm;
    UserModel userModel;
    public DateModel dateModel;


    public FarmModel(UserModel userModel, DateModel dateModel) {
        farm = new HashMap<>();
        this.userModel = userModel;
        this.dateModel = dateModel;
        System.out.println("farm 초기화");
    }

    public void setCropAtFarm(int location, CropModel crop) { // location(0~8)에 crop 심기
        if (farm.containsKey(location)) {
            System.out.println("이미 작물이 있습니다.");
        } else {
            System.out.println("위치 " + location + "에 작물 심기 완료");
            farm.put(location, crop);
        }
    }

    public boolean setCropAutoAtFarm(CropModel cropModel) { // 자동으로 남은 곳에 crop 심기
        for (int i = 0; i < 9; i++) {
            if (!farm.containsKey(i)) {
                System.out.println("위치 " + i + "에 작물 심기 완료");
                farm.put(i, cropModel);
                return true; // 작물을 한 번만 심도록 하기 위해 리턴
            }
        }
        System.out.println("더 이상 심을 곳이 없습니다.");
        return false;
    }

    public void removeCropAtFarm(int location) { // 해당 location에 crop 삭제
        if (farm.containsKey(location)) {
            System.out.println("위치 " + location + "에 작물 삭제 완료");
            farm.remove(location);
        } else {
            System.out.println("해당 작물이 없습니다.");
        }
    }

    public boolean getCanSeed() {
        if(this.farm.size() == 9){
            return false;
        }
        return true;
    }

    public void buyCorn() { // corn 사기 -> 나중에 그냥 crop 사기로 바꾸기
        Corn corn = new Corn(this.dateModel);
        boolean isSetMoney = this.userModel.setMoney(-corn.seedPrice);
        if (isSetMoney) {
            setCropAutoAtFarm(corn);
        } else {
            System.out.println("돈 없어서 작물 심기 실패");
        }
    }

    public boolean buyCropByStore(CropModel cropModel) {
        boolean canSeed = getCanSeed();
        if(!canSeed){
            return false;
        }
        boolean isSetMoney = this.userModel.setMoney(-cropModel.seedPrice);
        if (isSetMoney) {
            boolean canCropAutoAtFarm = setCropAutoAtFarm(cropModel);
            if (canCropAutoAtFarm) {
                return true;
            }
            return false;
        } else {
            System.out.println("돈 없어서 작물 심기 실패");
            return false;
        }
    }

    public void sellCrop(int location) { // location에 있는 작물 팔기
        CropModel crop = farm.get(location);
        removeCropAtFarm(location);
        this.userModel.setMoney(crop.sellPrice);
    }

    public CropModel getCropByLocation(int location) { // 해당 location의 crop 가져오기
        return this.farm.get(location);
    }

    public void updateNextDayCropStatus() { // 다음날 crop status update
        for (HashMap.Entry<Integer, CropModel> entry : farm.entrySet()) {
            int location = entry.getKey();
            CropModel crop = entry.getValue();
            System.out.println("Location: " + location + ", Name: " + crop.getName());
            crop.updateNextDayCo2();
            crop.updateNextDayFertilized();
            crop.updateNextDayHumidity();
            crop.updateNextDaySunshine();
        }
    }

    public void getCropStatus() { // 현재 crop 상태 출력
        for (HashMap.Entry<Integer, CropModel> entry : farm.entrySet()) {
            int location = entry.getKey();
            CropModel crop = entry.getValue();
            System.out.println("Location: " + location);
            System.out.println("Name: " + crop.getName());
            System.out.println("Humidity: " + crop.getHumidity());
            System.out.println("Fertilized: " + crop.getFertilized());
            System.out.println("Sunshine: " + crop.getSunshine());
            System.out.println("CO2: " + crop.getCO2());
        }
    }


    public HashMap<Integer, CropModel> getFarm() { // 현재 farm 상태 반환
        return this.farm;
    }

    public static <K, V> K getKeyFromValue(HashMap<K, V> map, V value) {
        for (HashMap.Entry<K, V> entry : map.entrySet()) {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
}
