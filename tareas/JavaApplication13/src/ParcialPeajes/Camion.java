package Peajes;

public class Camion extends Vehiculo{
    private int Ejes;
    
    public Camion(){
        Costo = 5000;
    }

    public int getEjes() {
        return Ejes;
    }

    public void setEjes(int Ejes) {
        this.Ejes = Ejes;
    }
    
    @Override
    public int Pago(){
        int Pagar;
        int MontoPagar;
        MontoPagar = Ejes * Costo;
        Pagar = MontoPagar * CantidadTipo;
        return Pagar;
    }
    
}
