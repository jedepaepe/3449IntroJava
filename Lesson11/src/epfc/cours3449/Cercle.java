
package epfc.cours3449;

public class Cercle {
    private static int nrInstance = 0;
    double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
        nrInstance++;
    }
   
    public double getAire() {
        return Math.PI * rayon * rayon;
    }
    
    static int getNrInstance() {
        return nrInstance;
    }   
}
