

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Admin
 */
public class Dbclass {
    
    Connection con;
    Statement st;
    ResultSet rs;

    public Dbclass() throws ClassNotFoundException, SQLException 
    {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
        st = con.createStatement();
    }
    public void insert(String sql) throws SQLException
            
    {
        st.executeUpdate(sql);
        
    }
    
     public  ResultSet getData(String str) throws SQLException 
    {
            
        rs=st.executeQuery(str);
        return rs;
    }
    
    
}
