/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;

import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //------declaracion de las variables------------
        String tipoCadena = new String();
        int tipoEntero = 0;
        double tipoReal = 0.0;
        char tipoCaracter = ' ';
        
        //---------entradas---------
        tipoCadena = JOptionPane.showInputDialog("Ingrese la cadena solicitada: ");
        
        tipoEntero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor entero solicitado: "));
        
        tipoReal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor real solicitado: "));
        
        tipoCaracter = JOptionPane.showInputDialog("Ingrese el valor caracter solicitado: ").trim().toUpperCase().charAt(0);
        
        //---------salidas------------
        System.out.println("Valor de la cadena: " + tipoCadena);
        System.out.println("Valor del entero: " + tipoEntero + " y el valor del real: " + tipoReal);
        
        JOptionPane.showMessageDialog(null, "El valor del caracter es: " + tipoCaracter);
        
    }
    
}
