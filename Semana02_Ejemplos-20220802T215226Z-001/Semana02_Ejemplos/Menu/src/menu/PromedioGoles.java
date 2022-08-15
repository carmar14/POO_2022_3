package programasiniciales;
import javax.swing.JOptionPane;

public class PromedioGoles {

    public static void main(String[] args) {
        int nro_partidos, nro_goles;
        float promedio_goles;

        JOptionPane.showMessageDialog(null,
                "Programa que Calcula Promedio de Goles por Partido.\n" +
                "A continuación se le solicitarán los datos de entrada.\n" +
                "Gracias.");
        nro_partidos = Integer.parseInt(
                            JOptionPane.showInputDialog("Por favor digite " +
                                "el número de partidos jugados en todo el torneo"));
        nro_goles    = Integer.parseInt(
                            JOptionPane.showInputDialog("Por favor digite " +
                                "el número total de goles marcados"));

        promedio_goles = (float)nro_goles / (float)nro_partidos;
        
        JOptionPane.showMessageDialog(null, "El promedio de goles por " +
                                            "partido es "+promedio_goles);
    }
}
