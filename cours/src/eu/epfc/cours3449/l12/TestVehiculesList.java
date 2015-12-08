/*
 */
package eu.epfc.cours3449.l12;

public class TestVehiculesList {

    public static void main(String[] args) {
        Vehicule[] vs = new Vehicule[4];
        vs[0] = new Vehicule();
        vs[0].age = 1;
        vs[1] = new Bateau();
        vs[1].age = 2;
        vs[2] = new Voiture();
        vs[2].age = 3;
        vs[3] = new Bateau();
        vs[3].age = 4;
        for(int i=0; i<vs.length; i++) {
            vs[i].start();
        }
        for(int i=0; i<vs.length; i++) {
            vs[i].stop();
        }
    }
}
