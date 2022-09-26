package interfaces2;
import javax.swing.JOptionPane;
public class RelojDePared extends Reloj implements Parlanchin{
    public void hablar(){
        JOptionPane.showMessageDialog(null,"¡Cucu, cucu, ..!");
    }
}
