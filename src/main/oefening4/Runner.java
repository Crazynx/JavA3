package src.main.oefening4;

import src.main.oefening4.controller.PersoonController;
import src.main.oefening4.model.PersoonModel;
import src.main.oefening4.view.AddView;
import src.main.oefening4.view.PersoonView;

public class Runner {

    public static void main(String[] args) {
        AddView addView = new AddView();
        PersoonView persoonView = new PersoonView();
        PersoonModel persoonModel = new PersoonModel();
        PersoonController persoonController = new PersoonController(addView, persoonView, persoonModel);

        persoonView.setVisible(true);
    }

}
