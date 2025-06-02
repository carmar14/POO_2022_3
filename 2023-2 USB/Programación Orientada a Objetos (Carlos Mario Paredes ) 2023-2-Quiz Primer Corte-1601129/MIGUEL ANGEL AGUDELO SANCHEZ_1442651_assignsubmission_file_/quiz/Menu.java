package com.mycompany.pelicula;

public class Menu {
    
 //private Vivienda c1;
 //private Vivienda c2;
 //private Vivienda c3;
 //private int opc=0;
 
 Menu(){
   //c1 = new Vivienda();
   // = new Vivienda();
   //c3 = new Vivienda();
 }
 
 public void interactuarConUsuario(){   
    mostrarBienvenida();
    realizarOperacion();
 }

 private void realizarOperacion(){  
        
    int n=0;
    do {
        
        opc = mostrarMenuYLeerOpcion();
        IO.mostrarString(""+opc);
        switch(opc){
            case 1:
                gestionarVivienda();
                break;
            case 2:
                gestionarVivienda();
                break;
            case 3:
                gestionarVivienda();
                break;
            case 4:
                IO.mostrarString("El programa terminado");
                n=1;
                break;
            default:
                IO.mostrarString("Ha presionado una opcion no valida, por favor intentelos de nuevo");                              
        }
    } while (n==0); 
}

 private void mostrarBienvenida(){
     IO.mostrarString("Bienvenido!\n"
     + "Programa para Gestionar,Modificar.Indicar y Mostrar infomación de viviendas");
 }
 
 private int mostrarMenuYLeerOpcion(){
     int o;
     String menu = "Menu de Opciones\n"
             + "1. Gestionar información de Vivienda \n"
             + "2. Gestionar información de Vivienda \n"
             + "3. Gestionar información de Vivienda \n"
             + "4. Salir.\n"
             + "Por favor digite la opción que desea: ";
     
     o = IO.leerEntero(menu);
    
     return o;
 }
 
 private int mostrarSubMenuYLeerOpcion(){
     int o;
     String menu = "Menu de Opciones\n"
             + "1. Modificar el nombre del Propietario. \n"
             + "2. Modificar ña direccion donde se encuantra ubicada \n"
             + "3. Modificar estrato\n"
             + "4. Modificar �?rea en Metros Cuadrados\n"
             + "5. Indicar si la vivienda cuenta con servicios públicos?\n"
             + "6. Indicar si la calle de enfrente está pavimentada?\n"
             + "7. Mostrar Información de la Vivienda \n"
             + "8. Volver al Manú Principal\n"
             + "Por favor digite la opción que desea: ";
     
     o = IO.leerEntero(menu);
     return o;
 }
    
 private void gestionarVivienda(){
    int m=0;
    int g=0;
    do{
        m = mostrarSubMenuYLeerOpcion();
        
        switch(opc){
            case 1:
                switch(m){
                    case 1:
                        String n=IO.leerString("Digite el nombre del propietario");
                        c1.setNombrePropietario(n);
                    break;
                    case 2:
                        String d=IO.leerString("Digite la direccion");
                        c1.setDireccion(d);
                    break;
                    case 3:
                        int e=IO.leerEntero("Digite el estrato");
                        c1.setEstrato(e);
                    break;
                    case 4:
                        double mt=IO.leerDouble("Digite el area en mtrs2");
                        c1.setAreaMetrosCuadrados(mt);
                    break;
                    case 5:
                        int sp=IO.leerEntero("Digite si la vivienda cuenta con servicios publicos\n " + " 1=Si      2=No");
                        c1.setServiciosPublicos(sp);
                    break;
                    case 6:
                        int cp=IO.leerEntero("Digite si la vivienda cuenta con la calle de enfrente pavimentada\n " + " 1=Si      2=No");
                        c1.setCallePavimentada(cp);
                    break;
                    case 7:
                        String Cp="", Sp="";
                        if (c1.getCallePavimentada()==1){
                            Cp="Si";
                        }else {
                            Cp="No";
                        }
                        if (c1.getServiciosPublicos()==1){
                            Sp="Si";
                        }else {
                            Sp="No";
                        }
                        
                        double costo=c1.calcularPrecioVivienda(c1.getEstrato(), c1.getAreaMetrosCuadrados());
                        c1.setCosto(costo);
                        
                        c1.mostrarInformacionVivienda(c1.getNombrePropietario(), c1.getDireccion(), c1.getEstrato(), c1.getAreaMetrosCuadrados(), c1.getCosto(), Sp, Cp);
                        
                    break;
                    default:
                        g=1;
                    break;
                    
                }
            break;
            case 2:
                switch(m){
                    case 1:
                        String n=IO.leerString("Digite el nombre del propietario");
                        c2.setNombrePropietario(n);
                    break;
                    case 2:
                        String d=IO.leerString("Digite la direccion");
                        c2.setDireccion(d);
                    break;
                    case 3:
                        int e=IO.leerEntero("Digite el estrato");
                        c2.setEstrato(e);
                    break;
                    case 4:
                        double mt=IO.leerDouble("Digite el area en mtrs2");
                        c2.setAreaMetrosCuadrados(mt);
                    break;
                    case 5:
                        int sp=IO.leerEntero("Digite si la vivienda cuenta con servicios publicos\n " + " 1=Si      2=No");
                        c2.setServiciosPublicos(sp);
                    break;
                    case 6:
                        int cp=IO.leerEntero("Digite si la vivienda cuenta con la calle de enfrente pavimentada\n " + " 1=Si      2=No");
                        c2.setCallePavimentada(cp);
                    break;
                    case 7:
                        String Cp="", Sp="";
                        if (c2.getCallePavimentada()==1){
                            Cp="Si";
                        }else {
                            Cp="No";
                        }
                        if (c2.getServiciosPublicos()==1){
                            Sp="Si";
                        }else {
                            Sp="No";
                        }
                        
                       double costo=c2.calcularPrecioVivienda(c2.getEstrato(), c2.getAreaMetrosCuadrados());
                       c2.setCosto(costo);
                       
                       c2.mostrarInformacionVivienda(c2.getNombrePropietario(), c2.getDireccion(), c2.getEstrato(), c2.getAreaMetrosCuadrados(), c2.getCosto(), Sp, Cp);
                    break;
                    default:
                        g=1;
                    break;
                    
                }
            break;
            case 3:
                switch(m){
                    case 1:
                        String n=IO.leerString("Digite el nombre del propietario");
                        c3.setNombrePropietario(n);
                    break;
                    case 2:
                        String d=IO.leerString("Digite la direccion");
                        c3.setDireccion(d);
                    break;
                    case 3:
                        int e=IO.leerEntero("Digite el estrato");
                        c3.setEstrato(e);
                    break;
                    case 4:
                        double mt=IO.leerDouble("Digite el area en mtrs2");
                        c3.setAreaMetrosCuadrados(mt);
                    break;
                    case 5:
                        int sp=IO.leerEntero("Digite si la vivienda cuenta con servicios publicos\n " + " 1=Si      2=No");
                        c3.setServiciosPublicos(sp);
                    break;
                    case 6:
                        int cp=IO.leerEntero("Digite si la vivienda cuenta con la calle de enfrente pavimentada\n " + " 1=Si      2=No");
                        c3.setCallePavimentada(cp);
                    break;
                    case 7:
                        String Cp="", Sp="";
                        if (c3.getCallePavimentada()==1){
                            Cp="Si";
                        }else {
                            Cp="No";
                        }
                        if (c3.getServiciosPublicos()==1){
                            Sp="Si";
                        }else {
                            Sp="No";
                        }
                        
                        double costo=c3.calcularPrecioVivienda(c3.getEstrato(), c3.getAreaMetrosCuadrados());
                        c3.setCosto(costo);
                        
                        c3.mostrarInformacionVivienda(c3.getNombrePropietario(), c3.getDireccion(), c3.getEstrato(), c3.getAreaMetrosCuadrados(), c3.getCosto(), Sp, Cp);
                    break;
                    default:
                        g=1;
                    break;
                    
                }
            break;
                                        
        }
    }while(g==0);
    
    }
   
}