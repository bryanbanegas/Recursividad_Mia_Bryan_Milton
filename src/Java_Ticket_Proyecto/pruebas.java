/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Ticket_Proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author adalb
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pruebas {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo JPasswordField");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JLabel label = new JLabel("Contraseña:");
        JPasswordField passwordField = new JPasswordField(20);

        // Añadir un ActionListener para detectar cuando se presiona "Enter"
        passwordField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char[] password = passwordField.getPassword();
                // Puedes hacer algo con la contraseña aquí, por ejemplo, imprimir en la consola
                System.out.println("Contraseña: " + new String(password));
            }
        });

        panel.add(label);
        panel.add(passwordField);

        frame.setSize(300, 100);
        frame.setVisible(true);
    }
}

