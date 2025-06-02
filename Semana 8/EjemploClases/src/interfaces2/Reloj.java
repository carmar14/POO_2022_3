package interfaces2;
import java.util.Date;
import javax.swing.JOptionPane;
public abstract class Reloj {
    public void mostrarHora(){
        Date fechaAhora = new Date();
        JOptionPane.showMessageDialog(null, "La Fecha y Hora es: "+fechaAhora);
    }
}
