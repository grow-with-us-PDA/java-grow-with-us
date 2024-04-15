package view.mainView;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import view.View;

public class MainView extends JPanel {
  Farm farm = new Farm();
  public MainView() {
    setLayout(new FlowLayout());

    add(farm);
  }
}
