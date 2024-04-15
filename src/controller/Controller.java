package controller;
import model.StoreModel;
import view.View;

public class Controller {


  public DetailController detailController;

    public StoreController storeController = new StoreController(new StoreModel());
    public WeatherController weatherController;
    final View view;

    public Controller() {
        this.view = new View(this);
        weatherController = new WeatherController();
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


    detailController=new DetailController();

    new View(this);


}
