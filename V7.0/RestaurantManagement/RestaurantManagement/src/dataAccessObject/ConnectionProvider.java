/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataAccessObject;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author AKSHATA
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms?useSSL=false", "root", "Por que?25#cada");
//            JOptionPane.showMessageDialog(null, "Created succesfully");
            return con;
            
        }
        catch (Exception e){
            System.out.println("Connection failed");
            return null;
        }
    }
}
