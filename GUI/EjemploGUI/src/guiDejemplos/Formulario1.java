package guiDejemplos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Formulario1 extends JFrame implements ActionListener{
    private JTextField usuario;
    private JPasswordField clave;
    private JComboBox universidad;
    private JButton limpiar,mostrar;

    public Formulario1(){
        inicializarGUI();
        inicializarEventos();
    }

    private void inicializarGUI(){
        //Configurando el título, posición, tamaño y cierre de la ventana
        setTitle("Ventana con Menú");
        setBounds(200,100,400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        String[] listaU = {"","Autónona","Javeriana","ICESI","Univalle","San Buenaventura","USC","Unilibre"};

        usuario     = new JTextField();
        clave       = new JPasswordField();
        universidad = new JComboBox(listaU);

        mostrar     = new JButton("Mostrar");
        limpiar     = new JButton("Limpiar");

        getContentPane().setLayout(new GridLayout(4,2));

        getContentPane().add(new JLabel("Usuario:"));
        getContentPane().add(usuario);
        getContentPane().add(new JLabel("Contraseña:"));
        getContentPane().add(clave);
        getContentPane().add(new JLabel("Universidad:"));
        getContentPane().add(universidad);
        getContentPane().add(mostrar);
        getContentPane().add(limpiar);
    }

    private void inicializarEventos(){
        limpiar.addActionListener(this);
        mostrar.addActionListener(this);

        limpiar.setActionCommand("limpiar forma");
        mostrar.setActionCommand("mostrar forma");
    }

    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("mostrar forma")){
            mostrarCamposFormulario();
        }

        if(e.getActionCommand().equals("limpiar forma")){
            limpiarFormulario();
        }
    }

    private void mostrarCamposFormulario(){
        String mensaje = "El formulario tiene los siguientes valores\n";
        mensaje += "Usuario: '" + usuario.getText() + "'\n";
        mensaje += "Contraseña: '" + new String(clave.getPassword()) + "'\n";
        mensaje += "Universidad: '" + universidad.getSelectedItem() + "'\n";

        JOptionPane.showMessageDialog(this, mensaje);
    }

    private void limpiarFormulario(){
        usuario.setText("");
        clave.setText("");
        universidad.setSelectedIndex(0);
    }

    public static void main(String[] args){
        Formulario1 f1 = new Formulario1();
        f1.setVisible(true);
    }
}
