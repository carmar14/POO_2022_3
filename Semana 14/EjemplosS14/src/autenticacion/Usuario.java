package autenticacion;
public class Usuario {
    private String nombres;
    private String apellidos;
    private String nombreUsuario;
    private String contrasena;
    private boolean docente;

    public Usuario(String nombres, String apellidos, String nombreUsuario, String contrasena, boolean docente) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.docente = docente;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public boolean isDocente() {
        return docente;
    }

    public void setDocente(boolean docente) {
        this.docente = docente;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    @Override
    public String toString(){
        String msg = "";
        msg += "Nombres: "+nombres+"\n";
        msg += "Apellidos: "+apellidos+"\n";
        msg += "Nombre de Usuario: "+nombreUsuario+"\n";
        msg += "Contraseña: "+contrasena+"\n";
        msg += "Docente: "+docente+"\n";
        return msg;
    }
}
