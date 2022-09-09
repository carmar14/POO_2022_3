package notasestudiante;
public class GestionNotasEstudiante {

    private double[] notasEstudiante;

    public void gestionar(){
        leerNroNotas();
        leerNotas();
        double promedio = calcularPromedio();
        mostrarPromedio(promedio);
    }

    private void leerNroNotas(){
        int nro_notas;
        nro_notas = ES.leerEntero("Por favor digite el número de notas del estudiante");
        notasEstudiante = new double[nro_notas];
    }
    
    private void leerNotas(){
        for(int i=0;i<notasEstudiante.length;i++){
            notasEstudiante[i] = ES.leerReal("Por favor digite la nota "+(i+1)+" del estudiante");
        }
    }

    private double calcularPromedio(){
        double prom,suma;
        suma = 0;
        for(int i=0;i<notasEstudiante.length;i++){
            suma = suma + notasEstudiante[i];
        }
        prom = suma/notasEstudiante.length;
        return prom;
    }

    private void mostrarPromedio(double prom){
        ES.mostrar("El promedio de notas del estudiante es: "+prom);
    }
}
