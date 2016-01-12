
package eu.epfc.cours3449.l15.Part2Abstract;

public class TestAbstract {
    public static void main(String[] args) {
        // Travailleur t = new Travailleur(); // on ne peut instancier de travailleur
        Independant i = new Independant();
        i.setRevenu(500000.0);
        System.out.println("Impôt: " + i.calculImpots());
        
        Employe e = new Employe();
        e.setEmployeur("Tonton Tapis");
        e.setRevenu(120000.0);
        System.out.println("Impôt: " + e.calculImpots());
        
        Travailleur[] ts = {i, e};
        for(int index=0; index<ts.length; index++) {
            System.out.println(ts[index].calculImpots());
        }
        
        // facile
        Travailleur[] nts = {new Independant(), new Employe()};
        
        // rappel
        int[] is = {7, 120, -5};
        int[] js = new int[3];
        js[0] = 7;
        js[1] = 120;
        js[2] = -5;
    }
    
}
