 import javax.swing.JOptionPane;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//<editor-fold defaultstate="collapsed" desc="comment">
/*
 * M123.java
 *
 * Created on Oct 20, 2019, 10:08:42 PM
 */
/**
 *
 * @author Kulbir Chand Katoch
 */
public class M123 extends javax.swing.JFrame {

    /** Creates new form M123 */
    public M123() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 48));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MOON");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 19, 202, 108));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("The Moon, occasionally distinguished as Luna, is an astronomical body that orbits the Earth as its only permanent natural satellite.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 145, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("The Moon is thought to have formed about 4.51 billion years ago, not long after Earth. The most widely accepted explanation is that the Moon formed from the debris left over after a giant impact OF Earth");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 36));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("WANT TO BE A PART");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 259, 450, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rajiv-bajaj-NPYqw5ZgGJs-unsplash.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new M13().setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new M123().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}