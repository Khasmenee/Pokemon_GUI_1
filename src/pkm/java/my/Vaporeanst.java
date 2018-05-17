
package pkm.java.my;

import javax.swing.JOptionPane;

public class Vaporeanst extends javax.swing.JFrame {
    public Vaporeanst(double weight,double height) {
        initComponents();
        Vaporean vp = new Vaporean(weight,height);
        w.setText(vp.getWeight()+" kg"); 
        h.setText(vp.getHeight()+" m"); 
        t.setText(""+vp.getType()); 
        hp.setText(vp.getHealth()+"/"+vp.maxHealth); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        w = new javax.swing.JLabel();
        h = new javax.swing.JLabel();
        t = new javax.swing.JLabel();
        hp = new javax.swing.JLabel();
        at = new javax.swing.JLabel();
        ut = new javax.swing.JLabel();
        Walk = new javax.swing.JButton();
        Name = new javax.swing.JTextField();
        OKbt = new javax.swing.JButton();
        Food = new javax.swing.JButton();
        VaporeanBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(810, 425));
        setMinimumSize(new java.awt.Dimension(810, 425));
        getContentPane().setLayout(null);

        w.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        getContentPane().add(w);
        w.setBounds(30, 130, 90, 30);

        h.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        getContentPane().add(h);
        h.setBounds(170, 130, 60, 30);

        t.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        getContentPane().add(t);
        t.setBounds(100, 210, 70, 50);

        hp.setFont(new java.awt.Font("Tempus Sans ITC", 1, 30)); // NOI18N
        getContentPane().add(hp);
        hp.setBounds(630, 260, 140, 40);

        at.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        at.setText("30");
        getContentPane().add(at);
        at.setBounds(730, 150, 60, 40);

        ut.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        ut.setText("100");
        getContentPane().add(ut);
        ut.setBounds(730, 210, 50, 30);

        Walk.setText("Walk");
        Walk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WalkActionPerformed(evt);
            }
        });
        getContentPane().add(Walk);
        Walk.setBounds(140, 290, 90, 40);

        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });
        getContentPane().add(Name);
        Name.setBounds(390, 340, 100, 20);

        OKbt.setIcon(new javax.swing.ImageIcon("C:\\Users\\Menie\\Desktop\\myPKM\\build\\classes\\pkm\\java\\my\\ok.png")); // NOI18N
        OKbt.setContentAreaFilled(false);
        OKbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKbtActionPerformed(evt);
            }
        });
        getContentPane().add(OKbt);
        OKbt.setBounds(500, 330, 40, 40);

        Food.setText("Food");
        Food.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FoodActionPerformed(evt);
            }
        });
        getContentPane().add(Food);
        Food.setBounds(20, 290, 90, 40);

        VaporeanBG.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        VaporeanBG.setIcon(new javax.swing.ImageIcon("C:\\Users\\Menie\\Desktop\\myPKM\\build\\classes\\pkm\\java\\my\\vaporeonst.png")); // NOI18N
        VaporeanBG.setText("jLabel2");
        getContentPane().add(VaporeanBG);
        VaporeanBG.setBounds(0, 0, 799, 395);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed

    }//GEN-LAST:event_NameActionPerformed

    private void OKbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKbtActionPerformed
        String name=Name.getText();
        if(name!=null){
            JOptionPane.showMessageDialog(null,"Your pokemon name is "+name);
        }
    }//GEN-LAST:event_OKbtActionPerformed

    private void WalkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WalkActionPerformed
        Vaporean vp = new Vaporean(15.42,1.30);
        vp.move();
        setVisible(false);
        new Vaporeanst(15.42,1.30).setVisible(true);
        
    }//GEN-LAST:event_WalkActionPerformed

    private void FoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FoodActionPerformed
        new FoodStore("Vaporean").setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_FoodActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Food;
    private javax.swing.JTextField Name;
    private javax.swing.JButton OKbt;
    private javax.swing.JLabel VaporeanBG;
    private javax.swing.JButton Walk;
    private javax.swing.JLabel at;
    private javax.swing.JLabel h;
    private javax.swing.JLabel hp;
    private javax.swing.JLabel t;
    private javax.swing.JLabel ut;
    private javax.swing.JLabel w;
    // End of variables declaration//GEN-END:variables
}
