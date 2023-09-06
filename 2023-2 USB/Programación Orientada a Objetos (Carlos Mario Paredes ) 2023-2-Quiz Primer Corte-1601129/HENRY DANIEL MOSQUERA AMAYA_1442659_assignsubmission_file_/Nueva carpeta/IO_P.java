/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peliculas;
import javax.swing.JOptionPane;
/**
 *
 * @author salas
 */
public class IO_P {

    /*
     * Methods for reading data
     */
    public static int readInt(String msg){
        int input;
        input = Integer.parseInt(JOptionPane.showInputDialog(msg));
        return input;
    }

    public static double readDouble(String msg){
        double input;
        input = Double.parseDouble(JOptionPane.showInputDialog(msg));
        return input;
    }

    public static char readChar(String msg){
        char input;
        input = JOptionPane.showInputDialog(msg).charAt(0);
        return input;
    }

    public static String readString(String msg){
        String input;
        input = JOptionPane.showInputDialog(msg);
        return input;
    }

    /*
     * Methods of data display
     */

    public static void show(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
}

    
