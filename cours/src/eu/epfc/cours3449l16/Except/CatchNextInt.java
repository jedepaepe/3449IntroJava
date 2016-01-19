package eu.epfc.cours3449l16.Except;

import java.util.Scanner;

public class CatchNextInt {

    /**
     * Hi main method
     *
     * @param args
     */
    public static void main(String[] args) {
        while (true) {
            Scanner keyb = new Scanner(System.in);
            try {
                int i1 = keyb.nextInt();
                int i2 = keyb.nextInt();
                System.out.println(i1 + i2);
                break;
            } catch (Exception ex) {
                keyb.nextLine();
                System.out.println(ex);
            }         }
    }

}
