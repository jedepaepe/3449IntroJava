
package eu.epfc.cours3449.l21.p1CatalogueSansCache;

import eu.epfc.cours3449.l21.p2DB.*;

public class Livre {
    private static int count = 0;
    private int id;     // id technique
    private String titre;
    private String auteur;

    public Livre(String titre, String auteur) {
        count++;
        this.id = count;
        this.titre = titre;
        this.auteur = auteur;
    }

    Livre(int id, String titre, String auteur) {
        if(id > count) count = id;
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
    }

    public int getId() {
        return id;
    }
    
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
    
    public String toCsv() {
        return id + ";" + titre + ";" + auteur;
    }

    @Override
    public String toString() {
        return "Livre{" + "id=" + id + ", titre=" + titre + ", auteur=" + auteur + '}';
    }
    
    
}
