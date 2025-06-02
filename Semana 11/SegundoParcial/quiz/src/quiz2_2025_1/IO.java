package quiz2_2025_1;

import javax.swing.JOptionPane;

public class IO {
    
public static int readInt(String msg){
    return Integer.parseInt(JOptionPane.showInputDialog(msg));
}

public static double readDouble(String msg){
    return Double.parseDouble(JOptionPane.showInputDialog(msg));
}

public static String readString(String msg){
    return JOptionPane.showInputDialog(msg);
}

public static void show(String msg){
    JOptionPane.showMessageDialog(null, msg);
} 

}
