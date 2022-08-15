package programasiniciales;
import javax.swing.JOptionPane;

public class PromedioGoles2 {
    static void mostrarBienvenida(){
        JOptionPane.showMessageDialog(null,
                "Programa que Calcula Promedio de Goles por Partido.\n" +
                "A continuación se le solicitarán los datos de entrada.\n" +
                "Gracias.");
    }
    
    static int obtenerNroPartidos(){
        int nro_partidos;
        nro_partidos = Integer.parseInt(
                         JOptionPane.showInputDialog("Por favor digite " +
                                "el número de partidos jugados en todo el torneo"));
        return nro_partidos;
    }

    static int obtenerNroGoles(){
        int nro_goles;
        nro_goles = Integer.parseInt(
                         JOptionPane.showInputDialog("Por favor digite " +
                                "el número total de goles marcados"));
        return nro_goles;
    }

    static double calcularPromedioGoles(int nro_goles, int nro_partidos){
        double promedio_goles;

        promedio_goles = (double)nro_goles / (double)nro_partidos;

        return promedio_goles;
    }

    public static void mostrarResultado(double promedio_goles){
        JOptionPane.showMessageDialog(null, "El promedio de goles por " +
                                            "partido es "+promedio_goles);
    }

    public static void main(String[] args) {
        int nro_partidos, nro_goles;
        double promedio_goles;

        nro_partidos = obtenerNroPartidos();
        nro_goles    = obtenerNroGoles();

        promedio_goles = calcularPromedioGoles(nro_goles,nro_partidos);

        mostrarResultado(promedio_goles);
    }
}
