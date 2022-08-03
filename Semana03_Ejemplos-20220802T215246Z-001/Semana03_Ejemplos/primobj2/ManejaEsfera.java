package primobj2;
import javax.swing.JOptionPane;
public class ManejaEsfera {
    Esfera e;
    double area, volumen;

    ManejaEsfera(){
        e       = new Esfera();
        area    = 0;
        volumen = 0;
    }

    void leerRadio(){
        double radio;
        radio = Double.parseDouble(
                    JOptionPane.showInputDialog("Por favor digite el radio de la esfera:"));
        e.asignarRadio(radio);
    }

    void calcularCaracteristicas(){
        area    = e.calcularArea();
        volumen = e.calcularVolumen();
    }

    void imprimirCaracteristicas(){
        JOptionPane.showMessageDialog(null, "El área de la esfera es: "+area+" y su volumen es: "+volumen);
    }

    void gestionar(){
        leerRadio();
        calcularCaracteristicas();
        imprimirCaracteristicas();
    }
}
