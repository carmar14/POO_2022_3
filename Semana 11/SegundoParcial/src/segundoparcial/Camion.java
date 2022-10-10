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
public class Camion extends Vehiculo{
    private int num_eje;

    public Camion(int num_eje, String placa) {
        super(placa);
        this.num_eje = num_eje;
    }

    public int getNum_eje() {
        return num_eje;
    }

    public void setNum_eje(int num_eje) {
        this.num_eje = num_eje;
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
