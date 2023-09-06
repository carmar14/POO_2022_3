package Parcial;
import javax.swing.JOptionPane;
public class IO {
    /*
     * Methods for reading data
     */
    public static int readInt(String tex){
        int input;
        input = Integer.parseInt(JOptionPane.showInputDialog(tex));
        return input;
    }

    public static double readDouble(String tex){
        double input;
        input = Double.parseDouble(JOptionPane.showInputDialog(tex));
        return input;
    }

    public static char readChar(String tex){
        char input;
        input = JOptionPane.showInputDialog(tex).charAt(0);
        return input;
    }

    public static String readString(String tex){
        String input;
        input = JOptionPane.showInputDialog(tex);
        return input;
    }

    /*
     * Methods of data display
     */

    public static void show(String tex){
        JOptionPane.showMessageDialog(null, tex);
    }
}
