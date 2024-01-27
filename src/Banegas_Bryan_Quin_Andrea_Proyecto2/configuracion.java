/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Banegas_Bryan_Prueba_1;

import static Banegas_Bryan_Prueba_1.escoger_oponente.users;
import static Banegas_Bryan_Prueba_1.login.usuarioLogin;

/**
 *
 * @author adalb
 */
public class configuracion extends javax.swing.JFrame {

    /**
     * Creates new form configuracion
     */
    public configuracion() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
    public static int clasico=0;
    public static int tutorial=0;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        modotutorial = new javax.swing.JButton();
        modoclasico = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        modotutorial.setBorder(null);
        modotutorial.setContentAreaFilled(false);
        modotutorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modotutorialActionPerformed(evt);
            }
        });
        getContentPane().add(modotutorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 150, 50));

        modoclasico.setBorder(null);
        modoclasico.setContentAreaFilled(false);
        modoclasico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modoclasicoActionPerformed(evt);
            }
        });
        getContentPane().add(modoclasico, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 160, 50));

        jButton1.setBackground(new java.awt.Color(80, 80, 105));
        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("VOLVER AL MENU");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 225, 150, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Configuracion_Background.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Menu pasar=new Menu(users,usuarioLogin);
        pasar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    private void modoclasicoActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        clasico=1;
    }   
    private void modotutorialActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        clasico=0;
    }    
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
            java.util.logging.Logger.getLogger(configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new configuracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JButton modoclasico;
    public static javax.swing.JButton modotutorial;
    // End of variables declaration//GEN-END:variables
}
