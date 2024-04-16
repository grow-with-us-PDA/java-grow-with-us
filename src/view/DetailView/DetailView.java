package view.DetailView;

import controller.Controller;



import controller.DetailController;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;

import model.CropModel;
import model.FarmModel;
import view.View;

public class DetailView extends JPanel {

  DetailController detailController;

  Controller controller;
  Plant plant;

  RightSide rightSide;

  public DetailView(Controller controller,CropModel cropModel) throws IOException {
    this.controller = controller;

//    System.out.println(cropModel.getName());

    setLayout(new FlowLayout());
    this.plant = new Plant(cropModel);
    this.rightSide = new RightSide(controller,cropModel);


//    JTextField tf_detail = new JTextField("디테일페이지입니다.");
//    add(tf_detail);
//    add(goToMainButton);
//    add(goToStoreButton);
    add(plant, BorderLayout.WEST);
    add(rightSide, BorderLayout.EAST);
  }
}