/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Chinmay
 */
public class dbconnection {
        public static Connection c;
        public static Statement s;
        static{
          String url="jdbc:mysql://localhost:3306/spendingdb";
          String username="root";
          String password="password";
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                 c=DriverManager.getConnection(url,username,password);
                 s=c.createStatement();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(dbconnection.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(dbconnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
