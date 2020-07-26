

package database_connect;
import java.sql.*;
public class Database_connect 
{

    public static void main(String[] args) throws ClassNotFoundException
    {
        try
        {
            System.out.println("asdfgg");
        
         Class.forName("com.mysql.jdbc.Driver"); 
        
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","root");
         
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from login");
        while(rs.next())
        {
            System.out.println(rs.getString(1));
        }
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
}
