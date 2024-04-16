package controller;

import model.*;
import view.View;

import java.util.Date;

public class Controller {

    DateModel dateModel;
    UserModel userModel;

    FarmModel farmModel;


//  public DetailController detailController;

    public StoreController storeController = new StoreController(new Store(dateModel, userModel, farmModel));
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

//    detailController=new DetailController();
//
//    new View(this);

}
