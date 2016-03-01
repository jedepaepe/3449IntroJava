
package eu.epfc.cours3449.l21.p2DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class TestMysql {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver"); // charger le driver pour mysql
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost/librairie", "root", "");
        Statement statement = connection.createStatement();
        //statement.executeUpdate("CREATE TABLE IF NOT EXISTS temp (col1 char(5), col2 varchar(5))");
        ResultSet resultSet = statement.executeQuery(
                "SELECT * FROM catalogue");
        ArrayList<Livre> listeLivres = new ArrayList<>();
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString(1) + " " +
                    resultSet.getString(2) + " " + 
                    resultSet.getString(3));
            Livre l = new Livre(
                    resultSet.getInt(1), 
                    resultSet.getString(2), 
                    resultSet.getString(3));
            listeLivres.add(l);
        }
        for (Livre livre : listeLivres) {
            System.out.println(livre);
        }
        
    }
}
