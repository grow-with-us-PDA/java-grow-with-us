package view.mainView;

import controller.Controller;
import controller.FarmController;

import javax.sound.sampled.Line;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FarmField extends JPanel {
    Controller controller;


    public FarmField(Controller controller) {
        setBackground(Color.RED);
        setBorder(new LineBorder(Color.BLACK, 3));
        setPreferredSize(new Dimension(200, 200));

        this.controller = controller;

    }

}
