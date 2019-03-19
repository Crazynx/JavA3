package src.main.oefening1;

class Main {
    public static void main (String[] args) {
        person person1 = new person(); // create new person
        person1.setFirstName("Ben"); // set first name
        person1.setLastName("Dover"); // set last name
        person1.setDateOfBirth(2001, 01, 01); // set age of birth

        System.out.println(person1.getAgeInDays()); // calculate age in days and output to screen
    }
}