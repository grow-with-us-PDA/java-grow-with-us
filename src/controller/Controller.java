package controller;

import model.StoreModel;
import view.View;

public class Controller {
    public StoreController storeController = new StoreController(new StoreModel());
    final View view;

    public Controller(){
        this.view = new View(this);
    }

    public void goToStorePage() {
        view.showStoreView();
    }

    public void goToMainPage() {
        view.showMainView();
    }

}
