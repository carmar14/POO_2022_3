package numeroaleatorios;
import javax.swing.*;
import java.awt.*;
public class VentanaNumeros extends JFrame{
    private JTextField cantidadNumeros;
    private JTextField numeroBuscado;
    private JLabel salidaNumeros;
    private JButton ordenar;
    private JButton buscar;
    private GestionNumeros gn;

    public VentanaNumeros(){
        gn = new GestionNumeros(this);
    }

    public void inicializarGUI(){
        setTitle("Números Aletorios Ordenados");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int tamano_letra = 20;

        cantidadNumeros = new JTextField();
        numeroBuscado   = new JTextField();
        salidaNumeros   = new JLabel();
        ordenar         = new JButton("Ordenar");
        buscar          = new JButton("Buscar");
        
        salidaNumeros.setFont(new Font("Helvetica",Font.BOLD,tamano_letra));
        cantidadNumeros.setColumns(2);
        numeroBuscado.setColumns(2);
        ordenar.setEnabled(false);
        numeroBuscado.setEnabled(false);
        buscar.setEnabled(false);

        cantidadNumeros.setHorizontalAlignment(JTextField.RIGHT);
        cantidadNumeros.setFont(new Font("Helvetica",Font.BOLD,tamano_letra));
        numeroBuscado.setHorizontalAlignment(JTextField.RIGHT);
        numeroBuscado.setFont(new Font("Helvetica",Font.BOLD,tamano_letra));

        JButton generar = new JButton("Generar");        

        generar.addActionListener(gn);
        ordenar.addActionListener(gn);
        buscar.addActionListener(gn);

        generar.setActionCommand("generar");
        ordenar.setActionCommand("ordenar");
        buscar.setActionCommand("buscar");

        generar.setFont(new Font("Helvetica",Font.BOLD,tamano_letra));
        buscar.setFont(new Font("Helvetica",Font.BOLD,tamano_letra));
        ordenar.setFont(new Font("Helvetica",Font.BOLD,tamano_letra));

        JLabel cantidad_numeros_etiqueta = new JLabel("Cantidad Números:");
        cantidad_numeros_etiqueta.setFont(new Font("Helvetica",Font.BOLD,tamano_letra));

        JLabel buscar_etiqueta = new JLabel("Buscar:");
        buscar_etiqueta.setFont(new Font("Helvetica",Font.BOLD,tamano_letra));

        JPanel panel_superior = new JPanel();
        panel_superior.setLayout(new FlowLayout());
        panel_superior.add(cantidad_numeros_etiqueta);
        panel_superior.add(cantidadNumeros);
        panel_superior.add(generar);
        panel_superior.add(ordenar);
        panel_superior.add(buscar_etiqueta);
        panel_superior.add(numeroBuscado);
        panel_superior.add(buscar);

        JPanel panel_inferior = new JPanel();
        panel_inferior.setLayout(new FlowLayout());
        panel_inferior.add(salidaNumeros);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(panel_superior,BorderLayout.NORTH);
        getContentPane().add(panel_inferior,BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public int obtenerCantidadNumeros(){
        int cn = Integer.parseInt(cantidadNumeros.getText());
        return cn;
    }
    
    public int obtenerNumeroBuscado(){
        int nb = Integer.parseInt(numeroBuscado.getText());
        return nb;
    }

    public void asignarSalidaNumeros(int sn[]){
        String salnum = "";
        for(int num:sn){
            salnum += num +" ";
        }
        salidaNumeros.setText(salnum);
        ordenar.setEnabled(true);
        numeroBuscado.setEnabled(true);
        buscar.setEnabled(true);
        pack();
        setLocationRelativeTo(null);
    }

     public void mostrarResultadoBusqueda(String msg){
         JOptionPane.showMessageDialog(this, msg);
     }
}
