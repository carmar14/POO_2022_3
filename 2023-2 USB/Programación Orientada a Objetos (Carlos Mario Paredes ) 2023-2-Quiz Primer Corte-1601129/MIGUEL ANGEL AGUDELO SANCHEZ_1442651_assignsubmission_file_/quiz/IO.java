package Parcial1;

import javax.swing.JOptionPane;

public class IO {
    
    public static void mostrarString(String m){
        JOptionPane.showMessageDialog(null,m);
    }
    
    public static String leerString(String m){
        return JOptionPane.showInputDialog(null,m);
    }
     
    public static int leerEntero(String m){
        return Integer.parseInt(JOptionPane.showInputDialog(null,m));
    }
    
    public static double leerDouble(String m){
        return Double.parseDouble(JOptionPane.showInputDialog(null,m));
    }
    
}
    

