package numeros;
public class GestionNumeros {
    private int[] numeros;

    public void gestionar(){
        leerCantidadNumeros();
        leerNumeros();
        leerNroAdicional();
        mostrar();
        ordenar();
        mostrar();
    }

    private void leerCantidadNumeros(){
        int tam;
        tam = ES.leerEntero("Ingrese la cantidad de números");
        numeros = new int[tam];
    }

    private void leerNumeros(){
        for(int i=0;i<numeros.length;i++){
        numeros[i] = ES.leerEntero("Digite el número "+(i+1));
        }
    }

    private void leerNroAdicional(){
        char seguir;
        do{
            int num;
            num = ES.leerEntero("Digite el número adicional");
            int pos;
            pos = buscar(num);
            if(pos<0){
                ES.mostrar("El número "+num+" no está entre los digitados anteriormente");
            }else{
                ES.mostrar("El número "+num+" SI está y se encuentra en la posición "+(pos+1));
            }
            seguir = ES.leerCaracter("¿Desea seguir (S/N)?");
        }while(seguir!='N');
    }

    private int buscar(int nb){
        int posicion = -1;
        for(int i=0;i<numeros.length;i++){        
            if(nb==numeros[i]){
                posicion = i;
            }
        }
        return posicion;
    }

    private void mostrar(){
        String cadena_numeros = "";
        for(int numero:numeros){
            cadena_numeros = cadena_numeros + " " + numero;
        }
        ES.mostrar("Los números son:"+cadena_numeros);
    }

    private void ordenar(){
        boolean ordenado;
        do{
            ordenado = true;
            for(int i=0;i<numeros.length-1;i++){
                if(numeros[i]>numeros[i+1]){
                    int aux      = numeros[i];
                    numeros[i]   = numeros[i+1];
                    numeros[i+1] = aux;
                    ordenado = false;
                }
            }
        }while(!ordenado);
    }
}
