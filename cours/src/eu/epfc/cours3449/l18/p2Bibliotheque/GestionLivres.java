package eu.epfc.cours3449.l18.p2Bibliotheque;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class GestionLivres {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner keyb = new Scanner(System.in);
        ArrayList<Livre> livres = new ArrayList<>();
        
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
            if( "N".equals(keyb.nextLine()) ) break;
        } while (true);
        
        PrintWriter out = new PrintWriter("livres.txt");
        for(int i=0; i<livres.size(); i++) {
            System.out.println(livres.get(i));
            out.println(livres.get(i));
        }
        out.close();
    }
}
