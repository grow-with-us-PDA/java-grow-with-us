package model;

public class CropInfoModel {
    public static void main(String[] args) {



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



class CropInfo{
    String name;
    int requiredDay;
    int seedPrice;
    int sellPrice;
    String[] img;

    CropInfo(String name, int seedPrice, int sellPrice){
        this.name = name;
        this.seedPrice = seedPrice;
        this.sellPrice = sellPrice;
        this.img = img;
    }
}

class Corn extends CropInfo{

    Corn() {
        super("옥수수", 100, 150);
    }
}

class Tomato extends CropInfo{

    Tomato() {
        super("토마토", 200, 300);
    }
}

class Strawberry extends CropInfo{
    Strawberry(){
        super("딸기", 500, 750);
    }
}

class Basil extends CropInfo{
    Basil(){
        super("바질", 50, 75);
    }
}

class Lettuce extends CropInfo{
    Lettuce(){
        super("상추", 80, 120);
    }
}

class Broccoli extends CropInfo{
    Broccoli(){
        super("브로콜리", 120, 180);
    }
}

class Apple extends CropInfo{
    Apple(){
        super("사과", 150, 225);
    }
}

class Pear extends CropInfo{
    Pear(){
        super("배", 180, 270);
    }
}

class Rice extends CropInfo{
    Rice(){
        super("쌀", 30, 45);
    }
}




