package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Enos
 */
public class DAO {

    public DAO() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
            System.err.println("Driver não encontrado\nErro: " + e);
        }           
    }
    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/cantinaprjt","root", "");
    }
}
