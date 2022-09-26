/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploMultInterface;

import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class Circulo extends Figura implements Dibujable{
    private double radio;

    public Circulo(double x, double y, double radio) {
      super(x,y);
        this.radio = radio;
    }
    
    
    
    @Override
    public double calcularArea(){
        return Math.PI*radio*radio;
    }

    @Override
    public void dibujar() {
        JOptionPane.showMessageDialog(null, "voy a dibujar un circulo");
    }
    
}
