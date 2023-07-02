/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataAccessObject;

import javax.swing.JOptionPane;
import model.User;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author AKSHATA
 */
public class UserDAO {

    public static void save(User user) {
        String query
                = "insert into user(name, email, mobileNumber, "
                + "password, "
                + "status) values('" + user.getName() + "' , '" + user.getEmail() + "' , '" + user.getMobileNumber() + "' , '" + user.getPassword() + "','false' )";
        DbOperations.setDataorDelete(query, "Registered Successfully! Wait for Admin Approval!");
    }

    public static User login(String email, String password) {
        User user = null;
        try {
            ResultSet rs = DbOperations.getData("select * from user where email = '" + email + "' and password = '" + password + "'");
            while (rs.next()) {
                user = new User();
                user.setStatus(rs.getString("status"));
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }

        return user;
    }
    
    public static User verifyEmail(String email) {
        User user = null;
        try {
            ResultSet rs = DbOperations.getData("select * from user where email = '" + email + "'");
            while (rs.next()) {
                user = new User();
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }

        return user;
    }

    

    public static void update(String email, String newPassword) {
        String query = "update user set password = '" + newPassword + "' where email = '" + email + "'";
        DbOperations.setDataorDelete(query, "Password changed Successfully");
    }

    public static ArrayList<User> getAllRecords(String email) {
        ArrayList<User> arrayList = new ArrayList<>();

        try {
            ResultSet rs = DbOperations.getData("Select * from user where email like '%" + email + "%'");

            while (rs.next()) {
                User user = new User();
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setMobileNumber(rs.getString("mobileNumber"));
                user.setStatus(rs.getString("status"));
                arrayList.add(user);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return arrayList;
    }

    public static void changeStatus(String email, String status) {
        String query = "update user set status = '" + status + "' where email = '" + email + "'";
        DbOperations.setDataorDelete(query, "User status updated successfully");
    }

    public static void changePassword(String email, String oldPassword, String newPassword) {
        try{
            ResultSet rs = DbOperations.getData("select * from user where email = '" + email + "' and password = '" + oldPassword + "'");
            if (rs.next()){
                update(email, newPassword);
            }
            else{
                JOptionPane.showMessageDialog(null, "Old password is wrong");
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
}
