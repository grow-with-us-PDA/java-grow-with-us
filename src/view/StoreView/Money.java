package view.StoreView;

import javax.swing.*;
import java.awt.*;

public class Money extends JPanel {
    private JLabel la_money;

    public Money(int money) {
        setLayout(new FlowLayout(FlowLayout.RIGHT));
        setPreferredSize(new Dimension(1000, 50));
        JLabel la_have = new JLabel("현재 보유 금액: ");
        la_have.setFont(new Font("", Font.BOLD, 24));
        add(la_have);

        la_money = new JLabel(Integer.toString(money));
        la_money.setFont(new Font("", Font.BOLD, 24));
        add(la_money);
    }

    public void updateMoney(int money) {
        la_money.setText(Integer.toString(money));
    }
}

