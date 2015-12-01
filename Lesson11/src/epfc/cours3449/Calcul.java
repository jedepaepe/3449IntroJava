// livre page 316
// mauvais design de factoriel : méthode non dépendante d'un attribut de l'instance 
// donc devrait être static.
//
package epfc.cours3449;

public class Calcul {

    public int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
    public static void main(String[] args) {
        Calcul c = new Calcul();
        System.out.println(c.factorial(3));
        // plus court mais ... pas très lisible
        System.out.println( new Calcul().factorial(4) );
    }
}
