package src.main.eindopdr1.model;

import src.main.eindopdr1.view.GameView;

import javax.swing.*;

public class GameModel {

    private GameView gameView;
    private int score;

    public GameModel(GameView gameView) {
        this.gameView = gameView;
        initButtons(gameView.getButtons()); // initialize buttons
    }

    public void initButtons(JButton[][] buttons) {
        ShuffleArray.shuffle(buttons); // shuffle array
        gameView.setBackOfCards(buttons); // set the back of cards
        gameView.setValueToButtons(buttons); // assign values in pairs of two
    }

    public int resetScore() {
        score = 0; // set score to 0
        return score;
    }

    public int incrementScore() {
        return ++score; // increment score by 1
    }



}

