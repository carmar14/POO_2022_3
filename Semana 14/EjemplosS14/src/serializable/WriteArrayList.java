/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializable;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author Acer
 */
public class WriteArrayList {
    public static void main (String [] args)
    {
        ArrayList<Coche> c = new ArrayList<Coche>();
        //--------objetos a agregar al array List de objetos
        Coche c1 = new Coche ("Juan", "Chevrolet", 1999);
        Coche c2 = new Coche ("Luisa", "Hyundai", 2004);
        c.add(c1);  // se adicionan los objetos al ArrayList de objetos
        c.add(c2);
        //--------objetos a agregar al array List de objetos
        try{
            FileOutputStream salArch = new FileOutputStream ("coches_array_list");
            ObjectOutputStream salStream = new ObjectOutputStream (salArch);            
            
            salStream.writeObject (c);
            salStream.close();
            salArch.close();
            
        }catch(Exception e){
            System.out.println("No pueden escribirse en disco los objetos");
	}
    }
}
