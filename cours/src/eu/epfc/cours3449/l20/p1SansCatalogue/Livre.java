
package eu.epfc.cours3449.l20.p1SansCatalogue;

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
}
