/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploInterface;


/**
 *
 * @author Acer
 */
public class Circulo implements Figura{
    private double radio;

    public Circulo(double radio) {
      
        this.radio = radio;
    }
    
    
    
    @Override
    public double calcularArea(){
        return Math.PI*radio*radio;
    }
    
}
