package src.main.oefening1;

class Main {
    public static void main (String[] args) {
        Persoon persoon1 = new Persoon(); // create new person
        persoon1.setFirstName("Ben"); // set first name
        persoon1.setLastName("Dover"); // set last name
        persoon1.setDateOfBirth(2001, 01, 01); // set age of birth

        System.out.println(persoon1.getAgeInDays()); // calculate age in days and output to screen
    }
}