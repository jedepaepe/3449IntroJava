package eu.epfc.cours3449.l20.p2AvecCatalogue;

import static eu.epfc.cours3449.l20.p2AvecCatalogue.DemoPersistEncaps.nomDeFichier;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Catalogue {

    private ArrayList<Livre> ls = new ArrayList<>();
    private String nomDeFichier;

    public Catalogue(String nomDeFichier) throws FileNotFoundException, IOException {
        this.nomDeFichier = nomDeFichier;
        charge();
    }

    public void add(Livre l) {
        // crée un clone profond (qui élimine toute référence à "l")
        String titre = new String(l.getTitre());
        String auteur = new String(l.getAuteur());
        Livre copy = new Livre(titre, auteur);
        ls.add(copy);
        /*ls.add(new Livre(
                new String(l.getTitre()),
                new String(l.getAuteur())
        ));*/
        sauve();
    }

    public void update(Livre l) throws Exception {
        for (Livre livre : ls) {
            if (livre.getId() == l.getId()) {
                livre.setTitre(l.getTitre());
                livre.setAuteur(l.getAuteur());
                return;
            }
        }
        throw new Exception("Livre pas trouvé");
    }

    public void delete(int id) throws Exception {
        for (Livre livre : ls) {
            if (livre.getId() == id) {
                ls.remove(livre);
                sauve();
                return;
            }
        }
        throw new Exception("Livre pas trouvé");
    }

    Livre read(int id) throws Exception {
        for (Livre livre : ls) {
            if (livre.getId() == id) {
                return livre;
            }
        }
        throw new Exception("Livre pas trouvé");
    }

    ArrayList<Livre> read() {
        return ls;
    }

    ArrayList<Livre> readByAuteur(String auteur) {
        ArrayList<Livre> lsDeAuteur = new ArrayList<>();
        for (Livre livre : ls) {
            if (livre.getAuteur().equals(auteur)) {
                lsDeAuteur.add(livre);
            }
        }
        return lsDeAuteur;
    }

    private void charge() throws FileNotFoundException, IOException {
        File file = new File(nomDeFichier);
        if (!file.exists()) {
            file.createNewFile();
        }
        Scanner sc = new Scanner(file);
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] elements = line.split(";");
            int id = Integer.getInteger(elements[0]);
            Livre l = new Livre( id, elements[1], elements[2]);
            ls.add(l);
        }
    }

    private void sauve() {
        PrintWriter pw = null;
        try {
            File f = new File(nomDeFichier);
            pw = new PrintWriter(f);
            for (Livre l : ls) {
                pw.println(l.toCsv());
            }
            pw.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Exception " + ex);
        } finally {
            pw.close();
        }
    }
}
