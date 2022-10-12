package paisesycapitalesarraylist;
import javax.swing.JOptionPane;
public class ES {//ES es una abreviación de EntradaSalida
    private ES(){}
    /*
     * Métodos para lectura de datos
     */
    public static int leerEntero(String msg){
        int entrada;
        entrada = Integer.parseInt(JOptionPane.showInputDialog(msg));
        return entrada;
    }

    public static double leerReal(String msg){
        double entrada;
        entrada = Double.parseDouble(JOptionPane.showInputDialog(msg));
        return entrada;
    }

    public static char leerCaracter(String msg){
        char entrada;
        entrada = JOptionPane.showInputDialog(msg).charAt(0);
        return entrada;
    }

    public static String leerCadena(String msg){
        String entrada;
        entrada = JOptionPane.showInputDialog(msg);
        return entrada;
    }

    /*
     * Métodos para despliegue de datos
     */
    public static void mostrar(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }

    public static void mostrar(Object objeto){
        JOptionPane.showMessageDialog(null, objeto);
    }
}
