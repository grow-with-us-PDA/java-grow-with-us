package controller;

import view.View;

public class Controller {
  public WeatherController weatherController;
  public DetailController detailController;

  public Controller() {
    weatherController = new WeatherController();

    detailController=new DetailController();

    new View(this);
  }
}
