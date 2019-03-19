package src.main.oefening4;

import src.main.oefening4.controller.PersoonController;
import src.main.oefening4.model.PersoonModel;
import src.main.oefening4.view.PersoonView;
import src.main.oefening4.view.AddView;

import javax.swing.*;

public class Runner {

    public static void main (String[] args) {
        AddView addView = new AddView();
        PersoonView persoonView = new PersoonView();
        PersoonModel persoonModel = new PersoonModel();
        PersoonController persoonController = new PersoonController(addView, persoonView, persoonModel);


        persoonView.setVisible(true);
        addView.setVisible(true);



    }
}
