package src.main.oefening4.model;

import java.util.ArrayList;
import java.util.List;

public class PersonModel {

    private List<Person> persons = new ArrayList<>();

    public void addPerson(Person person) { // add person to list of persons
        persons.add(person);
    }

    public List<Person> getPersons() { // get the list of persons
        return persons;
    }
}
