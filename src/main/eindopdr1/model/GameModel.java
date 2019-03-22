package src.main.eindopdr1.model;

import javax.swing.*;
import java.util.ArrayList;

public class GameModel {

    private static JButton[][] buttons;
    private ArrayList usedRandIndexes = new ArrayList(8) {
    };

    public GameModel(JButton[][] buttons) {
        initButtons(buttons);

    }

    public void initButtons(JButton[][] buttons) {
        ShuffleArray.shuffle(buttons); // shuffle array
        setRandomValueToButtons(buttons); // assign values in pairs of two

    }

    private void setRandomValueToButtons(JButton[][] buttons) {
        for (int x = 0; x < buttons.length; x++) {
            for (int y = 0; y < buttons[x].length; y++) {
                // TODO: Create pairs of 2 with the same value, the value has to be an UNIQUE random int between 1 and 8
                int randIndex = (int) (Math.random() * 8 + 1);
                // TODO: Check if randIndex is unique
                if (!usedRandIndexes.contains(randIndex)) {
                    ImageIcon imageIcon = new ImageIcon(getClass().getResource("../images/card_" + randIndex +".jpg"));
                    buttons[x][y].setIcon(imageIcon);
                    buttons[x][++y].setIcon(imageIcon);
                    usedRandIndexes.add(randIndex);
                } else {
                    System.out.println("else");
                    while (true) {
                        randIndex = (int) (Math.random() * 8 + 1);
                        if (!usedRandIndexes.contains(randIndex)) {
                            ImageIcon imageIcon = new ImageIcon(getClass().getResource("../images/card_" + randIndex +".jpg"));
                            buttons[x][y].setIcon(imageIcon);
                            buttons[x][++y].setIcon(imageIcon);
                            usedRandIndexes.add(randIndex);
                            break;
                        }
                    }
                }
            }
    }

}



}
