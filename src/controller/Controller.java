package controller;

import model.Corn;
import model.CropModel;
import model.DateModel;
import model.FarmModel;
import model.StoreModel;
import model.WeatherModel;


import com.sun.tools.javac.Main;

import model.*;

import view.View;

import java.util.Date;

public class Controller {

    public DetailController detailController;

    public StoreController storeController;
    public FarmController farmController;
    public MainPageController mainPageController;
    final View view;


    public Controller() {
        WeatherModel weatherModel = new WeatherModel();
        UserModel userModel = new UserModel("");
        DateModel dateModel = new DateModel();
        FarmModel farmModel = new FarmModel(userModel,dateModel, this);
        StoreModel storeModel = new StoreModel(dateModel, userModel,farmModel, this);


        this.detailController= new DetailController(this);
        farmController = new FarmController(farmModel);
        mainPageController = new MainPageController(weatherModel,dateModel);
        storeController = new StoreController(storeModel);
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