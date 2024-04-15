package controller;

import model.CropModel;
import model.FarmModel;
import view.DetailView.DetailView;

public class DetailController {

  CropModel cropModel;
  FarmModel farmModel;
    private int location;

    public DetailController(CropModel cropModel, FarmModel farmModel) {
      this.cropModel = cropModel;
      this.farmModel = farmModel;

//    new DetailView(this);
  }

  // 상태조회 (이미지,이름, 습도, 햇볕, 토양, 현재 가격)
    public String getlevelimg(){return cropModel.levelimg();}
    public String getName(){return cropModel.getName();}
    public int getHumidity(){return cropModel.getHumidity();}
    public int getCO2(){return cropModel.getCO2();}
    public int getFertilized(){return cropModel.getFertilized();}
    public int getsellPrice(){return cropModel.getsellPrice();}

    // 행위가 필요한지 체크
    public boolean checkWater(){return cropModel.checkWater();}
    public boolean checkSunshine(){return cropModel.checkSunshine();}
    public boolean checkCO2(){return cropModel.checkCO2();}
    public boolean checkFetilized(){return cropModel.checkFetilized();}


    // 행위 (물주기, 햇볕쬐기, CO2 공급, 비료 공급, 칭찬하기)
    public void waterSupply(){
        cropModel.waterSupply();
    }

    public void sunSupply(){
      cropModel.sunSupply();
    }

    public void CO2Supply(){
      cropModel.CO2Supply();
    }

    public void fetilizedSupply(){
      cropModel.checkFetilized();
    }

    public void plusPrice(){
      cropModel.plusPrice();
    }

    //팔기버튼 누르면
    public void sellCrop(){
      farmModel.sellCrop(location);
    }






}
