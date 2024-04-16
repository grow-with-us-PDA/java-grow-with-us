package view.StoreView;

import controller.Controller;

import javax.swing.*;
import java.awt.*;

public class Bottom extends JPanel {
    private int selectedSeedIndex = -1; // 선택된 씨앗의 인덱스를 저장할 변수
    private Controller controller;
    private Seeds seeds;

    public Bottom(Controller controller, Seeds seeds) {
        this.controller = controller;
        this.seeds = seeds;
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

        // 구매 버튼 ActionListener 추가
        purchase.addActionListener(e -> handlePurchase());
        // 돌아가기 버튼 ActionListener 추가
        comeback.addActionListener(e -> controller.goToMainPage());
    }

    // 씨앗 클릭 처리 메서드
    public void handlePurchase(){
        selectedSeedIndex = seeds.getSelectedSeedIndex();
        boolean isPurchased = this.controller.storeController.buyCropBySeedIndex(selectedSeedIndex);
        if (!isPurchased) {
            JOptionPane optionPane = new JOptionPane("보유 금액이 부족합니다", JOptionPane.WARNING_MESSAGE);
            JDialog dialog = optionPane.createDialog("알림");
            dialog.setLocation(dialog.getX() - 150, dialog.getY() - 50);
            dialog.setVisible(true);
        } else {
            JOptionPane optionPane = new JOptionPane("구매 성공", JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = optionPane.createDialog("알림");
            dialog.setLocation(dialog.getX() - 140, dialog.getY() - 50);
            dialog.setVisible(true);
            controller.goToMainPage();
        }
    }
}


