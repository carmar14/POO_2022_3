
package quiz;

import javax.swing.JOptionPane;

/**
 *
 * @author Mariana
 */
public class IO {
    
    public static String obtenerEntrada(String mensaje){
        return JOptionPane.showInputDialog(null,mensaje);
    }
    
  
    public static int obtenerEntero(String mensaje){
        String input = obtenerEntrada(mensaje);
        return Integer.parseInt(input);
    }
    
    
    
    public static double obtenerDecimal(String mensaje){
        String input = obtenerEntrada(mensaje);
        return Double.parseDouble(input);
    }
    
  
    
    
    public static char obtenerCaracter(String mensaje){
        String input = obtenerEntrada(mensaje); 
        return JOptionPane.showInputDialog(null,input).charAt(0);
    }
    

    public static void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null,mensaje);
    }
    
}
