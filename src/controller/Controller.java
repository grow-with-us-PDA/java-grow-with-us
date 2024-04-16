package controller;

import com.sun.tools.javac.Main;
import model.DateModel;
import model.FarmModel;
import model.StoreModel;
import model.UserModel;
import model.WeatherModel;
import view.View;

import java.util.Date;

public class Controller {
//    public StoreController storeController = new StoreController(new StoreModel());
    public MainPageController mainPageController;
    public FarmController farmController;

    public UserModel userModel;
    public DateModel dateModel;
    public FarmModel farmModel;
    final View view;

    public Controller() {
        userModel = new UserModel();
        dateModel = new DateModel();
        farmModel = new FarmModel(userModel,dateModel);

        WeatherModel weatherModel = new WeatherModel();
        DateModel dateModel =  new DateModel();
        this.mainPageController = new MainPageController(weatherModel, dateModel);

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

