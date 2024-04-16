package model;

import java.time.Period;
import java.util.Date;

public class CropModel {

    DateModel dateModel;

    public static void main(String[] args) {


    }

    int STAT_INCREASE = 10;
    int[] ALIVE_RANGE = {50,100};
    int NEXT_DAY_STAT_DECREASE = 5; // 다음날 감소하는 status 양

    String name;
    int requiredDay;
    int seedPrice; //살때 가격
    int sellPrice; //팔때 최소 가격
    String[] img;

    int humidity = 100;
    int sunshine = 100;
    int co2 = 100;
    int fertilized = 100;
    boolean isFullyGrowed = false;
    int startDate;
    int endDate = startDate + requiredDay;
    boolean isLive = true;


    // 물주기, 햇볕, CO2, 비료, 칭찬
    boolean[] todayDone = {false, false, false, false, false};
    int imglevel;


    CropModel(DateModel dateModel, String name, int requiredDay, int seedPrice, int sellPrice, String[] img){
        this.dateModel = dateModel;
        this.name = name;
        this.requiredDay = requiredDay;
        this.seedPrice = seedPrice;
        this.sellPrice = sellPrice;
        this.img = img;
    }

    // 수확까지 남은 날짜 조회
    public int getDateDiffInDays(){
        int day = dateModel.getDate();
        return endDate - day;
    }

    // 수확 날짜 계산해 imglevel 선정 후 이미지 반환
    public String levelimg(){
        int leftday = getDateDiffInDays(); // 수확까지 남은 날짜
        int liveday = requiredDay - leftday; //살아온 날짜

        if(liveday/leftday < requiredDay/3)
            return img[0];
        else if (liveday/leftday < requiredDay/3*2)
            return img[1];

        else if(liveday/leftday < requiredDay)
            return img[2];

        return img[0];

    }

    //물주기, 햇볕, CO2, 비료, 칭찬
    public void waterSupply(){
        humidity += STAT_INCREASE;
        todayDone[0] = true;
        if(humidity>ALIVE_RANGE[1]){
            isLive = false;
        }
    }

    public void sunSupply(){
        sunshine += STAT_INCREASE;
        todayDone[1] = true;
        if(sunshine>ALIVE_RANGE[1]){
            isLive = false;
        }
    }

    public void CO2Supply(){
        co2 += STAT_INCREASE;
        todayDone[2] = true;
        if(co2>ALIVE_RANGE[1]){
            isLive = false;
        }

    }

    public void fertilizedSupply(){
        fertilized += STAT_INCREASE;
        todayDone[3] = true;
        if(fertilized>ALIVE_RANGE[1]){
            isLive = false;
        }

    }

    public void plusPrice(){
        sellPrice += STAT_INCREASE;
        todayDone[4] = true;

    }

    //현재 상태, 가격 조회
    public boolean getisLive(){
        return isLive;
    }
    public int getHumidity() {
        return humidity;
    }

    public int getSunshine() {
        return sunshine;
    }

    public int getCO2() {
        return co2;
    }

    public int getFertilized() {
        return fertilized;
    }

    public int getsellPrice(){
        if(isFullyGrowed = false)
            return 0;
        return sellPrice;
    }

    public String getName(){
        return name;
    }

    public boolean getGrow(){
        return isFullyGrowed;
    }


    // 상태이상 요소 조회 (50보다 낮을시 false 반환)
    public boolean checkbadCrop(){
        if(humidity < ALIVE_RANGE[0])
            return false;
        else if (sunshine < ALIVE_RANGE[0])
            return false;
        else if (co2 < ALIVE_RANGE[0])
            return false;
        else if(fertilized <ALIVE_RANGE[0])
            return false;

        return true;
    }

    public boolean checkWater(){
        if(humidity < ALIVE_RANGE[0])
            return false;
        return true;
    }

    public boolean checkSunshine(){
        if (sunshine < ALIVE_RANGE[0])
            return false;
        return true;
    }

    public boolean checkCO2(){
        if (co2 < ALIVE_RANGE[0])
            return false;
        return true;
    }

    public boolean checkFetilized(){
        if(fertilized <ALIVE_RANGE[0])
            return false;
        return true;
    }

    // 다음날 될때 업데이트되는 값 humidity, sunshine, co2, fertilized
    public void updateNextDayHumidity(){
        this.humidity -= NEXT_DAY_STAT_DECREASE;
    }
    public void updateNextDaySunshine(){
        this.sunshine -= NEXT_DAY_STAT_DECREASE;
    }
    public void updateNextDayCo2(){
        this.co2 -= NEXT_DAY_STAT_DECREASE;
    }
    public void updateNextDayFertilized(){
        this.fertilized -= NEXT_DAY_STAT_DECREASE;
    }


}



//부모 클래스 : CropInfo
//자식 클래스 :
//  1. corn(옥수수)
//  2. tomato(토마토)
//  3. strawberry(딸기)
//  4. basil(바질)
//  5. lettuce(상추)
//  6. broccoli(브로콜리)
//  7. apple (사과)
//  8. pear(배)
//  9. rice(쌀)

