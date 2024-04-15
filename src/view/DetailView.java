package view;

import controller.DetailController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class DetailView extends JFrame {

  JLabel la_plantName = new JLabel("바질");

  DetailController detailController;

  public DetailView(DetailController detailController) {
    this.detailController = detailController;

    la_plantName.setBounds(50, 100, 200, 40);
    add(la_plantName);

    setVisible(true);

  }
}

