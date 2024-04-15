package view;

import controller.Controller;
import javax.swing.JFrame;
import view.mainView.MainView;

public class View extends JFrame {
  Controller controller;

  public View(Controller controller) {
    this.controller = controller;

    setTitle("Main Frame");

    MainView mainView = new MainView(controller);
    add(mainView);

    setSize(1133, 744);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
