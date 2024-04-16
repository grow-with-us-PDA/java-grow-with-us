package controller;

import model.StoreModel;

import java.util.Arrays;
//import view.StoreView.StoreView;

public class StoreController {
    StoreModel storeModel;
    StoreModel.CropDetails[] cropList;
    public StoreController(StoreModel storeModel){
        this.storeModel = storeModel;
        cropList = storeModel.getCrops();
        for (int i =0 ; i<cropList.length;i++){
            System.out.println(cropList[i].name);
        }
    }

    // 아래에 메서드 호출
    public StoreModel.CropDetails[] getCropDetails(){
        return cropList;
    }
}
