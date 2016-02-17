package eu.epfc.cours3449.l18.p2Bibliotheque;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class GestionLivres {

    private static String dbFile = "livres.txt";

    public static void main(String[] args) throws IOException {
        ArrayList<Livre> livres = new ArrayList<>();
        File file = new File(dbFile);
        if (!file.exists()) {
            file.createNewFile();
        }
        Scanner in = new Scanner(file);
        while (in.hasNext()) {
            String[] v = in.nextLine().split(";");
            livres.add(new Livre(v[0], v[1], v[2]));
        }

        Scanner keyb = new Scanner(System.in);
        do {
            Livre l = new Livre();
            livres.add(l);
            System.out.print("Identifiant: ");
            l.setIdentifiant(keyb.nextLine());
            System.out.print("Place: ");
            l.setPlace(keyb.nextLine());
            System.out.print("Data d'achat: ");
            l.setDateAchat(keyb.nextLine());
            System.out.print("\"N\" stoppe l'encodage, autre caractère continue: ");
            if ("N".equals(keyb.nextLine())) {
                break;
            }
        } while (true);

        PrintWriter out = new PrintWriter(dbFile);
        for (Livre livre : livres) {
            out.println(
                    livre.getIdentifiant() + ";"
                    + livre.getPlace() + ";"
                    + livre.getDateAchat());
        }
        out.close();
    }
}
