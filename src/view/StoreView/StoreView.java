package view.StoreView;

import controller.Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StoreView extends JPanel {
    private Controller controller;

    public StoreView(Controller controller) {
        this.controller = controller;

        JButton goToMainButton = new JButton("메인페이지로");
        JButton goToDetailButton = new JButton("상세페이지로");
        goToMainButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.goToMainPage();
            }
        });
        goToDetailButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.goToDetailPage();
            }
        });
        JTextField tf_store = new JTextField("상점페이지입니다.");
        add(goToMainButton);
        add(goToDetailButton);
        add(tf_store);

        // 다른 UI 요소들 추가...
    }
}