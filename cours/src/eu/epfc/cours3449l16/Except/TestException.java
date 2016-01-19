package eu.epfc.cours3449l16.Except;

import java.util.Scanner;

public class TestException {

    public static void main(String[] args) {
        try {
            // code business
            Scanner keyb = new Scanner(System.in);
            int diviseur = keyb.nextInt();
            int n = 3 / diviseur;
            System.out.println(n);
            String[] as = new String[2];
            as[2] = "coucou";
        } catch (ArithmeticException ex) {
            System.out.println("Erreur arithmétique");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println( ex.toString());
        } catch (Exception ex) {
            System.out.println("Une erreur est survenue");            
        } finally {
            // nettoyage
            System.out.println("Finally : Je suis toujours excécuté");
        }
        System.out.println("Dernière ligne : C'est fini");
    }
}
