package paisesycapitalesobjetos;
public class Pais {
    private String nombrePais;
    private String capital;

    public Pais(){
        nombrePais = "";
        capital    = "";
    }

    public void asignarNombrePais(String np){
        nombrePais = np;
    }

    public void asignarCapital(String c){
        capital = c;
    }

    public String obtenerNombrePais(){
        return nombrePais;
    }

    public String obtenerCapital(){
        return capital;
    }
}
