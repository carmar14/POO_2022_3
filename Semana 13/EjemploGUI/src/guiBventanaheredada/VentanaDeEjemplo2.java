package guiBventanaheredada;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class VentanaDeEjemplo2 extends JFrame implements ActionListener{
    public VentanaDeEjemplo2(){
        setTitle("Ventana de Ejemplo");
        setBounds(200,100,400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton un_boton = new JButton("Haz clic aquí!");
        un_boton.addActionListener(this);

        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(new JLabel("Bienvenido a este programa!"));
        getContentPane().add(un_boton);
    }

    public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(this, "Hola! has presionado este botón");
    }

    public static void main(String[] args){
        VentanaDeEjemplo2 vde2 = new VentanaDeEjemplo2();
        vde2.setVisible(true);
    }
}
