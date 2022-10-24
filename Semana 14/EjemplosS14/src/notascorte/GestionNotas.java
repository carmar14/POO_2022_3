package notascorteG53;
import java.awt.event.*;
public class GestionNotas implements ActionListener{
    private VentanaNotas vn;

    public GestionNotas(VentanaNotas ventana){
        vn = ventana;
    }

    public void actionPerformed(ActionEvent e){
        String comando = e.getActionCommand();

        if(comando.equals("calcular")){
            calcularNotaCorte();
        }

        if(comando.equals("creditos")){
            vn.mostrarCreditos();
        }
    }

    private void calcularNotaCorte(){
        double t = vn.obtenerNTarea();
        double q = vn.obtenerNQuiz();
        double p = vn.obtenerNParcial();

        double nc = t*0.1 + q*0.2 + p*0.7;
        nc = Math.round(nc*10)/(double)10;

        vn.asignarNCorte(nc);
    }
}