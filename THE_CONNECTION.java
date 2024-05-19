
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author dell
 */
public class THE_CONNECTION {
    
    private static final  String servername = "localhost";
    private static final String dbname = "java_rst_database";
    private static final String username="root";
    private static final Integer portnumber =3306;
    private static final String password ="";//no password
     
     //create a function to get the connection 
     public static Connection getTheConnection()
     {
        
      Connection connection  = null;
       MysqlDataSource datasource = new  MysqlDataSource();
       datasource.setServerName(servername);
       datasource.setUser(username);
       datasource.setDatabaseName(dbname);
       datasource.setPortNumber(portnumber);
       datasource.setPassword(password);
       
        try {
            connection = datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(THE_CONNECTION.class.getName()).log(Level.SEVERE, null, ex);
        }
       return connection;
     }
}
