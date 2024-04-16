package view.StoreView;

import controller.Controller;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Seeds extends JPanel {
    private JPanel selectedSeedPanel;
    private Controller controller;

    Seeds(Controller controller) {
        this.controller = controller;
        setLayout(new GridLayout(2, 5, 10, 10)); // 2행 5열의 그리드 레이아웃으로 설정
        setPreferredSize(new Dimension(1000, 400)); // 적절한 크기 설정
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // 여백 설정
        setBackground(Color.DARK_GRAY); // 배경색 설정

        // 씨앗 목록 추가
        for (int i = 1; i <= 9; i++) {
            JPanel seedPanel = createSeedPanel(i); // 씨앗을 담을 패널 생성
            add(seedPanel); // 패널을 Seeds 패널에 추가
        }
    }

    // 씨앗을 담을 패널 생성하는 메서드
    private JPanel createSeedPanel(int index) {
        JPanel seedPanel = new JPanel(); // 씨앗을 담을 패널 생성
        seedPanel.setPreferredSize(new Dimension(80, 80)); // 패널 크기 설정
        seedPanel.setBackground(Color.GREEN); // 배경색 설정

        // 씨앗 패널에 마우스 리스너 추가
        seedPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                selectSeedPanel(seedPanel); // 씨앗 패널 선택
            }
        });

        JLabel seedLabel = new JLabel("씨앗 " + index); // 씨앗 라벨 생성
        seedLabel.setForeground(Color.WHITE); // 텍스트 색상 설정
        seedPanel.add(seedLabel); // 라벨을 패널에 추가

        return seedPanel; // 패널 반환
    }

    // 씨앗 패널 선택 메서드
    private void selectSeedPanel(JPanel seedPanel) {
        if (selectedSeedPanel != null) {
            selectedSeedPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5)); // 이전 선택된 패널의 테두리 초기화
        }
        selectedSeedPanel = seedPanel; // 선택된 패널 업데이트
        selectedSeedPanel.setBorder(BorderFactory.createLineBorder(Color.RED, 10)); // 선택된 패널 테두리 설정
    }

    // 선택된 씨앗 패널의 인덱스를 반환하는 메서드
    public int getSelectedSeedIndex() {
        if (selectedSeedPanel == null) {
            return -1; // 선택된 씨앗이 없는 경우 -1 반환
        } else {
            // 선택된 씨앗의 인덱스를 계산하여 반환
            Component[] components = getComponents();
            for (int i = 0; i < components.length; i++) {
                if (components[i] == selectedSeedPanel) {
                    return i; // 패널의 인덱스는 1부터 시작하므로 +1
                }
            }
            return -1; // 선택된 씨앗이 없는 경우 -1 반환
        }
    }
}
