package controller;

import model.StoreModel;
import view.StoreView.StoreView;

public class StoreController {
    StoreModel storeModel;

    public StoreController(StoreModel storeModel){
        this.storeModel = storeModel;
        new StoreView(this);
    }

    public void plus() {
    }

    // 아래에 메서드 호출
}
