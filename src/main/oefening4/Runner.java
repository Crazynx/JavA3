package src.main.oefening4;

import src.main.oefening4.controller.PersonController;
import src.main.oefening4.model.PersonModel;
import src.main.oefening4.view.AddView;
import src.main.oefening4.view.PersonView;

public class Runner {

    public static void main(String[] args) {
        AddView addView = new AddView();
        PersonView personView = new PersonView();
        PersonModel personModel = new PersonModel();
        PersonController personController = new PersonController(addView, personView, personModel);

        personView.setVisible(true); // show the program tab
    }

}
