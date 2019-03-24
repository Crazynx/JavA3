package src.main.eindopdr1;

import src.main.eindopdr1.controller.GameController;
import src.main.eindopdr1.model.GameModel;
import src.main.eindopdr1.view.GameView;

public class Runner {

    public static void main(String[] args) {
        GameView gameView = new GameView();
        GameModel gameModel = new GameModel(gameView);
        GameController gameController = new GameController(gameModel, gameView);

        gameView.setVisible(true);


    }



}
