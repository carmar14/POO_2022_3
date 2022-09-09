package paisesycapitales;
public class GestionPaisesYCapitales {
    private String[] paises;
    private String[] capitales;

    public void gestionar(){
        leerCantidadPaisesYCapitales();
        leerPaisesYCapitales();
        mostrarPaisesYCapitales();
    }

    private void leerCantidadPaisesYCapitales(){
        int tam;
        tam       = ES.leerEntero("Por favor digite la cantidad de países y capitales a gestionar:");
        paises    = new String[tam];
        capitales = new String[tam];
    }

    private void leerPaisesYCapitales(){
        for(int i=0;i<paises.length;i++){
            paises[i]    = ES.leerCadena("Digite el nombre del país "+(i+1));
            capitales[i] = ES.leerCadena("Digite el nombre de la capital de  "+paises[i]);
        }
    }

    private void mostrarPaisesYCapitales(){
        String msg = "";
        for(int i=0;i<paises.length;i++){
            msg = msg + paises[i] + " - " + capitales[i] + "\n";
        }
        ES.mostrar(msg);
    }
}
