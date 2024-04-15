package view.StoreView;

import controller.Controller;
import view.mainView.Buttons;
import view.mainView.DayAndWeathers;

import javax.swing.*;
import java.awt.*;

public class Seeds extends JPanel {

    Seeds(Controller controller) {

        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(1000, 600));
        setBorder(BorderFactory.createEmptyBorder(10 , 10, 10 , 10));

        setBackground(Color.DARK_GRAY);

    }
}
