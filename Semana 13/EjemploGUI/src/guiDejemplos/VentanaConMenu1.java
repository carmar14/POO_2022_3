package guiDejemplos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaConMenu1 extends JFrame implements ActionListener{
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem menuItem1,menuItem2;

    public VentanaConMenu1(){
        inicializarGUI();
        inicializarEventos();
    }

    private void inicializarGUI(){
        //Configurando el título, posición, tamaño y cierre de la ventana
        setTitle("Ventana con Menú");
        setBounds(200,100,400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Creando la barra de menú, luego un menú principal y dos opciones
        menuBar = new JMenuBar();
        menu = new JMenu("Un menú");
        menuItem1 = new JMenuItem("Primera opción del menú");
        menuItem2 = new JMenuItem("Segunda opción del menú");

        //Agregando la etiqueta de información
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(new JLabel(
                "Este programa ejemplifica el uso de un menú"));

        //componiendo los menúes
        setJMenuBar(menuBar);
        menuBar.add(menu);
        menu.add(menuItem1);
        menu.add(menuItem2);        
    }

    private void inicializarEventos(){
        menuItem1.addActionListener(this);
        menuItem2.addActionListener(this);

        menuItem1.setActionCommand("opcion1");
        menuItem2.setActionCommand("opcion2");
    }

    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("opcion1")){
            JOptionPane.showMessageDialog(this,
                "Hola! has elegido la primera opción del menú");
        }

        if(e.getActionCommand().equals("opcion2")){
            JOptionPane.showMessageDialog(this,
                "Buen día! has elegido la segunda opción del menú");
        }
    }

    public static void main(String[] args){
        VentanaConMenu1 vcm1 = new VentanaConMenu1();
        vcm1.setVisible(true);
    }
}
