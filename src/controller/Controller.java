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
    DateModel dateModel = new DateModel();
    UserModel userModel = new UserModel();
    FarmModel farmModel = new FarmModel(userModel,dateModel);
    public StoreController storeController = new StoreController(new StoreModel(dateModel, userModel, farmModel));

    public MainPageController mainPageController;
    public FarmController farmController;

    public DetailController detailController;

    View view;
    public Controller() {
        WeatherModel weatherModel = new WeatherModel();
        DateModel dateModel = new DateModel();
        UserModel userModel = new UserModel();
        FarmModel farmModel = new FarmModel(userModel, dateModel);


        this.mainPageController = new MainPageController(weatherModel, dateModel);
        this.farmController = new FarmController(farmModel);
        this.detailController=new DetailController(this);
        this.view = new View(this);

      this.mainPageController = new MainPageController(weatherModel, dateModel);
    }
    public void goToStorePage() {
        view.showStoreView();
    }
    public void goToMainPage() {
        view.showMainView();
    }
    public void goToDetailPage() {
        //view.showDetailView();
    }
}