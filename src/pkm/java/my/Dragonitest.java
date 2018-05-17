/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkm.java.my;

import javax.swing.JOptionPane;

/**
 *
 * @author Menie
 */
public class Dragonitest extends javax.swing.JFrame {
    public Dragonitest(double weight,double height) {
        Dragonite dg = new Dragonite(weight,height);
        initComponents();
        w.setText(dg.getWeight()+" kg");
        h.setText(dg.getHeight()+" m");
        t.setText(""+dg.getType());
        hp.setText(dg.getHealth()+"/"+dg.maxHealth);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        w = new javax.swing.JLabel();
        h = new javax.swing.JLabel();
        t = new javax.swing.JLabel();
        hp = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Food = new javax.swing.JButton();
        Name = new javax.swing.JTextField();
        Walk = new javax.swing.JButton();
        OKbt = new javax.swing.JButton();
        DragoniteBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 425));
        setMinimumSize(new java.awt.Dimension(800, 425));
        getContentPane().setLayout(null);

        w.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        getContentPane().add(w);
        w.setBounds(20, 120, 110, 50);

        h.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        getContentPane().add(h);
        h.setBounds(160, 120, 90, 60);

        t.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        getContentPane().add(t);
        t.setBounds(90, 220, 100, 50);

        hp.setFont(new java.awt.Font("Tempus Sans ITC", 1, 30)); // NOI18N
        getContentPane().add(hp);
        hp.setBounds(630, 260, 140, 40);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setText("20");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(730, 150, 70, 40);

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel2.setText("70");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(730, 200, 80, 50);

        Food.setText("Food");
        Food.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FoodActionPerformed(evt);
            }
        });
        getContentPane().add(Food);
        Food.setBounds(30, 310, 90, 40);
        getContentPane().add(Name);
        Name.setBounds(380, 340, 100, 20);

        Walk.setText("Walk");
        Walk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WalkActionPerformed(evt);
            }
        });
        getContentPane().add(Walk);
        Walk.setBounds(140, 310, 90, 40);

        OKbt.setIcon(new javax.swing.ImageIcon("C:\\Users\\Menie\\Desktop\\myPKM\\build\\classes\\pkm\\java\\my\\ok.png")); // NOI18N
        OKbt.setContentAreaFilled(false);
        OKbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKbtActionPerformed(evt);
            }
        });
        getContentPane().add(OKbt);
        OKbt.setBounds(480, 330, 60, 40);

        DragoniteBG.setIcon(new javax.swing.ImageIcon("C:\\Users\\Menie\\Desktop\\myPKM\\build\\classes\\pkm\\java\\my\\Dragonitest.png")); // NOI18N
        DragoniteBG.setText("jLabel1");
        getContentPane().add(DragoniteBG);
        DragoniteBG.setBounds(0, 0, 798, 395);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void OKbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKbtActionPerformed
        String name=Name.getText();
        if(name!=null){
            JOptionPane.showMessageDialog(null,"Your pokemon name is "+name);
            //dg.name=name;
        }
    }//GEN-LAST:event_OKbtActionPerformed

    private void FoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FoodActionPerformed
        new FoodStore("Dragonite").setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_FoodActionPerformed

    private void WalkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WalkActionPerformed
        Dragonite dg = new Dragonite(135.16,1.87);
        dg.move();
        setVisible(false);
        new Dragonitest(135.16,1.87).setVisible(true);
    }//GEN-LAST:event_WalkActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DragoniteBG;
    private javax.swing.JButton Food;
    private javax.swing.JTextField Name;
    private javax.swing.JButton OKbt;
    private javax.swing.JButton Walk;
    private javax.swing.JLabel h;
    private javax.swing.JLabel hp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel t;
    private javax.swing.JLabel w;
    // End of variables declaration//GEN-END:variables
}
