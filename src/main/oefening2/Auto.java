package src.main.oefening2;

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

    public double getWegenbelasting() {
        switch(this.brandstof) {
            case "benzine":
                if (this.gewicht <= 1000) {
                    return 241.45;
                } else {
                    return 584.89;
                }

            case "diesel":
                if (this.gewicht <= 900) {
                    return 182.24;
                } else {
                    return 499.99;
                }

            case "gas":
                if (this.gewicht <= 1100) {
                    return 309.83;
                } else {
                    return 629.92;
                }

            default:
                return 0.00;
        }
    }

}
