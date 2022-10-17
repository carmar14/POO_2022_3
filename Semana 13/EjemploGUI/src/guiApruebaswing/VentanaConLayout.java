package guiApruebaswing;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
public class VentanaConLayout {
    public static void main(String[] args){
        JFrame ventana = new JFrame("Ventana con Botón");
        ventana.setBounds(100, 100, 300, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton boton = new JButton();
        boton.setText("Oprima este botón");
        
        Container contenedor;
        contenedor = ventana.getContentPane();

        FlowLayout disposicion = new FlowLayout();
        contenedor.setLayout(disposicion);

        contenedor.add(boton);
        ventana.setVisible(true);
    }
}
