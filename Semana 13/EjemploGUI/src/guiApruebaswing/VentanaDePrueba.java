package guiApruebaswing;
import javax.swing.JFrame;
public class VentanaDePrueba {
    public static void main(String[] args){
        JFrame ventana = new JFrame();
        ventana.setTitle("Ventana de Prueba 1");
        ventana.setBounds(100, 100, 300, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
