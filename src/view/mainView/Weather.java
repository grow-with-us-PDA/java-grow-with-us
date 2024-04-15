package view.mainView;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Weather extends JFrame {

  JTextField tf_num2 = new JTextField();

  Weather() {
    setSize(260, 240);
    setLayout(null);
    setVisible(true);

    tf_num2.setBounds(50, 50, 80, 40);
    add(tf_num2);

  }
}
