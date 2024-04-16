package view.StoreView;

import controller.Controller;
import model.StoreModel;

import javax.swing.*;
import java.awt.*;

public class StoreView extends JPanel {
    private Controller controller;
    private Money moneyPanel;
    private Bottom bottomPanel;
    private Seeds seeds;
    private StoreModel.CropDetails[] seedArray;
    public StoreView(Controller controller) {
        this.controller = controller;
        this.seedArray = controller.storeController.getCropDetails(); // 씨앗 정보 받아오기

        // 상점 제목 추가
        JLabel la_title = new JLabel("상점");
        la_title.setFont(new Font("", Font.BOLD, 42));
        la_title.setPreferredSize(new Dimension(1000, 100));
        add(la_title);

        // 금액을 담을 Money 패널 추가
        int money = this.controller.storeController.getMoney(); // controller에서 money 가져오기
        moneyPanel = new Money(money);
        add(moneyPanel);

        // 씨앗 목록 추가
        seeds = new Seeds(controller, seedArray);
        add(seeds);

        // Bottom 패널 추가
        bottomPanel = new Bottom(controller, seeds);
        add(bottomPanel);

        // Bottom 패널에 메서드 호출을 위한 선택된 씨앗 정보 설정
//        bottomPanel.setSelectedSeedIndex(seeds.getSelectedSeedIndex());
    }

    public void setMoney(int money) {
        moneyPanel.updateMoney(money);
    }
}
