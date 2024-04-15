package view.mainView;

import java.awt.*;
import javax.swing.*;

public class Farm extends JPanel {
  FarmField[] farmField = new FarmField[9];
  public Farm() {
    setBackground(Color.blue);

    for (int i = 0; i < 9; i++) {
      farmField[i] = new FarmField();
      add(farmField[i]);
    }
    setLayout(new GridLayout(3,3)); // 3x3 그리드 레이아웃으로 변경
    setPreferredSize(new Dimension(800, 700));
  }

}
