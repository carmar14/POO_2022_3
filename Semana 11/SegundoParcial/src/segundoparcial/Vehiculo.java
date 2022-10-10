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
public abstract class Vehiculo {
    protected String placa;
    protected int peaje;
    protected int id;

    public Vehiculo(String placa) {
        this.placa = placa;
    }

    public abstract String getPlaca();
    public abstract void setPlaca(String placa);
    
    public abstract int getPeaje();
    public abstract void setPeaje(int peaje);
    
    public abstract int getId();
    public abstract void setId(int id);
    
    
    
}
