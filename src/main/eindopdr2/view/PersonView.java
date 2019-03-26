package src.main.eindopdr2.view;

import src.main.eindopdr2.model.Person;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
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

    public void updatePersonList(ResultSet resultSet) { // update the person list
        model = new DefaultListModel<>(); // create new model

        while (true) { // loop for adding first and last name to the model from the database
            try {
                if (!resultSet.next()) break;
                model.addElement("Naam: " + resultSet.getString("firstname") +
                        " " + resultSet.getString("lastname"));
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        personList.setModel(model); // set the list to model
    }


}
