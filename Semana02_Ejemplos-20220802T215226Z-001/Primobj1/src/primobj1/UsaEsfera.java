package primobj1;
import javax.swing.JOptionPane;
public class UsaEsfera {
    public static void main(String args[]){
        Esfera e;
        e = new Esfera();

        double rad, area, volumen;
        rad = Double.parseDouble(
                    JOptionPane.showInputDialog("Por favor digite el radio de la esfera:"));

        e.asignarRadio(rad);

        area    = e.calcularArea();
        volumen = e.calcularVolumen();

        JOptionPane.showMessageDialog(null, "El área de la esfera es: "+area+" y su volumen es: "+volumen);
    }
}
