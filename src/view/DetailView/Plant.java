package view.DetailView;

import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.*;
import model.CropModel;

public class Plant extends JPanel {
  JLabel la_plantName = new JLabel("");

  JLabel la_plantImage;
  ImageIcon img_icon;

  Plant(CropModel cropModel) throws IOException {
    // 패널 설정
    setPreferredSize(new Dimension(800, 600));
    setLayout(null);

    // 폰트 설정
    la_plantName.setFont(new Font("", Font.BOLD, 42));
    la_plantName.setText(cropModel.getName());

    System.out.println(cropModel.levelimg());

    URL imageURL = new URL(cropModel.levelimg());
    Image image = ImageIO.read(imageURL);
    ImageIcon img_icon = new ImageIcon(image);
    this.img_icon=img_icon;

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
    int nameY = 30;  // 상단에서 약간의 간격
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
}
