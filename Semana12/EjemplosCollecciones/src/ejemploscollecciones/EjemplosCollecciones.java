/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploscollecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class EjemplosCollecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //-------arreglo unidimiensional--------
        String[] paises ={"Colombia","Venezuela", "España", "Brasil","Alemania"};
        
    //--------Uso de ArrayList--------
        List <String> a_paises = new ArrayList<>(); //upcasting
        for (String p: paises)
            a_paises.add(p);
        //Collections.shuffle(a_paises);
        JOptionPane.showMessageDialog(null, "Con array list: "+ a_paises);
        
    //---------Uso de LinkedList-------
        List <String> ll_paises = new LinkedList<>(); //upcasting
        for (String p: paises)
            ll_paises.add(p);
        //Collections.shuffle(ll_paises);
        JOptionPane.showMessageDialog(null, "Con linked list: "+ ll_paises);
        
        //------obteniendo valores-----
        String mensaje = "";
        int i =0;
        for (String cadena: a_paises){
            mensaje += " "+ll_paises.get(i);
            i+=1;
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
}
