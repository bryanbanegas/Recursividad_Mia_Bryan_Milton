/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Banegas_Bryan_Prueba_1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author adalb
 */
public class crear_cuenta extends javax.swing.JFrame {

    //VARIABLES
    boolean listaVacia = false;
    public static int cantidadeusuarios=0;
    

    // LISTA DE USUARIOS Y CONTRASEÑA
    static ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    static ArrayList<Usuario> listahistorica = new ArrayList<>();

    public crear_cuenta() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        if (listaUsuarios == null) {
            listaUsuarios = new ArrayList<>();
        }

        // Por si el usuario de lista está vacío y no se haga un error.
        if (listaUsuarios.isEmpty()) {
            listaVacia = true;
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CrearCuentaButton = new javax.swing.JButton();
        CancelarButton = new javax.swing.JButton();
        txtusuario = new javax.swing.JTextField();
        PasswordTextbox = new javax.swing.JPasswordField();
        Background = new javax.swing.JLabel();
        CancelarButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CrearCuentaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Crear_Unpressed.jpg"))); // NOI18N
        CrearCuentaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearCuentaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CrearCuentaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 160, 50));

        CancelarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Cancelar.jpg"))); // NOI18N
        CancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CancelarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 160, 40));

        txtusuario.setBackground(new java.awt.Color(255, 255, 255));
        txtusuario.setForeground(new java.awt.Color(0, 0, 0));
        txtusuario.setBorder(null);
        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 200, 20));

        PasswordTextbox.setBackground(new java.awt.Color(255, 255, 255));
        PasswordTextbox.setForeground(new java.awt.Color(0, 0, 0));
        PasswordTextbox.setBorder(null);
        PasswordTextbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordTextboxActionPerformed(evt);
            }
        });
        getContentPane().add(PasswordTextbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 200, 20));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BackgroundCuenta.png"))); // NOI18N
        Background.setOpaque(true);
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 390));

        CancelarButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Cancelar.jpg"))); // NOI18N
        CancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        CancelarButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(CancelarButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 160, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearCuentaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearCuentaButtonActionPerformed
        // TODO add your handling code here:
// VARIABLES
        String usuarioCrear = txtusuario.getText();
        String contraseñaCrear = PasswordTextbox.getText();

// Verificacion en consola
        System.out.println(usuarioCrear + " " + contraseñaCrear);

// Restriccion para cuando el usuario lo deje en blanco
        if (usuarioCrear.isEmpty() || contraseñaCrear.isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "Por favor, llenar todos los campos.");
            System.out.println("Error Campos Vacios.");
            
        } else if (!listaVacia) {
            
            // Restriccion de usuario existente
            
            for (Usuario usuarioExistente : listaUsuarios) {
                
                if (usuarioExistente.getnombre().equals(usuarioCrear)) {
                    JOptionPane.showMessageDialog(null, "Usuario Existente");
                    break;

                } else {
                    
                    if (contraseñaCrear.length() == 5) {
                    JOptionPane.showMessageDialog(null, "Ha creado exitosamente su cuenta.");
                    Usuario nuevoUsuario = new Usuario(usuarioCrear, contraseñaCrear, 0, 0, 0);
                    listaUsuarios.add(nuevoUsuario);
                    listahistorica.add(nuevoUsuario);
                    cantidadeusuarios++;

                        //Verificacion....
                        System.out.println(listaUsuarios);

                        panel_control pasar = new panel_control();
                        pasar.setVisible(true);
                        this.setVisible(false);
                        break;

                    } else {
                        // Restricion del length de la contraseña

                        JOptionPane.showMessageDialog(null, "La contraseña solo puede ser de 5 caracteres, por favor reingresar nuevos datos.");

                    }
                }
            }
        } else if (contraseñaCrear.length() != 5) {
            
            // Restricion del length de la contraseña
            
            JOptionPane.showMessageDialog(null, "La contraseña solo puede ser de 5 caracteres, por favor reingresar nuevos datos.");
      
        } else {
           
            // Si todo esta bien, es agregado.
            JOptionPane.showMessageDialog(null, "Ha creado exitosamente su cuenta.");
            Usuario nuevoUsuario = new Usuario(usuarioCrear, contraseñaCrear,0 ,0 ,0);
            listaUsuarios.add(nuevoUsuario);
            listahistorica.add(nuevoUsuario);
            cantidadeusuarios++;
            
            //Verificacion....
            System.out.println(listaUsuarios);

            panel_control pasar = new panel_control();
            pasar.setVisible(true);
            this.dispose();

        }
    }//GEN-LAST:event_CrearCuentaButtonActionPerformed

    private void CancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarButtonActionPerformed
        // TODO add your handling code here:
        panel_control pasar=new panel_control();
        pasar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CancelarButtonActionPerformed

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void PasswordTextboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordTextboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordTextboxActionPerformed

    private void CancelarButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelarButton1ActionPerformed
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

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
            java.util.logging.Logger.getLogger(crear_cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crear_cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crear_cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crear_cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                //Creando el constructor
                crear_cuenta crearCuenta = new crear_cuenta();

                // Mas verificacion....
                System.out.println("In Crear_Cuenta1: " + crearCuenta.listaUsuarios);

                // Pass listaUsuarios to login constructor
                new crear_cuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    public static javax.swing.JButton CancelarButton;
    private javax.swing.JButton CancelarButton1;
    private javax.swing.JButton CrearCuentaButton;
    public static javax.swing.JPasswordField PasswordTextbox;
    public static javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
