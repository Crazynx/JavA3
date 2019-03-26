package src.main.eindopdr2;

import src.main.eindopdr2.model.Database;
import src.main.eindopdr2.controller.PersonController;
import src.main.eindopdr2.view.AddView;
import src.main.eindopdr2.view.PersonView;

public class Runner {

    public static void main(String[] args) {
        AddView addView = new AddView();
        PersonView personView = new PersonView();
        Database database = new Database();
        PersonController personController = new PersonController(addView, personView, database);

        database.getConnection();
        personView.updatePersonList(database.getPersons());

        personView.setVisible(true); // show the program tab
    }

}
