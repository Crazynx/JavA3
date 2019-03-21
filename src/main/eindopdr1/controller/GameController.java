package src.main.eindopdr1.controller;

import src.main.eindopdr1.model.GameModel;
import src.main.eindopdr1.view.GameView;

public class GameController {

    private GameView gameView;
    private GameModel gameModel;

    public GameController(GameModel gameModel, GameView gameView) {
        this.gameView = gameView;
        this.gameModel = gameModel;

    }
}
