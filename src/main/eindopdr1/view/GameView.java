package src.main.eindopdr1.view;

import src.main.eindopdr1.controller.GameController;
import src.main.eindopdr1.model.GameModel;

import javax.swing.*;

public class GameView extends JFrame {
    private JButton Reset;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private JPanel rootPanel;

    public GameView() {
        addButtonsToFrame(GameModel.getButtons());
        add(rootPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 500);
    }

    public void addButtonsToFrame(JButton[][] buttons) {
        for (int x = 0; x < buttons.length; x++) {
            for (int y = 0; y < buttons[x].length; y++) {
                add(buttons[x][y]);
            }
        }
    }
}
