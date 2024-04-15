package view.mainView;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class RightSide extends JPanel {
  DayAndWeather weather = new DayAndWeather();
  Buttons buttons = new Buttons();

  RightSide() {
    setLayout(new BorderLayout());
    setPreferredSize(new Dimension(300, 700));
    setBorder(BorderFactory.createEmptyBorder(10 , 10, 10 , 10));

    setBackground(Color.DARK_GRAY);

    add(weather, BorderLayout.NORTH);
    add(buttons, BorderLayout.SOUTH);
  }
}
