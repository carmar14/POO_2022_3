package Peajes;

public class Carro extends Vehiculo{
    
    public Carro(){
        Costo = 10000;
    }
    
    @Override
    public int Pago(){
        int Pagar;
        Pagar = CantidadTipo * Costo; 
        return Pagar;
    }
    
}
