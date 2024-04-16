package controller;
import model.*;
import view.View;
public class Controller {
    //  public DetailController detailController;
    DateModel dateModel = new DateModel();
    UserModel userModel = new UserModel(dateModel);
    FarmModel farmModel = new FarmModel(userModel,dateModel);
    public StoreController storeController = new StoreController(new StoreModel(dateModel, userModel, farmModel));
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