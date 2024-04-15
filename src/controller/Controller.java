package controller;

import view.View;

public class Controller {
  public WeatherController weatherController;
  public FarmController farmController;

  public Controller() {
    weatherController = new WeatherController();
    farmController = new FarmController();
    
    new View(this);
  }
}
