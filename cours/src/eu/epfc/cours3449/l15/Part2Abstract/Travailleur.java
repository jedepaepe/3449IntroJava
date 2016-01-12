
package eu.epfc.cours3449.l15.Part2Abstract;

public abstract class Travailleur {
    private double revenu = 0;
    
    public abstract double calculImpots();

    public double getRevenu() {
        return revenu;
    }

    public void setRevenu(double revenu) {
        this.revenu = revenu;
    }
    
}
