/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertidorTemperatura;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Acer
 */
public class VentanaConvertidor extends JFrame{
    JTextField gradosCelcius;
    JLabel centigrados;
    JButton convertir;
    JLabel fahrenheit;
    GestionConvertidor gc;
    
    public VentanaConvertidor(){
        gc = new GestionConvertidor(this);
    }

    public JTextField getGradosCelcius() {
        return gradosCelcius;
    }

    public void setGradosCelcius(JTextField gradosCelcius) {
        this.gradosCelcius = gradosCelcius;
    }

    public JLabel getCentigrados() {
        return centigrados;
    }

    public void setCentigrados(JLabel centigrados) {
        this.centigrados = centigrados;
    }

    public JButton getConvertir() {
        return convertir;
    }

    public void setConvertir(JButton convertir) {
        this.convertir = convertir;
    }

    public JLabel getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(JLabel fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public GestionConvertidor getGc() {
        return gc;
    }

    public void setGc(GestionConvertidor gc) {
        this.gc = gc;
    }
    
        
    public void inicializarGUI(){
        setTitle("Convertidor de Temperatura");
        setLocation(100,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        gradosCelcius  = new JTextField();
        
        centigrados   = new JLabel("Centígrados");
        convertir = new JButton("Convertir");
        fahrenheit = new JLabel();

        //notaTarea.setColumns(3);       
        

        convertir.addActionListener(gc);
        

        convertir.setActionCommand("convertir");
        //creditos.setActionCommand("creditos");

        Container contenedor;
        contenedor = getContentPane();
        
        contenedor.setLayout(new GridLayout(2,2));

        contenedor.add(gradosCelcius);
        contenedor.add(centigrados);
        contenedor.add(convertir);
        contenedor.add(fahrenheit);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
    
    public void asignarTemperatura(double temp){
        fahrenheit.setText(temp+" Fahrenheit");
    }
    
    
    
}
