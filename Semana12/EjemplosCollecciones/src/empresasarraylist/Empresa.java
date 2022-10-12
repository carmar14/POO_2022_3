package empresasarraylist;
public class Empresa {
    private String nombre;
    private String nit;
    private int numeroTrabajadores;
    private double salarioPromedio;
    private double porcentajeAumento;

    public Empresa(){
        nombre             = "";
        nit                = "";
        numeroTrabajadores = 0;
        salarioPromedio    = 0;
        porcentajeAumento  = 0;
    }

    public void asignarNombre(String nom){
        nombre = nom;
    }

    public void asignarNit(String n){
        nit = n;
    }

    public void asignarNumeroTrabajadores(int nt){
        numeroTrabajadores = nt;
    }

    public void asignarSalarioPromedio(double sp){
        salarioPromedio = sp;
    }

    public void asignarPorcentajeAumento(double pa){
        porcentajeAumento = pa;
    }

    public String obtenerNombre(){
        return nombre;
    }

    public String obtenerNit(){
        return nit;
    }

    public int obtenerNumeroTrabajadores(){
        return numeroTrabajadores;
    }

    public double obtenerSalarioPromedio(){
        return salarioPromedio;
    }

    public double obtenerPorcentajeAumento(){
        return porcentajeAumento;
    }

    public double calcularNuevoSueldo(){
        double aumento, nuevo_salario;
        aumento = salarioPromedio*porcentajeAumento/100;
        nuevo_salario = salarioPromedio + aumento;
        return nuevo_salario;
    }
}
