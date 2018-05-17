
package pkm.java.my;

import javax.swing.JOptionPane;

public class Flareonst extends javax.swing.JFrame {
    public Flareonst(double weight,double height) {
        initComponents();
        Flareon fr = new Flareon(weight,height);
        w.setText(fr.getWeight()+" kg");
        h.setText(fr.getHeight()+" m");
        t.setText(""+fr.getType());
        hp.setText(fr.getHealth()+"/"+fr.maxHealth);
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
        FlareonBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 425));
        setMinimumSize(new java.awt.Dimension(800, 425));
        getContentPane().setLayout(null);

        w.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        getContentPane().add(w);
        w.setBounds(30, 120, 90, 60);

        h.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        getContentPane().add(h);
        h.setBounds(150, 120, 100, 60);

        t.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        getContentPane().add(t);
        t.setBounds(90, 210, 90, 70);

        hp.setFont(new java.awt.Font("Tempus Sans ITC", 1, 30)); // NOI18N
        getContentPane().add(hp);
        hp.setBounds(630, 240, 140, 50);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setText("10");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(740, 160, 50, 40);

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel2.setText("80");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(740, 210, 40, 30);

        Food.setText("Food");
        Food.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FoodActionPerformed(evt);
            }
        });
        getContentPane().add(Food);
        Food.setBounds(30, 310, 90, 40);
        getContentPane().add(Name);
        Name.setBounds(390, 330, 90, 20);

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
        OKbt.setBounds(490, 320, 50, 40);

        FlareonBG.setIcon(new javax.swing.ImageIcon("C:\\Users\\Menie\\Desktop\\myPKM\\build\\classes\\pkm\\java\\my\\Flareonst.png")); // NOI18N
        FlareonBG.setText("jLabel1");
        getContentPane().add(FlareonBG);
        FlareonBG.setBounds(0, 0, 800, 395);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void OKbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKbtActionPerformed
        String name=Name.getText();
        if(name!=null){
            JOptionPane.showMessageDialog(null,"Your pokemon name is "+name);
        }
    }//GEN-LAST:event_OKbtActionPerformed

    private void FoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FoodActionPerformed
        new FoodStore("Flareon").setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_FoodActionPerformed

    private void WalkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WalkActionPerformed
        Flareon fr = new Flareon(3.77,0.88);
        fr.move();
        setVisible(false);
        new Flareonst(3.77,0.88).setVisible(true);
    }//GEN-LAST:event_WalkActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FlareonBG;
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
