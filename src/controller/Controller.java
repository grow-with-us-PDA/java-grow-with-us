package controller;

import model.DateModel;
import model.StoreModel;
import model.WeatherModel;
import view.View;

public class Controller {
//  public DetailController detailController;

    public StoreController storeController = new StoreController(new StoreModel());
    public MainPageController mainPageController;
    View view;

    public Controller() {
      this.view = new View(this);

      WeatherModel weatherModel = new WeatherModel();
      DateModel dateModel =  new DateModel();
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