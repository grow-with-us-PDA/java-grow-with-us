package model;

import java.util.Date;

public class CropModel {

    public static void main(String[] args) {


    }

    int STAT_INCREASE = 10;
    int[] ALIVE_RANGE = {50,100};
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
    int imglevel;

    public CropModel(String name){
        this.name = name;
    }

    //물주기, 햇볕, CO2, 비료, 칭찬
    public void waterSupply(){
        this.humidity += STAT_INCREASE;
    }

    public void sunSupply(){
        this.sunshine += STAT_INCREASE;
    }

    public void co2Supply(){
        this.co2 += STAT_INCREASE;
    }

    public void fertilizedSupply(){
        this.fertilized += STAT_INCREASE;
    }

    public void plusPrice(){
        this.sellPrice += STAT_INCREASE;
    }

    //현재 상태, 가격 조회
    int getHumidity() {
        return this.humidity;
    }

    int getSunshine() {
        return this.sunshine;
    }

    int getCO2() {
        return this.co2;
    }

    int getFertilized() {
        return this.fertilized;
    }

    int getsellPrice(){
        return this.sellPrice;
    }

    // 상태이상 요소 조회 (50보다 낮을시 false 반환)
    public boolean checkbadCrop(){
        if(this.humidity < ALIVE_RANGE[0])
            return false;
        else if (this.sunshine < ALIVE_RANGE[0])
            return false;
        else if (this.co2 < ALIVE_RANGE[0])
            return false;
        else if(this.fertilized <ALIVE_RANGE[0])
            return false;

        return true;
    }





}

