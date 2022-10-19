package guiDejemplos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaConMenu2 extends JFrame implements ActionListener{
    private JMenuItem mi1,mi2,mi3,mi4,mi5,mi6;
    private JLabel mensaje;

    public VentanaConMenu2(){
        inicializarGUI();
        inicializarEventos();
    }

    private void inicializarGUI(){
        //Configurando el título, posición, tamaño y cierre de la ventana
        setTitle("Ventana con Menú");
        setBounds(200,100,400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Creando la barra de menú, luego un menú principal y dos opciones
        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = new JMenu("Un menú");
        JMenu menu2 = new JMenu("Otro menú");
        JMenu menu3 = new JMenu("Este será un submenú");

        mi1 = new JMenuItem("Primera opción del menú");
        mi2 = new JMenuItem("Segunda opción del menú");
        mi3 = new JMenuItem("Otra opción del menú");
        mi4 = new JMenuItem("Una opción del menú mas");
        mi5 = new JMenuItem("La quinta opción");
        mi6 = new JMenuItem("Y esta es la sexta");

        //Agregando las etiquetas de información
        mensaje = new JLabel("No se ha elegido aún ninguna opción del menú");
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(new JLabel(
                "Este programa ejemplifica el uso de un menú"),BorderLayout.NORTH);
        getContentPane().add(mensaje,BorderLayout.SOUTH);

        //componiendo los menúes
        setJMenuBar(menuBar);
        menuBar.add(menu1);
        menuBar.add(menu2);
        menu1.add(menu3);

        //agregando las opciones a los menús correspondientes
        menu1.add(mi1);
        menu1.add(mi2);
        menu2.add(mi3);
        menu2.add(mi4);
        menu3.add(mi5);
        menu3.add(mi6);
    }

    private void inicializarEventos(){
        mi1.addActionListener(this);
        mi2.addActionListener(this);
        mi3.addActionListener(this);
        mi4.addActionListener(this);
        mi5.addActionListener(this);
        mi6.addActionListener(this);

        mi1.setActionCommand("opción 1");
        mi2.setActionCommand("opción 2");
        mi3.setActionCommand("opción 3");
        mi4.setActionCommand("opción 4");
        mi5.setActionCommand("opción 5");
        mi6.setActionCommand("opción 6");
    }

    public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(this,
            "Hola! has elegido: "+e.getActionCommand());
        mensaje.setText("La última opción elegida es: "+e.getActionCommand());
    }

    public static void main(String[] args){
        VentanaConMenu2 vcm2 = new VentanaConMenu2();
        vcm2.setVisible(true);
    }
}
