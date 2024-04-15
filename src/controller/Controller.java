package controller;

import model.StoreModel;
import view.View;

public class Controller {

    public StoreController storeController = new StoreController(new StoreModel());

    public Controller(){
        new View(this);
    }

    int plus(){
        return 1;
    }
}
