package controller;

import model.StoreModel;
import view.View;

public class Controller {


<<<<<<< HEAD
    public DetailController detailController;
=======
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

<<<<<<< HEAD
}
=======
}
>>>>>>> 7ebefe2643b774fc6f6117c8b5c8fd49f7bd1c18
