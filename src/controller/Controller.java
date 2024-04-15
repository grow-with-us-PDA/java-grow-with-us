package controller;

import view.View;

public class Controller {
  public MainPageController mainPageController;

  public Controller() {
    mainPageController = new MainPageController();

    new View(this);
  }
}
