package view.DetailView;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Buttons extends JPanel implements ActionListener {
  String[] texts = new String[]{"팔기", "돌아가기"};
  JButton[] buttons = new JButton[texts.length];

  Buttons() {

    setPreferredSize(new Dimension(300, 107));
    setLayout(new FlowLayout());

    for (int i = 0 ; i < texts.length ; i++) {

      buttons[i] = new JButton(texts[i]);

      buttons[i].setPreferredSize(new Dimension(300, 70));
      buttons[i].setFont(new Font("돋음", Font.PLAIN, 16));
      buttons[i].addActionListener(this);

      add(buttons[i]);
    }
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    for (int i = 0 ; i < texts.length ; i++) {
      if (e.getSource() == buttons[i]) {
        // 함수 실행. 작동까지 확인함.
      }
    }
  }
}