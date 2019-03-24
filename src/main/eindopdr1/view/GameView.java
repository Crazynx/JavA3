package src.main.eindopdr1.view;

import javax.swing.*;
import java.util.ArrayList;

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

    private JButton[][] buttons;
    private ArrayList<Integer> usedRandIndexes;

    public GameView() {
        add(rootPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 500);
    }

    public JButton[][] getButtons() {
        buttons = new JButton[4][4];
        buttons[0][0] = button1;
        buttons[0][1] = button2;
        buttons[0][2] = button3;
        buttons[0][3] = button4;

        buttons[1][0] = button5;
        buttons[1][1] = button6;
        buttons[1][2] = button7;
        buttons[1][3] = button8;

        buttons[2][0] = button9;
        buttons[2][1] = button10;
        buttons[2][2] = button11;
        buttons[2][3] = button12;

        buttons[3][0] = button13;
        buttons[3][1] = button14;
        buttons[3][2] = button15;
        buttons[3][3] = button16;
        return buttons;
    }

    public void setValueToButtons(JButton[][] buttons) { // set icons to buttons in pairs of two
        usedRandIndexes  = new ArrayList<>(8); // initialize arraylist
        for (int x = 0; x < buttons.length; x++) {
            for (int y = 0; y < buttons[x].length; y++) {
                while (true) {
                    int randIndex = (int) (Math.random() * 8 + 1); // create random index
                    if (!usedRandIndexes.contains(randIndex)) { // check if random index isn't already used
                        buttons[x][y].setActionCommand(randIndex + ""); // set icon to button
                        buttons[x][++y].setActionCommand(randIndex + ""); // set icon to button
                        usedRandIndexes.add(randIndex); // add rand index to used rand indexes
                        break;
                    }
                }
            }
        }
    }

    public void setBackOfCards(JButton[][] buttons) {
        for (int x = 0; x < buttons.length; x++) {
            for (int y = 0; y < buttons[x].length; y++) {
                setBackOfCard(buttons[x][y]);
            }
        }
    }

    public void setBackOfCard(JButton button) {
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("../images/card_back.png"));
        button.setIcon(imageIcon);
        System.out.println(button.getActionCommand());
    }
}
