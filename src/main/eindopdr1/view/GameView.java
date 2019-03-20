package src.main.eindopdr1.view;

import javax.swing.*;
import java.awt.event.ActionListener;

public class GameView extends JFrame {
    private JButton card1;
    private JButton card2;
    private JButton card3;
    private JButton card4;
    private JButton card5;
    private JButton card6;
    private JButton card7;
    private JButton card8;
    private JButton card9;
    private JButton card10;
    private JButton card11;
    private JButton card12;
    private JButton card13;
    private JButton card14;
    private JButton card15;
    private JButton card16;
    private JLabel scoreLabel;
    private JButton restartButton;
    private JPanel rootPanel;

    public GameView() { // constructor
        add(rootPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setTitle("Memory");
        setSize(340, 340);
    }

    public void addRestartButtonListener(ActionListener listenForRestartButton) {
        restartButton.addActionListener(listenForRestartButton);
    }

    public void turnDownCards() {

    }

    public void setScoreLabel(int score) {
        scoreLabel.setText(Integer.toString(score));
    }



}
