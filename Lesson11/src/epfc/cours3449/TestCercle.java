
package epfc.cours3449;

public class TestCercle {
    public static void main(String[] args) {
        creer2Cercles();
        System.out.println(Cercle.getNrInstance());
    }

    private static void creer2Cercles() {
        Cercle c1 = new Cercle(5);
        Cercle c2 = new Cercle(3);
        System.out.println(Cercle.getNrInstance());
        Test2Cercle.test();
    }
}
