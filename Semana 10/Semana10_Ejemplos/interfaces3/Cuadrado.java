package interfaces3;
import javax.swing.JOptionPane;
public class Cuadrado extends Figura implements Posicionable{
    //almacena la longitud del lado del cuadrado
    private double lado;
    //representa ubicación de la esquina superior izquierda
    //del cuadrado con respecto al eje x
    private double coordenada_x;
    //representa ubicación de la esquina superior izquierda
    //del cuadrado con respecto al eje y
    private double coordenada_y;

    public void asignarLado(double l){ lado = l; }

    //===========================================================
    // INICIO DE IMPLEMENTACIÓN DE MÉTODOS DE LA CLASE ABSTRACTA
    //===========================================================
    public void calcularLongitud(){
        longitud = lado*4;
    }

    public void calcularArea(){
        area = lado*lado;
    }
    //========================================================
    // FIN DE IMPLEMENTACIÓN DE MÉTODOS DE LA CLASE ABSTRACTA
    //========================================================

    //=================================================================
    // INICIO DE IMPLEMENTACIÓN DE MÉTODOS DE LA INTERFAZ POSICIONABLE
    //=================================================================
    public void asignarCoordenadas(double x, double y){
        coordenada_x = x;
        coordenada_y = y;
    }
    
    public double obtenerAbscisa(){
        return coordenada_x;
    }

    public double obtenerOrdenada(){
        return coordenada_y;
    }
    public void mostrarCoordenadas(){
        JOptionPane.showMessageDialog(null,
                "La posición del cuadrado es (x,y) = ("+
                coordenada_x+","+coordenada_y+")");
    }

    public double obtenerDistanciaAlOrigen(){
        double x_cerca_origen = coordenada_x;
        double y_cerca_origen = coordenada_y;

        if(x_cerca_origen<0)
            x_cerca_origen += lado;
        if(y_cerca_origen>0)
            y_cerca_origen -= lado;

        double distancia;
        distancia = x_cerca_origen*x_cerca_origen + y_cerca_origen*y_cerca_origen;
        distancia = Math.sqrt(distancia);

        return distancia;
    }
    //=================================================================
    // INICIO DE IMPLEMENTACIÓN DE MÉTODOS DE LA INTERFAZ POSICIONABLE
    //=================================================================
}
