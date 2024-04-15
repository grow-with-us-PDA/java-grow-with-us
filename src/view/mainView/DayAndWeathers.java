package view.mainView;

import controller.Controller;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DayAndWeathers extends JPanel {
  Controller controller;
  JLabel la_todayWeather = new JLabel("날씨 테스트");
  ImageIcon icon;

  DayAndWeathers(Controller controller) {
    this.controller = controller;

    la_todayWeather.setBounds(50, 140, 160, 40);
    add(la_todayWeather);

    setBackground(Color.CYAN);
    setPreferredSize(new Dimension(300, 200));
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    String[] weathers = controller.weatherController.getWeathers();
    String todayWeather = weathers[0];
    String tomorrowWeather = weathers[1];

    la_todayWeather.setText(todayWeather);

    icon = new ImageIcon("src/assets/weatherIcons/" + todayWeather + ".png");
    g.drawImage(icon.getImage(), 50, 50, null);
  }
}
