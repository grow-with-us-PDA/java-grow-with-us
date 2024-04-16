package controller;

import model.Corn;
import model.CropModel;
import model.DateModel;
import model.FarmModel;
import model.StoreModel;
import model.WeatherModel;

import model.*;

import view.View;
public class Controller {

    public DetailController detailController;

    //  public DetailController detailController;
    DateModel dateModel = new DateModel();
    UserModel userModel = new UserModel();
    FarmModel farmModel = new FarmModel(userModel,dateModel);
    public StoreController storeController = new StoreController(new StoreModel(dateModel, userModel, farmModel));

    public MainPageController mainPageController;
    public FarmController farmController;
    View view;
    public Controller() {
        WeatherModel weatherModel = new WeatherModel();
        DateModel dateModel = new DateModel();
        UserModel userModel = new UserModel();
        FarmModel farmModel = new FarmModel(userModel, dateModel);


        this.mainPageController = new MainPageController(weatherModel, dateModel);
        this.farmController = new FarmController(farmModel);

        this.view = new View(this);

//      Corn corn = new Corn(dateModel);
      this.mainPageController = new MainPageController(weatherModel, dateModel);
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