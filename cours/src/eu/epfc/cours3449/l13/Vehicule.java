/*
 Exemple d'héritage
 Vehicule est la classe mère ou super-classe
 (Bateau hérite de Vehicule)
 */
package eu.epfc.cours3449.l13;

public class Vehicule {

    private int age;    // en jour

    public void start() {
        System.out.println("Véhicule " + getAge() + " start");
    }

    public void stop() {
        System.out.println("Véhicule " + getAge() + " stop");
    }

    /**
     * @return the age en année
     */
    public int getAge() {
        return age/365;
    }

    /**
     * @param age the age to set en année
     */
    public void setAge(int age) {
        if (age >= 0 && age <= 5000) {
            this.age = age*365;
        }
    }
    
    public int getAge(int unite) {
        switch(unite) {
            case 0: // en jour
                return age;
            case 1: // en année
                getAge();
            default:
                System.err.println("Valeur de code hors limite: " + unite);
        }
        return age;
    }
    
    public void setAge(int age, int unite) {
        switch(unite) {
            case 0: // en jour
                // "bug" : permet d'introduire un age non conforme (<0 ou > 5000 ans)
                this.age = age;
                break;
            case 1: // en année
                setAge(age);
                break;
            default:
                System.err.println("Valeur de code hors limite: " + unite);
        }        
    }

}
