package Peajes;

public class MPeaje {
    
    private Vehiculo V;
    private Carro C;
    private Moto M;
    private Camion CA;
    private Peaje P;
    private int Recaudado;
    String[] Vehiculos;
    String[] Placas;

    public MPeaje() {
        C = new Carro();
        M = new Moto();
        CA = new Camion();
        P = new Peaje();
    }
    
   

   private int mostrarMenuYLeerOpcion(){
        int o;
        String menu = "Gestion Peaje:\n"
                + "1. Peaje\n"
                + "2. Vehículos\n"
                + "3. Calcular valor total\n"
                + "4. Mostrar información recaudada\n"
                + "5. Salir\n"
                + "Por favor digite la opción que desea:";
        
        o = ES.readInt(menu);
        return o;
    }
    
    private void interactuarConUsuario(){
        int opcion;
        do{
            opcion = mostrarMenuYLeerOpcion();
            realizarOperacion(opcion);
        }while(opcion!=5);
    }

      private  void realizarOperacion(int opc){
        switch(opc){
            case 1:
                gestionarPeaje();
            break;
            
            case 2:
                Vehiculos();
            break;
            
            case 3:
                calcularRecaudado();
            break;
            
            case 4:
                InformacionPeaje();
            break;
            
            case 5:
            break;
            
            default:
                ES.show("Ha presionado una opción no valida, por favor inténtelo de nuevo");
        }
    }
    
    private void gestionarPeaje(){
        String Nombre = ES.readString("Ingrese el nombre del peaje: ");
        P.setNombre(Nombre);
        String Departamento = ES.readString("Departamento del Peaje: ");
        P.setDepartamento(Departamento);
        ES.show("Nombre del peaje: " + P.getNombre()+"\nDepartamento del peaje: " + P.getDepartamento());
    }
    
   private void Vehiculos(){
        int CantidadVehiculos = ES.readInt("¿Cuántos vehículos ingresara?");
        int TipoVehiculo; 
        Vehiculos = new String[CantidadVehiculos];
        Placas = new String[CantidadVehiculos];
        
        for(int i = 0 ; i < Vehiculos.length ; i++){
            TipoVehiculo = ES.readInt("Digite el tipo del vehículo" + (i+1)+": \n"
                                            + "1. Carro\n"
                                            + "2. Moto\n"
                                            + "3. Camión\n");
            
            while (TipoVehiculo != 1 && TipoVehiculo != 2 && TipoVehiculo !=3){
                TipoVehiculo = ES.readInt("Digite el tipo del vehículo" + (i+1)+": \n"
                                            + "1. Carro\n"
                                            + "2. Moto\n"
                                            + "3. Camión\n");
            }
            if (TipoVehiculo == 1){
                Vehiculos[i] = "Carro";
                C.CantidadTipo += 1;
            }

            if (TipoVehiculo == 2){
                Vehiculos[i] = "Moto";
                M.CantidadTipo += 1;
            }

            if (TipoVehiculo == 3){
                int Ejes = ES.readInt("Digite la cantidad de ejes del camión: ");
                CA.setEjes(Ejes);
                Vehiculos[i] = "Camión";
                CA.CantidadTipo += 1;
            }
            Placas[i] = ES.readString("Digite la placa de " + Vehiculos[i]);
        }
    }
    
   private void calcularRecaudado(){
        Recaudado = C.Pago()+M.Pago()+CA.Pago();
        ES.show("El total recaudado por el peaje es: "+Recaudado);
    }
    
    private void InformacionPeaje(){
        String msg = "";
        for(int i = 0 ; i < Vehiculos.length ; i++){
            msg = msg + "Vehiculo: "+Vehiculos[i] + ", #Placa: " + Placas[i] + "\n";
        }
        ES.show("Nombre peaje: " + P.getNombre()+"\nUbicación peaje: " + P.getDepartamento()+"\n"+msg+"\n"+"Total recaudado: "+Recaudado);
    }
    
   public void gestionar(){
        
        interactuarConUsuario();
    }
    
}
