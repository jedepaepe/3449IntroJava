
package eu.epfc.cours3449.l11;

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
    
    public static void main(String[] args) {
        Cercle c1 = new Cercle(10);
        System.out.println(c1.getRayon() + " " + c1.getAire());
        // attention vous accès aux attributs privés
        System.out.println(c1.rayon);
    }
}
