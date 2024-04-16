package controller;

import model.DateModel;
import model.FarmModel;
import model.StoreModel;
import model.UserModel;
import view.View;

import java.util.Date;

public class Controller {



//  public DetailController detailController;


    public StoreController storeController = new StoreController(new StoreModel());
    public WeatherController weatherController;
    public FarmController farmController;

    public UserModel userModel;
    public DateModel dateModel;
    public FarmModel farmModel;
    final View view;

    public Controller() {
        userModel = new UserModel();
        dateModel = new DateModel();
        farmModel = new FarmModel(userModel,dateModel);

        weatherController = new WeatherController();
       // detailController = new DetailController(new Corn(),new FarmModel(new UserModel(new DateModel())));
        farmController = new FarmController(farmModel);
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

