package view.DetailView;

import controller.Controller;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import model.CropModel;

public class RightSide extends JPanel {

  RightSide(Controller controller, CropModel cropModel) {
    PlantInfo plantInfo = new PlantInfo(cropModel);
    PlantButtons plantButtons = new PlantButtons(controller,cropModel,plantInfo);
    Buttons buttons = new Buttons(controller,cropModel);

    setLayout(new BorderLayout());
    setPreferredSize(new Dimension(300, 700));
    setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

    // 각 컴포넌트에 동일한 간격의 EmptyBorder 설정
    int padding = 10; // 원하는 간격 (예: 10 픽셀)

    plantInfo.setBorder(BorderFactory.createEmptyBorder(0, 0, padding, 0));
    plantButtons.setBorder(BorderFactory.createEmptyBorder(padding, 0, padding, 0));
    buttons.setBorder(BorderFactory.createEmptyBorder(padding, 0, 0, 0));

    // 컴포넌트 추가
    add(plantInfo, BorderLayout.NORTH);
    add(buttons, BorderLayout.SOUTH);
    add(plantButtons, BorderLayout.CENTER);
  }
}
