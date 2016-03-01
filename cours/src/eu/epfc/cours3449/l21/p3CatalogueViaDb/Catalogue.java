package eu.epfc.cours3449.l21.p3CatalogueViaDb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Catalogue {

    private String nomDeFichier;

    public Catalogue(String nomDeFichier) {
        this.nomDeFichier = nomDeFichier;
    }

    public void add(Livre l) {
        // INSERT INTO catalogue (titre, auteur) VALUES( xxx, yyy)
    }

    public void update(Livre l) {
        // UPDATE catalogue SET titre= xxx, auteur= yyy
    }

    public void delete(int id) {
        // DELETE FROM catalogue WHERE id= id
    }

    Livre read(int id) {
        // SELECT * FROM catalogue WHERE id=id
    }

    ArrayList<Livre> read() throws ClassNotFoundException, SQLException {
        ArrayList<Livre> ls = new ArrayList<>();
        Class.forName("com.mysql.jdbc.Driver"); // charger le driver pour mysql
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost/librairie", "root", "");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(
                "SELECT * FROM catalogue");
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString(1) + " " +
                    resultSet.getString(2) + " " + 
                    resultSet.getString(3));
            Livre l = new Livre(
                    resultSet.getInt(1), 
                    resultSet.getString(2), 
                    resultSet.getString(3));
            ls.add(l);
        }
        return ls;
    }

    ArrayList<Livre> readByAuteur(String auteur) {
        // SELECT * FROM catalogue WHERE auteur = auteur
    }

}
