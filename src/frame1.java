/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Smktelkom
 */
public class frame1 extends javax.swing.JFrame {

    /**
     * Creates new form frame1
     */
    public frame1() {
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

        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        be = new javax.swing.JTextField();
        ap = new javax.swing.JTextField();
        ma = new javax.swing.JTextField();
        de = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        paket = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 102));
        getContentPane().setLayout(null);

        jLabel8.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 11)); // NOI18N
        jLabel8.setText("Appetizier");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(90, 110, 70, 30);

        jLabel9.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 11)); // NOI18N
        jLabel9.setText("MainCourse");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(90, 150, 80, 30);

        jLabel10.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 11)); // NOI18N
        jLabel10.setText("Dessert");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(100, 190, 60, 30);

        jLabel11.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 11)); // NOI18N
        jLabel11.setText("Beverage");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(100, 230, 70, 30);

        be.setEditable(false);
        getContentPane().add(be);
        be.setBounds(180, 230, 160, 30);

        ap.setEditable(false);
        ap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apActionPerformed(evt);
            }
        });
        getContentPane().add(ap);
        ap.setBounds(180, 110, 160, 30);

        ma.setEditable(false);
        getContentPane().add(ma);
        ma.setBounds(180, 150, 160, 30);

        de.setEditable(false);
        getContentPane().add(de);
        de.setBounds(180, 190, 160, 30);

        jLabel12.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 11)); // NOI18N
        jLabel12.setText("Pilih Paket");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(60, 60, 80, 30);

        paket.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Paket1", "Paket2", "Paket3" }));
        paket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paketActionPerformed(evt);
            }
        });
        getContentPane().add(paket);
        paket.setBounds(180, 60, 100, 30);

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));
        jPanel1.setLayout(null);

        jLabel7.setFont(new java.awt.Font("MingLiU-ExtB", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("Pilih Paket Makanan");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(130, 10, 190, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 300);

        setBounds(0, 0, 416, 339);
    }// </editor-fold>//GEN-END:initComponents

    private void apActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apActionPerformed

        
    }//GEN-LAST:event_apActionPerformed

    private void paketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paketActionPerformed
        if(paket.getSelectedItem().equals("Paket1")) { 
            ap.setText("Cream Soup");
            ma.setText("Penne Carbonara");
            de.setText("Greentea Lava");
            be.setText("Ice Tea Tarik");
    }
        else
          if(paket.getSelectedItem().equals("Paket2")) {
            ap.setText("Salad");
            ma.setText("Beef Steak");
            de.setText("Red Velvet");
            be.setText("Blue Ocean");
    }
          else
            if(paket.getSelectedItem().equals("Paket3")) { 
            ap.setText("Crab Soup");
            ma.setText("Grill Lobster");
            de.setText("Rainbow Pudding");
            be.setText("Lemonade");
    }
    }//GEN-LAST:event_paketActionPerformed

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
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ap;
    private javax.swing.JTextField be;
    private javax.swing.JTextField de;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField ma;
    private javax.swing.JComboBox paket;
    // End of variables declaration//GEN-END:variables
}
