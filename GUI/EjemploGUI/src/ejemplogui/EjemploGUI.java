/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplogui;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Acer
 */
public class EjemploGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UIManager um = new UIManager();
		um.put("OptionPane.messageForeground", Color.red);
		//um.put("Panel.background", Color.yellow);
        JOptionPane.showMessageDialog(null, "Hola");
        um.put("OptionPane.messageForeground", Color.blue);
        JOptionPane.showMessageDialog(null, "Hola 2");
    }
    
}
