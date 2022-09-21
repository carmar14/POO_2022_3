package universidad;
public class Persona {
    protected String nombre;
    protected String direccion;
    protected String telefono;

    public Persona(){
        nombre    = "";
        direccion = "";
        telefono  = "";
    }

    public void asignarNombre(String n){
        nombre = n;
    }

    public void asignarDireccion(String d){
        direccion = d;
    }

    public void asignarTelefono(String t){
        telefono = t;
    }

    public String obtenerNombre(){
        return nombre;
    }

    public String obtenerDireccion(){
        return direccion;
    }

    public String obtenerTelefono(){
        return telefono;
    }
}
