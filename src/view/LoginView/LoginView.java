package view.LoginView;

import controller.Controller;

import javax.swing.*;
import java.awt.*;

public class LoginView extends JPanel {
    private Controller controller ;
    JLabel la_name=new JLabel("");
    JTextField tf_nameInput=new JTextField(20);


    public LoginView(Controller controller) {
        this.controller = controller;
        JLabel la_title = new JLabel("로그인화면");
        la_title.setFont(new Font("", Font.BOLD, 42));
        la_title.setPreferredSize(new Dimension(1000, 100));

        tf_nameInput.setPreferredSize(new Dimension(150,40));
        add(la_title);
        add(la_name);
        add(tf_nameInput);


        JButton comeback = new JButton("로그인");
        comeback.setPreferredSize(new Dimension(160, 40));
        add(comeback);



        comeback.addActionListener(e -> {
            String nameInput = tf_nameInput.getText();
            controller.loginController.setName(nameInput);
            controller.goToMainPage();
        });

    }
}
