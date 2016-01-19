package eu.epfc.cours3449l16.Except;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestPersonneExcep {

    public static void main(String[] args) {
        Personne p = new Personne();
        try {
            p.setAge(-5);
        } catch (Exception ex) {
            System.out.println(ex.toString());
            ex.printStackTrace();
        }
    }
}
