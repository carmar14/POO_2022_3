/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial;

/**
 *
 * @author Acer
 */
public class Peaje {
    private String nombre;
    private String dpto;
    private int total_peaje;
    private Vehiculo[] v;

    public Peaje(String nombre, String dpto, int total_peaje){//, Vehiculo[] v) {
        this.nombre = nombre;
        this.dpto = dpto;
        this.total_peaje = total_peaje;
        //this.v = v;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDpto() {
        return dpto;
    }

    public void setDpto(String dpto) {
        this.dpto = dpto;
    }

    public int getTotal_peaje() {
        return total_peaje;
    }

    public void setTotal_peaje(int total_peaje) {
        this.total_peaje = total_peaje;
    }

    public Vehiculo[] getV() {
        return v;
    }

    public void setV(Vehiculo[] v) {
        this.v = v;
    }
    
    public void ingresarVehiculos(){
        String placa;
        int id;
        int peaje;
        int num_eje;
        int cant = ES.leerEntero("Ingrese la cantidad de vehiculos");
        v = new Vehiculo[cant];
        for(int i=0; i < v.length; i++){
            id = ES.leerEntero("Tipo de vehiculo (1:carro, 2:moto, 3: camion): ");
            placa = ES.leerCadena("Ingrese la placa");
            switch(id){
            case 1:                
                v[i]= new Carro(placa);
                v[i].setId(id);
                v[i].setPlaca(placa);
                peaje = 10000;
                v[i].setPeaje(peaje);
            break;
            case 2:
                v[i]= new Moto(placa);
                v[i].setId(id);
                v[i].setPlaca(placa);
                peaje = 5000;
                v[i].setPeaje(peaje);
            break;
            case 3:
                num_eje=ES.leerEntero("Ingrese el numero de ejes");
                v[i]= new Camion(num_eje, placa);
                v[i].setId(id);
                v[i].setPlaca(placa);
                peaje = 5000;
                v[i].setPeaje(peaje*num_eje);
            break;
            }             
            
        }
        setV(v);
    }
    
    public void calcularTotalPeaje(){      
        
        for(int i=0; i < v.length; i++){
            total_peaje+=v[i].getPeaje();
        }
        setTotal_peaje(total_peaje);
    }
    
    public void mostrarInformacion(){
        String msg;
        msg = "El peaje ubicado en el dpto de: "+ getDpto() + "\n"+
              "con nombre " + getNombre() + " pasaron ";
        
        for(int i=0; i < v.length; i++){
            switch(v[i].getId()){
            case 1:                
                msg += "un carro identificado con la placa " + v[i].getPlaca();
            break;
            case 2:
                msg += "una moto identificada con la placa " + v[i].getPlaca();
            break;
            case 3:
                Camion c = (Camion)v[i];
                msg += "un camion identificado con la placa " + v[i].getPlaca() + " con numero de ejes "+ c.getNum_eje();
            break;
            }
            
            msg += ", \n ";
        }
        
        msg += "y se recolectó un total de $ "+ getTotal_peaje();
        ES.mostrar(msg);
    }
    
    public void gestionar(){
        ingresarVehiculos();
        calcularTotalPeaje();
        mostrarInformacion();
    }
}
