package guiApruebaswing;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JButton;
public class VentanaContenedorConBoton {
    public static void main(String[] args){
        JFrame ventana = new JFrame("Ventana con Botón");
        ventana.setBounds(100, 100, 300, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton boton = new JButton();
        boton.setText("Oprima este botón");

        Container contenedor;
        contenedor = ventana.getContentPane();

        contenedor.add(boton);
        ventana.setVisible(true);
    }
}
