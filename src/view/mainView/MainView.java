package view.mainView;

import controller.Controller;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JPanel;

public class MainView extends JPanel {


  public MainView(Controller controller) {
    Farm farm = new Farm();
    RightSide rightSide = new RightSide(controller);

    setLayout(new FlowLayout());

    add(farm, BorderLayout.WEST);
    add(rightSide, BorderLayout.EAST);
  }
}
