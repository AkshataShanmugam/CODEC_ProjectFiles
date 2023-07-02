/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataAccessObject;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Product;
import java.sql.*;
/**
 *
 * @author AKSHATA
 */
public class ProductDao {
    
    public static void save(Product product){
        String query = "insert into product (name, category, price, type) values ('" + product.getName() +"', '" + product.getCategory() + "', '" + product.getPrice() + "', '" + product.getType() + "')";
        DbOperations.setDataorDelete(query, "Product added successfully");
    }
    
    public static ArrayList<Product> getAllRecords(){
        ArrayList<Product> arrayList = new ArrayList<>();
        
        try{
            ResultSet rs = DbOperations.getData("Select * from product");
            
            while (rs.next()){
                Product product = new Product();
                product.setProduct_id(rs.getInt("id"));
                product.setName(rs.getString("name"));
                product.setCategory(rs.getString("category"));
                product.setPrice(rs.getString("price"));
                product.setType(rs.getString("type"));
                arrayList.add(product);
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,e); 
        }
        
        return arrayList;
    }
    
    public static void update(Product product){
        String query = "update product set name = '" + product.getName() + "', category = '" + product.getCategory() + "', price = '" + product.getPrice() + "', type = '" + product.getType() + "' where product_id = '" + product.getProduct_id()+ "'";
        DbOperations.setDataorDelete(query, "Product updated successfully");
    }
    
    public static void delete(String id){
        String query = "delete from product where product_id = '" + id + "'";
        DbOperations.setDataorDelete(query, "Product deleted successfully");
    }
    
    public static ArrayList<Product> getAllRecordsByCategory(String category){
        ArrayList<Product> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DbOperations.getData("Select * from product where category = '" + category + "'");
            
            while (rs.next()){
                Product product = new Product();
                product.setName(rs.getString("name"));
                arrayList.add(product);
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e); 
        }
        
        return arrayList;
    }
    
    public static ArrayList<Product> filterProductByName(String name, String category){
        ArrayList<Product> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DbOperations.getData("Select * from product where name like '%" + name + "%' and category = '" + category + "'");
            
            while (rs.next()){
                Product product = new Product();
                product.setName(rs.getString("name"));
                arrayList.add(product);
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e); 
        }
        
        return arrayList;
    }
    
    public static Product getProductByName(String name){
        Product product = new Product();
        try{
            ResultSet rs = DbOperations.getData("Select * from product where name = '" + name + "'");
            
            while (rs.next()){
                product.setName(rs.getString(2));
                product.setCategory(rs.getString(3));
                product.setPrice(rs.getString(4));
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e); 
        }
    return product;
    }
}
