package view.DetailView;

import java.awt.*;
import javax.swing.*;

public class Plant extends JPanel {

  JLabel la_plantName = new JLabel("바질");
  JLabel la_imageLabel; // 이미지 표시용 JLabel

  Plant() {
    setBackground(Color.blue);
    setPreferredSize(new Dimension(800, 600));

    // la_plantName 라벨 추가
    add(la_plantName);

    // 이미지 아이콘 생성
//    ImageIcon img_plantImage = new ImageIcon("../seed.jpeg");
//
//    // 이미지 표시용 JLabel 생성
//    la_imageLabel = new JLabel();
//    la_imageLabel.setIcon(img_plantImage);
//
//    // 이미지 라벨 추가
//    add(la_imageLabel);
//
//    // 이미지 라벨 크기 조정
//    la_imageLabel.setPreferredSize(new Dimension(400, 200));
  }

  // 메인 메소드 등에서 'Plant' 객체를 생성하고 JFrame에 추가하여 테스트할 수 있습니다.
}
