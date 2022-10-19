package guiApruebaswing;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
public class VentanaConEtiqueta {
    public static void main(String[] args){
        JFrame ventana = new JFrame("Ventana con Etiqueta");
        ventana.setBounds(100, 100, 300, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel etiqueta1 = new JLabel();
        JLabel etiqueta2 = new JLabel();
        etiqueta1.setText("Bienvenido a Java Swing!!");
        etiqueta2.setText("La forma de hacer interfaces gráficas en Java");

        ventana.getContentPane().add(etiqueta1);
        ventana.getContentPane().add(etiqueta2);
        ventana.getContentPane().setLayout(new FlowLayout());
        ventana.setVisible(true);
    }
}
