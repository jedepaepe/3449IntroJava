
package eu.epfc.cours3449.l15.Part2Abstract;

public class Independant extends Travailleur {

    @Override
    public double calculImpots() {
        return getRevenu()/10;
    }
}
