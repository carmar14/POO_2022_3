/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploAbstraccion;

/**
 *
 * @author Acer
 */
public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double x, double y, double lado) {
        super(x,y);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado*lado;
    }
    
    
    
    
    
}
