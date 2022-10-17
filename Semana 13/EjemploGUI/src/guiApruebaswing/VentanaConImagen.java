package guiApruebaswing;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
public class VentanaConImagen {
    public static void main(String[] args){
        JFrame ventana = new JFrame("Ventana con Imagen");
        ventana.setBounds(100, 100, 300, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon imagen = new ImageIcon("C:/Recursos/LogoUAO.jpg");
        JLabel etiqueta  = new JLabel();
        etiqueta.setIcon(imagen);

        ventana.getContentPane().add(etiqueta);
        ventana.getContentPane().setLayout(new FlowLayout());
        ventana.setVisible(true);
    }
}
