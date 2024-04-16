package view.DetailView;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class PlantInfo extends JPanel {

  JLabel la_currentStatus = new JLabel("[식물의 현재 상태]");
  JLabel la_humidity = new JLabel("습도: ");
  JLabel la_sunshine = new JLabel("햇볕: ");
  JLabel la_co2 = new JLabel("이산화탄소: ");
  JLabel la_fertilized = new JLabel("토양: ");
  JLabel la_sellPrice = new JLabel("현재 가격: ");


  PlantInfo(){
    setBackground(Color.white);
    setPreferredSize(new Dimension(300, 210));

//    setLayout(new BorderLayout());

    setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    la_currentStatus.setFont(new Font("돋움", Font.PLAIN, 18));

    la_humidity.setFont(new Font("돋움", Font.PLAIN, 16));
    la_sunshine.setFont(new Font("돋움", Font.PLAIN, 16));
    la_co2.setFont(new Font("돋움", Font.PLAIN, 16));
    la_fertilized.setFont(new Font("돋움", Font.PLAIN, 16));
    la_sellPrice.setFont(new Font("돋움", Font.PLAIN, 16));
    la_currentStatus.setBorder(new EmptyBorder(10, 10, 10, 10)); // 위, 왼쪽, 아래, 오른쪽 패딩
    la_humidity.setBorder(new EmptyBorder(10, 10, 10, 10));
    la_sunshine.setBorder(new EmptyBorder(0, 10, 10, 10));
    la_co2.setBorder(new EmptyBorder(0, 10, 10, 10));
    la_fertilized.setBorder(new EmptyBorder(0, 10, 10, 10));
    la_sellPrice.setBorder(new EmptyBorder(0, 10, 10, 10));

    add(la_currentStatus);
    add(la_humidity);
    add(la_sunshine);
    add(la_co2);
    add(la_fertilized);
    add(la_sellPrice);
  }

}
