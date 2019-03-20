package src.main.oefening4.view;


import javax.swing.*;
import java.awt.event.ActionListener;

public class AddView extends JFrame{
    private JButton submitButton;
    private JTextField firstnameField;
    private JTextField lastnameField;
    private JTextField birthdateField;
    private JPanel rootPanelSubmit;

    public AddView() {
        add(rootPanelSubmit); // add rootpanel

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close when tab is closed instead of hiding tab

        setTitle("Persoon toevoegen"); // set title
        setSize(300, 140); // set size
    }

    public void addSubmitButtonListener(ActionListener listenForSubmitButton) { // action listener for submit button
        submitButton.addActionListener(listenForSubmitButton);
    }

    public void clearFields() { // clear the fields
        setFirstnameField("");
        setLastnameField("");
        setBirthdateField("");
    }

    /* SETTERS
                 &
                      GETTERS */

    public String getFirstnameField() {
        return firstnameField.getText();
    }
    public void setFirstnameField(String text) { firstnameField.setText(text);}

    public String getLastnameField() {
        return lastnameField.getText();
    }
    public void setLastnameField(String text) { lastnameField.setText(text);}

    public String getBirthdateField() {
        return birthdateField.getText();
    }
    public void setBirthdateField(String text) { birthdateField.setText(text);}

}
