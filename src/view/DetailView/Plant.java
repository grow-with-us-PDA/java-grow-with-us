package view.DetailView;

import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.*;

public class Plant extends JPanel {
  JLabel la_plantName = new JLabel("바질");
  ImageIcon img_icon = new ImageIcon("src/assets/plants/새싹.jpeg");
  JLabel la_plantImage;

  Plant() {
    // 패널 설정
    setPreferredSize(new Dimension(800, 600));
    setLayout(null);

    // 폰트 설정
    la_plantName.setFont(new Font("", Font.BOLD, 42));

    // la_plantName과 la_plantImage를 패널에 추가
    add(la_plantName);
    la_plantImage = new JLabel();
    add(la_plantImage);

    // 패널 크기 변경 시 요소 중앙 정렬
    addComponentListener(new ComponentAdapter() {
      @Override
      public void componentResized(ComponentEvent e) {
        centralizeComponents();
      }
    });

    // 초기 중앙 정렬 수행
    centralizeComponents();
  }

  // 요소 중앙 정렬
  private void centralizeComponents() {
    // la_plantName 중앙 정렬
    int nameWidth = la_plantName.getPreferredSize().width;
    int nameHeight = la_plantName.getPreferredSize().height;
    int nameX = (getWidth() - nameWidth) / 2;
    int nameY = 50;  // 상단에서 약간의 간격
    la_plantName.setBounds(nameX, nameY, nameWidth, nameHeight);

    // la_plantImage 크기 조절 및 중앙 정렬
    // 원하는 가로, 세로 크기
    int desiredWidth = 500;
    int desiredHeight = 500;

    // ImageIcon의 이미지를 원하는 크기로 조절
    Image scaledImage = img_icon.getImage().getScaledInstance(desiredWidth, desiredHeight, Image.SCALE_SMOOTH);

    // 조절된 이미지로 새로운 ImageIcon 생성
    ImageIcon scaledIcon = new ImageIcon(scaledImage);

    // la_plantImage에 새로운 Icon 설정
    la_plantImage.setIcon(scaledIcon);

    // 중앙 정렬
    int imageWidth = scaledIcon.getIconWidth();
    int imageHeight = scaledIcon.getIconHeight();
    int imageX = (getWidth() - imageWidth) / 2;
    int imageY = nameY + nameHeight + 20;  // la_plantName 아래에 약간의 간격
    la_plantImage.setBounds(imageX, imageY, imageWidth, imageHeight);
  }

  // main 메소드에서 테스트할 수 있습니다.
  public static void main(String[] args) {
    JFrame frame = new JFrame("Plant Test");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(800, 600);

    Plant plantPanel = new Plant();
    frame.add(plantPanel);

    frame.setVisible(true);
  }
}
