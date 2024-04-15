package view.DetailView;

import controller.Controller;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class RightSide extends JPanel {

  RightSide(Controller controller) {
    PlantButtons plantButtons = new PlantButtons(controller);
    Buttons buttons = new Buttons();
    PlantInfo plantInfo = new PlantInfo();

    setLayout(new BorderLayout());
    setPreferredSize(new Dimension(300, 700));
    setBorder(BorderFactory.createEmptyBorder(10 , 10, 10 , 10));

    setBackground(Color.RED);
    add(plantInfo,BorderLayout.NORTH);
    add(plantButtons);

    add(buttons);
  }
}
