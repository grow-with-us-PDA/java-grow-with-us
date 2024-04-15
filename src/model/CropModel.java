package model;

import java.util.Date;

public class CropModel {

    public static void main(String[] args) {

    }


}

class Crop{
    String name;
    int humidity = 100;
    int sunshine = 100;
    int co2 = 100;
    int fertilized = 100;
    boolean isFullyGrowed = false;
    int sellPrice;
    Date startDate;
    Date endDate;
    boolean[] todayDone;

    Crop(String name){
        this.name = name;
    }



}


