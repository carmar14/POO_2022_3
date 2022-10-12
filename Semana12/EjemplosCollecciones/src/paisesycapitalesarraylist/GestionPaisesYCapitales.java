package paisesycapitalesarraylist;
import java.util.ArrayList;
public class GestionPaisesYCapitales {
    private ArrayList<String> paises;
    private ArrayList<String> capitales;

    public GestionPaisesYCapitales(){
        paises    = new ArrayList<String>();
        capitales = new ArrayList<String>();
    }

    public void gestionar(){
        leerPaisesYCapitales();
        mostrarPaisesYCapitales();
    }

    private void leerPaisesYCapitales(){
        char seguir;
        int i=0;
        do{
            i++;
            String pais    = ES.leerCadena("Digite el nombre del país "+i);
            String capital = ES.leerCadena("Digite el nombre de la capital de "+pais);
            paises.add(pais);
            capitales.add(capital);
            seguir = ES.leerCaracter("¿Desea leer otro pais y capital?\n"
                    +"Digite S para continuar y N para no leer mas.");
        }while(seguir!='N');
    }

    private void mostrarPaisesYCapitales(){
        String msg = "";
        for(int i=0;i<paises.size();i++){
            msg = msg + paises.get(i) + " - " + capitales.get(i) + "\n";
        }
        ES.mostrar(msg);
    }
}
