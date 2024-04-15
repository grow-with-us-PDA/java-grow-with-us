package view.mainView;

import controller.Controller;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DayAndWeathers extends JPanel {
  Controller controller;

  JLabel la_date = new JLabel("DAY 1");
  JLabel la_today = new JLabel("오늘");
  JLabel la_todayWeatherIcon = new JLabel();
  JLabel la_todayWeatherText = new JLabel("날씨");
  JLabel la_tomorrow = new JLabel("내일");
  JLabel la_tomorrowWeatherIcon = new JLabel();
  JLabel la_tomorrowWeatherText = new JLabel("날씨");

  DayAndWeathers(Controller controller) {
    this.controller = controller;

    // title
    JPanel pa_title = new JPanel(new BorderLayout());

    la_date.setHorizontalAlignment(JLabel.CENTER);
    la_date.setFont(new Font("돋음", Font.PLAIN, 16));

    pa_title.add(la_date);
    pa_title.setPreferredSize(new Dimension(300, 20));
    add(pa_title);

    JPanel pa_today = new JPanel(new FlowLayout());
    pa_today.setPreferredSize(new Dimension(300, 70));
    pa_today.add(la_today);
    pa_today.add(la_todayWeatherIcon);
    pa_today.add(la_todayWeatherText);
    add(pa_today);

    JPanel pa_tomorrow = new JPanel(new FlowLayout());
    pa_tomorrow.setPreferredSize(new Dimension(300, 50));
    pa_tomorrow.add(la_tomorrow);
    pa_tomorrow.add(la_tomorrowWeatherIcon);
    pa_tomorrow.add(la_tomorrowWeatherText);
    add(pa_tomorrow);

    setBackground(Color.CYAN);
    setPreferredSize(new Dimension(300, 200));
    setBorder(BorderFactory.createEmptyBorder(10 , 10, 10 , 10));
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    String[] weathers = controller.mainPageController.getWeathers();
    int date = controller.mainPageController.getDate();

    la_date.setText("DAY " + date);

    ImageIcon todayWeatherIcon = new ImageIcon("src/assets/weatherIcons/" + weathers[0] + ".png");
    la_todayWeatherIcon.setIcon(resizeImage(todayWeatherIcon, 70, 70));
    la_todayWeatherText.setText(weathers[0]);

    ImageIcon tomorrowWeatherIcon = new ImageIcon("src/assets/weatherIcons/" + weathers[1] + ".png");
    la_tomorrowWeatherIcon.setIcon(resizeImage(tomorrowWeatherIcon, 50, 50)); // Adjust the size as needed
    la_tomorrowWeatherText.setText(weathers[1]);
  }

  private ImageIcon resizeImage(ImageIcon icon, int width, int height) {
    Image img = icon.getImage();
    Image resizedImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
    return new ImageIcon(resizedImg);
  }
}
