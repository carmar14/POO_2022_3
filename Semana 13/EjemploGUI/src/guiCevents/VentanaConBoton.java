package guiCevents;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
public class VentanaConBoton {
    public static void main(String[] args){
        JFrame ventana = new JFrame("Ventana con Botón");
        ventana.setBounds(100, 100, 300, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton boton = new JButton();
        boton.setText("Oprima este botón");
        ventana.getContentPane().setLayout(new FlowLayout());
        ventana.getContentPane().add(boton);

        ComportamientoBoton cb = new ComportamientoBoton();
        boton.addActionListener(cb);

        ventana.setVisible(true);
    }
}
