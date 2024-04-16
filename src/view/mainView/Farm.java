package view.mainView;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JTextField;
import controller.Controller;

public class Farm extends JPanel {
  Controller controller;
  Farm(Controller controller) {
    this.controller = controller;
    setBackground(Color.blue);
    setPreferredSize(new Dimension(800, 600));
    setCropAtField();
  }

  public void setCropAtField(){
    System.out.println(controller.farmController.getFarm());
  }

}
