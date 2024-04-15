package view;

import javax.swing.JFrame;
import view.mainView.MainView;
import view.DetailView.DetailView;
import controller.DetailController;

public class View extends JFrame {
  public View() {
    setTitle("Main Frame");

    MainView mainView = new MainView();
//    add(mainView);

    DetailController detailController=new DetailController();
    DetailView detailView=new DetailView();
    add(detailView);

    setSize(1133, 744);
    setResizable(false);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
