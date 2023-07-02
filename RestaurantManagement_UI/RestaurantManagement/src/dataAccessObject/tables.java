/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataAccessObject;
import javax.swing.JOptionPane;

/**
 *
 * @author AKSHATA
 */
public class tables {
//    public static void main(String[] args) {
//        String result = JOptionPane.showInputDialog(null, "How many?");
//        int ans = Integer.parseInt(result);
//        JOptionPane.showMessageDialog(null, "You have " + ans + " Things.");
//    }
    public static void main(String[] args) {
        try {
//            String userTable = 
//                        "create table user(id int AUTO_INCREMENT primary key, name varchar(200), email varchar(200), mobileNumber varchar(10), password varchar(200), status varchar(20), UNIQUE (email))";
//            
//            String adminDetails = "insert into user(name, email, mobileNumber, password, status) values ('Admin', 'admin@gmail.com', '1234567890', 'admin', 'true')";
//            String categoryTable = "create table category(category_id int AUTO_INCREMENT primary key, name varchar(200))";
            String productTable = "create table product(product_id int AUTO_INCREMENT primary key, name varchar(200), category varchar(200), price varchar(200), type varchar(200))";
//            String billTable = "create table bill(id int primary key, name varchar(200), mobileNumber varchar(200), email varchar(200), date varchar(50), total varchar(200), createdBy varchar(200))";
            String orderTable = "create table orders(email varchar(200), date varchar(200), category varchar(200), name varchar(200), type varchar(200), price varchar(200))";
//            String verificationTable = "create table verify(email varchar(200) primary key, securityQuestion varchar(200), answer varchar(200))";
            
//            DbOperations.setDataorDelete(userTable, "User table created successfully");
//            DbOperations.setDataorDelete(adminDetails, "Admin details added successfully");
//            DbOperations.setDataorDelete(categoryTable, "Category Table created successfully");
            DbOperations.setDataorDelete(productTable, "Product Table created successfully");
//            DbOperations.setDataorDelete(billTable, "Bill Table created successfully");
            DbOperations.setDataorDelete(orderTable, "Order table created successfully");
//            DbOperations.setDataorDelete(verificationTable, "Verification table created successfully");
            
        
        } 
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
