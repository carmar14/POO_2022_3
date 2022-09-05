
package ManejaViviendas;


public class vivienda {
    private String nombrePropietario;
    private boolean callePavimentada;
    private String direccion;
    private int estrato;
    private double areaMtsC;
    private boolean serviciosPublicos;

    public vivienda() {
    }
    public void asignarNombrePropietario(String NP){
        nombrePropietario = NP;
    }
    public void asignarDireccion(String D){
       direccion = D;
    }
    public void asignarAreaMtsC(double AM){
        areaMtsC = AM;
    }
    public void asignarServiciosPublicos(boolean SP){
        serviciosPublicos = SP;
    }
    public void asignarCallePavimentada(boolean CP){
        callePavimentada = CP;
    }
    public void aignarEstrato(int ES){
        estrato = ES;
    }
    public double calcularValorLote(){
        double valorLote=0;
        if (estrato == 1){
        valorLote = areaMtsC * 400000;
        }
        else{
            if (estrato == 2){
         valorLote= areaMtsC(200000+400000);
            }
             else{
            if (estrato == 3){
                    valorLote = areaMtsC(300000+600000);
            }
             else{
            if (estrato == 4){
                valorLote = areaMtsC (450000+900000);
                    }
            else{ 
                if(estrato == 5){
                valorLote = areaMtsC(675000+1350000);
                }
            }
            }
            }
        }
        return valorLote;
    }

    @Override
    public String toString() {
        return "Vivienda: " + "Nombre Propietario: " + nombrePropietario + "\n Calle Pavimentada: " + callePavimentada + "\n Dirección: " + direccion + " Estrato: " + estrato + "\n AreaMtsC: " + areaMtsC + "\n Servicios Publicos: " + serviciosPublicos + "\nValor Total: "+calcularValorLote();
    }

    private double areaMtsC(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
