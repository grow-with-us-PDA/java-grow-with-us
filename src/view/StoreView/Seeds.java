package view.StoreView;

import controller.Controller;
import view.mainView.Buttons;
import view.mainView.DayAndWeathers;

import javax.swing.*;
import java.awt.*;

public class Seeds extends JPanel {

    Seeds(Controller controller) {
        setLayout(null);
        setPreferredSize(new Dimension(1000, 400));
        setBorder(BorderFactory.createEmptyBorder(10 , 10, 10 , 10));
        setBackground(Color.DARK_GRAY);

        // Seeds에 추가할 내용 생성
        JLabel seedsLabel = new JLabel("씨앗 목록");
        seedsLabel.setForeground(Color.WHITE); // 텍스트 색상 설정
        add(seedsLabel, BorderLayout.CENTER); // Seeds 패널에 추가
    }
}
