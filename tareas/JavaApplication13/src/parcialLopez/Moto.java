package ParcialPeajes;

public class Moto extends Vehiculo{
    
    public Moto(){
        Costo = 5000;
    }
    
    @Override
    public int totalPago(){
        int Pagar;
        Pagar = CantidadTipo * Costo; 
        return Pagar;
    }
}
