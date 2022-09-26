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
public class Circulo extends Figura{
    private double radio;

    public Circulo(double x, double y, double radio) {
        super(x,y);
        this.radio = radio;
    }
    
    
    
    @Override
    public double calcularArea(){
        return Math.PI*radio*radio;
    }
    
}
