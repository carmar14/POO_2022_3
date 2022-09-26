package universidadpolimorfismo;
public class Estudiante extends Persona{
    private String codigoPrograma;
    private int numeroSemestre;
    private double promedioAcumulado;

    public Estudiante(){
        codigoPrograma    = "";
        numeroSemestre    = 0;
        promedioAcumulado = 0;
    }

    public void asignarCodigoPrograma(String cp){
        codigoPrograma = cp;
    }

    public void asignarNumeroSemestre(int ns){
        numeroSemestre = ns;
    }

    public void asignarPromedioAcumulado(double pa){
        promedioAcumulado = pa;
    }

    public String obtenerCodigoPrograma(){
        return codigoPrograma;
    }

    public int obtenerNumeroSemestre(){
        return numeroSemestre;
    }

    public double obtenerPromedioAcumulado(){
        return promedioAcumulado;
    }
}
