package view;

import controller.Controller;
import javax.swing.JFrame;
import view.mainView.MainView;
import view.DetailView.DetailView;
import controller.DetailController;

public class View extends JFrame {
  Controller controller;

  public View(Controller controller) {
    this.controller = controller;

    setTitle("Main Frame");

    MainView mainView = new MainView(controller);
    add(mainView);

//    DetailView detailView=new DetailView();
//    add(detailView);

    setSize(1133, 744);
    setResizable(false);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
