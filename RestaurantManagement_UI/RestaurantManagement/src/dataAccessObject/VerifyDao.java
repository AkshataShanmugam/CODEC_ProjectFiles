/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataAccessObject;

import model.Verify;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author AKSHATA
 */
public class VerifyDao {
    
    public static void save(Verify verify) {
        String query = "insert into verify(email, securityQuestion, answer) values('" + verify.getEmail() + "', '" + verify.getSecurityQuestion() + "','" + verify.getAnswer() + "')";
        DbOperations.setDataorDelete(query, "Registered Successfully! Wait for Admin Approval!");
    }

     
    public static Verify getSecurityQuestion(String email) {
        Verify verify = null;
        try {
            ResultSet rs = DbOperations.getData("select * from verify where email = '" + email + "'");
            while (rs.next()) {
                verify = new Verify();
                verify.setSecurityQuestion(rs.getString("securityQuestion"));
                verify.setAnswer(rs.getString("answer"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return verify;
    }
     
    public static void update(String email, String securityQuestion, String answer){
        String query = "update verify set securityQuestion = '" + securityQuestion + "', answer = '" + answer + "'where email = '" + email + "'";
        DbOperations.setDataorDelete(query, "Security question changed successfully");
    
    }
    
    public static void changeSecurityQuestion(String email, String password, String securityQuestion, String answer){
        try{
            ResultSet rs = DbOperations.getData("select * from user where email = '" + email + "' and password = '" + password + "'");
            if (rs.next()){
                update(email, securityQuestion, answer);
            }
            else{
                JOptionPane.showMessageDialog(null, "Password is wrong");
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
