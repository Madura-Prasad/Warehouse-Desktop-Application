/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warehouse;

import Db_conncection.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author madur
 */
public final class manager_add_new_job extends javax.swing.JFrame {

    /**
     * Creates new form add_new_job
     */
    
    DB obj=new DB();
    Connection con=obj.connect();
                
    public manager_add_new_job() {
        initComponents();
        autoID();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtno = new javax.swing.JTextField();
        txtcater = new javax.swing.JComboBox<>();
        register = new javax.swing.JButton();
        back = new javax.swing.JButton();
        txtduration = new javax.swing.JComboBox<>();
        txtquantity = new javax.swing.JComboBox<>();
        txtspace1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add New Stotrage Job");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Images/warehouse.png")).getImage());
        setResizable(false);

        jPanel1.setBackground(java.awt.Color.lightGray);
        jPanel1.setPreferredSize(new java.awt.Dimension(475, 72));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel1.setForeground(java.awt.Color.lightGray);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add New Storage Job");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 30, 470, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.gray);
        jLabel2.setText("User No.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(java.awt.Color.gray);
        jLabel3.setText("Catergory");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(java.awt.Color.gray);
        jLabel4.setText("Duration [Day]");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(java.awt.Color.gray);
        jLabel5.setText("Space [Ft]");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(java.awt.Color.gray);
        jLabel6.setText("Quantity [Pcs]");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        txtno.setBackground(java.awt.Color.lightGray);
        txtno.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtno.setForeground(new java.awt.Color(255, 255, 255));
        txtno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtno.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, java.awt.Color.lightGray));
        txtno.setOpaque(false);
        txtno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnoActionPerformed(evt);
            }
        });
        txtno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnoKeyReleased(evt);
            }
        });
        jPanel1.add(txtno, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 170, -1));

        txtcater.setBackground(java.awt.Color.lightGray);
        txtcater.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtcater.setForeground(java.awt.Color.darkGray);
        txtcater.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Electrical", "Computer ", "Phone", "Education  " }));
        txtcater.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(txtcater, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 170, -1));

        register.setBackground(java.awt.Color.lightGray);
        register.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        register.setForeground(java.awt.Color.darkGray);
        register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        register.setText("  Add Job");
        register.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.lightGray));
        register.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        jPanel1.add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 100, 30));

        back.setBackground(java.awt.Color.lightGray);
        back.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        back.setForeground(java.awt.Color.darkGray);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back_1.png"))); // NOI18N
        back.setText("  Back");
        back.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.lightGray));
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 90, 30));

        txtduration.setBackground(java.awt.Color.lightGray);
        txtduration.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtduration.setForeground(java.awt.Color.darkGray);
        txtduration.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "45", "60", "75", "90" }));
        txtduration.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtduration.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtduration.setPreferredSize(new java.awt.Dimension(111, 25));
        txtduration.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtdurationKeyReleased(evt);
            }
        });
        jPanel1.add(txtduration, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 170, -1));

        txtquantity.setBackground(java.awt.Color.lightGray);
        txtquantity.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtquantity.setForeground(java.awt.Color.darkGray);
        txtquantity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "50", "100", "150", "200", "250" }));
        txtquantity.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(txtquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 170, -1));

        txtspace1.setBackground(java.awt.Color.lightGray);
        txtspace1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtspace1.setForeground(java.awt.Color.darkGray);
        txtspace1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "20", "30", "40", "50", "60", "70", "80", "90", "100" }));
        txtspace1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(txtspace1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 170, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(491, 393));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        // TODO add your handling code here:
            try {
                // TODO add your handling code here:
                PreparedStatement pst = con.prepareStatement("insert into add_job values(?,?,?,?,?)");
                pst.setString(1, txtno.getText());
                pst.setString(2, (String) txtcater.getSelectedItem());
                pst.setString(3, (String) txtduration.getSelectedItem());
                pst.setString(4, (String) txtspace1.getSelectedItem());
                pst.setString(5, (String) txtquantity.getSelectedItem());

                pst.executeUpdate();

                JOptionPane.showMessageDialog(this,"Job Successfully Added.");

                autoID();

               

            } catch (SQLException ex) {
                Logger.getLogger(autoIn.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_registerActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        manager_main_page L1 =new manager_main_page();
        L1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void txtdurationKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdurationKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdurationKeyReleased

    private void txtnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnoKeyReleased

    private void txtnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnoActionPerformed
    
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
            java.util.logging.Logger.getLogger(manager_add_new_job.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manager_add_new_job.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manager_add_new_job.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manager_add_new_job.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new manager_add_new_job().setVisible(true);
        });
    }
    
     public void autoID()
    {
        try {
            Statement s = con.createStatement();
            
            ResultSet rs = s.executeQuery("select Max(id) from add_job");
            rs.next();
            
            rs.getString("Max(id)");
            
            
            if(rs.getString("Max(id)")==null)
            {
                
                txtno.setText("U001");
            }
            else
            {
                Long id = Long.parseLong(rs.getString("Max(id)").substring(2,rs.getString("Max(id)").length()));
                id++;
                txtno.setText("U0" + String.format("%02d", id));
                
                
                
                
            }
         
            
            
        } catch (SQLException ex) {
            Logger.getLogger(autoIn.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton register;
    private javax.swing.JComboBox<String> txtcater;
    private javax.swing.JComboBox<String> txtduration;
    private javax.swing.JTextField txtno;
    private javax.swing.JComboBox<String> txtquantity;
    private javax.swing.JComboBox<String> txtspace1;
    // End of variables declaration//GEN-END:variables
}
