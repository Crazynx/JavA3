package src.main.eindopdr1.controller;

import src.main.eindopdr1.model.GameModel;
import src.main.eindopdr1.view.GameView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameController {

    private GameView gameView;
    private GameModel gameModel;
    private JButton[][] buttons;

    public GameController(GameModel gameModel, GameView gameView) {
        this.gameView = gameView;
        this.gameModel = gameModel;

        gameView.addButtonListener(new ButtonListener());
        gameView.addResetListener(new ResetListener());


    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == gameView.button1) {
                System.out.println(e.getActionCommand());
            } else if (e.getSource() == gameView.button2) {
                System.out.println(e.getActionCommand());
            } else if (e.getSource() == gameView.button3) {
                System.out.println(e.getActionCommand());
            } else if (e.getSource() == gameView.button4) {
                System.out.println(e.getActionCommand());
            } else if (e.getSource() == gameView.button5) {
                System.out.println(e.getActionCommand());
            } else if (e.getSource() == gameView.button6) {
                System.out.println(e.getActionCommand());
            } else if (e.getSource() == gameView.button7) {
                System.out.println(e.getActionCommand());
            } else if (e.getSource() == gameView.button8) {
                System.out.println(e.getActionCommand());
            } else if (e.getSource() == gameView.button9) {
                System.out.println(e.getActionCommand());
            } else if (e.getSource() == gameView.button10) {
                System.out.println(e.getActionCommand());
            } else if (e.getSource() == gameView.button11) {
                System.out.println(e.getActionCommand());
            } else if (e.getSource() == gameView.button12) {
                System.out.println(e.getActionCommand());
            } else if (e.getSource() == gameView.button13) {
                System.out.println(e.getActionCommand());
            } else if (e.getSource() == gameView.button14) {
                System.out.println(e.getActionCommand());
            } else if (e.getSource() == gameView.button15) {
                System.out.println(e.getActionCommand());
            } else if (e.getSource() == gameView.button16) {
                System.out.println(e.getActionCommand());
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
