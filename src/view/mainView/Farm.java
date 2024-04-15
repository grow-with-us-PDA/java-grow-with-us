package view.mainView;

import controller.Controller;

import java.awt.*;
import javax.swing.*;

public class Farm extends JPanel {
  FarmField[] farmField = new FarmField[9];
  Controller controller;

  public Farm(Controller controller) {
    this.controller = controller;

    setBackground(Color.blue);
    setLayout(new GridLayout(3,3)); // 3x3 그리드 레이아웃으로 변경
    setPreferredSize(new Dimension(800, 700));

    setFarmField();
  }

  public void setFarmField(){
    for (int i = 0; i < 9; i++) {
      farmField[i] = new FarmField(controller);
      add(farmField[i]);
    }
  }

}
