package model;

public class CropInfoModel {

    public static void main(String[] args) {

    }

    String name;
    int requiredDay;
    int seedPrice;
    int sellPrice;
    String[] img;

    CropInfoModel(String name, int requiredDay, int seedPrice, int sellPrice, String[] img){
        this.name = name;
        this.requiredDay = requiredDay;
        this.seedPrice = seedPrice;
        this.sellPrice = sellPrice;
        this.img = img;
    }
}

















