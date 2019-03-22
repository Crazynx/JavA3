package src.main.eindopdr1;

import src.main.eindopdr1.model.ShuffleArray;

import javax.swing.*;
import java.util.Arrays;

public class UnitTest {

    public static void main(String[] args) {

        ShuffleArray shuffleArray = new ShuffleArray();
        JButton[][] buttons = new JButton[2][3];

        buttons[0][0] = new JButton("button1");
        buttons[0][1] = new JButton("button2");
        buttons[0][2] = new JButton("button3");

        buttons[1][0] = new JButton("button4");
        buttons[1][1] = new JButton("button5");
        buttons[1][2] = new JButton("button6");

        System.out.println(Arrays.deepToString(buttons));
        for (int x = 0; x < buttons.length; x++) {
            for (int y = 0; y < buttons[x].length; y++) {
                System.out.println(buttons[x][y].getText());
            }
        }

        shuffleArray.shuffle(buttons);

        System.out.println();

        for (int x = 0; x < buttons.length; x++) {
            for (int y = 0; y < buttons[x].length; y++) {
                System.out.println(buttons[x][y].getText());
            }
        }

        System.out.println(Arrays.deepToString(buttons));



    }
}
