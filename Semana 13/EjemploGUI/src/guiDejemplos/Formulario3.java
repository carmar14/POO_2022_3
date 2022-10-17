package guiDejemplos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Formulario3 extends JFrame implements ActionListener{
    private JTextField usuario;
    private JPasswordField clave;
    private JComboBox universidad;
    private JButton limpiar,mostrar,salir;
    private JRadioButton m,f;
    private ButtonGroup genero;
    private JCheckBox am,az,ro;

    public Formulario3(){
        inicializarGUI();
        inicializarEventos();
    }

    private void inicializarGUI(){
        //Configurando el título, posición, tamaño y cierre de la ventana
        setTitle("Ventana con Menú");
        setBounds(200,100,400,300);
        getContentPane().setBackground(Color.GREEN);
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
        campos.setOpaque(false);
        campos.setLayout(new GridLayout(5,2));

        JPanel celdas[][] = new JPanel[5][2];
        for(int i=0;i<5;i++)
            for(int j=0;j<2;j++){
                celdas[i][j] = new JPanel();
                celdas[i][j].setOpaque(false);
                celdas[i][j].setLayout(new FlowLayout());
                campos.add(celdas[i][j]);
            }

        celdas[0][0].add(new JLabel("Usuario:"));
        celdas[0][1].add(usuario);
        celdas[1][0].add(new JLabel("Contraseña:"));
        celdas[1][1].add(clave);
        celdas[2][0].add(new JLabel("Universidad:"));
        celdas[2][1].add(universidad);
        celdas[3][0].add(new JLabel("Género:"));
        celdas[3][1].add(m);
        celdas[3][1].add(f);
        celdas[4][0].add(new JLabel("¿Qué colores le gustan?:"));
        celdas[4][1].add(am);
        celdas[4][1].add(az);
        celdas[4][1].add(ro);

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
        Formulario3 f3 = new Formulario3();
        f3.setVisible(true);
    }
}
