class Main {
    public static void main (String[] args) {
        Persoon persoon1 = new Persoon();
        persoon1.setFirstName("Ben");
        persoon1.setLastName("Dover");
        persoon1.setDateOfBirth("01-01-2001");

        persoon1.getAgeInDays();
    }
}