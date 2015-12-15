/*
 Exemple d'héritage
 Vehicule est la classe mère ou super-classe
 (Bateau hérite de Vehicule)
 */
package eu.epfc.cours3449.l13;

public class Vehicule {

    private int age;

    public void start() {
        System.out.println("Véhicule " + getAge() + " start");
    }

    public void stop() {
        System.out.println("Véhicule " + getAge() + " stop");
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        if (age >= 0 && age <= 5000) {
            this.age = age;
        }
    }

}
