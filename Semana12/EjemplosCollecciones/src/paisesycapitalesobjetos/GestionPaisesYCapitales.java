package paisesycapitalesobjetos;
public class GestionPaisesYCapitales {
    private Pais[] paises;

    public void gestionar(){
        leerCantidadPaisesYCapitales();
        leerPaisesYCapitales();
        mostrarPaisesYCapitales();
    }

    private void leerCantidadPaisesYCapitales(){
        int tam;
        tam    = ES.leerEntero("Por favor digite la cantidad de países y capitales a gestionar:");
        paises = new Pais[tam];
    }

    private void leerPaisesYCapitales(){
        for(int i=0;i<paises.length;i++){
            String nombrePais = ES.leerCadena("Digite el nombre del país "+(i+1));
            String capital    = ES.leerCadena("Digite el nombre de la capital de  "+nombrePais);

            paises[i] = new Pais();

            paises[i].asignarNombrePais(nombrePais);
            paises[i].asignarCapital(capital);
        }
    }

    private void mostrarPaisesYCapitales(){
        String msg = "";
        for(Pais p:paises){
            msg = msg + p.obtenerNombrePais() + " - " + p.obtenerCapital() + "\n";
        }
        ES.mostrar(msg);
    }
}
