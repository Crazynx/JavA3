package src.main.oefening4.view;


import src.main.oefening4.controller.PersoonController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class AddView extends JFrame{
    private JButton submitButton;
    private JTextField firstnameField;
    private JTextField lastnameField;
    private JTextField birthdateField;
    private JPanel rootPanelSubmit;

    public AddView() {
        add(rootPanelSubmit);

        setTitle("Persoon toevoegen");
        setSize(300, 140);
    }

    public void addSubmitButtonListener(ActionListener listenForSubmitButton) {
        submitButton.addActionListener(listenForSubmitButton);
    }

    public String getFirstnameField() {
        return firstnameField.getText();
    }

    public String getLastnameField() {
        return lastnameField.getText();
    }

    public String getBirthdateField() {
        return birthdateField.getText();
    }
}
