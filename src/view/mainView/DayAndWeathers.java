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
  JLabel la_todayWeatherIcon = new JLabel();
  JLabel la_todayWeatherText = new JLabel("  날씨");
  JLabel la_tomorrow = new JLabel("내일   ");
  JLabel la_tomorrowWeatherIcon = new JLabel();


  int todayHeight = 90;
  int todayFontSize = 16;
  int todayIconRatio = 5;

  int tomorrowHeight = 60;
  int tomorrowIconRatio = 3;
  int tomorrowFontSize = 14;



  DayAndWeathers(Controller controller) {
    this.controller = controller;

    // title
    JPanel pa_title = new JPanel(new BorderLayout());

    la_date.setHorizontalAlignment(JLabel.CENTER);
    la_date.setFont(new Font("돋음", Font.BOLD, 20));

    pa_title.add(la_date);
    pa_title.setPreferredSize(new Dimension(220, 28));
    pa_title.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.lightGray));
    add(pa_title);

    // today
    JPanel pa_today = new JPanel(new FlowLayout());

    la_todayWeatherText.setFont(new Font("돋음", Font.PLAIN, todayFontSize));

    pa_today.setPreferredSize(new Dimension(300, todayHeight));
    pa_today.add(la_todayWeatherIcon);
    pa_today.add(la_todayWeatherText);
    add(pa_today);

    // tomorrow
    JPanel pa_tomorrow = new JPanel(new FlowLayout());

    la_tomorrow.setFont(new Font("돋음", Font.PLAIN, tomorrowFontSize));
    la_tomorrow.setPreferredSize(new Dimension(180, tomorrowHeight));
    la_tomorrow.setHorizontalAlignment(JLabel.RIGHT);

    pa_tomorrow.setPreferredSize(new Dimension(300, tomorrowHeight));
    pa_tomorrow.add(la_tomorrow);
    pa_tomorrow.add(la_tomorrowWeatherIcon);
    add(pa_tomorrow);

    setBackground(Color.WHITE);
    pa_title.setBackground(Color.WHITE);
    pa_today.setBackground(Color.WHITE);
    pa_tomorrow.setBackground(Color.WHITE);

    setPreferredSize(new Dimension(300, 220));
    setBorder(BorderFactory.createEmptyBorder(10 , 10, 10 , 10));
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    String[] weathers = controller.mainPageController.getWeathers();
    int date = controller.mainPageController.getDate();

    la_date.setText("DAY " + date);

    ImageIcon img_todayWeatherIcon = new ImageIcon("src/assets/weatherIcons/" + weathers[0] + ".png");
    la_todayWeatherIcon.setIcon(resizeImage(img_todayWeatherIcon, 16*todayIconRatio, 15*todayIconRatio));
    la_todayWeatherText.setText("  " + weathers[0]);

    ImageIcon img_tomorrowWeatherIcon = new ImageIcon("src/assets/weatherIcons/" + weathers[1] + ".png");
    la_tomorrowWeatherIcon.setIcon(resizeImage(img_tomorrowWeatherIcon, 16*tomorrowIconRatio, 15*tomorrowIconRatio));
  }

  private ImageIcon resizeImage(ImageIcon icon, int width, int height) {
    Image img = icon.getImage();
    Image resizedImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
    return new ImageIcon(resizedImg);
  }
}
