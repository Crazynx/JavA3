package src.main.oefening2;

public class Auto extends Vervoermiddel {
    private int gewicht;
    private double belasting;

    public void setGewicht(int gewicht) { this.gewicht = gewicht; }
    public int getGewicht() { return this.gewicht; }

    public void setBelasting(double belasting) { this.belasting = belasting; }
    public double getBelasting() { return this.belasting; }

    @Override
    public int getAantalWielen() { return 4; }

}
