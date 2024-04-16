package view.DetailView;

import controller.Controller;



import controller.DetailController;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import model.CropModel;
import model.FarmModel;
import view.View;

public class DetailView extends JPanel {

  Controller controller;
  Plant plant = new Plant();
  RightSide rightSide;

  public DetailView(Controller controller,CropModel cropModel) {
    this.controller = controller;

    setLayout(new FlowLayout());
    this.plant = new Plant();
    this.rightSide = new RightSide(controller);


//    JTextField tf_detail = new JTextField("디테일페이지입니다.");
//    add(tf_detail);
//    add(goToMainButton);
//    add(goToStoreButton);
    add(plant, BorderLayout.WEST);
    add(rightSide, BorderLayout.EAST);
  }
}