package guiCevents;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
public class ComportamientoBoton implements ActionListener{
    public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(null,
                "Hola! Has presionado este botón :)");
    }
}
