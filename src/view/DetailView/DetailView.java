package view.DetailView;

import controller.DetailController;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import view.View;

public class DetailView extends JPanel {
  Plant plant = new Plant();
  RightSide rightSide = new RightSide();

  public DetailView() {
    setLayout(new FlowLayout());

    add(plant, BorderLayout.WEST);
    add(rightSide, BorderLayout.EAST);
  }
}