package view.mainView;

import controller.Controller;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Buttons extends JPanel implements ActionListener {

  Controller controller;

  JLabel la_result = new JLabel("결과 출력");

  String[] texts = new String[]{"다음 날", "상점"};
  JButton[] buttons = new JButton[texts.length];

  Buttons(Controller controller) {
    this.controller = controller;

    setBackground(Color.YELLOW);
    setPreferredSize(new Dimension(300, 207));
    setLayout(new FlowLayout());

    for (int i = 0 ; i < texts.length ; i++) {
      buttons[i] = new JButton(texts[i]);

      buttons[i].setPreferredSize(new Dimension(300, 50));
      buttons[i].setFont(new Font("돋음", Font.PLAIN, 16));
      buttons[i].addActionListener(this);

      add(buttons[i]);
    }
    add(la_result);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    for (int i = 0 ; i < texts.length ; i++) {
      if (e.getSource() == buttons[0]) {
        String[] test = controller.weatherController.getWeathers();
        la_result.setText(test[0]);
        return;
      }

      if (e.getSource() == buttons[1]) {
        controller.weatherController.updateWeathers();
        return;
      }
    }
  }
}
