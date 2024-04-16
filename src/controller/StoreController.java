package controller;

import model.StoreModel;
//import view.StoreView.StoreView;

public class StoreController {
    StoreModel storeModel;

    public StoreController(StoreModel storeModel) {
        this.storeModel = storeModel;
    }

    // 아래에 메서드 호출
    public StoreModel.CropDetails[] getCrops() {
        return this.storeModel.getCrops();
    }

    public int getMoney(){ // userModel의 money 받아오기
        return this.storeModel.getUserModelByStoreModel().getMoney();
    }
}
