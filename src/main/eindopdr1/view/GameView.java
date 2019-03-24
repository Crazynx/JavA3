package src.main.eindopdr1.view;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GameView extends JFrame {
    private JLabel scoreLabel;
    private JButton reset;
    public JButton button1;
    public JButton button2;
    public JButton button3;
    public JButton button4;
    public JButton button5;
    public JButton button6;
    public JButton button7;
    public JButton button8;
    public JButton button9;
    public JButton button10;
    public JButton button11;
    public JButton button12;
    public JButton button13;
    public JButton button14;
    public JButton button15;
    public JButton button16;
    private JPanel rootPanel;

    private JButton[][] buttons;
    private ArrayList<Integer> usedRandIndexes;

    public GameView() {
        add(rootPanel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Memory");
        setSize(460, 530);
        setResizable(false);
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
                buttons[x][y].setBorder(BorderFactory.createEmptyBorder());
                setBackOfCard(buttons[x][y]);
            }
        }
    }

    public void setFrontOfCard(JButton button) {
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("../images/card_" + button.getActionCommand() + ".jpg"));
        button.setIcon(imageIcon);
    }

    public void setBackOfCard(JButton button) {
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("../images/card_back.png"));
        button.setIcon(imageIcon);
    }

    public void setScoreLabel(int score) {
        scoreLabel.setText(score + "");
    }

    public void addButtonListener (ActionListener listenForButton) {
        button1.addActionListener(listenForButton);
        button2.addActionListener(listenForButton);
        button3.addActionListener(listenForButton);
        button4.addActionListener(listenForButton);
        button5.addActionListener(listenForButton);
        button6.addActionListener(listenForButton);
        button7.addActionListener(listenForButton);
        button8.addActionListener(listenForButton);
        button9.addActionListener(listenForButton);
        button10.addActionListener(listenForButton);
        button11.addActionListener(listenForButton);
        button12.addActionListener(listenForButton);
        button13.addActionListener(listenForButton);
        button14.addActionListener(listenForButton);
        button15.addActionListener(listenForButton);
        button16.addActionListener(listenForButton);
    }

    public void addResetListener (ActionListener listenForReset) {
        reset.addActionListener(listenForReset);
    }
}
