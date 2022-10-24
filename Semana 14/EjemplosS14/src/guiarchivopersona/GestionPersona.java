package guiarchivopersona;
import javax.swing.JOptionPane;
import java.util.*;
import java.io.*;
import java.awt.event.*;
public class GestionPersona implements ActionListener{
    private FormularioPersona formulario;
    private List<Persona> listaPersonas;

    public GestionPersona(FormularioPersona fp){
        formulario    = fp;
        listaPersonas = new ArrayList<Persona>();
    }

    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("agregar persona")){
            agregarPersona();
        }

        if(e.getActionCommand().equals("limpiar forma")){
            formulario.limpiarFormulario();
        }

        if(e.getActionCommand().equals("salir aplicación")){
            System.exit(0);
        }

        if(e.getActionCommand().equals("mostrar personas")){
            mostrarPersonas();
        }

        if(e.getActionCommand().equals("mostrar creditos")){
            mostrarCreditos();
        }

        if(e.getActionCommand().equals("guardar personas")){
            guardarPersonas();
        }

        if(e.getActionCommand().equals("cargar personas")){
            cargarPersonas();
        }
    }

    private void agregarPersona(){
        String usuario, clave, universidad, genero, color;
        usuario = formulario.obtenerUsuario();
        clave = formulario.obtenerClave();
        universidad = formulario.obtenerUniversidad();
        genero = formulario.obtenerGenero();
        color = formulario.obtenerColor();

        Persona p = new Persona(usuario,clave,universidad,genero,color);
        listaPersonas.add(p);

        JOptionPane.showMessageDialog(formulario,"La persona ha sido agregada");
        formulario.limpiarFormulario();
    }

    private void mostrarPersonas(){
        String listado = "Personas Registradas:";

        for(Persona p:listaPersonas){
            listado += "\n";
            listado += p.obtenerUsuario() + ", ";
            listado += p.obtenerClave() + ", ";
            listado += p.obtenerUniversidad() + ", ";
            listado += p.obtenerGenero() + ", ";
            listado += p.obtenerColor();
        }

        if(listaPersonas.isEmpty())
            listado = "No hay personas registradas";

        JOptionPane.showMessageDialog(formulario,listado);
    }

    private void mostrarCreditos(){
        String mensaje = "Créditos\n\n";
        mensaje += "Informática 2\n";
        mensaje += "Departamento de Operaciones y Sistemas\n";
        mensaje += "Universidad Autónoma de Occidente\n";

        JOptionPane.showMessageDialog(formulario, mensaje);
    }

    private void guardarPersonas(){
        try{
            FileOutputStream salArch = new FileOutputStream ("personas.dat");
            ObjectOutputStream salStream = new ObjectOutputStream (salArch);

            for(Persona p:listaPersonas){
                salStream.writeObject (p);
            }
            JOptionPane.showMessageDialog(formulario, "Los datos han sido almacenados satisfactoriamente");
            salStream.close();
        }catch(Exception e){
            System.out.println("No pueden escribirse las personas en el archivo\n"+e);
	}
    }

    private void cargarPersonas(){
        boolean cargados = false;
        try{
            FileInputStream entArch = new FileInputStream ("personas.dat");
            ObjectInputStream entStream = new ObjectInputStream (entArch);

            listaPersonas.clear();

            Persona p;
            while(true){
                p = (Persona) entStream.readObject ();
                listaPersonas.add(p);
            }
        }catch(EOFException e){
            cargados = true;
        }catch(Exception e){
            System.out.println("No pueden leerse las personas desde el archivo\n"+e);
	}
        if(cargados)
            JOptionPane.showMessageDialog(formulario, "Los datos han sido cargados satisfactoriamente");
        else
            JOptionPane.showMessageDialog(formulario, "Los datos no pudieron ser cargados");
    }
}