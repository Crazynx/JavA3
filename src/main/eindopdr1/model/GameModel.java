package src.main.eindopdr1.model;

import src.main.eindopdr1.view.GameView;

import javax.swing.*;
import java.util.ArrayList;

public class GameModel {

    private ArrayList<Integer> usedRandIndexes;
    private GameView gameView;

    public GameModel(GameView gameView) {
        this.gameView = gameView;
        initButtons(gameView.getButtons()); // initialize buttons
    }

    public void initButtons(JButton[][] buttons) {
        ShuffleArray.shuffle(buttons); // shuffle array
        gameView.setBackOfCards(buttons);
        gameView.setValueToButtons(buttons); // assign values in pairs of two


    }



}

