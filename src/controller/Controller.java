package controller;

import model.StoreModel;
import view.View;

public class Controller {


//  public DetailController detailController;

    public StoreController storeController = new StoreController(new StoreModel());
    public WeatherController weatherController;
    final View view;

    public Controller() {
        this.view = new View(this);
        weatherController = new WeatherController();
       // detailController = new DetailController(new Corn(),new FarmModel(new UserModel(new DateModel())));
    }

    public void goToStorePage() {
        view.showStoreView();
    }

    public void goToMainPage() {
        view.showMainView();
    }
    public void goToDetailPage() {
        view.showDetailView();
    }

}
