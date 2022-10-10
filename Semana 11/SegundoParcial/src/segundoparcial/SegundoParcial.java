/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial;

/**
 *
 * @author Acer
 */
public class SegundoParcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = ES.leerCadena("Digite el nombre del peaje ");
        String dpto = ES.leerCadena("Digite el dpto del peaje ");

        Peaje p = new Peaje(nombre,dpto, 0);
        p.gestionar();
    }
    
}
