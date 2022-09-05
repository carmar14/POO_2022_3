
package ManejaViviendas;

import javax.swing.JOptionPane;

public class ManejaViviendas {
    private vivienda vivienda1; 
    private vivienda vivienda2; 
    private vivienda vivienda3; 
    
    public ManejaViviendas(){
        
        vivienda1 = new vivienda();
        vivienda2 = new vivienda();
        vivienda3 = new vivienda();
        }
    
    private void mostrarBienvenida(){
        IO.show("Bienvenido!\n"
                + "Nuestro programa está creado para gestionar tres diferentes viviendas");
    }

    private int mostrarMenuYLeerOpcion(){
        int o;
        String menu = "Menú de Opciones\n"
                + "1. Gestionar vivienda 1\n"
                + "2. Gestionar vivienda 2\n"
                + "3. Gestionar vivienda 3\n"
                + "4. Salir\n"
                + "Por favor digite la opción que desea:";
        
        o = IO.readInt(menu);
        return o;
    }

    private void interactuarConUsuario(){
        int opcion;
        do{
            opcion = mostrarMenuYLeerOpcion();
            realizarOperacion(opcion);
        }while(opcion!=4);
    }
    private void realizarOperacion(int opc){
        switch(opc){
            case 1:
                interactuarConUsuario2(vivienda1);
            break;
            case 2:
                interactuarConUsuario2(vivienda2);            
            break;
            case 3:
                interactuarConUsuario2(vivienda3);
                
            break;
            case 4:
                IO.show("El programa terminará");
            break;
            default:
                IO.show("Ha presionado una opción no valida, por favor inténtelo de nuevo");
            
                
        }
    }

    private void interactuarConUsuario2(vivienda vivienda){
        int opcion;
        do{
            opcion = mostrarSubMenuYLeerOpcion(vivienda);
        }while(opcion!=4);
    }
    
    private int mostrarSubMenuYLeerOpcion(vivienda vivienda){
        int o;
        String menu = "SubMenú de Opciones\n"
                +"1. Modificar el Nombre del Propietario\n"
                +"2. Modificar la Dirección donde se encuentra ubicada\n"
                +"3. Modificar el Estrato\n"
                +"4. Modificar Área en Mts Cuadrados\n"
                +"5. Indicar si la vivienda cuenta con servicios públicos?\n"
                +"6. Indicar si la calle de enfrente está pavimentada?\n"
                +"7. Mostrar Información de la Vivienda\n"
                +"8. Volver al Menú Principal \n"
                + "Por favor digite la opción que desea:";

        o = Integer.parseInt(JOptionPane.showInputDialog(menu));

        realizarOperacionMenu2(o, vivienda);
        return o;
    }
    
    private void realizarOperacionMenu2(int opc, vivienda vivienda){
        switch(opc){
            case 1:
                modNombreP(vivienda);
            break;
            case 2:
                modDireccion(vivienda);
            break;
            case 3:
                modEstrato(vivienda);
            break;
            case 4:
                modArea(vivienda);
            break;
            case 5:
                indicarServicios(vivienda);
            break;
            case 6:
                indicarCallePavimentada(vivienda);
            break;
            case 7:
                mostrarReporte(vivienda);
            break;
            case 8:
                interactuarConUsuario();
            break;
            default:
                JOptionPane.showMessageDialog(null,
                        "Ha presionado una opción no valida, por favor intÃ©ntelo de nuevo");
        }
    }
    
    public void modNombreP(vivienda vivienda){
        String nombrePropietario;
        nombrePropietario = JOptionPane.showInputDialog("Ingrese el nombre del propietario:\n");
        vivienda.asignarNombrePropietario(nombrePropietario);
    }
    public void modDireccion(vivienda vivienda){
        String direccion;
        direccion = JOptionPane.showInputDialog("Ingrese la direccion:\n");
        vivienda.asignarDireccion(direccion);
    }
    public void modEstrato(vivienda vivienda){
       int estrato;
       estrato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el estrato del 1 al 5:\n"));
       vivienda.aignarEstrato(estrato);
    }
    public void modArea(vivienda vivienda){
       double area;
       area = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el area:\n"));
       vivienda.asignarAreaMtsC(area);
    }
    public void indicarServicios(vivienda vivienda){
       int validarCalle;
       boolean serviciosPublicos= false;
       validarCalle = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 para si 2 para no:\n"));

       if(validarCalle == 1){
            serviciosPublicos = true;
        }else{serviciosPublicos = false;} 

       vivienda.asignarServiciosPublicos(serviciosPublicos);
    }
    public void indicarCallePavimentada(vivienda vivienda){
       int validarServicios;
       boolean callePavimentada= false;
       validarServicios = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 para si 2 para no:\n"));

       if(validarServicios == 1){
            callePavimentada = true;
        }else{callePavimentada = false;} 

       vivienda.asignarCallePavimentada(callePavimentada);
    }
    public void mostrarReporte(vivienda vivienda){
        JOptionPane.showMessageDialog(null, vivienda.toString());
    }


    private void mostrarDespedida(){
        IO.show("Gracias por utilizar nuestro programa!\nHasta Pronto!");
    }

    public void gestionar(){
        mostrarBienvenida();
        interactuarConUsuario();
        mostrarDespedida();
    }
}

    

    

