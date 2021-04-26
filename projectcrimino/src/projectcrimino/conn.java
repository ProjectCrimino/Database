package projectcrimino;
import java.sql.*;

public class conn 
{
    Connection c;
     Statement s;
     public conn()
     {
         try{
             Class.forName("com.mysql.jdbc.Driver");
             c = DriverManager.getConnection("jdbc:mysql:///projectcrimino","","");
             s = c.createStatement();  // used to access our database.Useful when running static sql statements at runtime
             
         }catch (Exception e){
             System.out.println(e);
         }
     }
}
