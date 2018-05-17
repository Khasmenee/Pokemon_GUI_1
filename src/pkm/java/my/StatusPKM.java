
package pkm.java.my;

public class StatusPKM extends javax.swing.JFrame {

    public StatusPKM() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        VaporeanBT = new javax.swing.JButton();
        FlareonBT = new javax.swing.JButton();
        DragoniteBT = new javax.swing.JButton();
        StatusBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(765, 538));
        setMinimumSize(new java.awt.Dimension(765, 538));
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Menie\\Desktop\\myPKM\\build\\classes\\pkm\\java\\my\\pkm2.png")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(260, 110, 240, 280);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Menie\\Desktop\\myPKM\\build\\classes\\pkm\\java\\my\\pkm1.png")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 120, 237, 250);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Menie\\Desktop\\myPKM\\build\\classes\\pkm\\java\\my\\pkm3.png")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(510, 110, 240, 290);

        VaporeanBT.setIcon(new javax.swing.ImageIcon("C:\\Users\\Menie\\Desktop\\myPKM\\build\\classes\\pkm\\java\\my\\vaporeon.png")); // NOI18N
        VaporeanBT.setContentAreaFilled(false);
        VaporeanBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VaporeanBTActionPerformed(evt);
            }
        });
        getContentPane().add(VaporeanBT);
        VaporeanBT.setBounds(30, 390, 200, 60);

        FlareonBT.setIcon(new javax.swing.ImageIcon("C:\\Users\\Menie\\Desktop\\myPKM\\build\\classes\\pkm\\java\\my\\Flareon.png")); // NOI18N
        FlareonBT.setContentAreaFilled(false);
        FlareonBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FlareonBTActionPerformed(evt);
            }
        });
        getContentPane().add(FlareonBT);
        FlareonBT.setBounds(310, 390, 140, 60);

        DragoniteBT.setIcon(new javax.swing.ImageIcon("C:\\Users\\Menie\\Desktop\\myPKM\\build\\classes\\pkm\\java\\my\\Dragonite.png")); // NOI18N
        DragoniteBT.setContentAreaFilled(false);
        DragoniteBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DragoniteBTActionPerformed(evt);
            }
        });
        getContentPane().add(DragoniteBT);
        DragoniteBT.setBounds(550, 400, 160, 50);

        StatusBG.setIcon(new javax.swing.ImageIcon("C:\\Users\\Menie\\Desktop\\myPKM\\build\\classes\\pkm\\java\\my\\bgst.png")); // NOI18N
        StatusBG.setText("jLabel4");
        getContentPane().add(StatusBG);
        StatusBG.setBounds(0, 0, 750, 500);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void VaporeanBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VaporeanBTActionPerformed
        new Vaporeanst(15.42,1.30).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_VaporeanBTActionPerformed

    private void FlareonBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FlareonBTActionPerformed
        new Flareonst(3.77,0.88).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_FlareonBTActionPerformed

    private void DragoniteBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DragoniteBTActionPerformed
        new Dragonitest(135.16,1.87).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_DragoniteBTActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DragoniteBT;
    private javax.swing.JButton FlareonBT;
    private javax.swing.JLabel StatusBG;
    private javax.swing.JButton VaporeanBT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
