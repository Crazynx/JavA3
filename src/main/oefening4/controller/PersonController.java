package src.main.oefening4.controller;

import src.main.oefening4.model.Person;
import src.main.oefening4.model.PersonModel;
import src.main.oefening4.view.AddView;
import src.main.oefening4.view.PersonView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PersonController {

    private AddView addView;
    private PersonView personView;
    private PersonModel personModel;

    public PersonController(AddView addView, PersonView personView, PersonModel personModel) {
        this.addView = addView;
        this.personView = personView;
        this.personModel = personModel;

        this.personView.addAddButtonListener(new AddListener());
        this.addView.addSubmitButtonListener(new SubmitListener());
    }

    public class AddListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            addView.setVisible(true); // show the tab for inserting a person
        }
    }

    public class SubmitListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            Person person = new Person(); // create new person
            person.setFirstname(addView.getFirstnameField()); // set first name
            person.setLastname(addView.getLastnameField()); // set last name
            personModel.addPerson(person); // add person to the person list

            personView.updatePersonList(personModel.getPersons()); // update person with the person list as parameter

            addView.clearFields(); // empty the fields
            addView.setVisible(false); // hide the tab
        }
    }
}

