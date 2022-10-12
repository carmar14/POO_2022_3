package manejapeaje;

public class Carrito extends Vehiculos {
    public Carrito(){
    costoVH = 10000;
    }
      
    @Override
    public int TotalPagar(){
        int Pagos;
        Pagos = cantidadT * costoVH; 
        return Pagos;
    }   
}
