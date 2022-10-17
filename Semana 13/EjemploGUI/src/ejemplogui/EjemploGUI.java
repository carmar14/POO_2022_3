/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplogui;


import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Acer
 */
public class EjemploGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame ventana = new JFrame();
        ventana.setTitle("Ventana de prueba");
        ventana.setBounds(100,100,300,300);
        
        
        
        JButton boton = new JButton();
        boton.setText("Oprima este boton");
        
        JLabel etiqueta1 =new JLabel();
        JLabel etiqueta2 =new JLabel();
        etiqueta1.setText("Bienvenido a Java Swing!!");
        etiqueta2.setText("La forma de hacer interfaces gráficas en Java");

        
        Container contenedor;
        contenedor = ventana.getContentPane();
        contenedor.add(boton);
        contenedor.add(etiqueta1);
        contenedor.add(etiqueta2);
        
        FlowLayout disposicion =new FlowLayout();
        contenedor.setLayout(disposicion);
        
        ComportamientoBoton cb =new ComportamientoBoton();
        boton.addActionListener(cb);
        ventana.setVisible(true);
        
        
        
        
        
    }
    
}
