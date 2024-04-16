package view.mainView;

import controller.Controller;

import java.awt.*;
import javax.swing.*;

public class RightSide extends JPanel {
  RightSide(Controller controller, MainView mainView) {
    DayAndWeathers dayAndWeathers = new DayAndWeathers(controller);
    JLabel la_name = new JLabel("김영석" + "님의 농장 \uD83E\uDDD1\u200D\uD83C\uDF3E");
    la_name.setFont(new Font("", Font.BOLD, 20));
    Buttons buttons = new Buttons(controller, mainView);

    setLayout(new BorderLayout());
    setPreferredSize(new Dimension(300, 700));
    setBorder(BorderFactory.createEmptyBorder(10 , 10, 10 , 10));

    add(dayAndWeathers, BorderLayout.NORTH);
    JPanel bottomPanel = new JPanel(new BorderLayout());
    bottomPanel.add(la_name, BorderLayout.NORTH);
    bottomPanel.add(buttons, BorderLayout.SOUTH);
    add(bottomPanel, BorderLayout.SOUTH);
  }
}
