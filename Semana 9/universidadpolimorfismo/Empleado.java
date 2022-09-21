package universidadpolimorfismo;
public class Empleado extends Persona{
    private String cargo;
    private String departamento;

    public Empleado(){
        cargo        = "";
        departamento = "";
    }

    public void asignarCargo(String c){
        cargo = c;
    }

    public void asignarDeparamento(String d){
        departamento = d;
    }

    public String obtenerCargo(){
        return cargo;
    }

    public String obtenerDepartamento(){
        return departamento;
    }
}
