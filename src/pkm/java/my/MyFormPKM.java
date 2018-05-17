
package pkm.java.my;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
public class MyFormPKM extends javax.swing.JFrame {

    public MyFormPKM() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LOGO = new javax.swing.JLabel();
        StartBT = new javax.swing.JButton();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(593, 357));
        setMinimumSize(new java.awt.Dimension(593, 357));
        getContentPane().setLayout(null);

        LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkm/java/my/pkmmm.png"))); // NOI18N
        getContentPane().add(LOGO);
        LOGO.setBounds(370, -20, 220, 150);

        StartBT.setForeground(new java.awt.Color(255, 255, 255));
        StartBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkm/java/my/st.png"))); // NOI18N
        StartBT.setText("jButton1");
        StartBT.setBorderPainted(false);
        StartBT.setContentAreaFilled(false);
        StartBT.setFocusPainted(false);
        StartBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartBTActionPerformed(evt);
            }
        });
        getContentPane().add(StartBT);
        StartBT.setBounds(0, 190, 130, 140);

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkm/java/my/pokken-boxart-169.jpg"))); // NOI18N
        BG.setMaximumSize(new java.awt.Dimension(200, 200));
        getContentPane().add(BG);
        BG.setBounds(0, -50, 580, 410);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void StartBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartBTActionPerformed
        new StatusPKM().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_StartBTActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyFormPKM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel LOGO;
    private javax.swing.JButton StartBT;
    // End of variables declaration//GEN-END:variables

}
