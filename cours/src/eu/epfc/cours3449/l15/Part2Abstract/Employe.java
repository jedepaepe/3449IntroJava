
package eu.epfc.cours3449.l15.Part2Abstract;

public class Employe extends Travailleur{

    String employeur;
    
    @Override
    public double calculImpots() {
        return getRevenu()*35/100;
    }

    public String getEmployeur() {
        return employeur;
    }

    public void setEmployeur(String employeur) {
        this.employeur = employeur;
    }
}
