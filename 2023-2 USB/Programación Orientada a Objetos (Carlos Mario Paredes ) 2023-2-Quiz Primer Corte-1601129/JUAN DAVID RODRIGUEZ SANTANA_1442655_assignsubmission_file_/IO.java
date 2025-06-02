
package pelicula;

import javax.swing.JOptionPane;
    public class IO {
      //entradas
      public static int leerEnt(String msg){
        int input;
        input = Integer.parseInt(JOptionPane.showInputDialog(msg));
        return input;
    }

      public static double leerDou(String msg){
        double input;
        input = Double.parseDouble(JOptionPane.showInputDialog(msg));
        return input;
    }
    
      public static char leerchar(String msg){
        char input;
        input = JOptionPane.showInputDialog(msg).charAt(0);
        return input;
    }
      public static String leerString(String msg){
        String input;
        input = JOptionPane.showInputDialog(msg);
        return input;
    }
      //salida
      public static void mostrar(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
}