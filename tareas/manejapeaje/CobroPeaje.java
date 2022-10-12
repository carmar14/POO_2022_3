package manejapeaje;

public class CobroPeaje {
    private Vehiculos unVehiculo;
    private Carrito unCarro;
    private Motico unaMoto;
    private Camioncito unCamion;
    private Peaje unPeaje;
    private int Recaudo;
    String[] vehiculos;
    String[] Placas;
    
    public CobroPeaje (){
        unCarro = new Carrito();
        unaMoto = new Motico();
        unCamion = new Camioncito();
        unPeaje = new Peaje();
    }
    private void MostrarlaBienvenida(){
         IO.show("¡Bienvenido!\n"
                + "A nuestro programa de peajes");
    }
    
    
    int mostrarMenuYLeerOpcion(){
        int o;
        String menu = "Menú de Opciones:\n"
                + "1. Gestionar peaje\n"
                + "2. Asignar vehículos\n"
                + "3. Calcular valor total\n"
                + "4. Mostrar información\n"
                + "5. Salir\n"
                + "Por favor digite la opción que desea:";
        
        o = IO.readInt(menu);
        return o;
    }
    
    void interactuarConUsuario(){
        int opcion;
        do{
            opcion = mostrarMenuYLeerOpcion();
            realizarOperacion(opcion);
        }while(opcion!=5);
    }
    void realizarOperacion(int opc){
        switch(opc){
            case 1:
                gestionarPeaje();
            break;
            
            case 2:
                asignarVehiculos();
            break;
            
            case 3:
                calcularRecaudo();
            break;
            
            case 4:
                mostrarInformacion();
            break;
            
            case 5:
            break;
            
            default:
                IO.show("Ha presionado una opción no valida, por favor inténtelo de nuevo");
        }
    }
    
    void gestionarPeaje(){
        String Nombre = IO.readString("Ingrese el nombre del peaje: ");
        unPeaje.setNombrePeaje(Nombre);
        String Departamento = IO.readString("Ingrese el departamento donde se encuentra ubicado: ");
        unPeaje.setDepartamentoPeaje(Departamento);
        IO.show("Nombre peaje: " + unPeaje.getNombrePeaje()+"\nUbicación peaje: " + unPeaje.getDepartamentoPeaje());
    }
    
    void asignarVehiculos(){
        int CantidadVehiculos = IO.readInt("¿Cuántos vehículos desea ingresar?");
        int TipoVehiculo; 
        vehiculos = new String[CantidadVehiculos];
        Placas = new String[CantidadVehiculos];
        
        for(int i = 0 ; i < vehiculos.length ; i++){
            TipoVehiculo = IO.readInt("Digite el tipo del vehículo" + (i+1)+": \n"
                                            + "1. Carro\n"
                                            + "2. Moto\n"
                                            + "3. Camión\n");
            
            while (TipoVehiculo != 1 && TipoVehiculo != 2 && TipoVehiculo !=3){
                TipoVehiculo = IO.readInt("Digite el tipo del vehículo" + (i+1)+": \n"
                                            + "1. Carro\n"
                                            + "2. Moto\n"
                                            + "3. Camión\n");
            }
            if (TipoVehiculo == 1){
                vehiculos[i] = "Carro";
                unCarro.cantidadT += 1;
            }

            if (TipoVehiculo == 2){
                vehiculos[i] = "Moto";
                unaMoto.cantidadT += 1;
            }

            if (TipoVehiculo == 3){
                int Ejes = IO.readInt("Digite la cantidad de ejes del camión: ");
                unCamion.setEjes(Ejes);
                vehiculos[i] = "Camión";
                unCamion.cantidadT += 1;
            }
            Placas[i] = IO.readString("Digite la placa de " + vehiculos[i]);
        }
    }
    
    void calcularRecaudo(){
        Recaudo = unCarro.TotalPagar()+unaMoto.TotalPagar()+unCamion.TotalPagar();
        IO.show("El total recaudado por el peaje es: "+Recaudo);
    }
    
    void mostrarInformacion(){
        String msg = "";
        for(int i = 0 ; i < vehiculos.length ; i++){
            msg = msg + vehiculos[i] + " - " + Placas[i] + "\n";
        }
        IO.show("Nombre peaje: " + unPeaje.getNombrePeaje()+"\nUbicación peaje: " + unPeaje.getDepartamentoPeaje()+"\n"+msg+"\n"+"Total recaudado: "+Recaudo);
    }
    
    void gestionar(){
        MostrarlaBienvenida();
        interactuarConUsuario();
    }

}
