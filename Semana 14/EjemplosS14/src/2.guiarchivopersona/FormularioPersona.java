package guiarchivopersona;
import javax.swing.*;
import java.awt.*;

public class FormularioPersona extends JFrame{
    private JMenuItem guardar,cargar,salir,mostrar,creditos;

    private JButton limpiar,agregar;
    private JTextField usuario;
    private JPasswordField clave;
    private JComboBox universidad;
    private JRadioButton m,f;
    private ButtonGroup genero;
    private JCheckBox am,az,ro;

    public FormularioPersona(){
        inicializarGUI();
        inicializarEventos();
    }

    private void inicializarGUI(){
        //Configurando el título, posición, tamaño y cierre de la ventana
        setTitle("Gestión de Personas");
        setBounds(200,100,400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Creando la barra de menú, luego un menú principal y dos opciones
        JMenuBar menuBar = new JMenuBar();
        JMenu archivo = new JMenu("Archivo");
        JMenu ver = new JMenu("Ver");

        guardar  = new JMenuItem("Guardar en Archivo");
        cargar   = new JMenuItem("Cargar de Archivo");
        salir    = new JMenuItem("Salir");
        mostrar  = new JMenuItem("Mostrar Personas");
        creditos = new JMenuItem("Créditos");
        
        //componiendo los menúes
        setJMenuBar(menuBar);
        menuBar.add(archivo);
        menuBar.add(ver);

        //agregando las opciones a los menús correspondientes
        archivo.add(guardar);
        archivo.add(cargar);
        archivo.addSeparator();
        archivo.add(salir);
        ver.add(mostrar);
        ver.add(creditos);

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

        agregar = new JButton("Agregar");
        limpiar = new JButton("Limpiar");

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
        campos.setLayout(new GridLayout(5,2));

        JPanel celdas[][] = new JPanel[5][2];
        for(int i=0;i<5;i++)
            for(int j=0;j<2;j++){
                celdas[i][j] = new JPanel();
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
        botones.add(agregar);
        botones.add(limpiar);
    }

    private void inicializarEventos(){
        GestionPersona cp = new GestionPersona(this);

        limpiar.addActionListener(cp);
        agregar.addActionListener(cp);
        guardar.addActionListener(cp);
        cargar.addActionListener(cp);
        salir.addActionListener(cp);
        mostrar.addActionListener(cp);
        creditos.addActionListener(cp);

        limpiar.setActionCommand("limpiar forma");
        agregar.setActionCommand("agregar persona");
        guardar.setActionCommand("guardar personas");
        cargar.setActionCommand("cargar personas");
        salir.setActionCommand("salir aplicación");
        mostrar.setActionCommand("mostrar personas");
        creditos.setActionCommand("mostrar creditos");
    }

    public void limpiarFormulario(){
        usuario.setText("");
        clave.setText("");
        universidad.setSelectedIndex(0);
        genero.clearSelection();
        am.setSelected(false);
        az.setSelected(false);
        ro.setSelected(false);
    }

    public String obtenerGenero(){
        String gen="";
        if(m.isSelected()) gen = "Masculino";
        if(f.isSelected()) gen = "Femenino";
        return gen;
    }

    public String obtenerColor(){
        String col="";
        if(am.isSelected()) col += "Amarillo ";
        if(az.isSelected()) col += "Azul ";
        if(ro.isSelected()) col += "Rojo ";
        return col;
    }

    public String obtenerUsuario(){
        return usuario.getText();
    }

    public String obtenerClave(){
        return new String(clave.getPassword());
    }

    public String obtenerUniversidad(){
        return (String)universidad.getSelectedItem();
    }
}
