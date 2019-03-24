package src.main.eindopdr1;

import src.main.eindopdr1.controller.GameController;
import src.main.eindopdr1.model.GameModel;
import src.main.eindopdr1.view.GameView;

import javax.swing.*;

public class Runner {

    public static void main(String[] args) {
        GameView gameView = new GameView();
        GameModel gameModel = new GameModel(gameView);
        GameController gameController = new GameController(gameModel, gameView);

        gameView.setVisible(true);

//        JButton[][] buttons = gameView.getButtons();
//
//        for (int x = 0; x < buttons.length; x++) {
//            for (int y = 0; y < buttons[x].length; y++) {
//                System.out.println(buttons[x][y].getActionCommand());
//            }
//            System.out.println("--------------------------");
//        }
    }



}
