package interfaces1;
import javax.swing.JOptionPane;
public class Punto implements Posicionable{
    //representa ubicación del punto actual en
    //el plano cartesiano con respecto al eje x
    private double coord_x;
    //representa ubicación del punto actual en
    //el plano cartesiano con respecto al eje y
    private double coord_y;

    //=================================================================
    // INICIO DE IMPLEMENTACIÓN DE MÉTODOS DE LA INTERFAZ POSICIONABLE
    //=================================================================
    public void asignarCoordenadas(double x, double y){
        coord_x = x;
        coord_y = y;
    }

    public double obtenerAbscisa(){
        return coord_x;
    }

    public double obtenerOrdenada(){
        return coord_y;
    }
    public void mostrarCoordenadas(){
        JOptionPane.showMessageDialog(null,
                "La posición del punto es (x,y) = ("+
                coord_x+","+coord_y+")");
    }

    public double obtenerDistanciaAlOrigen(){
        double distancia;
        distancia = coord_x*coord_x + coord_y*coord_y;
        distancia = Math.sqrt(distancia);

        return distancia;
    }
    //=================================================================
    // INICIO DE IMPLEMENTACIÓN DE MÉTODOS DE LA INTERFAZ POSICIONABLE
    //=================================================================
}
