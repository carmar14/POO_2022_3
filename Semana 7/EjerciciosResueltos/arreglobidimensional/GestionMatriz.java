package arreglobidimensional;
public class GestionMatriz {
    private int[][] matriz;
    public void gestionar(){
        leerDimensiones();
        leerNumeros();
        int    s = sumar();
        double p = promediar(s);
        mostrar(s,p);
    }

    private void leerDimensiones(){
        int filas, columnas;
        filas    = ES.leerEntero("Digite el número de filas de la matriz");
        columnas = ES.leerEntero("Digite el número de columnas de la matriz");
        matriz = new int[filas][columnas];
    }

    private void leerNumeros(){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                matriz[i][j] = ES.leerEntero("Digite el número en la posición "+(i+1)+","+(j+1));
            }
        }
    }

    private int sumar(){
        int sumatoria = 0;
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                sumatoria += matriz[i][j];
            }
        }
        return sumatoria;
    }

    private double promediar(int s){
        double prom;
        prom = (double)s / (double)(matriz.length * matriz[0].length);
        return prom;
    }

    private void mostrar(int s,double p){
        String msg = "";
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                msg += " " + matriz[i][j];
            }
            msg += "\n";
        }
        ES.mostrar("La matriz es:\n"+msg+"Suma: "+s+"\nPromedio:"+p);
    }
}
