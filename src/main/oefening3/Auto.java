package src.main.oefening3;

public class Auto extends Vervoermiddel {
    private int gewicht;
    private double belasting;
    private String brandstof;

    public void setGewicht(int gewicht) { this.gewicht = gewicht; }
    public int getGewicht() { return this.gewicht; }

    public void setBelasting(double belasting) { this.belasting = belasting; }
    public double getBelasting() { return this.belasting; }

    @Override
    public int getAantalWielen() { return 4; }

    public void setBrandstof(String brandstof) { this.brandstof = brandstof; }
    public String getBrandstof() { return this.brandstof; }

}
