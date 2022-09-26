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
public class Cuadrado extends Figura implements Dibujable, Rotable{
    private double lado;

    public Cuadrado(double x, double y, double lado){
       super(x,y);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado*lado;
    }

    @Override
    public void dibujar() {
        JOptionPane.showMessageDialog(null, "voy a dibujar un cuadrado");
    }
    

    @Override
    public void rotar() {
        JOptionPane.showMessageDialog(null, "voy a rotar  un cuadrado");
    }
    
    
    
    
    
}
