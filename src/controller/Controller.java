package controller;

import model.StoreModel;
import view.View;

public class Controller {


//  public DetailController detailController;

    public StoreController storeController = new StoreController(new StoreModel());
    public MainPageController mainPageController;
    View view;

    public Controller() {
      this.view = new View(this);
      this.mainPageController = new MainPageController();
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