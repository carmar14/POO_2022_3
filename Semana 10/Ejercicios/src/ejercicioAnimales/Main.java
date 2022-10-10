/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioAnimales;

import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class Main {
    
    public static void main(String[] args){

        Animal[] a = new Animal[3];
        a[0] = new Perro();
        a[1] = new Lobo();
        a[2] = new Leon();
      
        for(int i =0; i<a.length; i++){
                JOptionPane.showMessageDialog(null,a[i].getNombreCientifico()+ "\n"+
                        a[i].getAlimentos()+ "\n"+
                        a[i].getHabitat() + "\n"+
                        a[i].getSonidos());
        }
    }
}
