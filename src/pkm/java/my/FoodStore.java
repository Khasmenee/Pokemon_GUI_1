/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkm.java.my;


public class FoodStore extends javax.swing.JFrame {
    
    private double w;
    private double h;
    public String name;
    Vaporean vp = new Vaporean(15.42,1.30);
    Flareon fr = new Flareon(3.77,0.88);
    Dragonite dg = new Dragonite(135.16,1.87);
    public FoodStore(String s) {
        initComponents();
        name=s;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Billberry = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Couberry = new javax.swing.JButton();
        Strawberry = new javax.swing.JButton();
        Health1 = new javax.swing.JButton();
        Health2 = new javax.swing.JButton();
        Health3 = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        FoodBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(515, 387));
        setMinimumSize(new java.awt.Dimension(515, 387));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 0));
        jLabel1.setText("hp +30");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(260, 180, 90, 40);

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel2.setText("+0.01 m");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 100, 60, 20);

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("+1.0 kg");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(430, 80, 70, 20);

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("+0.5 m");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(430, 100, 70, 20);

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("+0.25 m");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(270, 100, 70, 20);

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("+0.5 kg");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(270, 80, 70, 20);

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel7.setText("+0.25 kg");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(110, 70, 70, 30);

        jLabel9.setFont(new java.awt.Font("Tempus Sans ITC", 1, 19)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 0));
        jLabel9.setText("hp +100");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(420, 180, 120, 40);

        Billberry.setIcon(new javax.swing.ImageIcon("C:\\Users\\Menie\\Desktop\\myPKM\\build\\classes\\pkm\\java\\my\\Bilberry.png")); // NOI18N
        Billberry.setBorderPainted(false);
        Billberry.setContentAreaFilled(false);
        Billberry.setFocusPainted(false);
        Billberry.setFocusable(false);
        Billberry.setRequestFocusEnabled(false);
        Billberry.setRolloverEnabled(false);
        Billberry.setSelected(true);
        Billberry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillberryActionPerformed(evt);
            }
        });
        getContentPane().add(Billberry);
        Billberry.setBounds(-20, 40, 160, 120);

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 0));
        jLabel8.setText("hp +10");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(100, 180, 80, 40);

        Couberry.setIcon(new javax.swing.ImageIcon("C:\\Users\\Menie\\Desktop\\myPKM\\build\\classes\\pkm\\java\\my\\Couberry.png")); // NOI18N
        Couberry.setBorderPainted(false);
        Couberry.setContentAreaFilled(false);
        Couberry.setFocusPainted(false);
        Couberry.setFocusable(false);
        Couberry.setRequestFocusEnabled(false);
        Couberry.setRolloverEnabled(false);
        Couberry.setVerifyInputWhenFocusTarget(false);
        Couberry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CouberryActionPerformed(evt);
            }
        });
        getContentPane().add(Couberry);
        Couberry.setBounds(157, 50, 132, 100);

        Strawberry.setIcon(new javax.swing.ImageIcon("C:\\Users\\Menie\\Desktop\\myPKM\\build\\classes\\pkm\\java\\my\\Strawberry.png")); // NOI18N
        Strawberry.setBorderPainted(false);
        Strawberry.setContentAreaFilled(false);
        Strawberry.setFocusPainted(false);
        Strawberry.setFocusable(false);
        Strawberry.setRequestFocusEnabled(false);
        Strawberry.setRolloverEnabled(false);
        Strawberry.setVerifyInputWhenFocusTarget(false);
        Strawberry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StrawberryActionPerformed(evt);
            }
        });
        getContentPane().add(Strawberry);
        Strawberry.setBounds(310, 50, 140, 100);

        Health1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Menie\\Desktop\\myPKM\\build\\classes\\pkm\\java\\my\\Health1.png")); // NOI18N
        Health1.setBorderPainted(false);
        Health1.setContentAreaFilled(false);
        Health1.setFocusPainted(false);
        Health1.setFocusable(false);
        Health1.setRequestFocusEnabled(false);
        Health1.setRolloverEnabled(false);
        Health1.setVerifyInputWhenFocusTarget(false);
        Health1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Health1ActionPerformed(evt);
            }
        });
        getContentPane().add(Health1);
        Health1.setBounds(-30, 150, 170, 100);

        Health2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Menie\\Desktop\\myPKM\\build\\classes\\pkm\\java\\my\\Health2.png")); // NOI18N
        Health2.setBorderPainted(false);
        Health2.setContentAreaFilled(false);
        Health2.setFocusPainted(false);
        Health2.setFocusable(false);
        Health2.setRequestFocusEnabled(false);
        Health2.setRolloverEnabled(false);
        Health2.setVerifyInputWhenFocusTarget(false);
        Health2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Health2ActionPerformed(evt);
            }
        });
        getContentPane().add(Health2);
        Health2.setBounds(160, 140, 110, 118);

        Health3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Menie\\Desktop\\myPKM\\build\\classes\\pkm\\java\\my\\Health3.png")); // NOI18N
        Health3.setBorderPainted(false);
        Health3.setContentAreaFilled(false);
        Health3.setFocusPainted(false);
        Health3.setFocusable(false);
        Health3.setRequestFocusEnabled(false);
        Health3.setRolloverEnabled(false);
        Health3.setVerifyInputWhenFocusTarget(false);
        Health3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Health3ActionPerformed(evt);
            }
        });
        getContentPane().add(Health3);
        Health3.setBounds(320, 140, 110, 120);

        Back.setIcon(new javax.swing.ImageIcon("C:\\Users\\Menie\\Desktop\\myPKM\\build\\classes\\pkm\\java\\my\\back.png")); // NOI18N
        Back.setBorderPainted(false);
        Back.setContentAreaFilled(false);
        Back.setFocusPainted(false);
        Back.setFocusable(false);
        Back.setRequestFocusEnabled(false);
        Back.setRolloverEnabled(false);
        Back.setVerifyInputWhenFocusTarget(false);
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back);
        Back.setBounds(170, 250, 160, 100);

        FoodBG.setIcon(new javax.swing.ImageIcon("C:\\Users\\Menie\\Desktop\\myPKM\\build\\classes\\pkm\\java\\my\\Food.png")); // NOI18N
        getContentPane().add(FoodBG);
        FoodBG.setBounds(0, 0, 500, 350);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void Eat(int n){
        Food f = new Food(n);
        if(name.equals("Vaporean")){   
            vp.eat(f);
            Update u = new Update(vp.getWeight(),vp.getHeight());
            new Vaporeanst(vp.getWeight(),vp.getHeight()).setVisible(true);
        }else if(name.equals("Flareon")){   
            fr.eat(f);
            Update u = new Update(fr.getWeight(),fr.getHeight());
            new Flareonst(fr.getWeight(),fr.getHeight()).setVisible(true);
        }else if(name.equals("Dragonite")){
            dg.eat(f);
            Update u = new Update(dg.getWeight(),dg.getHeight());
            new Dragonitest(dg.getWeight(),dg.getHeight()).setVisible(true);
        }
        setVisible(false);
        
    }

    private void BillberryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillberryActionPerformed
        Eat(0);
    }//GEN-LAST:event_BillberryActionPerformed
    
    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        if(name.equals("Vaporean")){   
            new Vaporeanst(vp.getWeight(),vp.getHeight()).setVisible(true);
        }else if(name.equals("Flareon")){
            new Flareonst(fr.getWeight(),fr.getHeight()).setVisible(true);
        }else if(name.equals("Dragonite")){
            new Dragonitest(dg.getWeight(),dg.getHeight()).setVisible(true);
        }
    }//GEN-LAST:event_BackActionPerformed

    private void CouberryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CouberryActionPerformed
        Eat(1);
    }//GEN-LAST:event_CouberryActionPerformed

    private void StrawberryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StrawberryActionPerformed
        Eat(2);
    }//GEN-LAST:event_StrawberryActionPerformed

    private void Health1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Health1ActionPerformed
        Eat(3);
    }//GEN-LAST:event_Health1ActionPerformed

    private void Health2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Health2ActionPerformed
        Eat(4);
    }//GEN-LAST:event_Health2ActionPerformed

    private void Health3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Health3ActionPerformed
        Eat(5);
    }//GEN-LAST:event_Health3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Billberry;
    private javax.swing.JButton Couberry;
    private javax.swing.JLabel FoodBG;
    private javax.swing.JButton Health1;
    private javax.swing.JButton Health2;
    private javax.swing.JButton Health3;
    private javax.swing.JButton Strawberry;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables


}
