/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package restaurantmanagement;

import javax.swing.JOptionPane;
import model.User;
import dataAccessObject.UserDAO;
import model.Verify;
import dataAccessObject.VerifyDao;

/**
 *
 * @author AKSHATA
 */
public class ForgotPassword extends javax.swing.JFrame {
    private String dbAnswer = null;
    private String email = null;
    private String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
    
    /** Creates new form ForgotPassword */
    public ForgotPassword() {
        initComponents();
        btnSearch.setEnabled(false);
        btnUpdate.setEnabled(false);
        txtSecurityQuestion.setEditable(false);
    }
    
    public void clear(){
        txtEmail.setEditable(true);
        
        txtEmail.setText("");
        txtAnswer.setText("");
        txtSecurityQuestion.setText("");        
        txtNewPassword.setText("");
        
        btnSearch.setEnabled(false); 
        btnUpdate.setEnabled(false);
    }
    
    public void validateEmail(){
        email = txtEmail.getText();
        
        if (email.matches(emailPattern)){
            btnSearch.setEnabled(true);
        }
        else{
            btnSearch.setEnabled(false);
        }
    }
    
    public void validateFields(){
        String answer = txtAnswer.getText();
        String password = txtNewPassword.getText();
        String securityQuestion = txtSecurityQuestion.getText();
        
        if (!password.equals("") && !answer.equals("") && !securityQuestion.equals("")){
            btnUpdate.setEnabled(true);
        }
        else{
            btnUpdate.setEnabled(false);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtAnswer = new javax.swing.JTextField();
        txtSecurityQuestion = new javax.swing.JTextField();
        txtNewPassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Email");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 119, -1));

        jLabel2.setText("Your Answer");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 119, -1));

        jLabel3.setText("Your Security Question");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));

        jLabel4.setText("Enter New Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 119, -1));

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 385, -1));

        txtAnswer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAnswerKeyReleased(evt);
            }
        });
        getContentPane().add(txtAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 385, -1));

        txtSecurityQuestion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSecurityQuestionKeyReleased(evt);
            }
        });
        getContentPane().add(txtSecurityQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 385, -1));

        txtNewPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNewPasswordKeyReleased(evt);
            }
        });
        getContentPane().add(txtNewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 385, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 255));
        jLabel5.setText("Forgot Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, -1, 73));

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 450, 103, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit small.png"))); // NOI18N
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 410, 103, -1));

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 103, -1));

        jButton4.setText("Signup");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 490, 103, -1));

        jButton5.setText("Login");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, 103, -1));

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 103, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/My project.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, -22, 1150, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to close the application?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0){
            System.exit(0);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        email = txtEmail.getText();
        Verify verify = null;
        User user = null;
        verify = VerifyDao.getSecurityQuestion(email);
        if (verify == null){
            JOptionPane.showMessageDialog(null,"<html><b style = \"red\">Incorrect Email email</b><html>", "Message", JOptionPane.ERROR_MESSAGE);
        }else{
            btnSearch.setEnabled(false);
            txtEmail.setEditable(false);
            dbAnswer = verify.getAnswer();
            txtSecurityQuestion.setText(verify.getSecurityQuestion());
            validateFields();
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
        validateEmail();
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtSecurityQuestionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSecurityQuestionKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtSecurityQuestionKeyReleased

    private void txtAnswerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnswerKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtAnswerKeyReleased

    private void txtNewPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNewPasswordKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtNewPasswordKeyReleased

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String answer = txtAnswer.getText();
        String newPassword = txtNewPassword.getText();
        if (answer.equals(dbAnswer)){
            UserDAO.update(email, newPassword);
            clear();
            
        }else{
            JOptionPane.showMessageDialog(null,"<html><b style = \"red\">Incorrect answer</b><html>", "Message", JOptionPane.ERROR_MESSAGE);
        
        }
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new SignUp().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtAnswer;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtNewPassword;
    private javax.swing.JTextField txtSecurityQuestion;
    // End of variables declaration//GEN-END:variables

}