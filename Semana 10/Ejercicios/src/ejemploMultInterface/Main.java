/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploMultInterface;


import javax.swing.JOptionPane;
import ejemploInterface.ClaseExtra;
/**
 *
 * @author Acer
 */
public class Main {
    public static void main(String[] args){
        Figura cir = new Circulo(1.0,1.0,3.0);
        Figura cuad = new Cuadrado(1.0,1.0,2.5);
        
        Circulo c = (Circulo)cir;   
        Cuadrado cua = (Cuadrado)cuad;
        
        
        JOptionPane.showMessageDialog(null,"El area del circulo es : " + Math.round(c.calcularArea()*100.0)/100.0+ " y el area del cuadrado es: "+ 
                Math.round(cua.calcularArea()*100.0)/100.0);
        
        JOptionPane.showMessageDialog(null," "+ cir.calcularArea());
        c.dibujar();
        cua.dibujar();
        
        ClaseExtra ce = new ClaseExtra();
        ce.mensaje();
        
        
    }
}
