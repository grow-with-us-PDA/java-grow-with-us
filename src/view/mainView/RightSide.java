package view.mainView;

import controller.Controller;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class RightSide extends JPanel {


  RightSide(Controller controller) {
    DayAndWeather weather = new DayAndWeather();
    Buttons buttons = new Buttons(controller);

    setLayout(new BorderLayout());
    setPreferredSize(new Dimension(300, 700));
    setBorder(BorderFactory.createEmptyBorder(10 , 10, 10 , 10));

    setBackground(Color.DARK_GRAY);

    add(weather, BorderLayout.NORTH);
    add(buttons, BorderLayout.SOUTH);
  }
}
