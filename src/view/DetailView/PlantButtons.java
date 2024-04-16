package view.DetailView;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
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

  PlantButtons(Controller controller, CropModel cropModel, PlantInfo plantInfo) {

    this.cropModel=cropModel;
    this.plantInfo=plantInfo;
    setPreferredSize(new Dimension(30, 10));
    setLayout(new FlowLayout());


    for (int i = 0 ; i < texts.length ; i++) {
      buttons[i] = new JButton(texts[i]);


      buttons[i].setPreferredSize(new Dimension(283, 55));
      buttons[i].setFont(new Font("돋음", Font.PLAIN, 16));
      buttons[i].addActionListener(this);

      add(buttons[i]);
    }
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    for (int i = 0 ; i < texts.length ; i++) {
      if (e.getSource() == buttons[i]) {

        if(i==0){
          cropModel.waterSupply();
//          System.out.println(cropModel.getHumidity());
        }
        else if(i==1){
          cropModel.sunSupply();
        }
        else if(i==2){
          cropModel.CO2Supply();
        }
        else if(i==3){
          cropModel.fertilizedSupply();
        }
        else{
          cropModel.plusPrice();
        }

        plantInfo.repaint();
      }
    }
  }
}