package Peajes;

public class Moto extends Vehiculo{
    
      
    public Moto(){
        Costo = 5000;
    }
    
    @Override
    public int Pago(){
        int Pagar;
        Pagar = CantidadTipo * Costo; 
        return Pagar;
    }
    
}
