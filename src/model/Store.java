package model;

import java.util.Arrays;
import java.util.Comparator;

public class Store {
    CropModel[] seed;
    DateModel dateModel;
    UserModel userModel;
    FarmModel farmModel;

    public Store(DateModel dateModel, UserModel userModel, FarmModel farmModel) {

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
    public int getMoney() {
        return userModel.getMoney();
    }

    public CropModel[] getCrops() {
        System.out.println(seed);
        return seed;
    }

    public void buyCrop(CropModel cropModel) { // 해당 crop 구매하기
        System.out.println("buy: " + cropModel);
        farmModel.buyCropByStore(cropModel);
    }
}