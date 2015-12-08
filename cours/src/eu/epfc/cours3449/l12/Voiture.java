/*
 */

package eu.epfc.cours3449.l12;

public class Voiture extends Vehicule {
    double consommation;
    String couleur;
    public static void main(String[] args) {
        Voiture v = new Voiture();
        v.consommation = 4.5;
        v.couleur = "vert";
        v.age = 15;
        v.start();
        v.stop();
    }
    @Override
    public void start() {
        System.out.println("Voiture " + age + " " + couleur + " "
         + consommation + " start");
    }
}
