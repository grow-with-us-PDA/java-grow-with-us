package view.mainView;

import controller.Controller;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import view.View;

public class MainView extends JPanel {


  public MainView(Controller controller) {
    Farm farm = new Farm(controller);
    RightSide rightSide = new RightSide(controller);

    setLayout(new FlowLayout());

    add(farm, BorderLayout.WEST);
    add(rightSide, BorderLayout.EAST);
  }
}
