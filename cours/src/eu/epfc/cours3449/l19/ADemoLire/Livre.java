
package eu.epfc.cours3449.l19.ADemoLire;

import eu.epfc.cours3449.l18.p2Bibliotheque.*;

public class Livre {
    private String identifiant;
    private String place;
    private String dateAchat;

    public Livre() {
    }

    public Livre(String identifiant, String place, String dateAchat) {
        this.identifiant = identifiant;
        this.place = place;
        this.dateAchat = dateAchat;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(String dateAchat) {
        this.dateAchat = dateAchat;
    }

    @Override
    public String toString() {
        return "Livre{" + "identifiant=" + identifiant + ", place=" + place + ", dateAchat=" + dateAchat + '}';
    }    
}
