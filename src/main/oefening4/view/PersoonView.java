package src.main.oefening4.view;

import src.main.oefening4.controller.PersoonController;
import src.main.oefening4.model.PersoonModel;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class PersoonView extends JFrame {
    private JButton addButton;
    private JList personList;
    private JPanel rootPanelperson;

    public PersoonView() {
        add(rootPanelperson); // get form

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setTitle("Overzicht van personen"); // set title
        setSize(400, 500); // set size
    }

    public void addAddButtonListener(ActionListener listenForAddButton) {
        addButton.addActionListener(listenForAddButton);
    }

}
