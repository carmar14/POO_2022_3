/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peajes;

/**
 *
 * @author katherin.duque
 */
public class Carro extends TipoDeVehiculo {
    public Carro();
    Costo = 10000;
    
}
public int TotalaPagar(){
int Pago;
Pago = CantidadTi * Costo;
return Pago;
}
