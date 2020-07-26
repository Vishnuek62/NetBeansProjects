/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vishnu EK
 */
import javax.swing.*;
import java.sql.*;

public class javaconnect {

    Connection conn = null;

    public static Connection ConnectDb() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
            return conn;
        } catch (Exception exe) {
            JOptionPane.showMessageDialog(null, exe);
            return null;
        }
    }

}
