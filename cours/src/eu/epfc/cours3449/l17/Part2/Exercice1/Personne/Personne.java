package eu.epfc.cours3449.l17.Part2.Exercice1.Personne;

import java.util.ArrayList;

public class Personne {
    String nom;
    ArrayList<Adresse> adresses = new ArrayList<>();

    public Personne(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Personne{" + "adresses=" + adresses + '}';
    }
    
    public void add(Adresse a) {
        adresses.add(a);
    } 
    
    
}
