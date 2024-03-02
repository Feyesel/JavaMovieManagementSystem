package main;
import java.sql.*;
/**
 *
 * @author Feyesel Sultan
 */
public class MyConnection {
    public static Connection getConnection(){
        Connection con=null;
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/movieinfo","root","");
            System.out.println("connected to....movieinfo database");
        } catch (Exception ex) {
            System.out.println("disconnected to....movieinfo database");
            System.out.println(ex.getMessage());
        }
         return con;
    }
}
