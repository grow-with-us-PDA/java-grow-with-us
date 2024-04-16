package view.DetailView;

import controller.Controller;



import controller.DetailController;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import view.View;

public class DetailView extends JPanel {

  final Controller controller;
  Plant plant = new Plant();

  public DetailView(Controller controller) {
    this.controller = controller;

    setLayout(new FlowLayout());
    Plant plant = new Plant();
    RightSide rightSide = new RightSide(controller);

    JButton goToMainButton = new JButton("메인페이지로");
    JButton goToStoreButton = new JButton("상점페이지로");
    ActionListener buttonActionListener = new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        if (e.getSource() == goToStoreButton) {
          controller.goToStorePage();
        } else if (e.getSource() == goToMainButton) {
          controller.goToMainPage();
        }
      }
    };
    goToMainButton.addActionListener(buttonActionListener);
    goToStoreButton.addActionListener(buttonActionListener);

//    JTextField tf_detail = new JTextField("디테일페이지입니다.");
//    add(tf_detail);
//    add(goToMainButton);
//    add(goToStoreButton);
    add(plant, BorderLayout.WEST);
    add(rightSide, BorderLayout.EAST);
  }
}