package manejapeaje;

public class Camioncito extends Vehiculos {
    private int Ejes;
    
    public Camioncito(){
        costoVH = 5000;
    }
    
    public int getEjes() {
        return Ejes;
    }

    public void setEjes(int Ejes) {
        this.Ejes = Ejes;
    }
    
    @Override
    public int TotalPagar(){
        int Pagos;
        int CostoEjes;
        CostoEjes = Ejes * costoVH;
        Pagos = CostoEjes * cantidadT ; 
        return Pagos;
    }   
    
}
