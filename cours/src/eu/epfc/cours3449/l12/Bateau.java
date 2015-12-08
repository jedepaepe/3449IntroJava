/*
Bateau hérite de véhicule (classe fille)
 */

package eu.epfc.cours3449.l12;

public class Bateau extends Vehicule {
    public double tirantDEau;
    
    void larguerLesAmarres() {
        System.out.println("Bateau " + age + " - " + tirantDEau + 
                " largue les amarres");
    }
    
    public static void main(String[] args) {
        Bateau b = new Bateau();
        b.age = 10;
        b.tirantDEau = 12.7;
        b.start();
        b.stop();
        b.larguerLesAmarres();
        
        Vehicule v = b;
        v.age = 11;
        v.start();
        v.stop();
        
        System.out.println(b.age);
    }
}
