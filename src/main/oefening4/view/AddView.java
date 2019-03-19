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

        setTitle("person toevoegen");
        setSize(300, 140);

        ActionListener submitButtonListener = new PersoonController.SubmitListener();
        submitButton.addActionListener(submitButtonListener);
    }
}
