package guiarchivopersona;
import java.io.Serializable;
public class Persona implements Serializable{
    private String usuario, clave, universidad, genero, color;
    public Persona(){
        usuario     = "";
        clave       = "";
        universidad = "";
        genero      = "";
        color       = "";
    }

    public Persona(String us,String cl, String un,String g,String co){
        usuario     = us;
        clave       = cl;
        universidad = un;
        genero      = g;
        color       = co;
    }

    public String obtenerUsuario(){
        return usuario;
    }

    public String obtenerClave(){
        return clave;
    }

    public String obtenerUniversidad(){
        return universidad;
    }

    public String obtenerGenero(){
        return genero;
    }

    public String obtenerColor(){
        return color;
    }
}