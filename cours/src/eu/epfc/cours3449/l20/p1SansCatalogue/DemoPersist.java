package eu.epfc.cours3449.l20.p1SansCatalogue;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class DemoPersist {
    static ArrayList<Livre> ls = new ArrayList<>();
    static final String nomDeFichier = "livre.csv";

    public static void main(String[] args) throws FileNotFoundException {
        chargeLivres();
        creeDeuxLivres();
    }

    private static void chargeLivres() throws FileNotFoundException {
        Scanner sc = new Scanner(new File(nomDeFichier));
        while(sc.hasNext()) {
            String line = sc.nextLine();    
            String[] elements = line.split(";");
            Livre l = new Livre(elements[1], elements[2]);
            ls.add(l);
        }
    }

    private static void creeDeuxLivres() throws FileNotFoundException {
        Livre l1 = new Livre("Notre Dame", "Victor");
        ls.add(l1);
        sauveLivres();
        Livre l2 = new Livre("Java ...", "Orstmann");
        ls.add(l2);
        sauveLivres();
    }

    private static void sauveLivres() throws FileNotFoundException {
        File f = new File(nomDeFichier);
        PrintWriter pw = new PrintWriter(f);
        for (Livre l : ls) {
            pw.println(l.toCsv());
        }
        pw.close();
    }
}
