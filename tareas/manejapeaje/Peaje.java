package manejapeaje;

public class Peaje {
    private String NombrePeaje;
    private String DepartamentoPeaje;
    private int TipoVehiculo;
    
    public String getNombrePeaje(){
        return NombrePeaje;
}
    public void setNombrePeaje(String NP) {
        this.NombrePeaje = NP;
    }
      public String getDepartamentoPeaje(){
        return DepartamentoPeaje;
}
    public void setDepartamentoPeaje(String DP) {
        this.DepartamentoPeaje = DP;
    }
       public int getTipoVehiculo(){
        return TipoVehiculo;
}
    public void setTipoVehiculo(int TV) {
        this.TipoVehiculo = TV;
    }
    @Override
    public String toString() {
        return ("Nombre del peaje:" + NombrePeaje + "\nDepartamento: " + DepartamentoPeaje);
            
    }



}
    

