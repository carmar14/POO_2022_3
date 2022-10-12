package ParcialPeajes;

public class EmpleaPeaje {
    
    private Vehiculo elVehiculo;
    private Carro C;
    private Moto M;
    private Camion Ca;
    private Peaje Pe;
    private int Recaudo;
    String[] Vehiculos;
    String[] Placas;

    public EmpleaPeaje() {
        C = new Carro();
        M = new Moto();
        Ca = new Camion();
        Pe = new Peaje();
    }
    
    private void mostrarBienvenida(){
        IO.show("¡Bienvenido!\n"
                + "Al programa de Peajes");
    }

    private int mostrarMenuYLeerOpcion(){
        int o;
        String menu = "Menú de Opciones:\n"
                + "1. Gestionar peaje\n"
                + "2. Ingresar Cantidad de vehículos\n"
                + "3. Calcular el valor total\n"
                + "4. Mostrar información diligenciada\n"
                + "5. Salir\n"
                + "Por favor digite la opción que desea->:";
        
        o = IO.readInt(menu);
        return o;
    }
    
    private void interactuarConUsuario(){
        int opcion;
        do{
            opcion = mostrarMenuYLeerOpcion();
            realizarOperacion(opcion);
        }while(opcion!=5);
    }
 
    private void realizarOperacion(int opc){
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
                IO.show("Ha ingresado una opción no valida, por favor inténtelo de nuevo");
        }
    }
    
    private void gestionarPeaje(){
        String Nombre = IO.readString("Ingrese el nombre de la organización del peaje->: ");
        Pe.setNombre(Nombre);
        String Departamento = IO.readString("Ingrese el departamento donde se encuentra ubicado el peaje->: ");
        Pe.setDepartamento(Departamento);
        IO.show("Nombre peaje->: " + Pe.getNombre()+"\nUbicación del peaje->: " + Pe.getDepartamento());
    }
    
    private void asignarVehiculos(){
        int CantidadVehiculos = IO.readInt("¿Cuántos vehículos desea ingresar?");
        int TipoVehiculo; 
        Vehiculos = new String[CantidadVehiculos];
        Placas = new String[CantidadVehiculos];
        
        for(int i = 0 ; i < Vehiculos.length ; i++){
            TipoVehiculo = IO.readInt("Digite del 1 al 3 el tipo del vehículo" + (i+1)+": \n"
                                            + "1. Carro\n"
                                            + "2. Moto\n"
                                            + "3. Camión\n");
            
            while (TipoVehiculo != 1 && TipoVehiculo != 2 && TipoVehiculo !=3){
                TipoVehiculo = IO.readInt("Digite del 1 al 3 el tipo del vehículo" + (i+1)+": \n"
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
                int Ejes = IO.readInt("Digite la cantidad de ejes del camión->: ");
                Ca.setEjes(Ejes);
                Vehiculos[i] = "Camión";
                Ca.CantidadTipo += 1;
            }
            Placas[i] = IO.readString("Ingrese el número de la placa de->:" + Vehiculos[i]);
        }
    }
    
    private void calcularRecaudo(){
        Recaudo = C.totalPago()+M.totalPago()+Ca.totalPago();
        IO.show("El total recaudado por el peaje es->: "+Recaudo);
    }
    
    private void mostrarInformacion(){
        String msg = "";
        for(int i = 0 ; i < Vehiculos.length ; i++){
            msg = msg + Vehiculos[i] + " - " + Placas[i] + "\n";
        }
        IO.show("Nombre peaje->: " + Pe.getNombre()+"\nUbicación peaje->: " + Pe.getDepartamento()+"\n"+msg+"\n"+"Total recaudado->: "+Recaudo);
    }
    
    public void gestionar(){
        mostrarBienvenida();
        interactuarConUsuario();
    }
    
}
