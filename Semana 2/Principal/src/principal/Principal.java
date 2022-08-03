/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //-------se crea el objeto de la clase Numero
        Numero n;
        String pos= new String();
        String mul= new String();
        // -------instanciar la clase con el objeto n
        n = new Numero();
        int num = 0;
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero entero: "));
        
        //----invocar metodos de la clase Numero atraves del objeto n----
        n.asignarNumero(num);
        pos = n.isPositivo();
        mul = n.isMultiplo();
        
        //-------------mostrar informacion------------
        JOptionPane.showMessageDialog(null, "El numero "+num+" es "+ pos + " y " + mul);
        
    
        
    }
    
}
