package src.main.eindopdr1.model;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ShuffleArray {

    /* Method for shuffling an array
    * This makes it easier to assign random values to it, because
    * you don't have to assign a random VALUE to a random INDEX of an array*/
    public static void shuffle(JButton[][] arr) {
        Random random = new Random();

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = arr[i].length - 1; j > 0; j--) {
                int m = random.nextInt(i + 1);
                int n = random.nextInt(j + 1);

                JButton temp = arr[i][j];
                arr[i][j] = arr[m][n];
                arr[m][n] = temp;
            }
        }
    }

}
