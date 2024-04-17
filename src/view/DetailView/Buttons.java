package view.DetailView;

import controller.Controller;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import model.CropModel;

public class Buttons extends JPanel implements ActionListener {
    String[] texts = new String[]{"팔기", "돌아가기"};
    JButton[] buttons = new JButton[texts.length];

    CropModel cropModel;
    Controller controller;

    Buttons(Controller controller, CropModel cropModel) {
        this.cropModel = cropModel;
        this.controller = controller;
        setPreferredSize(new Dimension(300, 160));

        setLayout(new FlowLayout());

        for (int i = 0; i < texts.length; i++) {

            buttons[i] = new JButton(texts[i]);

            buttons[i].setPreferredSize(new Dimension(283, 70));
            buttons[i].setFont(new Font("돋음", Font.PLAIN, 16));
            buttons[i].addActionListener(this);

            add(buttons[i]);
        }


        ActionListener buttonActionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == buttons[1]) {
                    controller.goToMainPage();
                }
            }
        };
        buttons[1].addActionListener(buttonActionListener);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttons[0]) {
            System.out.println("팔기팔기");
            System.out.println(cropModel);
            controller.storeController.sellCropByCrop(cropModel);

            JOptionPane optionPane = new JOptionPane("판매 성공", JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = optionPane.createDialog("알림");
            dialog.setLocation(dialog.getX() - 140, dialog.getY() - 50);
            dialog.setVisible(true);
            controller.goToMainPage();
        }
        for (int i = 0; i < texts.length; i++) {
            if (e.getSource() == buttons[i]) {
                // 함수 실행. 작동까지 확인함.
            }
        }
    }
}