package ParcialPeajes;

public class Carro extends Vehiculo{
    
    public Carro(){
        Costo = 10000;
    }
    
    @Override
    public int totalPago(){
        int Pagar;
        Pagar = CantidadTipo * Costo; 
        return Pagar;
    }
    
}
