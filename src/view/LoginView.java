package view;

import controller.Controller;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import view.mainView.Farm;
import view.mainView.RightSide;

public class LoginView extends JPanel {
  Controller controller;
  JLabel la_name=new JLabel("");
  JTextField tf_nameInput=new JTextField("");
  public LoginView(Controller controller) {
    this.controller = controller;
    add(la_name);
    add(tf_nameInput);



}

}
