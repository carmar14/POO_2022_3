package autenticacion;
import javax.swing.*;
import java.awt.*;
public class VentanaAutenticacion extends JFrame{
    private JTextField nombreDeUsuario;
    private JPasswordField contrasena;
    private GestionAutenticacion ga;

    public VentanaAutenticacion(){
        ga = new GestionAutenticacion(this);
    }

    public void inicializarGUI(){
        setTitle("Inicio de Sesión");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        nombreDeUsuario = new JTextField();
        contrasena      = new JPasswordField();

        nombreDeUsuario.setColumns(8);
        contrasena.setColumns(8);

        JButton acceder = new JButton("Iniciar Sesión");
        acceder.addActionListener(ga);

        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(new JLabel("Usuario:"));
        getContentPane().add(nombreDeUsuario);
        getContentPane().add(new JLabel("Contraseña:"));
        getContentPane().add(contrasena);
        getContentPane().add(acceder);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public String obtenerNombreUsuario(){
        return nombreDeUsuario.getText();
    }

    public String obtenerContrasena(){
        return new String(contrasena.getPassword());
    }

    public void mostrarMensajeAutenticacion(Usuario u){
        String msg;
        if(u==null){
            msg = "Autenticación Fallida!\nContraseña Incorrecta";
        }else{
            msg = "Usuario Autenticado:\n"+ u.toString();
        }
        JOptionPane.showMessageDialog(this, msg);
    }
}
