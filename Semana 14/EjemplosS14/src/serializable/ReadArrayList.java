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
public class ReadArrayList {
    
    public static void main (String [] args)
    {
        ArrayList<Coche> c = new ArrayList<Coche>();
        
        try{
            FileInputStream entArch = new FileInputStream ("coches_array_list");
            ObjectInputStream entStream = new ObjectInputStream (entArch);
            
            //---------lectura del Arraylist de objetos----
            c = (ArrayList)entStream.readObject();
            
            for(Coche coche: c){
                coche.escribir();
            }
            //---------lectura del Arraylist de objetos----         
            
        }
        catch(Exception e){
            System.out.println("No pueden escribirse en disco los objetos");
	}  
    }
    
}
