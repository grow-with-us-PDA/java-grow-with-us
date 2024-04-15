package view.StoreView;

import controller.Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StoreView extends JPanel {
    private Controller controller;

    public StoreView(Controller controller) {
        this.controller = controller;

        JButton goToMainButton = new JButton("Go to Main");
        goToMainButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.goToMainPage();
            }
        });
        add(goToMainButton);

        // 다른 UI 요소들 추가...
    }
}