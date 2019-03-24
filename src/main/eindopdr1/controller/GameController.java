package src.main.eindopdr1.controller;

import src.main.eindopdr1.model.GameModel;
import src.main.eindopdr1.view.GameView;

import javax.swing.*;
import java.awt.*;
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

        gameView.addButtonListener(new ButtonListener());
        gameView.addResetListener(new ResetListener());
    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            timesButtonPressed++;
            previousButton = currentButton;
            if (e.getSource() == gameView.button1) {
                currentButton = gameView.button1;
                gameView.setFrontOfCard(gameView.button1);
                System.out.println(e.getActionCommand());
            } else if (e.getSource() == gameView.button2) {
                currentButton = gameView.button2;
                gameView.setFrontOfCard(gameView.button2);
                System.out.println(e.getActionCommand());
            } else if (e.getSource() == gameView.button3) {
                currentButton = gameView.button3;
                gameView.setFrontOfCard(gameView.button3);
                System.out.println(e.getActionCommand());
            } else if (e.getSource() == gameView.button4) {
                currentButton = gameView.button4;
                gameView.setFrontOfCard(gameView.button4);
                System.out.println(e.getActionCommand());
            } else if (e.getSource() == gameView.button5) {
                currentButton = gameView.button5;
                gameView.setFrontOfCard(gameView.button5);
                System.out.println(e.getActionCommand());
            } else if (e.getSource() == gameView.button6) {
                currentButton = gameView.button6;
                gameView.setFrontOfCard(gameView.button6);
                System.out.println(e.getActionCommand());
            } else if (e.getSource() == gameView.button7) {
                currentButton = gameView.button7;
                gameView.setFrontOfCard(gameView.button7);
                System.out.println(e.getActionCommand());
            } else if (e.getSource() == gameView.button8) {
                currentButton = gameView.button8;
                gameView.setFrontOfCard(gameView.button8);
                System.out.println(e.getActionCommand());
            } else if (e.getSource() == gameView.button9) {
                currentButton = gameView.button9;
                gameView.setFrontOfCard(gameView.button9);
                System.out.println(e.getActionCommand());
            } else if (e.getSource() == gameView.button10) {
                currentButton = gameView.button10;
                gameView.setFrontOfCard(gameView.button10);
                System.out.println(e.getActionCommand());
            } else if (e.getSource() == gameView.button11) {
                currentButton = gameView.button11;
                gameView.setFrontOfCard(gameView.button11);
                System.out.println(e.getActionCommand());
            } else if (e.getSource() == gameView.button12) {
                currentButton = gameView.button12;
                gameView.setFrontOfCard(gameView.button12);
                System.out.println(e.getActionCommand());
            } else if (e.getSource() == gameView.button13) {
                currentButton = gameView.button13;
                gameView.setFrontOfCard(gameView.button13);
                System.out.println(e.getActionCommand());
            } else if (e.getSource() == gameView.button14) {
                currentButton = gameView.button14;
                gameView.setFrontOfCard(gameView.button14);
                System.out.println(e.getActionCommand());
            } else if (e.getSource() == gameView.button15) {
                currentButton = gameView.button15;
                gameView.setFrontOfCard(gameView.button15);
                System.out.println(e.getActionCommand());
            } else if (e.getSource() == gameView.button16) {
                currentButton = gameView.button16;
                gameView.setFrontOfCard(gameView.button16);
                System.out.println(e.getActionCommand());
            }

//            if (currentButton.getActionCommand().equals(previousButton.getActionCommand())
//            && currentButton != previousButton) {
//                gameView.setFrontOfCard(currentButton);
//                gameView.setFrontOfCard(previousButton);
//                gameView.setScoreLabel(gameModel.incrementScore());
//                currentButton = new JButton();
//                previousButton = new JButton();
//                System.out.println("match");
//            } else if (!currentButton.getActionCommand().equals(previousButton.getActionCommand())) {
////                gameView.setBackOfCard(currentButton);
//
//            }

            if (timesButtonPressed == 2) {
                if (currentButton.getActionCommand().equals(previousButton.getActionCommand())
                && currentButton != previousButton) {
                    gameView.setScoreLabel(gameModel.incrementScore());
                } else {
                    int delay = 500;
                    Timer timer = new Timer( delay, new ActionListener(){
                        @Override
                        public void actionPerformed( ActionEvent e ){
                        gameView.setBackOfCard(currentButton);
                        gameView.setBackOfCard(previousButton);
                        }
                    } );
                    timer.setRepeats( false );
                    timer.start();
                }
                timesButtonPressed = 0;
            }


        }
    }




    private class ResetListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println();
        }
    }

}
