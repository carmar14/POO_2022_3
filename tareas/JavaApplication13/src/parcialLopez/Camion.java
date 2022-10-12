package ParcialPeajes;

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
    public int totalPago(){
        int Pagar;
        int CostoEjes;
        CostoEjes = Ejes * Costo;
        Pagar = CostoEjes * CantidadTipo;
        return Pagar;
    }
    
}
