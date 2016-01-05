package eu.epfc.cours3449.l13exercices;

import java.util.Objects;

public class Personne {

    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;
    private int age;
    private String nationalite;

    public Personne() {
    }

    public Personne(String nom, String prenom, String adresse, String telephone, int age, String nationalite) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.age = age;
        this.nationalite = nationalite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    @Override
    public String toString() {
        return nom + ", "
                + prenom + ", "
                + adresse + ", "
                + telephone + ", "
                + age + ", "
                + nationalite;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (! (obj instanceof Personne)) {
            return false;
        }
        final Personne other = (Personne) obj;
        if (! nom.equals(other.nom)) {
            return false;
        }
        if (! prenom.equals(other.prenom)) {
            return false;
        }
        if (! adresse.equals(other.adresse)) {
            return false;
        }
        if (! telephone.equals(other.telephone)) {
            return false;
        }
        if ( age != other.age) {
            return false;
        }
        if (! nationalite.equals(other.nationalite)) {
            return false;
        }
        return true;
    }
    

}
