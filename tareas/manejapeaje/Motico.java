package manejapeaje;

public class Motico extends Vehiculos {
      public Motico (){
        costoVH = 5000;
    }
      
    @Override
    public int TotalPagar(){
        int Pagos;
        Pagos = cantidadT * costoVH; 
        return Pagos;
    }

}
  