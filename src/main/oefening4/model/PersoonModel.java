package src.main.oefening4.model;

import java.util.ArrayList;
import java.util.List;

public class PersoonModel {

    private String voornaam;
    private String achternaam;
    private String geboortedatum;
    private List<PersoonModel> personen = new ArrayList<>();

    public void setVoornaam(String voornaam) { this.voornaam = voornaam; }
    public String getVoornaam() { return voornaam; }

    public void setAchternaam(String achternaam) { this.achternaam = achternaam; }
    public String getAchternaam() { return achternaam; }

    public void setGeboortedatum(String geboortedatum) { this.geboortedatum = geboortedatum; }
    public String getGeboortedatum() { return geboortedatum; }

    public void addPersoon(PersoonModel persoon) {
        personen.add(persoon);
    }

    public List<PersoonModel> getPersonen() {
        return personen;
    }
}
