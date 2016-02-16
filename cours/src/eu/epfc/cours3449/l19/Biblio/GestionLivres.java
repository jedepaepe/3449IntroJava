package eu.epfc.cours3449.l19.Biblio;

import eu.epfc.cours3449.l18.p2Bibliotheque.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestionLivres {

    static Scanner in = new Scanner(System.in);
    static Catalogue cat;

    public static void main(String[] args) throws BusinessException {
        Initialize();
        Run();
    }

    private static void Initialize() throws BusinessException {
        cat = new Catalogue();
    }

    private static void Run() {
        WelcomeBanner();
        MainMenu();
        ByeBanner();
    }

    private static void WelcomeBanner() {
        System.out.println("Bienvenu à GestionLivre, votre application de gestion de librairie");
    }

    private static void MainMenu() {
        boolean next = true;
        while (next) {
            System.out.println("Select a menu");
            System.out.println("F pour chercher un livre");
            System.out.println("A pour ajouter un livre");
            System.out.println("U pour mettre à jour un livre");
            System.out.println("D pour supprimer un livre");
            System.out.println("Q pour quitter l'application");
            String command = in.nextLine();
            switch (command) {
                case "F":
                    uiFind();
                    break;
                case "A":
                    uiAdd();
                    break;
                case "U":
                    uiUpdate();
                    break;
                case "D":
                    uiDelete();
                    break;
                case "Q":
                    next = !uiQuit();
                    break;
            }
        }
    }

    private static void ByeBanner() {
        System.out.println("Merci d'avoir utiliser GestionLivres");
    }

    private static void uiFind() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void uiAdd() {
        try {
            System.out.println("\n\nFormulaire d'ajout de livre dans le catalogue");
            for(int i=1;i<100;i++) System.out.print("-");
            System.out.println("");
            System.out.print("Identifiant: ");
            System.out.print("Place: ");
            System.out.print("Date d'achat: ");
            cat.add(new Livre(in.next(), in.next(), in.next()));
        } catch (BusinessException ex) {
            Logger.getLogger(GestionLivres.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void uiUpdate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void uiDelete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static boolean uiQuit() {
        System.out.print("\nEtês vous sûr de vouloir quitter l'application Y/N ");
        return "Y".equals(in.next());
    }
}
