
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

//<editor-fold defaultstate="collapsed" desc="comment">

/*
 * M121.java
 *
 * Created on Oct 20, 2019, 9:27:04 PM
 */
/**
 *
 * @author Kulbir Chand Katoch
 */
public class M121 extends javax.swing.JFrame {

    /** Creates new form M121 */
    public M121() {
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36));
        jLabel1.setForeground(new java.awt.Color(255, 162, 0));
        jLabel1.setText("LIFE ON MARS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14));
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("IS LIFE ON MARS POSSIBLE? TRYING TO MAKE ROCKET FIRST INDIAN WHICH CAN DIRCTLY GO TO MARS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24));
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("FINDING LIFE HELPING NASA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 134, -1, -1));

        jLabel4.setForeground(new java.awt.Color(0, 255, 0));
        jLabel4.setText("SPONCERED BY NASA");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 461, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 24));
        jLabel5.setText("FINDING WAY TO PLANT WITH SPACEX");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 181, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 24));
        jLabel6.setForeground(java.awt.Color.orange);
        jLabel6.setText("FINDING A WAY TO MAKE INDIAN SCIENTIST PROUD");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 228, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 24));
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("HELP BY APPLYING FOR JOB");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 289, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/a5.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 490));

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
                new M121().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
