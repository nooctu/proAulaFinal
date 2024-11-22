/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package register;
import model.db_connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

import view.loginUser;

/**
 *
 * @author YOJHAN DAVID
 */
public class formUser extends javax.swing.JFrame {

    /**
     * Creates new form formUser
     */
    public formUser() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        newUserField = new javax.swing.JTextField();
        newPassField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        newRealNameField = new javax.swing.JTextField();
        newEmailField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 394));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NEW USERS FORM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 550, 100));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("New user:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 118, 127, 28));
        getContentPane().add(newUserField, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 120, 157, 28));
        getContentPane().add(newPassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 168, 157, 28));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("New password:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 166, -1, 28));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("COMPLETE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 326, -1, 33));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Email");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 214, -1, 28));
        getContentPane().add(newRealNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 270, 157, 28));
        getContentPane().add(newEmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 216, 157, 28));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Real Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 270, -1, 28));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String newUser = newUserField.getText().trim();
        String newPass = newPassField.getText().trim();
        String newEmail = newEmailField.getText().trim();
        String newRealName = newRealNameField.getText().trim();
        
        db_connection db = new db_connection();
        Connection cn = db.conectar();
        
        if (cn != null) {
            try {
                // Crear la consulta SQL
                String url = "jdbc:mysql://localhost:3306/loginpro?characterEncoding=utf8"; // Cambia 'nombredb' por tu base de datos
                String user = "root"; // Usuario de MySQL
                String password = "";
                
                
                cn = DriverManager.getConnection(url, user, password);
            
                String sql = "INSERT INTO userspro (user1, password1, email, name1, rol) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement pst = cn.prepareStatement(sql);
                
                // Establecer los valores en la consulta
                pst.setString(1, newUser);
                pst.setString(2, newPass);
                pst.setString(3, newEmail);
                pst.setString(4, newRealName);
                pst.setString(5, "client");

                // Ejecutar la consulta
                //validacion de que ningun campo debe estar vacio
                if (newUser.isEmpty() || newPass.isEmpty() || newEmail.isEmpty() || newRealName.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "PLEASE, COMPLETE THE FIELDS.", "FIELDS ERROR" , JOptionPane.WARNING_MESSAGE);
                    return;
                }
                // Validación de que el email contenga "@"
                if (!newEmail.contains("@") || newEmail.contains(" ")) {
                 JOptionPane.showMessageDialog(null, "INVALID EMAIL ADDRESS" , "EMAIL ADRESS ERROR", JOptionPane.ERROR_MESSAGE);
                return;
                }

                // Validación de que el nombre real no contenga números
                if (!newRealName.matches("[a-zA-Z ]+")) {
                JOptionPane.showMessageDialog(null, "THE REAL NAME CANNOT CONTAIN NUMBERS, ONLY LETTERS.", "NAME ERROR " , JOptionPane.ERROR_MESSAGE);
                return;
                } if (newRealName.length() < 4 || newUser.length() < 4 || newPass.length() < 4 || newEmail.length() < 4) {
                 JOptionPane.showMessageDialog(null, "THERE ARE FIELDS VERY SHORT, TRY AGAIN, PLEASE.", "SHORTS FIELDS", JOptionPane.ERROR_MESSAGE);   
                } else {
                     int rowsInserted = pst.executeUpdate();
                      if (rowsInserted > 0) {
                    JOptionPane.showMessageDialog(null, "SUCESSFULL REGISTRATION!");
                    
                    loginUser returnMain = new loginUser();
                    returnMain.setVisible(true);
                    
                    this.dispose();
                }
                      
                }
                
        

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error to register data: " + e);
            }
        } else {
        JOptionPane.showMessageDialog(null, "Error de conexión a la base de datos");
    }
       //Llave del método
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(formUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField newEmailField;
    private javax.swing.JTextField newPassField;
    private javax.swing.JTextField newRealNameField;
    private javax.swing.JTextField newUserField;
    // End of variables declaration//GEN-END:variables
}
