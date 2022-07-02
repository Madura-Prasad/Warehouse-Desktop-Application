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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author madur
 */
public class monthly_bill extends javax.swing.JFrame {

    private int sum;

    /**
     * Creates new form monthly_bill
     */
    
     DB obj=new DB();
     Connection con=obj.connect();
            
    public monthly_bill() {
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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        space = new javax.swing.JTextField();
        duration = new javax.swing.JTextField();
        catergory = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        print = new javax.swing.JButton();
        add = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtotal = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        head = new javax.swing.JLabel();
        tot = new javax.swing.JTextField();
        stot = new javax.swing.JLabel();
        foot = new javax.swing.JLabel();
        space3 = new javax.swing.JLabel();
        foot1 = new javax.swing.JLabel();
        img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculate Monthly Bill");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Images/warehouse.png")).getImage());
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel2.setForeground(java.awt.Color.lightGray);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Calculate Monthly Bill");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 20, 580, -1));

        jScrollPane1.setOpaque(false);

        jTable1.setBackground(java.awt.Color.lightGray);
        jTable1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jTable1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTable1.setForeground(java.awt.Color.darkGray);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Catergory Cost", "Duration Cost", "Space Cost", "Quantity Cost", "Total Cost"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setEnabled(false);
        jTable1.setOpaque(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 420, 120));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(java.awt.Color.lightGray);
        jLabel1.setText("Total");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, -1, -1));

        txtid.setBackground(java.awt.Color.darkGray);
        txtid.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtid.setForeground(new java.awt.Color(255, 255, 255));
        txtid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, java.awt.Color.lightGray));
        txtid.setOpaque(false);
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        txtid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtidKeyReleased(evt);
            }
        });
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 60, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(java.awt.Color.lightGray);
        jLabel3.setText("User No.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(java.awt.Color.lightGray);
        jLabel4.setText("Catergory");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(java.awt.Color.lightGray);
        jLabel5.setText("Duration");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(java.awt.Color.lightGray);
        jLabel6.setText("Space");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(java.awt.Color.lightGray);
        jLabel7.setText("Quantity");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, -1, -1));

        quantity.setEditable(false);
        quantity.setBackground(java.awt.Color.darkGray);
        quantity.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        quantity.setForeground(new java.awt.Color(255, 255, 255));
        quantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        quantity.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        quantity.setOpaque(false);
        quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityActionPerformed(evt);
            }
        });
        jPanel1.add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 60, -1));

        total.setEditable(false);
        total.setBackground(java.awt.Color.darkGray);
        total.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        total.setForeground(new java.awt.Color(255, 255, 255));
        total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        total.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        total.setOpaque(false);
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });
        jPanel1.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 60, -1));

        space.setEditable(false);
        space.setBackground(java.awt.Color.darkGray);
        space.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        space.setForeground(new java.awt.Color(255, 255, 255));
        space.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        space.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        space.setOpaque(false);
        jPanel1.add(space, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 60, -1));

        duration.setEditable(false);
        duration.setBackground(java.awt.Color.darkGray);
        duration.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        duration.setForeground(new java.awt.Color(255, 255, 255));
        duration.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        duration.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        duration.setOpaque(false);
        jPanel1.add(duration, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 60, -1));

        catergory.setEditable(false);
        catergory.setBackground(java.awt.Color.darkGray);
        catergory.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        catergory.setForeground(new java.awt.Color(255, 255, 255));
        catergory.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        catergory.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        catergory.setOpaque(false);
        jPanel1.add(catergory, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 60, -1));

        back.setBackground(java.awt.Color.lightGray);
        back.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        back.setForeground(java.awt.Color.darkGray);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back_1.png"))); // NOI18N
        back.setText("Back");
        back.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.lightGray));
        back.setPreferredSize(new java.awt.Dimension(100, 30));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, -1, -1));

        print.setBackground(java.awt.Color.lightGray);
        print.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        print.setForeground(java.awt.Color.darkGray);
        print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/print.png"))); // NOI18N
        print.setText(" Print Bill");
        print.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.lightGray));
        print.setPreferredSize(new java.awt.Dimension(100, 30));
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel1.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, -1, -1));

        add.setBackground(java.awt.Color.lightGray);
        add.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        add.setForeground(java.awt.Color.darkGray);
        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        add.setText(" Add");
        add.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.lightGray));
        add.setPreferredSize(new java.awt.Dimension(100, 30));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(java.awt.Color.lightGray);
        jLabel8.setText("Monthly Bill");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 90, 20));

        txtotal.setEditable(false);
        txtotal.setBackground(java.awt.Color.darkGray);
        txtotal.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        txtotal.setForeground(java.awt.Color.orange);
        txtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtotal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        txtotal.setOpaque(false);
        txtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtotalActionPerformed(evt);
            }
        });
        jPanel1.add(txtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 110, -1));

        jPanel2.setBackground(java.awt.Color.lightGray);
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.setOpaque(false);

        head.setFont(new java.awt.Font("Papyrus", 0, 14)); // NOI18N
        head.setForeground(java.awt.Color.lightGray);
        head.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        tot.setEditable(false);
        tot.setBackground(java.awt.Color.darkGray);
        tot.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tot.setForeground(java.awt.Color.yellow);
        tot.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tot.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        tot.setOpaque(false);
        tot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totActionPerformed(evt);
            }
        });

        stot.setFont(new java.awt.Font("SansSerif", 2, 14)); // NOI18N
        stot.setForeground(java.awt.Color.white);
        stot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        foot.setFont(new java.awt.Font("Papyrus", 0, 14)); // NOI18N
        foot.setForeground(java.awt.Color.white);
        foot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        space3.setBackground(java.awt.Color.darkGray);
        space3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        space3.setForeground(new java.awt.Color(255, 255, 255));

        foot1.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        foot1.setForeground(java.awt.Color.white);
        foot1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(head, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(foot, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(stot, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(foot1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(tot, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(293, 293, 293)
                        .addComponent(space3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(space3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(head, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stot, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(foot, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(foot1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 200, 160));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.jpg"))); // NOI18N
        jPanel1.add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 670, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(605, 458));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityActionPerformed

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalActionPerformed

    private void txtidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidKeyReleased
        // TODO add your handling code here:                                       
        try {
            String id = txtid.getText();
            PreparedStatement pst = con.prepareStatement("select id,catergory,duration,space,quantity,total from calculate_bill where id = ?");
            pst.setString(1, id);
            ResultSet rs = pst.executeQuery();
            if(rs.next()==true)
            {
                catergory.setText(rs.getString(2));
                duration.setText(rs.getString(3));
                space.setText(rs.getString(4));
                quantity.setText(rs.getString(5));
                total.setText(rs.getString(6));
            }   
            else
            {
                 catergory.setText("");
                 duration.setText("");
                 space.setText("");
                 quantity.setText("");
                 total.setText("");
                 txtid.requestFocus();
            }

        } catch (SQLException ex) {
            Logger.getLogger(find.class.getName()).log(Level.SEVERE, null, ex);
        }  
    
    }//GEN-LAST:event_txtidKeyReleased

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        manager_main_page L1 =new manager_main_page();
        L1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // TODO add your handling code here:
        head.setText("+++ Smart Ware House +++");
        stot.setText("Total Cost");
        foot.setText("Smart Ware House");
        foot1.setText("Monthly Report");
       
        String total2= txtotal.getText();
        tot.setText(total2);
        
    }//GEN-LAST:event_printActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
            String id = (txtid.getText());
            String cater = catergory.getText();
            int dura = Integer.parseInt(duration.getText());
            int spac = Integer.parseInt(space.getText());
            int quan = Integer.parseInt(quantity.getText());
            String tot = total.getText();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.addRow(new Object[]
                    {
                        id ,
                        cater,
                        dura,
                        spac,
                        quan,
                        tot,
                    });
            
             int sum = 0;
             for(int i = 0; i<jTable1.getRowCount(); i++)
        {sum = sum + Integer.parseInt(jTable1.getValueAt(i, 5).toString());}
        txtotal.setText("Rs. "+sum);
        txtid.setText("");
        catergory.setText("");
        duration.setText("");
        space.setText("");
        quantity.setText("");
        total.setText("");
        txtid.requestFocus();
    }//GEN-LAST:event_addActionPerformed

    private void totActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totActionPerformed

    private void txtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtotalActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

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
            java.util.logging.Logger.getLogger(monthly_bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(monthly_bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(monthly_bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(monthly_bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new monthly_bill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton back;
    private javax.swing.JTextField catergory;
    private javax.swing.JTextField duration;
    private javax.swing.JLabel foot;
    private javax.swing.JLabel foot1;
    private javax.swing.JLabel head;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton print;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField space;
    private javax.swing.JLabel space3;
    private javax.swing.JLabel stot;
    private javax.swing.JTextField tot;
    private javax.swing.JTextField total;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtotal;
    // End of variables declaration//GEN-END:variables
}