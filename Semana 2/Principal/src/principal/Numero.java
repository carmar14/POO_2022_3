/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author Acer
 */
public class Numero {
    private int num = 0;
    
    public void asignarNumero(int n){
        num = n;
    }
    
    public String isPositivo(){
        String mess = new String();
        if (num>0){
            mess = "positivo";
        }
        else{
            mess = "negativo";
        
        }
  
        return mess;
    }
    
    public String isMultiplo (){
        String mess = new String();
        if (num % 10==0){
            mess = "multiplo de 10";
        }
        else{
            mess = "no es multiplo de 10";
        
        }
  
        return mess;
    
    }
}
