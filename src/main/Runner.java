package src.main;

import src.main.oefening4.controller.PersoonController;
import src.main.oefening4.model.PersoonModel;
import src.main.oefening4.view.PersoonView;
import src.main.oefening4.view.AddView;

import javax.swing.*;

public class Runner {

    public static void main (String[] args) {
        PersoonController personController = new PersoonController();
        PersoonModel personModel = new PersoonModel();
        PersoonView personView = new PersoonView();
        AddView addView = new AddView();

        personView.setVisible(true);
        addView.setVisible(true);

        personView.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
