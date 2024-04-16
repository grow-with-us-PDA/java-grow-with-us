package controller;

import model.*;
import view.View;

public class Controller {
//  public DetailController detailController;

    public StoreController storeController = new StoreController(new StoreModel());
    public MainPageController mainPageController;
    public FarmController farmController;
    View view;

    public Controller() {
        WeatherModel weatherModel = new WeatherModel();
        DateModel dateModel = new DateModel();
        UserModel userModel = new UserModel(dateModel);
        FarmModel farmModel = new FarmModel(userModel, dateModel);


        this.mainPageController = new MainPageController(weatherModel, dateModel);
        this.farmController = new FarmController(farmModel);

        this.view = new View(this);
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