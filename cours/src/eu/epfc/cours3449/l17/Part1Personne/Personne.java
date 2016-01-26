
package eu.epfc.cours3449.l17.Part1Personne;

public class Personne {
    private String nom;
    private Adresse adresse;

    public Personne(String nom, Adresse adresse) {
        this.nom = nom;
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Personne{" + "nom=" + nom + ", adresse=" + adresse + '}';
    }
    
    
}
