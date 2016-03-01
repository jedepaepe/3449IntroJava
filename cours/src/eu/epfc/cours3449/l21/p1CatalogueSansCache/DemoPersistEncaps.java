package eu.epfc.cours3449.l21.p1CatalogueSansCache;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class DemoPersistEncaps {

    static Catalogue cat;
    static final String nomDeFichier = "livre.csv";

    public static void main(String[] args) throws FileNotFoundException, IOException, Exception {
        cat = new Catalogue(nomDeFichier);
        creeDeuxLivres();
        testDeleteNoLivre();        
        lireLeCatalogue();
        TestReadByAuteur();
    }

    private static void TestReadByAuteur() {
        System.out.println("\n\n---------------------------------------------------------------");
        ArrayList<Livre> livresDeVictor = cat.readByAuteur("Victor");
        for (Livre livre : livresDeVictor) {
            System.out.println(livre.toString());
        }
    }

    private static void lireLeCatalogue() {
        ArrayList<Livre> sendCat = cat.read();
        for (Livre livre : sendCat) {
            System.out.println(livre.toString());
        }
    }

    private static void testDeleteNoLivre() {
        try {
            Livre l = new Livre("test", "auteur");
            cat.delete(l.getId());
        } catch (Exception ex) {
            System.out.println( ex);
        }
    }

    private static void creeDeuxLivres() throws FileNotFoundException {
        Livre l1 = new Livre("Notre Dame", "Victor");
        cat.add(l1);
        Livre l2 = new Livre("Java ...", "Orstmann");
        cat.add(l2);
    }
}
