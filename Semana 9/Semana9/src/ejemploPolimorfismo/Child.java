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
public class Child extends Parent{
    int id;
 
    // Overriding the parent method
    // to print the signature of the
    // child class
    @Override 
    public void method()
    {
        System.out.println("Method from Child");
    }
}

