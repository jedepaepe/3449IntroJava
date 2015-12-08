/*
Exemple d'héritage
Vehicule est la classe mère ou super-classe
(Bateau hérite de Vehicule)
 */

package eu.epfc.cours3449.l12;

public class Vehicule {
    public int age;

    public void start() {
        System.out.println("Véhicule " + age + " start");
    }
    
    public void stop() {
        System.out.println("Véhicule " + age + " stop");
    }
    
    public static void main(String[] args) {
        Vehicule v = new Vehicule();
        v.age = 3;
        v.start();
        v.stop();
    }
}
