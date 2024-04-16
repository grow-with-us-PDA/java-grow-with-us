package view.StoreView;

import controller.Controller;

import javax.swing.*;
import java.awt.*;

public class Bottom extends JPanel {
    private int selectedSeedIndex = -1; // 선택된 씨앗의 인덱스를 저장할 변수
    private Controller controller;

    public Bottom(Controller controller) {
        this.controller = controller;
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(1000, 60));

        JPanel statusPanel = new JPanel(new BorderLayout());
        JLabel la_farmStatus = new JLabel("밭 현황");
        JLabel la_farmCount = new JLabel(this.controller.storeController.getFarmNameAndCount());
        la_farmStatus.setFont(new Font("", Font.BOLD, 24));
        la_farmCount.setFont(new Font("", Font.BOLD, 24));
        statusPanel.add(la_farmStatus, BorderLayout.NORTH);
        statusPanel.add(la_farmCount, BorderLayout.SOUTH);

        JPanel bottomButtonPanel = new JPanel(new FlowLayout());
        JButton purchase = new JButton("구매");
        JButton comeback = new JButton("돌아가기");
        purchase.setPreferredSize(new Dimension(160, 40));
        comeback.setPreferredSize(new Dimension(160, 40));
        bottomButtonPanel.add(purchase);
        bottomButtonPanel.add(comeback);

        add(statusPanel, BorderLayout.WEST);
        add(bottomButtonPanel, BorderLayout.EAST);

        // 돌아가기 버튼 ActionListener 추가
        comeback.addActionListener(e -> controller.goToMainPage());
        purchase.addActionListener(e -> controller.storeController.test(this.selectedSeedIndex));
    }

    // 선택된 씨앗의 인덱스를 설정하는 메서드
//    public void setSelectedSeedIndex(int index)
//    {
//        System.out.println(index);
//        this.selectedSeedIndex = index;
//    }

}
