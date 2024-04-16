package controller;

import model.CropModel;
import model.FarmModel;

import java.util.HashMap;

public class FarmController {
    FarmModel farmModel;

    public FarmController(FarmModel farmModel){
        this.farmModel = farmModel;
    }

    public HashMap<Integer, CropModel> getFarm(){
        return farmModel.getFarm();
    }

    public void buyCorn(){
        farmModel.buyCorn();
    }

    public void sellCrop(int location){
        farmModel.sellCrop(location);
    }

    public CropModel getCropByLocation(int location){
        return farmModel.getCropByLocation(location);
    }

    public void updateNextDayCropStatus(){
        farmModel.updateNextDayCropStatus();
    }

    public void getCropStatus(){
        farmModel.getCropStatus();
    }


}
