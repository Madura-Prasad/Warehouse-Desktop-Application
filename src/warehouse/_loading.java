/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warehouse;

/**
 *
 * @author madur
 */
public class _loading extends javax.swing.JFrame {

    /**
     * Creates new form aa_loading
     */
    public _loading() {
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
        jLabel1 = new javax.swing.JLabel();
        loadinglabel = new javax.swing.JLabel();
        loadingvalue = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        loadingbar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setFocusTraversalPolicyProvider(true);
        setFocusableWindowState(false);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Images/warehouse.png")).getImage());
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setBackground(new java.awt.Color(225, 222, 218));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Papyrus", 3, 30)); // NOI18N
        jLabel1.setForeground(java.awt.Color.darkGray);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" Smart WareHouse ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 480, 50));

        loadinglabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        loadinglabel.setText("Loading...");
        jPanel1.add(loadinglabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 293, -1, -1));

        loadingvalue.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        loadingvalue.setText("0 %");
        jPanel1.add(loadingvalue, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 293, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/load.gif"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 390, 220));

        loadingbar.setBackground(new java.awt.Color(255, 255, 255));
        loadingbar.setForeground(java.awt.Color.gray);
        loadingbar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        loadingbar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(loadingbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 315, 420, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(475, 348));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseClicked

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
            java.util.logging.Logger.getLogger(_loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(_loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(_loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(_loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        _loading aa = new _loading();
        aa.setVisible(true);
        try{
            for(int j=0; j<=100; j++){
              Thread.sleep(100);
              aa.loadingvalue.setText(j + "%");
              if(j==10){
                  aa.loadinglabel.setText("Turning On System");
              }
              if(j==20){
                  aa.loadinglabel.setText("Loading System");
              }
              if(j==60){
                  aa.loadinglabel.setText("Connecting to Database");
              }
              if(j==80){
                  aa.loadinglabel.setText("Connection Successfully");
              }
              if(j==85){
                  aa.loadinglabel.setText("Launching System");
              }
              if(j==100){
                main_page Y1 =new main_page();
                Y1.setVisible(true);
                aa.dispose();
                
              }
              aa.loadingbar.setValue(j);
            }
        }catch(InterruptedException e){ 
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar loadingbar;
    private javax.swing.JLabel loadinglabel;
    private javax.swing.JLabel loadingvalue;
    // End of variables declaration//GEN-END:variables

    private void kill() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}