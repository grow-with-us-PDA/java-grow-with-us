package controller;

import model.StoreModel;
import view.StoreView;

public class StoreController {
    StoreModel storeModel;

    StoreController(StoreModel storeModel){
        this.storeModel = storeModel;
        new StoreView(this);
    }
}
