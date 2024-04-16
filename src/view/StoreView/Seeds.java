package view.StoreView;

import controller.Controller;
import model.StoreModel;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Seeds extends JPanel {
    private JPanel selectedSeedPanel;
    private Controller controller;
    private StoreModel.CropDetails[] seedArray;
    private int money;
    Seeds(Controller controller, StoreModel.CropDetails[] seedArray, int money) {
        this.controller = controller;
        this.seedArray = seedArray;
        this.money = money;
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

    private JPanel createSeedPanel(int index) {
        JPanel seedPanel = new JPanel(); // 씨앗을 담을 패널 생성
        seedPanel.setLayout(new BoxLayout(seedPanel, BoxLayout.Y_AXIS));
        seedPanel.setPreferredSize(new Dimension(200, 200)); // 패널 크기 설정
        seedPanel.setBackground(Color.WHITE); // 배경색 설정

        // 수평 방향으로 가운데 정렬하기 위해 FlowLayout 사용
        JPanel horizontalPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JLabel seedLabel = new JLabel(seedArray[index - 1].name); // 씨앗 라벨 생성
        seedLabel.setForeground(Color.BLACK); // 텍스트 색상 설정
        horizontalPanel.add(seedLabel); // 라벨을 수평 패널에 추가

        // 씨앗 패널에 마우스 리스너 추가
        seedPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                selectSeedPanel(seedPanel); // 씨앗 패널 선택
            }
        });

        try {
            System.out.println(seedArray[index - 1].money);
            // money가 true일 경우 이미지를 보여줌
            if (money >= seedArray[index - 1].seedPrice) {
                URL imageURL = new URL(seedArray[index - 1].image);
                BufferedImage originalImage = ImageIO.read(imageURL); // 원본 이미지를 읽어옴
                Image scaledImage = originalImage.getScaledInstance(170, 140, Image.SCALE_SMOOTH); // 이미지 크기 조절
                ImageIcon icon = new ImageIcon(scaledImage);
                JLabel imageLabel = new JLabel(icon); // 이미지 라벨 생성
                horizontalPanel.add(imageLabel); // 이미지 라벨을 수평 패널에 추가
            } else {
                // money가 false인 경우 lock 이미지를 보여줌
                ImageIcon lockIcon = new ImageIcon("src/assets/store/lock.png");
                Image lockImage = lockIcon.getImage(); // ImageIcon에서 Image 추출
                Image scaledLockImage = lockImage.getScaledInstance(170, 140, Image.SCALE_SMOOTH); // 이미지 크기 조절
                ImageIcon scaledLockIcon = new ImageIcon(scaledLockImage);
                JLabel lockLabel = new JLabel(scaledLockIcon); // 조절된 크기의 lock 이미지 라벨 생성
                horizontalPanel.add(lockLabel); // lock 이미지 라벨을 수평 패널에 추가
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 가격 라벨 추가
        JLabel priceLabel = new JLabel(Integer.toString(seedArray[index - 1].seedPrice)+" 원"); // 씨앗 가격 라벨 생성
        horizontalPanel.add(priceLabel); // 가격 라벨을 수평 패널에 추가

        // 수평 패널을 세로 패널에 추가
        seedPanel.add(horizontalPanel);

        return seedPanel; // 패널 반환
    }

    // 씨앗 패널 선택 메서드
    private void selectSeedPanel(JPanel seedPanel) {
        if (selectedSeedPanel != null) {
            selectedSeedPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0)); // 이전 선택된 패널의 테두리 초기화
        }
        selectedSeedPanel = seedPanel; // 선택된 패널 업데이트
        selectedSeedPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0)); // 이전 선택된 패널의 테두리 초기화
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
