package controller;

import java.io.IOException;
import model.CropModel;
import model.FarmModel;
import view.DetailView.DetailView;

public class DetailController {

  private CropModel cropModel;
  private FarmModel farmModel;
  private int location;
  Controller controller;

  public DetailView detailView;

  public DetailController(Controller controller) {
    this.controller = controller;
    //new DetailView(this.controller);
  }

  public void makeDetailView(CropModel cropModel) throws IOException {
//    this.farmModel = farmModel;
//    this.location = location;
//    this.cropModel = this.farmModel.getCropByLocation(location);
//    // num으로 객체 찾고

   this.detailView = new DetailView(controller,cropModel);

  }



  // 상태조회 (이미지,이름, 습도, 햇볕, 토양, 현재 가격)
  public String getLevelImg() {
    return cropModel.levelimg();
  }

  public String getName() {
    return cropModel.getName();
  }

  public int getHumidity() {
    return cropModel.getHumidity();
  }

  public int getCO2() {
    return cropModel.getCO2();
  }

  public int getFertilized() {
    return cropModel.getFertilized();
  }

  public int getSellPrice() {
    return cropModel.getSellPrice();
  }

  // 행위가 필요한지 체크
  public boolean checkWater() {
    return cropModel.checkWater();
  }

  public boolean checkSunshine() {
    return cropModel.checkSunshine();
  }

  public boolean checkCO2() {
    return cropModel.checkCO2();
  }

  public boolean checkFertilized() {
    return cropModel.checkFertilized();
  }

  // 행위 (물주기, 햇볕쬐기, CO2 공급, 비료 공급, 칭찬하기)
  public void waterSupply() {
    cropModel.waterSupply();
  }

  public void sunSupply() {
    cropModel.sunSupply();
  }

  public void CO2Supply() {
    cropModel.CO2Supply();
  }

  public void fertilizedSupply() {
    cropModel.fertilizedSupply();
  }

  public void plusPrice() {
    cropModel.plusPrice();
  }

  // 팔기버튼 누르면
  public void sellCrop() {
    farmModel.sellCrop(location);
  }

  public void getTodayDone(){
    cropModel.getTodayDone();
  }


}
