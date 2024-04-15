package view.mainView;

import controller.Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainView extends JPanel {
  final Controller controller;

  public MainView(Controller controller) {
    this.controller = controller;

    JButton goToStoreButton = new JButton("상점페이지로");
    JButton goToDetailButton = new JButton("상세페이지로");

    ActionListener buttonActionListener = new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        if (e.getSource() == goToStoreButton) {
          controller.goToStorePage();
        } else if (e.getSource() == goToDetailButton) {
          controller.goToDetailPage();
        }
      }
    };

    goToStoreButton.addActionListener(buttonActionListener);
    goToDetailButton.addActionListener(buttonActionListener);

    JTextField tf_main = new JTextField("메인페이지입니다.");
    add(goToStoreButton);
    add(goToDetailButton);
    add(tf_main);

    // 다른 UI 요소들 추가...
  }
}
