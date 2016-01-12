
package eu.epfc.cours3449.l15.Part2Abstract;

public class Statutaire extends Travailleur{

    @Override
    public double calculImpots() {
        return getRevenu()/25;
    }
    
}
