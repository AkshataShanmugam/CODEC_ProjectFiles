/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataAccessObject;

import javax.swing.JOptionPane;
import model.Orders;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author AKSHATA
 */
public class OrdersDao {
    public static void save(Orders orders){
        String query = "insert into orders values('" + orders.getEmail() + "','" + orders.getDate() + "','" + orders.getCategory() + "','" + orders.getName() + "','" + orders.getType() + "','" + orders.getPrice() + "')";
//        DbOperations.setDataorDelete(query, "Order details added successfully");
    }
    
    public static String getType(String name){
        String type = "None";
        String query = "SELECT type FROM product WHERE name='" + name + "'";
        ResultSet rs = DbOperations.getData(query);
        try {
            while (rs.next()) {
                type = rs.getString("type");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return type;
            
    }
    
    public static String getCategory(String name){
        String category = "None";
        String query = "SELECT category FROM product WHERE name='" + name + "'";
        ResultSet rs = DbOperations.getData(query);
        try {
            while (rs.next()) {
                category = rs.getString("category");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return category;
            
    }
    
    public static ArrayList<Orders> getAllRecords(String email){
        ArrayList<Orders> arrayList = new ArrayList<>();
        
        try{
            ResultSet rs = DbOperations.getData("Select * from orders where email = '" + email + "'" );
            
            while (rs.next()){
                Orders orders = new Orders();
                orders.setName(rs.getString("name"));
                orders.setDate(rs.getString("date"));
                orders.setCategory(rs.getString("category"));
                orders.setPrice(rs.getString("price"));
                orders.setType(rs.getString("type"));
                arrayList.add(orders);
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,e); 
        }
        
        return arrayList;
    }
}
