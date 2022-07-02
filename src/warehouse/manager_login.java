/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warehouse;

import Db_conncection.DB;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author madur
 */
public class manager_login extends javax.swing.JFrame {

    /**
     * Creates new form manager
     */
    
    DB obj=new DB();
    Connection con=obj.connect();
            
    public manager_login() {
        initComponents();
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
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        Mlogin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_username = new javax.swing.JLabel();
        lbl_password = new javax.swing.JLabel();
        backi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manager Log In");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Images/warehouse.png")).getImage());
        setPreferredSize(new java.awt.Dimension(900, 420));
        setResizable(false);

        jPanel1.setBackground(java.awt.Color.lightGray);
        jPanel1.setPreferredSize(new java.awt.Dimension(325, 70));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setBackground(java.awt.Color.lightGray);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        back.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.lightGray));
        back.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 45, 38));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manager Log In");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 14, 470, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manager_1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 190, 230));

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel3.setForeground(java.awt.Color.gray);
        jLabel3.setText("UserName ;");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        username.setBackground(java.awt.Color.lightGray);
        username.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        username.setForeground(java.awt.Color.white);
        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, java.awt.Color.lightGray));
        username.setOpaque(false);
        username.setPreferredSize(new java.awt.Dimension(2, 25));
        username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usernameKeyReleased(evt);
            }
        });
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 150, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel4.setForeground(java.awt.Color.gray);
        jLabel4.setText("Password ;");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, -1));

        password.setBackground(java.awt.Color.lightGray);
        password.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        password.setForeground(java.awt.Color.white);
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, java.awt.Color.lightGray));
        password.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        password.setOpaque(false);
        password.setPreferredSize(new java.awt.Dimension(5, 25));
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordKeyReleased(evt);
            }
        });
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 150, 20));

        Mlogin.setBackground(java.awt.Color.lightGray);
        Mlogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Mlogin.setForeground(java.awt.Color.darkGray);
        Mlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login_1.png"))); // NOI18N
        Mlogin.setText(" Log In");
        Mlogin.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.lightGray));
        Mlogin.setFocusable(false);
        Mlogin.setPreferredSize(new java.awt.Dimension(100, 30));
        Mlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MloginActionPerformed(evt);
            }
        });
        jPanel1.add(Mlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/username.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/password_1.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        lbl_username.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lbl_username.setForeground(java.awt.Color.orange);
        jPanel1.add(lbl_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 150, 20));

        lbl_password.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lbl_password.setForeground(java.awt.Color.orange);
        jPanel1.add(lbl_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 150, 20));

        backi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.jpg"))); // NOI18N
        jPanel1.add(backi, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -50, 500, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(491, 371));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MloginActionPerformed
        // TODO add your handling code here:
        //login
        if(username.getText().trim().isEmpty() && password.getText().trim().isEmpty()){
        lbl_username.setText("Username is Empty");
        lbl_password.setText("Password is Empty");
        }
        else if(username.getText().trim().isEmpty()){
            lbl_username.setText("Username is Empty");
        }
        else if(password.getText().trim().isEmpty()){
            lbl_password.setText("Password is Empty");
        }
        else{
        try {
            String sql = "Select * from manager where username=? and password=?";
            PreparedStatement pst= con.prepareStatement(sql);
            pst.setString(1,username.getText());
            pst.setString(2,password.getText());
            ResultSet rs=pst.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null,"Welcome back to the Manager page.");
                manager_main_page Y1 =new manager_main_page();
                Y1.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null,"Username or Password Incorrect.");
                username.setText("");
                password.setText("");
                username.requestFocus();       
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null,e);
        }
        }
    }//GEN-LAST:event_MloginActionPerformed

    private void usernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyReleased
        // TODO add your handling code here:
        lbl_username.setText("");
    }//GEN-LAST:event_usernameKeyReleased

    private void passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyReleased
        // TODO add your handling code here:
         lbl_password.setText("");
    }//GEN-LAST:event_passwordKeyReleased

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        main_page L1 =new main_page();
        L1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(manager_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manager_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manager_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manager_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new manager_login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Mlogin;
    private javax.swing.JButton back;
    private javax.swing.JLabel backi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}