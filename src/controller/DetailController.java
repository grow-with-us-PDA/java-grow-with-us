package controller;

import model.CropModel;
import view.DetailView.DetailView;

public class DetailController {

  CropModel cropModel;
  public DetailController(CropModel cropModel) {
      this.cropModel = cropModel;

//    new DetailView(this);
  }

  // 상태조회 (이름, 습도, 햇볕, 토양, 현재 가격)
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




}
