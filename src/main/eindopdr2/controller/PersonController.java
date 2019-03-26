package src.main.eindopdr2.controller;

import src.main.eindopdr2.model.Database;
import src.main.eindopdr2.model.Person;
import src.main.eindopdr2.view.AddView;
import src.main.eindopdr2.view.PersonView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PersonController {

    private AddView addView;
    private PersonView personView;
    private Database database;

    public PersonController(AddView addView, PersonView personView, Database database) {
        this.addView = addView;
        this.personView = personView;
        this.database = database;

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

            database.getConnection(); // start connection

            database.addPerson(person); // add person to database
            personView.updatePersonList(database.getPersons()); // update person with the person list as parameter

            database.closeConnection(); // close connection

            addView.clearFields(); // empty the fields
            addView.setVisible(false); // hide the tab
        }
    }
}

