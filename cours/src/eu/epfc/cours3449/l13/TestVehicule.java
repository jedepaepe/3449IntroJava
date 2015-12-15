package eu.epfc.cours3449.l13;

public class TestVehicule {
    public static void main(String[] args) {
        Vehicule v = new Vehicule();
        v.setAge(3);
        v.start();
        v.stop();
        v.setAge(-5);
        System.out.println("l'attribut age n'a pas changé ! : " + v.getAge());
        v.setAge(8721, 0);
        System.out.println("Années " + v.getAge() + " - jours " + v.getAge(0));
    }    
}
