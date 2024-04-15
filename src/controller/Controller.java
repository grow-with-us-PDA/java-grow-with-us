package controller;

import view.View;

public class Controller {
  public WeatherController weatherController;

  public Controller() {
    weatherController = new WeatherController();

    new View(this);
  }
}
