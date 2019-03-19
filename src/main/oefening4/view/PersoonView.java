package src.main.oefening4.view;

import src.main.oefening4.controller.PersoonController;

import javax.swing.*;
import java.awt.event.ActionListener;

public class PersoonView extends JFrame {
    private JButton addButton;
    private JList personList;
    private JPanel rootPanelperson;

    public PersoonView() {
        add(rootPanelperson); // get form

        setTitle("Overzicht van personen"); // set title
        setSize(400, 500); // set size

        ActionListener addButtonListener = new PersoonController.addListener();
        addButton.addActionListener(addButtonListener);
    }
}
