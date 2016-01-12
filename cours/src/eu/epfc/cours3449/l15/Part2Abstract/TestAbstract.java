
package eu.epfc.cours3449.l15.Part2Abstract;

public class TestAbstract {
    public static void main(String[] args) {
        // Travailleur t = new Travailleur(); // on ne peut instancier de travailleur
        Independant i = new Independant();
        i.setRevenu(500000.0);
        System.out.println("Impôt: " + i.calculImpots());
    }
    
}
