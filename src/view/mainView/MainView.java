package view.mainView;

import controller.Controller;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainView extends JPanel {
  public MainView(Controller controller) {
    Farm farm = new Farm();
    RightSide rightSide = new RightSide(controller, this);

    setLayout(new FlowLayout());

    add(farm, BorderLayout.WEST);
    add(rightSide, BorderLayout.EAST);
    };
  }

