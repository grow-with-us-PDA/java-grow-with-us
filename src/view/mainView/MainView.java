package view.mainView;

import controller.Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainView extends JPanel {
  final Controller controller;

  public MainView(Controller controller) {
    this.controller = controller;

    JButton goToStoreButton = new JButton("Go to Store");
    goToStoreButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        controller.goToStorePage();
      }
    });
    add(goToStoreButton);

    // 다른 UI 요소들 추가...
  }
}