package src.main.oefening4.controller;

import src.main.oefening4.model.PersoonModel;
import src.main.oefening4.view.PersoonView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PersoonController {

    private PersoonView persoonView;
    private PersoonModel persoonModel;

    public PersoonController() {
//        this.persoonView = persoonView;
//        this.persoonModel = persoonModel;
    }

    public static class addListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO: add code for filling the list with all persons
        }
    }

    public static class SubmitListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO: add code for submitting a new person
        }
    }
}

