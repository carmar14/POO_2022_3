package guiEtemperatura;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ConvertidorTemperatura extends JFrame implements ActionListener{
    private JTextField centigrados;
    private JLabel etiqueta_centigrados, mensaje_fahrenheit;
    private JButton conversion;

    public ConvertidorTemperatura(){
        inicializarGUI();
        inicializarEventos();
    }

    private void inicializarGUI(){
        setTitle("Convertidor de Temperatura");
        setBounds(100,100,210,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        etiqueta_centigrados = new JLabel("Centígrados");
        mensaje_fahrenheit   = new JLabel("32º Fahrenheit");
        
        conversion  = new JButton("Convertir");
        centigrados = new JTextField("0");
        centigrados.setColumns(6);

        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(centigrados);
        getContentPane().add(etiqueta_centigrados);
        getContentPane().add(conversion);
        getContentPane().add(mensaje_fahrenheit);
    }

    private void inicializarEventos(){
        conversion.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        double grados_centigrados;
        grados_centigrados = Double.parseDouble(centigrados.getText());

        double grados_fahrenheit;
        grados_fahrenheit = (grados_centigrados*9)/5 +32;

        mensaje_fahrenheit.setText(grados_fahrenheit+"º Fahrenheit");
    }

    public static void main(String args[]){
        ConvertidorTemperatura ct = new ConvertidorTemperatura();
        ct.setVisible(true);
    }

}
