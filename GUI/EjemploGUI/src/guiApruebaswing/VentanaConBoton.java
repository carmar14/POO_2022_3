package guiApruebaswing;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
public class VentanaConBoton {
    public static void main(String[] args){
        JFrame ventana = new JFrame("Ventana con Botón");
        ventana.setBounds(100, 100, 300, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton boton = new JButton();
        boton.setText("Oprima este botón");

        ventana.getContentPane().add(boton);
        ventana.getContentPane().setLayout(new FlowLayout());
        ventana.setVisible(true);
    }
}
