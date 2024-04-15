package view.StoreView;

import controller.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StoreView extends JPanel {
    private Controller controller;

    public StoreView(Controller controller) {
        this.controller = controller;

        setLayout(null); // 레이아웃 매니저 설정을 제거하여 컴포넌트를 직접 배치

        // 상점 제목 추가
        JLabel la_title = new JLabel("상점");
        la_title.setBounds(50, 100, 100, 30); // 위치와 크기 설정
        la_title.setFont(new Font("", Font.BOLD, 42));
        add(la_title); // 패널에 추가

        // 현재 보유 금액 추가
        JLabel la_money = new JLabel("현재 보유 금액: ");
        la_money.setBounds(800, 150, 150, 20); // 위치와 크기 설정
        la_title.setFont(new Font("", Font.BOLD, 30));
        add(la_money); // 패널에 추가

        JButton goToMainButton = new JButton("메인페이지로");
        JButton goToDetailButton = new JButton("상세페이지로");

        // 각 버튼의 위치와 크기 설정
        goToMainButton.setBounds(400, 0, 100, 30);
        goToDetailButton.setBounds(500, 0, 100, 30);

        // 각 버튼의 ActionListener 추가
        goToMainButton.addActionListener(e -> controller.goToMainPage());
        goToDetailButton.addActionListener(e -> controller.goToDetailPage());

        add(goToMainButton); // 패널에 추가
        add(goToDetailButton); // 패널에 추가

        JTextField tf_store = new JTextField("상점페이지입니다.");
        tf_store.setBounds(600, 0, 100, 30); // 위치와 크기 설정
        add(tf_store); // 패널에 추가

        // 다른 UI 요소들 추가...
    }
}