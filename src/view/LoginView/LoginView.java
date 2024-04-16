package view.LoginView;

import controller.Controller;

import javax.swing.*;
import java.awt.*;

public class LoginView extends JPanel {
    private Controller controller ;

    public LoginView(Controller controller) {
        this.controller = controller;
        JLabel la_title = new JLabel("로그인화면");
        la_title.setFont(new Font("", Font.BOLD, 42));
        la_title.setPreferredSize(new Dimension(1000, 100));
        add(la_title);

        JButton comeback = new JButton("로그인");
        comeback.setPreferredSize(new Dimension(160, 40));
        add(comeback);

        comeback.addActionListener(e -> controller.goToMainPage());
    }
}
