package guiDejemplos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Formulario2 extends JFrame implements ActionListener{
    private JTextField usuario;
    private JPasswordField clave;
    private JComboBox universidad;
    private JButton limpiar,mostrar,salir;
    private JRadioButton m,f;
    private ButtonGroup genero;
    private JCheckBox am,az,ro;

    public Formulario2(){
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
        m           = new JRadioButton("Masculino");
        f           = new JRadioButton("Femenino");
        genero      = new ButtonGroup();
        am          = new JCheckBox("Amarillo");
        az          = new JCheckBox("Azul");
        ro          = new JCheckBox("Rojo");

        genero.add(m);
        genero.add(f);
        usuario.setColumns(10);
        clave.setColumns(10);

        mostrar = new JButton("Mostrar");
        limpiar = new JButton("Limpiar");
        salir   = new JButton("Salir");

        //Definiendo los tres paneles en los que estará divida la gui
        JPanel encabezado = new JPanel();
        JPanel campos     = new JPanel();
        JPanel botones    = new JPanel();

        //El contenedor de la ventana tendrá una disposición de BorderLayout
        getContentPane().setLayout(new BorderLayout());

        //Agregando cada panel al contenedor principal
        getContentPane().add(encabezado,BorderLayout.NORTH);
        getContentPane().add(campos,BorderLayout.CENTER);
        getContentPane().add(botones,BorderLayout.SOUTH);

        //Configurando el panel del encabezado
        encabezado.setLayout(new FlowLayout());
        encabezado.add(new JLabel("Por favor diligencia el siguiente formulario:"));

        //Configurando el panel de los campos del formulario
        campos.setLayout(new GridLayout(5,0));

        //Configurando los paneles de cada campo al interior de un celda
        JPanel pUs = new JPanel(), pCl = new JPanel();
        JPanel pUn = new JPanel(), pGe = new JPanel(), pCo = new JPanel();
        pUs.setLayout(new FlowLayout()); pUs.add(usuario);
        pCl.setLayout(new FlowLayout()); pCl.add(clave);
        pUn.setLayout(new FlowLayout()); pUn.add(universidad);
        pGe.setLayout(new FlowLayout()); pGe.add(m); pGe.add(f);
        pCo.setLayout(new FlowLayout()); pCo.add(am); pCo.add(az); pCo.add(ro);

        campos.add(new JLabel("Usuario:"));
        campos.add(pUs);
        campos.add(new JLabel("Contraseña:"));
        campos.add(pCl);
        campos.add(new JLabel("Universidad:"));
        campos.add(pUn);
        campos.add(new JLabel("Género:"));
        campos.add(pGe);
        campos.add(new JLabel("¿Qué colores le gustan?:"));
        campos.add(pCo);

        //Configurando el panel de los botones del formulario
        botones.setLayout(new FlowLayout());
        botones.add(mostrar);
        botones.add(limpiar);
        botones.add(salir);
    }

    private void inicializarEventos(){
        limpiar.addActionListener(this);
        mostrar.addActionListener(this);
        salir.addActionListener(this);

        limpiar.setActionCommand("limpiar forma");
        mostrar.setActionCommand("mostrar forma");
        salir.setActionCommand("salir aplicación");
    }

    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("mostrar forma")){
            mostrarCamposFormulario();
        }

        if(e.getActionCommand().equals("limpiar forma")){
            limpiarFormulario();
        }

        if(e.getActionCommand().equals("salir aplicación")){
            System.exit(0);
        }
    }

    private void mostrarCamposFormulario(){
        String gen="";
        if(m.isSelected()) gen = "Masculino";
        if(f.isSelected()) gen = "Femenino";
        
        String col="";
        if(am.isSelected()) col += "Amarillo ";
        if(az.isSelected()) col += "Azul ";
        if(ro.isSelected()) col += "Rojo ";

        String mensaje = "El formulario tiene los siguientes valores\n";
        mensaje += "Usuario: '" + usuario.getText() + "'\n";
        mensaje += "Contraseña: '" + new String(clave.getPassword()) + "'\n";
        mensaje += "Universidad: '" + universidad.getSelectedItem() + "'\n";
        mensaje += "Género: '" + gen + "'\n";
        mensaje += "Colores: '" + col + "'\n";

        JOptionPane.showMessageDialog(this, mensaje);
    }

    private void limpiarFormulario(){
        usuario.setText("");
        clave.setText("");
        universidad.setSelectedIndex(0);
        genero.clearSelection();
        am.setSelected(false);
        az.setSelected(false);
        ro.setSelected(false);
    }

    public static void main(String[] args){
        Formulario2 f2 = new Formulario2();
        f2.setVisible(true);
    }
}
