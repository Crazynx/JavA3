package src.main.eindopdr1.view;

import src.main.eindopdr1.model.Card;

import javax.swing.*;

public class GameView extends JFrame {
    private JLabel scoreLabel;
    private JButton restartButton;
    private JPanel rootPanel;

    public GameView() { // constructor

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Memory");
        setSize(340, 340);
    }

}
