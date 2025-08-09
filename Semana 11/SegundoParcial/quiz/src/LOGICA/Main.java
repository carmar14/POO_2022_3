/*Andrés Camilo Medina
* Julián Millán
* Nicolas Hernández Rodríguez
* Nicolas Hernández Ruiz*/
package LOGICA;

import BASEDATOS.Usuario;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Usuario usuarioPrueba = new Usuario("Andres", "andres@mail.com", "12345");

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Seleccionar Robot");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 400);
            frame.setLocationRelativeTo(null);

            PanelSeleccionRobot panel = new PanelSeleccionRobot(usuarioPrueba);
            frame.setContentPane(panel);

            frame.setVisible(true);
        });
    }
}
