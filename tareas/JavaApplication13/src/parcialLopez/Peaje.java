package ParcialPeajes;

public class Peaje {
    
    private String Nombre;
    private String Departamento;
    private int TipoV;
    
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

    public int getTipoV() {
        return TipoV;
    }

    public void setTipoV(int TipoV) {
        this.TipoV = TipoV;
    }

    @Override
    public String toString() {
        return ("Nombre del peaje:" + Nombre + "\nDepartamento: " + Departamento);
    }
    
    
    
    
}
