package interfaces3;
import javax.swing.JOptionPane;
public abstract class Figura {
    protected double posx, posy;
    protected double longitud;
    protected double area;

    Figura(){
        longitud = 0;
        area     = 0;
        posx     = 0;
        posy     = 0;
    }

    public final void mostrarBienvenida(){
        JOptionPane.showMessageDialog(null,
                "Bienvenido a la Clase de"+
                " Figuras Geométricas");
    }

    public void imprimirLongitud(){
        JOptionPane.showMessageDialog(null,
                "La longitud de la figura es: "+longitud);
    }

    public void imprimirArea(){
        JOptionPane.showMessageDialog(null,
                "El área de la figura es: "+area);
    }

    public abstract void calcularLongitud();
    
    public abstract void calcularArea();
}
