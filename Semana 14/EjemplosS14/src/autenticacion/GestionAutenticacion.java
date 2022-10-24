package autenticacion;
import java.awt.event.*;
import java.util.*;
import java.io.*;
public class GestionAutenticacion implements ActionListener{
    private VentanaAutenticacion va;
    private ArrayList<Usuario> listaUsuarios;
    private Usuario usuarioAutenticado;

    public GestionAutenticacion(VentanaAutenticacion ventana){
        va = ventana;
        listaUsuarios = new ArrayList<Usuario>();
        usuarioAutenticado = null;
    }

    public void actionPerformed(ActionEvent e){
        autenticarUsuario();
    }

    public void autenticarUsuario(){
        cargarListaUsuarios();
        String forma_nombre_usuario = va.obtenerNombreUsuario();
        String forma_contrasena = va.obtenerContrasena();
        usuarioAutenticado = null;

        for(Usuario u:listaUsuarios){
            String nombre_usuario = u.getNombreUsuario();
            String contrasena    = u.getContrasena();

            if(nombre_usuario.equals(forma_nombre_usuario)
               && contrasena.equals(forma_contrasena)){
                usuarioAutenticado = u;
            }
        }

        va.mostrarMensajeAutenticacion(usuarioAutenticado);
    }

    private void cargarListaUsuarios(){
        try{
            File archivo      = new File("src/autenticacion/usuarios.txt");
            FileReader fr     = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            String linea;
            while((linea=br.readLine())!=null){
                System.out.println(linea);
                String[] datos   = linea.split("#");
                String nom_usu   = datos[0];
                String clave     = datos[1];
                String tipo      = datos[2];
                String nombres   = datos[3];
                String apellidos = datos[4];
                boolean docente;
                if(tipo.equals("docente")) docente = true;
                else docente = false;
                Usuario u = new Usuario(nombres,apellidos,nom_usu,clave,docente);
                listaUsuarios.add(u);
            }
            fr.close();
        }catch(Exception e){
            System.out.println("Error al abrir el archivo "+e);
        }
    }
}
