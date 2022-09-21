package universidad;
public class Docente extends Persona{
    private String areaConocimiento;
    private String nivelEscolaridad;
    private String facultad;

    public Docente(){
        areaConocimiento = "";
        nivelEscolaridad = "";
        facultad = "";
    }

    public void asignarAreaConomiento(String ac){
        areaConocimiento = ac;
    }

    public void asignarNivelEscolaridad(String ne){
        nivelEscolaridad = ne;
    }

    public void asignarFacultad(String f){
        facultad = f;
    }

    public String obtenerAreaConocimiento(){
        return areaConocimiento;
    }

    public String obtenerNivelEscolaridad(){
        return nivelEscolaridad;
    }

    public String obtenerFacultad(){
        return facultad;
    }
}
