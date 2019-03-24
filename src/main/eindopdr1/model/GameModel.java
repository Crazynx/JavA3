package src.main.eindopdr1.model;

import src.main.eindopdr1.view.GameView;

import javax.swing.*;

public class GameModel {

    private GameView gameView;

    public GameModel(GameView gameView) {
        this.gameView = gameView;
        initButtons(gameView.getButtons()); // initialize buttons
    }

    public void initButtons(JButton[][] buttons) {
        ShuffleArray.shuffle(buttons); // shuffle array
//        gameView.setBackOfCards(buttons); // set the back of cards
        gameView.setValueToButtons(buttons); // assign values in pairs of two
    }



}

