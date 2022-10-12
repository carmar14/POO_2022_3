package Peajes;

public class Peaje {
    
    private String Nombre;
    private String Departamento;
    private int TipoVehiculo;
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String N) {
        this.Nombre = N;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String D) {
        this.Departamento = D;
    }

    public int getTipoVehiculo() {
        return TipoVehiculo;
    }

    public void setTipoVehiculo(int TV) {
        this.TipoVehiculo = TV;
    }

    @Override
    public String toString() {
        return ("Nombre del peaje:" + Nombre + "\nDepartamento: " + Departamento);
    }
    
    
    
    
}
