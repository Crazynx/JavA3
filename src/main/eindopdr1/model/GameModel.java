package src.main.eindopdr1.model;

import src.main.eindopdr1.view.GameView;

import javax.swing.*;

public class GameModel {

    private static JButton[][] buttons;

    public GameModel() {
        initButtons();

    }

    public void initButtons() {
        createButtons(); // generate buttons
        ShuffleArray.shuffle(buttons); // shuffle array
        setRandomValueToButtons(buttons); // assign values in pairs of two

    }

    public static JButton[][] getButtons() {
        return buttons;
    }

    public void createButtons() {
        buttons = new JButton[4][4];
        buttons[0][0] = new JButton("button1");
        buttons[0][1] = new JButton("button2");
        buttons[0][2] = new JButton("button3");
        buttons[0][3] = new JButton("button4");

        buttons[1][0] = new JButton("button5");
        buttons[1][1] = new JButton("button6");
        buttons[1][2] = new JButton("button7");
        buttons[1][3] = new JButton("button8");

        buttons[2][0] = new JButton("button9");
        buttons[2][1] = new JButton("button10");
        buttons[2][2] = new JButton("button11");
        buttons[2][3] = new JButton("button12");

        buttons[3][0] = new JButton("button13");
        buttons[3][1] = new JButton("button14");
        buttons[3][2] = new JButton("button15");
        buttons[3][3] = new JButton("button16");
    }

    private void setRandomValueToButtons(JButton[][] buttons) {
        for (int x = 0; x < buttons.length; x++) {
            for (int y = 0; y < buttons[x].length; y++) {
                // TODO: Create pairs of 2 with the same value, the value has to be an UNIQUE random int between 1 and 8
                int randIndex = (int) (Math.random() * 8 + 1);
                // TODO: Check if randIndex is unique
                ImageIcon imageIcon = new ImageIcon("../images/card_" + randIndex +".jpg");
                buttons[x][y].setIcon(imageIcon);
                buttons[x][y].setActionCommand(randIndex + "");
                buttons[x][++y].setIcon(imageIcon);
                buttons[x][y].setActionCommand(randIndex + "");
        }
    }

}



}
