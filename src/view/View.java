package view;

import javax.swing.JFrame;
import view.mainView.MainView;

public class View extends JFrame {
  public View() {
    setTitle("Main Frame");

    MainView mainView = new MainView();
    add(mainView);

    setSize(1133, 744);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
