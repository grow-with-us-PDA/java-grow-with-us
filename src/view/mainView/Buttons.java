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
import model.Weather;

public class Buttons extends JPanel implements ActionListener {

  Controller controller;
  DayAndWeathers dayAndWeathers;
  String[] texts = new String[]{"다음 날", "상점"};
  JButton[] buttons = new JButton[texts.length];

  Buttons(Controller controller, DayAndWeathers dayAndWeathers) {
    this.controller = controller;
    this.dayAndWeathers = dayAndWeathers;

    setBackground(Color.YELLOW);
    setPreferredSize(new Dimension(300, 107));
    setLayout(new FlowLayout());

    for (int i = 0 ; i < texts.length ; i++) {
      buttons[i] = new JButton(texts[i]);

      buttons[i].setPreferredSize(new Dimension(300, 50));
      buttons[i].setFont(new Font("돋음", Font.PLAIN, 16));
      buttons[i].addActionListener(this);

      add(buttons[i]);
    }
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    for (int i = 0 ; i < texts.length ; i++) {
      // 다음날
      if (e.getSource() == buttons[0]) {
        controller.weatherController.updateWeathers();
        dayAndWeathers.repaint();
        return;
      }

      // 상점
      if (e.getSource() == buttons[1]) {
        //
        return;
      }
    }
  }
}
