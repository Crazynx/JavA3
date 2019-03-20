package src.main.oefening4.controller;

import src.main.oefening4.model.PersoonModel;
import src.main.oefening4.view.AddView;
import src.main.oefening4.view.PersoonView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PersoonController {

    private AddView addView;
    private PersoonView persoonView;
    private PersoonModel persoonModel;

    public PersoonController(AddView addView, PersoonView persoonView, PersoonModel persoonModel) {
        this.addView = addView;
        this.persoonView = persoonView;
        this.persoonModel = persoonModel;

        this.persoonView.addAddButtonListener(new AddListener());
        this.addView.addSubmitButtonListener(new SubmitListener());
    }

    public class AddListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO: add code for filling the list with all persons

            addView.setVisible(true);
        }
    }

    public class SubmitListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            // TODO: add code for creating a new person

            PersoonModel persoon = new PersoonModel();
            persoon.setVoornaam(addView.getFirstnameField());
            persoon.setAchternaam(addView.getLastnameField());
            persoon.setGeboortedatum(addView.getBirthdateField());
            persoon.addPersoon(persoon);

            addView.setVisible(false);

        }
    }
}

