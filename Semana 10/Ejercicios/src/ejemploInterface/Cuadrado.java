/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploInterface;

import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class Cuadrado implements Figura {
    private double lado;

    public Cuadrado(double lado) {
       
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado*lado;
    }
    
     
    
    
}
