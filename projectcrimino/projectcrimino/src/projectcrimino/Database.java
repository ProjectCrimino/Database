package projectcrimino;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database 
{
    
    public static void main(String[] args) {
        Database conn = new Database();
        conn.createConnection();    
    }

    private void createConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to database...");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectcrimino", "root", "");
            System.out.println("Connecting to database...");
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


}
