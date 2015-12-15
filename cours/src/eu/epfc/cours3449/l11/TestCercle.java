package eu.epfc.cours3449.l11;

public class TestCercle {

    public static void main(String[] args) {
        System.out.println(Cercle.getNrInstance());
        creer3Cercles();
        System.out.println(Cercle.getNrInstance());
    }

    private static void creer3Cercles() {
        Cercle c1 = new Cercle(5);
        Cercle c2 = new Cercle(3);
        System.out.println(Cercle.getNrInstance());
        Test2Cercle.test();
    }
}
