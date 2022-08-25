/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usacurso;

/**
 *
 * @author Acer
 */

import javax.swing.JOptionPane;
public class IO {
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
    
    public static void show(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
    
}