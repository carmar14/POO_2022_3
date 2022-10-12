package Peajes;

public abstract class Vehiculo {
    
    protected int Costo;
    protected int CantidadTipo;
    protected int CantidadVehiculos;

    public Vehiculo() {
        this.Costo = 0;
        this.CantidadTipo = 0;
        this.CantidadVehiculos = 0;
    } 

    public int getCosto() {
        return Costo;
    }

    public void setCosto(int C) {
        this.Costo = C;
    }
    
    public int getCantidadTipo() {
        return CantidadTipo;
    }

    public void setCantidadTipo(int CantidadTipo) {
        this.CantidadTipo = CantidadTipo;
    }

    public int getCantidadVehiculos() {
        return CantidadVehiculos;
    }

    public void setCantidadVehiculos(int CantidadVehiculos) {
        this.CantidadVehiculos = CantidadVehiculos;
    }

    public abstract int Pago();
   
}
