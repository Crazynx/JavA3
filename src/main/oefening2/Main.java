package src.main.oefening2;

public class Main {

    public static void main(String[] args) {
        Auto auto1 = new Auto();
        auto1.setMerk("Renault");
        auto1.setType("N4TZ");
        auto1.setKleur("zwart");
        auto1.setBrandstof("gas");
        auto1.setGewicht(947);

        System.out.println("Wegenbelasting is: " + auto1.getWegenbelasting());
    }
}
