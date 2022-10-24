package familia;
public class Persona {
    private String nombre;
    private int edad;

    public Persona() {
        nombre = "";
        edad   = 0;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        String msg = "";

        msg += "Nombre: "+nombre+" Edad: "+edad;

        return msg;
    }

    
}
