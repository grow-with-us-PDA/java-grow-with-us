package view.mainView;

import controller.Controller;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import javax.swing.JPanel;

public class MainView extends JPanel {
    Farm farm;
    Controller controller;

    public MainView(Controller controller) {
        this.controller = controller;
        this.farm = new Farm(controller);

        RightSide rightSide = new RightSide(controller, this);

        setLayout(new FlowLayout());

        add(farm, BorderLayout.WEST);
        add(rightSide, BorderLayout.EAST);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        farm = new Farm(controller);
    }
}

