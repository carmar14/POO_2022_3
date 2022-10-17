package guiBventanaheredada;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
public class VentanaDeEjemplo1 extends JFrame{
    public VentanaDeEjemplo1(){
        setTitle("Ventana de Ejemplo");
        setBounds(200,100,400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(new JLabel("Bienvenido a este programa!"));
        getContentPane().add(new JButton("Haz clic aquí!"));
    }

    public static void main(String[] args){
        VentanaDeEjemplo1 vde1 = new VentanaDeEjemplo1();
        vde1.setVisible(true);
    }
}
