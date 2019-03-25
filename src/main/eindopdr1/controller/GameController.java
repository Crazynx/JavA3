package src.main.eindopdr1.controller;

import src.main.eindopdr1.model.GameModel;
import src.main.eindopdr1.view.GameView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameController {

    private GameView gameView;
    private GameModel gameModel;
    private JButton previousButton = new JButton();
    private JButton currentButton = new JButton();
    private int timesButtonPressed = 0;

    public GameController(GameModel gameModel, GameView gameView) {
        this.gameView = gameView;
        this.gameModel = gameModel;

        gameView.addButtonListener(new ButtonListener()); // button listener for "cards"
        gameView.addResetListener(new ResetListener()); // button listener for the reset button
    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton[][] buttons = gameView.getButtons(); //
            timesButtonPressed++;
            previousButton = currentButton; // switch the buttons
            for (int x = 0; x < buttons.length; x++) {
                for (int y = 0; y < buttons[x].length; y++) {
                    if (e.getSource() == buttons[x][y]) { // check which button is pressed
                        currentButton = buttons[x][y]; // assign button to current button
                        gameView.setFrontOfCard(buttons[x][y]); // turn card to front
                    }
                }
            }

            if (timesButtonPressed == 2) {
                if (currentButton.getActionCommand().equals(previousButton.getActionCommand())
                && currentButton != previousButton) { // check if the values match, and if the card is not matching itself
                    gameView.setScoreLabel(gameModel.incrementScore()); //
                } else {
                    int delay = 500; // delay, after 0.5 secs
                    Timer timer = new Timer( delay, new ActionListener(){
                        @Override
                        public void actionPerformed( ActionEvent e ){
                        gameView.setBackOfCard(currentButton); // turn card
                        gameView.setBackOfCard(previousButton); // turn card
                        }
                    } );
                    timer.setRepeats( false ); // disable repeat
                    timer.start(); // start the timer
                }
                timesButtonPressed = 0; // reset back to 0
            }
        }
    }

    private class ResetListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) { // reset back to standard values
            gameModel.initButtons(gameView.getButtons()); // initialize buttons, the values will be set back to normal
            gameView.setScoreLabel(gameModel.resetScore()); // reset value back to 0

        }
    }

}
