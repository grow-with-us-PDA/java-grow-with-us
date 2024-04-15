package view.mainView;

import javax.sound.sampled.Line;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class FarmField extends JPanel {
    public FarmField() {
        setBackground(Color.RED);
        setBorder(new LineBorder(Color.BLACK, 3));
        setPreferredSize(new Dimension(200, 200));
    }
}
