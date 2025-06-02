
package quiz_1;

import javax.swing.JOptionPane;


public class IO {
    
    
    //Metodo de entrada cadena
   public static String obtenerEntrada(String mensaje){
        return JOptionPane.showInputDialog(null,mensaje);
    }
    
    //Metodo de entrada entero
    public static int obtenerEntero(String mensaje){
        String input = obtenerEntrada(mensaje);
        return Integer.parseInt(input);
    }
    
    //Metodo de entrada decimal
    
    public static double obtenerDecimal(String mensaje){
        String input = obtenerEntrada(mensaje);
        return Double.parseDouble(input);
    }
    
    //Metod de entrada caracter
    
    public static char obtenerCaracter(String mensaje){
        String input = obtenerEntrada(mensaje); 
        return JOptionPane.showInputDialog(null,input).charAt(0);
    }
    
 //Metod de mostrar mensaje
    public static void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null,mensaje);
    }
    
    
  
    }//asasaswewewedfdfdf
