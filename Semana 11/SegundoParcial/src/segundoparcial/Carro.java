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
public class Carro extends Vehiculo{
    
    public Carro(String placa) {
        super(placa);
    }
    
    @Override
    public String getPlaca() {
        return placa;
    }
    
    @Override
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    @Override
    public int getPeaje() {
        return peaje;
    }
    
    @Override
    public void setPeaje(int peaje) {
        this.peaje = peaje;
    }
    
    @Override
    public int getId() {
        return id;
    }
    
    @Override
    public void setId(int id) {
        this.id = id;
    }  
    
    
}
