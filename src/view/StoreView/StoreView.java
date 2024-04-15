package view.StoreView;

import controller.StoreController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StoreView extends JFrame implements ActionListener {
    StoreController storeController;
    public StoreView(StoreController storeController) {
        this.storeController = storeController;
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
