package eu.epfc.cours3449.l19.Biblio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Gère la liste des livres
 * et assurance la persistance
 */
public class Catalogue {
    ArrayList<Livre> livres;        // la liste des livres
    String fichier = "dbLivre.csv"; // nom du fichier DB
    String separator = ";";         // le séparateur dans le fichier DB

    /**
     * Crée un nouveau catalogue peuplé par le fichier DB
     * @throws BusinessException : problème dans le chargement du fichier
     */
    public Catalogue() throws BusinessException {
        loadDb();
    }

    private void loadDb() throws BusinessException {
        try {
            File file = new File(fichier);
            if(! file.exists()) {
                file.createNewFile();
            }
            Scanner in = new Scanner(file);
            while(in.hasNext()) {
                String[] values = (in.nextLine()).split(separator);
                livres.add(new Livre(values[0], values[1], values[2]));
            }
        } catch (IOException | ArrayIndexOutOfBoundsException ex) {
            Logger.getLogger(Catalogue.class.getName()).log(Level.SEVERE, null, ex);
            throw new BusinessException("Impossible to load DB file " + fichier);
        }
    }

    /**
     * Sauve le catalogue sur le fichier DB
     * @throws BusinessException : problème dans la sauvegarde
     */
    private void saveDb() throws BusinessException {
        try (PrintWriter out = new PrintWriter(fichier)) {
            for (Livre livre : livres) {
                out.println(
                        livre.getIdentifiant() + separator +
                        livre.getPlace() + separator +
                        livre.getDateAchat());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Catalogue.class.getName()).log(Level.SEVERE, null, ex);
            throw new BusinessException("Impossible de sauver DB file " + fichier);
        }
    }
    
    /**
     * retourne le Livre d'identifiant = paramètre.in identifiant
     * @param identifiant : identifiant du livre rechercher
     * @return le livre d'identifiant
     */
    public Livre findPerIdentifiant(String identifiant) {
        for (Livre livre : livres) {
            if(livre.getIdentifiant().equals(identifiant)) {
                return livre;
            }
        }
        return null;
    }
    
    /**
     * retourne une liste de livres dont la place contient la String en donnée paramètre
     * @param place : string recherchée
     * @return liste de livres qui vérifient le critère de recherche
     */
    public ArrayList<Livre> findPerPlace(String place) {
        ArrayList<Livre> ls = new ArrayList<>();
        for (Livre livre : livres) {
            CharSequence cs = place;
            if(livre.getPlace().contains(cs)) {
                ls.add(livre);
            }
        }
        return ls;
    }
    
    /**
     * retourne vrai si le livre d'identifiant fait partie du catalogue
     * @param identifiant
     * @return true/false
     */
    public boolean containsIdentifiant(String identifiant) {
        return findPerIdentifiant(identifiant) != null;
    }
    
    /**
     * ajoute un livre au catalogue
     * @param livre : livre à ajouter
     * @throws BusinessException : si le livre est déjà au catalogue ou erreur dans l'opération save
     */
    public void add(Livre livre) throws BusinessException {
        if(containsIdentifiant(livre.getIdentifiant())) {
            throw new BusinessException("Idenfiant already exist " + livre.getIdentifiant());
        }
        livres.add(livre);
        saveDb();
    }
    
    /**
     * supprime un livre
     * @param identifiant du livre à supprimer
     * @throws BusinessException : si le livre n'existe pas ou erreur dans l'opération save
     */
    public void remove(String identifiant) throws BusinessException {
        Livre l = findPerIdentifiant(identifiant);
        livres.remove(l);
        saveDb();
    }
    
    /**
     * met à jour un livre
     * @param identifiant du livre à mettre à jour
     * @param livre contient les nouvelles valeurs du livre
     * @throws BusinessException : si le livre n'est pas au catalogue ou erreur dans l'opération save
     */
    public void update(String identifiant, Livre livre) throws BusinessException {
        Livre l = findPerIdentifiant(identifiant);
        l.setIdentifiant(livre.getIdentifiant());
        l.setPlace(livre.getPlace());
        l.setDateAchat(livre.getDateAchat());
        saveDb();
    }
}
