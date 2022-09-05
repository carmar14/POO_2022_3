/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viviendas;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *
 * @author Acer
 */
public class MenuPrincipal {
    MenuPrincipal(){
    }
    
    
    
    public static void mostrarBienvenida(){
        JOptionPane.showMessageDialog(null, "Bienvenido!\n"
                + "Programa que gestiona información de viviendas (David Quiceno-2215539)");
    }

    public static int menuPrincipal(){
        int o;
        String menu = "Menú de Opciones\n"
                + "1. Gestionar información de la vivienda N° 1\n"
                + "2. Gestionar información de la vivienda N° 2\n"
                + "3. Gestionar información de la vivienda N° 3\n"
                + "4. Salir\n"
                + "Por favor digite la opción que desea:";
        
        o = Integer.parseInt(JOptionPane.showInputDialog(menu));
        return o;
    }

    public static void interactuarConUsuario(){
        int opcion;
        do{
            opcion = menuPrincipal();
            realizarOperacion(opcion);
        }while(opcion!=4);
    }

    public static void realizarOperacion(int opc){
        
        DecimalFormat df = new DecimalFormat("#.00"); //Redondear decimales de las áreas y volumenes
        
        switch(opc){
            case 1:
               gestionarV1();
            break;
            case 2:
               gestionarV2();
            break;
            case 3:
               gestionarV3();
            break;
            case 4:
                JOptionPane.showMessageDialog(null, "El programa terminará");
            break;
            default:
                JOptionPane.showMessageDialog(null,
                        "Ha presionado una opción no válida, por favor inténtelo de nuevo");
        }
    }
    
    
    public static void gestionarV1(){
        Submenu1.submenu();
    }
    
    public static void gestionarV2(){
        Submenu2.submenu();
        
    }
    
    public static void gestionarV3(){
        Submenu3.submenu();
    }
    
    
    public static void mostrarDespedida(){
        JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestro programa!\n"
                + "Hasta Pronto!");
    }
    
   
    
    public static void main (String args[]){
        mostrarBienvenida();
        interactuarConUsuario();
        mostrarDespedida();
    }
}
