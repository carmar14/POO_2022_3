package guiFvectores;
import javax.swing.*;
import java.awt.*;
public class FormularioVectores extends JFrame{
    private JTextField[] vector1;
    private JTextField[] vector2;
    private JLabel[] vectorsuma;
    private JLabel producto;
    private GestionVector gv;

    public FormularioVectores(){
        gv = new GestionVector(this);
    }

    public void gestionar(){
        leerTamanoVector();
        inicializarGUI();
    }

    private void leerTamanoVector(){
        int tam    = ES.leerEntero("Por favor digite el tamaño del vector a gestionar");
        vector1    = new JTextField[tam];
        vector2    = new JTextField[tam];
        vectorsuma = new JLabel[tam];
    }

    private void inicializarGUI(){
        setTitle("Operaciones con Vectores");

        for(int i=0;i<vector1.length;i++){
            vector1[i]    = new JTextField();
            vector2[i]    = new JTextField();
            vectorsuma[i] = new JLabel("");
        }
        producto = new JLabel();

        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        JPanel vectores = new JPanel();
        c.add(vectores,BorderLayout.CENTER);
        vectores.setLayout(new GridLayout(3,vector1.length+1));

        for(int i=0;i<vector1.length;i++){
            vectores.add(vector1[i]);
        }
        
        JButton boton_suma = new JButton("S");
        boton_suma.setActionCommand("sumar");
        boton_suma.addActionListener(gv);
        vectores.add(boton_suma);

        for(int i=0;i<vector2.length;i++){
            vectores.add(vector2[i]);
        }

        JButton boton_producto = new JButton("P");
        boton_producto.setActionCommand("multiplicar");
        boton_producto.addActionListener(gv);
        vectores.add(boton_producto);

        for(int i=0;i<vectorsuma.length;i++){
            vectores.add(vectorsuma[i]);
        }

        vectores.add(producto);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(200, 200);
        setVisible(true);
        pack();
    }

    public double[] obtenerVector1(){
        double[] vector_numeros = new double[vector1.length];
        for(int i=0;i<vector1.length;i++){
            vector_numeros[i] = Double.parseDouble(vector1[i].getText());
        }
        return vector_numeros;
    }

    public double[] obtenerVector2(){
        double[] vector_numeros = new double[vector2.length];
        for(int i=0;i<vector2.length;i++){
            vector_numeros[i] = Double.parseDouble(vector2[i].getText());
        }
        return vector_numeros;
    }

    public void asignarVectorSuma(double[] suma){
        for(int i=0;i<vectorsuma.length;i++){
            vectorsuma[i].setText(suma[i]+"");
        }
    }

    public void asignarProducto(double p){
        producto.setText(p+"");
    }
}
