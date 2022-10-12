package manejapeaje;

public abstract class Vehiculos {
    protected int costoVH;
    protected int cantidadT;
    protected int cantidadVH;
    
    public Vehiculos(){
        this.costoVH=0;
        this.cantidadT=0;
        this.cantidadVH=0;
}
    public int getcostoVH(){
        return costoVH;
    }
    
    public void setcostoVH(int CV) {
        this.costoVH = CV;
    }
    
    public int getcantidadT() {
        return cantidadT;
    }

    public void setcantidadT(int CT) {
        this.cantidadT = CT;
    }

    public int getcantidadVH() {
        return cantidadVH;
    }

    public void setcantidadVH(int CNV) {
        this.cantidadVH = CNV;
    }

    public abstract int TotalPagar();
}
