
package epfc.cours3449;

public class Cercle {
    private static int nrInstance = 0;
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
        nrInstance++;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }    
   
    public double getAire() {
        return Math.PI * rayon * rayon;
    }
    
    static int getNrInstance() {
        return nrInstance;
    }
}
