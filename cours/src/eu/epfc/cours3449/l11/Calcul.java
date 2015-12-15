// livre page 316
// static.
//
package eu.epfc.cours3449.l11;

public class Calcul {

    static public int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println(Calcul.factorial(3));
        System.out.println( Calcul.factorial(4) );
    }
}
