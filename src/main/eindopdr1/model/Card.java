package src.main.eindopdr1.model;

import javax.swing.*;

public class Card extends JButton {

    private String name;
    private int value;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getValue() { return value; }
    public void setValue() { this.value = value; }
}
