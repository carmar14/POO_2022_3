/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofactorial;

import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class EjemploFactorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //---------declaracion de las variables---------
        int a = 0;
        int b = 0;
        int c = 0;
        
        double fa = 1;
        int fb = 1;
        int fc = 1;
        
        double res = 0.0;
        
        //---------solicito los tres numeros--------
        a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor entero a solicitado: "));
        
        b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor entero b solicitado: "));
        
        c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor entero c solicitado: "));
        
        //---------calcular factorial de cada uno-----
                
        for (int i = a; i > 0; i--){
            //System.out.println("Esto es i: " + i);
            
            fa *= i;
        }
        
        for (int i = b; i > 0; i--){
            //System.out.println("Esto es i: " + i);
            
            fb *= i;
        }
        
        for (int i = c; i > 0; i--){
            //System.out.println("Esto es i: " + i);
            
            fc *= i;
        }
        
        res = (fa+fb+fc)/fa;
        //---------salidas------------
        System.out.println("El factorial de a es: " + fa);
        System.out.println("El factorial de b es: " + fb);
        System.out.println("El factorial de c es: " + fc);
        System.out.println("El resultado es: " + res);
        
    }
    
}
