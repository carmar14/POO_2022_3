package ordenamientoarregloaleatorio;
import java.util.Arrays;
public class GestionNumerosAleatorios {
    private int[] numeros;

    public void gestionar(){
        leerCantidadNumeros();
        generarNumerosAleatorios();
        mostrarArreglo();
        ordenarArreglo();
        mostrarArreglo();
    }

    private void leerCantidadNumeros(){
        int tam;
        tam = ES.leerEntero("Por favor digite la cantidad de números aleatorios a generar");
        numeros = new int[tam];
    }

    private void generarNumerosAleatorios(){
        for(int i=0;i<numeros.length;i++){
            numeros[i] = 1 + (int)(Math.random()*99);
        }
    }

    private void ordenarArreglo(){
        Arrays.sort(numeros);
    }

    private void mostrarArreglo(){
        String cadena_numeros="";
        for(int n:numeros){
            cadena_numeros += " "+n;
        }
        ES.mostrar("Los números son: "+cadena_numeros);
    }
}
