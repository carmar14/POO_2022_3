/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploPolimorfismo;

/**
 *
 * @author Acer
 */
public class Main {
    
    public static void main (String[] args){
        // Upcasting
        Parent p = new Child();
        p.name = "GeeksforGeeks";
        //p.id = 1;
 
        //Printing the parentclass name
        System.out.println("Nombre del padre "+ p.name);
        //parent class method is overriden method hence this will be executed
        p.method();
 
        // Trying to Downcasting Implicitly
        // Child c = new Parent(); - > compile time error
 
        // Downcasting Explicitly
        Child c = (Child)p; 
        c.id = 1;
        //c.name ="Hijo";
        System.out.println("Nombre del hijo "+c.name);
        System.out.println(c.id);
        c.method();
    }
    
}
