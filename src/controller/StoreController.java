package controller;

import model.StoreModel;

import java.util.Arrays;
import java.util.Map;
//import view.StoreView.StoreView;

public class StoreController {
    StoreModel storeModel;
    StoreModel.CropDetails[] cropList;
    public StoreController(StoreModel storeModel){

        this.storeModel = storeModel;
        cropList = storeModel.getCrops();
    }

    // 아래에 메서드 호출
    public StoreModel.CropDetails[] getCropDetails() {
        return cropList;
    }

    public StoreModel.CropDetails[] getCrops() {
        return this.storeModel.getCrops();
    }

    public int getMoney(){ // userModel의 money 받아오기
        return this.storeModel.getUserModelByStoreModel().getMoney();
    }

    public String getFarmNameAndCount(){
        return this.storeModel.getFarmNameAndCount();
    }

    public void test(int selectedSeedIndex){
        System.out.println("test" + selectedSeedIndex);
    }

    public boolean buyCropBySeedIndex(int seedIndex){
        return this.storeModel.buyCropBySeedIndex(seedIndex);
    }
}
