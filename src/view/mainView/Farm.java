package view.mainView;

import controller.Controller;
import model.CropModel;
import model.FarmModel;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.LineBorder;
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
    setCropAtField();
    setFarmField();
  }

  private void setFarmField() {
    HashMap<Integer, CropModel> cropMap = controller.farmController.getFarm();

    for (Map.Entry<Integer, CropModel> crop : cropMap.entrySet()) {
      Integer cropLocation = crop.getKey();
      CropModel cropInfo = crop.getValue();
      JPanel field = createField(cropInfo, cropLocation);
      farmField[cropLocation] = field;
      add(field);
    }

    for (int i = cropMap.size(); i < 9; i++) {
      JPanel field = createEmptyField();
      farmField[i] = field;
      add(field);
    }
  }

  private JPanel createField(CropModel cropInfo, int location) {
    JPanel field = new JPanel();
    field.setBackground(Color.WHITE);
    field.setBorder(new LineBorder(Color.BLACK, 1));
    JLabel imageLabel = new JLabel();

    try {
      URL imageURL = new URL(cropInfo.levelimg());
      Image image = ImageIO.read(imageURL);
      ImageIcon icon = new ImageIcon(image);
      imageLabel.setIcon(icon);
      field.addMouseListener(createMouseListener(location));
    } catch (IOException e) {
      e.printStackTrace();
    }

    field.add(imageLabel);
    return field;
  }

  private JPanel createEmptyField() {
    JPanel field = new JPanel();
    field.setBackground(Color.WHITE);
    field.setBorder(new LineBorder(Color.BLACK, 1));

    return field;
  }

  private MouseAdapter createMouseListener(int location) {
    return new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);

        System.out.println(location);
        FarmModel farmModel = controller.farmController.getFarmModel();
        controller.detailController.makeDetailView(location, farmModel);
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
