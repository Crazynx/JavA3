package src.main.oefening4.view;

import src.main.oefening4.model.Person;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.List;

public class PersonView extends JFrame {
    private JButton addButton;
    private JList personList;
    private JPanel rootPanelperson;
    private DefaultListModel<String> model;

    public PersonView() {
        add(rootPanelperson); // add rootpanel

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close tab instead of hiding it

        setTitle("Overzicht van personen"); // set title
        setSize(400, 500); // set size
    }

    public void addAddButtonListener(ActionListener listenForAddButton) { // add action listener for "Toevoegen" button
        addButton.addActionListener(listenForAddButton);
    }

    public void updatePersonList(List<Person> personen) { // update the person list
        model = new DefaultListModel<String>(); // create new model
        for (Person person : personen) { // foreach every person to a new element
            model.addElement("Naam: " + person.getFirstname() + " " + person.getLastname());
        }
        personList.setModel(model); // set the list to model
    }


}
