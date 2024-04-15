package view.DetailView;

import controller.Controller;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import view.View;

public class DetailView extends JPanel {



  public DetailView(Controller controller) {
    setLayout(new FlowLayout());
    Plant plant = new Plant();
    RightSide rightSide = new RightSide(controller);

    add(plant, BorderLayout.WEST);
    add(rightSide, BorderLayout.EAST);
  }
}