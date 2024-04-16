package view.mainView;

import controller.Controller;
import model.CropModel;
import model.FarmModel;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class Farm extends JPanel {
  private final JPanel[] farmField = new JPanel[9];

  private final Controller controller;

  public Farm(Controller controller) {
    this.controller = controller;
//    setBackground(Color.blue);
    setLayout(new GridLayout(3, 3));
    setPreferredSize(new Dimension(800, 700));
//    setCropAtField();
    setFarmField();
  }

  private void setFarmField() {
    HashMap<Integer, CropModel> cropMap = controller.farmController.getFarm();

    for (int i = 0; i < 9; i++) {
      JPanel field = createEmptyField();
      farmField[i] = field;
//      add(field);
    }

    for (Map.Entry<Integer, CropModel> crop : cropMap.entrySet()) {
      Integer cropLocation = crop.getKey();
      CropModel cropInfo = crop.getValue();
      JPanel field = createField(cropInfo, cropLocation);
      farmField[cropLocation] = field;
//      add(field);
    }

    for (JPanel field: farmField) {
      add(field);
    }
  }

  private JPanel createField(CropModel cropInfo, int location) {
    JPanel field = new JPanel();
    field.setLayout(new BorderLayout()); // BorderLayout으로 변경
    JLabel imageLabel = new JLabel();
    try {
      ImageIcon image;
      if (controller.farmController.checkbadCrop(location)) {
        URL imageURL = new URL(cropInfo.levelimg());
        Image originalImage = ImageIO.read(imageURL);
        int width = Math.min(originalImage.getWidth(null), 300); // 최대 너비를 300으로 설정 (원하는 크기에 맞게 조절)
        int height = Math.min(originalImage.getHeight(null), 200); // 최대 높이를 300으로 설정 (원하는 크기에 맞게
        Image scaledImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        image = new ImageIcon(scaledImage);
      } else {
        ImageIcon originalIcon = new ImageIcon("src/assets/plants/죽음.jpg");
        int width = 300; // 최대 너비를 300으로 설정 (원하는 크기에 맞게 조절)
        int height = 200; // 최대 높이를 300으로 설정 (원하는 크기에 맞게
        Image scaledImage = originalIcon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        image = new ImageIcon(scaledImage);
      }

      imageLabel.setIcon(image);
    } catch (IOException e) {
      e.printStackTrace();
    }

    JLabel la_cropName = new JLabel(cropInfo.getName());
    la_cropName.setFont(new Font("Arial", Font.PLAIN, 20)); // 예시로 Arial 글꼴, 평범한 스타일, 크기 14로 설정
    field.addMouseListener(createMouseListener(location));
    field.add(imageLabel, BorderLayout.CENTER);
    field.add(la_cropName, BorderLayout.NORTH); // 라벨을 아래쪽에 추가

    return field;
  }




  private JPanel createEmptyField() {
    JPanel field = new JPanel();
    field.setBackground(Color.WHITE);

    try {
      ImageIcon image = new ImageIcon("src/assets/plants/farm.jpg");
      JLabel jLabel = new JLabel(image);
      field.add(jLabel);

    } catch (Exception e) {
      e.printStackTrace();
    }

    return field;
  }

  private MouseAdapter createMouseListener(int location) {
    return new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);

        System.out.println(location);
        CropModel cropModel = controller.farmController.getFarm().get(location);
        try {
          controller.detailController.makeDetailView(cropModel);
        } catch (IOException ex) {
          throw new RuntimeException(ex);
        }
        controller.goToDetailPage();
      }
    };
  }

  private void setCropAtField() {
    //임시로 넣어놓은 작물
    controller.farmController.buyCorn();
    controller.farmController.buyCorn();
    CropModel crop = controller.farmController.getFarm().get(1);
    System.out.println("클래스 확인: " + crop.getClass());
  }


}
