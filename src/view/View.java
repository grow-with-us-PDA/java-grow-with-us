package view;

import javax.swing.JFrame;

import controller.Controller;
import controller.StoreController;
import view.StoreView.StoreView;
import view.mainView.MainView;

public class View extends JFrame {
  Controller controller;

  public View(Controller controller) {
    this.controller = controller;
    controller.storeController.plus();
    setTitle("Main Frame");

    MainView mainView = new MainView();
    add(mainView);

    setSize(1133, 744);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
