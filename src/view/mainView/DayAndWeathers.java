package view.mainView;

import controller.Controller;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DayAndWeathers extends JPanel {
  Controller controller;

  JLabel la_date = new JLabel("DAY 1");
  JLabel la_todayWeatherIcon = new JLabel();
  JLabel la_todayWeatherText = new JLabel("날씨");
  JLabel la_tomorrowWeatherIcon = new JLabel();

  DayAndWeathers(Controller controller) {
    this.controller = controller;

    JPanel titlePanel = new JPanel(new BorderLayout());
    add(titlePanel, BorderLayout.NORTH);

    


    setBackground(Color.CYAN);
    setPreferredSize(new Dimension(300, 200));
    setBorder(BorderFactory.createEmptyBorder(10 , 10, 10 , 10));

  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    String[] weathers = controller.mainPageController.getWeathers();
    String todayWeather = weathers[0];
    String tomorrowWeather = weathers[1];

    la_todayWeatherText.setText(todayWeather);

    ImageIcon todayWeatherIcon = new ImageIcon("src/assets/weatherIcons/" + todayWeather + ".png");
    la_todayWeatherIcon.setIcon(resizeImage(todayWeatherIcon, 80, 80));

    ImageIcon tomorrowWeatherIcon = new ImageIcon("src/assets/weatherIcons/" + tomorrowWeather + ".png");
    la_tomorrowWeatherIcon.setIcon(resizeImage(tomorrowWeatherIcon, 50, 50)); // Adjust the size as needed
  }

  private ImageIcon resizeImage(ImageIcon icon, int width, int height) {
    Image img = icon.getImage();
    Image resizedImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
    return new ImageIcon(resizedImg);
  }
}
