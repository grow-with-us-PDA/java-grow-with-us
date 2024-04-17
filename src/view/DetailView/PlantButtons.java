package view.DetailView;

import controller.DetailController;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import controller.Controller;
import javax.swing.border.EmptyBorder;
import model.CropModel;

public class PlantButtons extends JPanel implements ActionListener {
  String[] texts = new String[]{"물 주기(습도)", "햇볕 쬐기(햇볕)", "CO2 공급", "비료 주기(토양)", "칭찬하기"};
  JButton[] buttons = new JButton[texts.length];
  CropModel cropModel;
  PlantInfo plantInfo;
  DetailController detailController;

  PlantButtons(Controller controller, CropModel cropModel, PlantInfo plantInfo) {
    this.detailController=controller.detailController;
    this.cropModel=cropModel;
    this.plantInfo=plantInfo;
    setPreferredSize(new Dimension(30, 10));
    setLayout(new FlowLayout());
    for (int i = 0 ; i < texts.length ; i++) {
      buttons[i] = new JButton(texts[i]);


      buttons[i].setPreferredSize(new Dimension(283, 55));
      buttons[i].setFont(new Font("돋음", Font.PLAIN, 16));
      if(detailController.getTodayDone()[i]){
        buttons[i].setEnabled(false);
      }
      if(i==0){
        if(!detailController.checkWater()){
          buttons[i].setForeground(Color.RED);
        }

      }
      else if(i==1){
        if(!detailController.checkSunshine()){
          buttons[i].setForeground(Color.RED);
        }

      }
      else if(i==2){
        if(!detailController.checkCO2()){
          buttons[i].setForeground(Color.RED);
        }

      }
      else if(i==3){
        if(!detailController.checkFertilized()){
          buttons[i].setForeground(Color.RED);
        }

      }

      buttons[i].addActionListener(this);
      add(buttons[i]);
    }
  }


  @Override
  public void actionPerformed(ActionEvent e) {
    for (int i = 0 ; i < texts.length ; i++) {
      if (e.getSource() == buttons[i]) {

        if(i==0){
          detailController.waterSupply();

        }
        else if(i==1){
          detailController.sunSupply();
        }
        else if(i==2){
          detailController.CO2Supply();
        }
        else if(i==3){
          detailController.fertilizedSupply();
        }
        else{
          detailController.plusPrice();
        }

        plantInfo.repaint();
        this.repaint();

      }
    }
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    for (int i = 0 ; i < texts.length ; i++) {

      if(detailController.getTodayDone()[i]){
        buttons[i].setEnabled(false);
      }
      if(i==0){
        if(!detailController.checkWater()){
          buttons[i].setForeground(Color.RED);
        }

      }
      else if(i==1){
        if(!detailController.checkSunshine()){
          buttons[i].setForeground(Color.RED);
        }

      }
      else if(i==2){
        if(!detailController.checkCO2()){
          buttons[i].setForeground(Color.RED);
        }

      }
      else if(i==3){
        if(!detailController.checkFertilized()){
          buttons[i].setForeground(Color.RED);
        }

      }

    }
  }


}