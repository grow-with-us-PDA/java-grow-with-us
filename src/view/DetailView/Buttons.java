package view.DetailView;

import controller.Controller;
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
import javax.swing.border.EmptyBorder;
import model.CropModel;

public class Buttons extends JPanel implements ActionListener {
  String[] texts = new String[]{"팔기", "돌아가기"};
  JButton[] buttons = new JButton[texts.length];

  Buttons(Controller controller, CropModel cropModel) {

    setPreferredSize(new Dimension(300, 160));

    setLayout(new FlowLayout());

    for (int i = 0 ; i < texts.length ; i++) {

      buttons[i] = new JButton(texts[i]);

      buttons[i].setPreferredSize(new Dimension(283, 70));
      buttons[i].setFont(new Font("돋음", Font.PLAIN, 16));
      buttons[i].addActionListener(this);

      add(buttons[i]);
    }


    ActionListener buttonActionListener = new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
      if (e.getSource() == buttons[1]) {
          controller.goToMainPage();
        }
      }
    };
    buttons[1].addActionListener(buttonActionListener);


  }

  @Override
  public void actionPerformed(ActionEvent e) {
    for (int i = 0 ; i < texts.length ; i++) {
      if (e.getSource() == buttons[i]) {
        // 함수 실행. 작동까지 확인함.
      }
    }
  }
}