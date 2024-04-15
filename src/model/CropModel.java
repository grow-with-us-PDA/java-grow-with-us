package model;

import java.time.Period;
import java.util.Date;

public class CropModel {

    DateModel dateModel;

    public static void main(String[] args) {
        DateModel dateModel = new DateModel();

    }

    int STAT_INCREASE = 10;
    int[] ALIVE_RANGE = {50,100};

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


    CropModel(String name, int requiredDay, int seedPrice, int sellPrice, String[] img){
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

class Corn extends CropModel{

    Corn(){
        super("옥수수",90, 100, 150, new String[] {
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fpng.pngtree.com%2Fpng-vector%2F20190129%2Fourlarge%2Fpngtree-cartoon-seed-commercial-element-solar-termsgerminationcartoon-sproutgrowingchinese-png-image_568239.jpg&type=a340",
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fpng.pngtree.com%2Fpng-clipart%2F20190118%2Fourlarge%2Fpngtree-small-bud-seedling-seed-germination-soil-illustration-png-image_455292.jpg&type=sc960_832",
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fus.123rf.com%2F450wm%2Fvirinka%2Fvirinka1306%2Fvirinka130600014%2F20302520-%25EB%25A7%258C%25ED%2599%2594-%25EC%2598%25A5%25EC%2588%2598%25EC%2588%2598.jpg%3Fver%3D6&type=sc960_832"
        });
    }
}

class Tomato extends CropModel{

    Tomato() {
        super("토마토", 30, 200, 300, new String[] {
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fpng.pngtree.com%2Fpng-vector%2F20190129%2Fourlarge%2Fpngtree-cartoon-seed-commercial-element-solar-termsgerminationcartoon-sproutgrowingchinese-png-image_568239.jpg&type=a340",
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fpng.pngtree.com%2Fpng-clipart%2F20190118%2Fourlarge%2Fpngtree-small-bud-seedling-seed-germination-soil-illustration-png-image_455292.jpg&type=sc960_832",
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fus.123rf.com%2F450wm%2Fmylisa%2Fmylisa1201%2Fmylisa120100019%2F12083008-%25ED%2586%25A0%25EB%25A7%2588%25ED%2586%25A0-%25ED%259D%25B0%25EC%2583%2589-%25EB%25B0%25B0%25EA%25B2%25BD%25EC%2597%2590-%25EA%25B3%25A0%25EB%25A6%25BD%25EC%259E%2585%25EB%258B%2588%25EB%258B%25A4-%25EB%25B2%25A1%25ED%2584%25B0.jpg%3Fver%3D6&type=sc960_832"
        });
    }
}

class Strawberry extends CropModel{
    Strawberry(){
        super("딸기", 120, 500, 750, new String[] {
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fpng.pngtree.com%2Fpng-vector%2F20190129%2Fourlarge%2Fpngtree-cartoon-seed-commercial-element-solar-termsgerminationcartoon-sproutgrowingchinese-png-image_568239.jpg&type=a340",
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fpng.pngtree.com%2Fpng-clipart%2F20190118%2Fourlarge%2Fpngtree-small-bud-seedling-seed-germination-soil-illustration-png-image_455292.jpg&type=sc960_832",
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fus.123rf.com%2F450wm%2Ftikiri%2Ftikiri1501%2Ftikiri150100027%2F49894635-%25EB%25B2%25A1%25ED%2584%25B0-%25EB%2594%25B8%25EA%25B8%25B0-%25EC%25BB%25AC%25EB%25A0%2589%25EC%2585%2598.jpg%3Fver%3D6&type=sc960_832"
        });
    }
}

class Basil extends CropModel{
    Basil(){
        super("바질", 35, 50, 75, new String[] {
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fpng.pngtree.com%2Fpng-vector%2F20190129%2Fourlarge%2Fpngtree-cartoon-seed-commercial-element-solar-termsgerminationcartoon-sproutgrowingchinese-png-image_568239.jpg&type=a340",
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fpng.pngtree.com%2Fpng-clipart%2F20190118%2Fourlarge%2Fpngtree-small-bud-seedling-seed-germination-soil-illustration-png-image_455292.jpg&type=sc960_832",
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fus.123rf.com%2F450wm%2Fivanmateev%2Fivanmateev1510%2Fivanmateev151000813%2F45737946-%25EB%25B0%2594%25EC%25A7%2588.jpg%3Fver%3D6&type=sc960_832"
        });
    }
}

class Lettuce extends CropModel{
    Lettuce(){
        super("상추", 50,80, 120, new String[] {
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fpng.pngtree.com%2Fpng-vector%2F20190129%2Fourlarge%2Fpngtree-cartoon-seed-commercial-element-solar-termsgerminationcartoon-sproutgrowingchinese-png-image_568239.jpg&type=a340",
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fpng.pngtree.com%2Fpng-clipart%2F20190118%2Fourlarge%2Fpngtree-small-bud-seedling-seed-germination-soil-illustration-png-image_455292.jpg&type=sc960_832",
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fthumbs.dreamstime.com%2Fb%2Fred-lettuce-22244826.jpg&type=sc960_832"
        });
    }
}

class Broccoli extends CropModel{
    Broccoli(){
        super("브로콜리", 85,120, 180, new String[] {
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fpng.pngtree.com%2Fpng-vector%2F20190129%2Fourlarge%2Fpngtree-cartoon-seed-commercial-element-solar-termsgerminationcartoon-sproutgrowingchinese-png-image_568239.jpg&type=a340",
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fpng.pngtree.com%2Fpng-clipart%2F20190118%2Fourlarge%2Fpngtree-small-bud-seedling-seed-germination-soil-illustration-png-image_455292.jpg&type=sc960_832",
                "https://search.pstatic.net/common/?src=http%3A%2F%2Fcafefiles.naver.net%2FMjAyMDA0MjNfMjQy%2FMDAxNTg3NjIyMzU2NDA0.EJDbwLCJwOdrmxsFddCxwWcvvkwFB165K4bs2BB0Gk0g.GHZaKagPnR-qRr2UaKPp6yR-0fKHlXFXbrHJfv3ahjEg.PNG%2Fbroccoli_PNG72886.png&type=sc960_832"
        });
    }
}

class Apple extends CropModel{
    Apple(){
        super("사과", 200, 150, 225, new String[] {
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fpng.pngtree.com%2Fpng-vector%2F20190129%2Fourlarge%2Fpngtree-cartoon-seed-commercial-element-solar-termsgerminationcartoon-sproutgrowingchinese-png-image_568239.jpg&type=a340",
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fpng.pngtree.com%2Fpng-clipart%2F20190118%2Fourlarge%2Fpngtree-small-bud-seedling-seed-germination-soil-illustration-png-image_455292.jpg&type=sc960_832",
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fpng.pngtree.com%2Fpng-clipart%2F20190810%2Fourlarge%2Fpngtree-delicious-red-apples-png-image_1685447.jpg&type=sc960_832"
        });
    }
}

class Pear extends CropModel{
    Pear(){
        super("배", 200, 180, 270, new String[] {
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fpng.pngtree.com%2Fpng-vector%2F20190129%2Fourlarge%2Fpngtree-cartoon-seed-commercial-element-solar-termsgerminationcartoon-sproutgrowingchinese-png-image_568239.jpg&type=a340",
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fpng.pngtree.com%2Fpng-clipart%2F20190118%2Fourlarge%2Fpngtree-small-bud-seedling-seed-germination-soil-illustration-png-image_455292.jpg&type=sc960_832",
                "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMjEwMDVfOTcg%2FMDAxNjY0OTU3MjUyNzE4.X_4yeYOkbAEtp6qswq_c2TvwOCKZLsEjX8SLDAO0QjIg.znVnstriB9XdLh7ew5KDc8jKRicNaLiVndZP-LpTcvIg.JPEG.kvision2022%2F19587315.jpg&type=sc960_832"
        });
    }
}

class Rice extends CropModel{
    Rice(){
        super("쌀", 150, 30, 45, new String[] {
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fpng.pngtree.com%2Fpng-vector%2F20190129%2Fourlarge%2Fpngtree-cartoon-seed-commercial-element-solar-termsgerminationcartoon-sproutgrowingchinese-png-image_568239.jpg&type=a340",
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fpng.pngtree.com%2Fpng-clipart%2F20190118%2Fourlarge%2Fpngtree-small-bud-seedling-seed-germination-soil-illustration-png-image_455292.jpg&type=sc960_832",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTNKJfBKPFji49GUZUn2_xkStmMdG0p4CA3rTEgpCVJFg&s"
        });
    }
}


