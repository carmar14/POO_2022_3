/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class menu {
    
    static void mostrarBienvenida(){
        JOptionPane.showMessageDialog(null, "Bienvenido!\n"
                + "Programa que Gestiona Área y Volumen de diversos sólidos");
    }

    static int mostrarMenuYLeerOpcion(){
        int o;
        String menu = "Menú de Opciones\n"
                + "1. Calcular dimensiones de una Esfera\n"
                + "2. Calcular dimensiones de un Cubo\n"
                + "3. Calcular dimensiones de un Tetraedro Regular\n"
                + "4. Salir\n"
                + "Por favor digite la opción que desea:";
        
        o = Integer.parseInt(JOptionPane.showInputDialog(menu));
        return o;
    }

    static void interactuarConUsuario(){
        int opcion;
        do{
            opcion = mostrarMenuYLeerOpcion();
            realizarOperacion(opcion);
        }while(opcion!=4);
    }

    static void realizarOperacion(int opc){
        switch(opc){
            case 1:
                JOptionPane.showMessageDialog(null, "Caso 1");
            break;
            case 2:
                JOptionPane.showMessageDialog(null, "Caso 2");
            break;
            case 3:
                JOptionPane.showMessageDialog(null, "Caso 3");
            break;
            case 4:
                JOptionPane.showMessageDialog(null, "El programa terminará");
            break;
            default:
                JOptionPane.showMessageDialog(null,
                        "Ha presionado una opción no valida, por favor inténtelo de nuevo");
        }
    }
    
    static void mostrarDespedida(){
        JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestro programa!\n"
                + "Hasta Pronto!");
    }
    
    public static void main (String args[]){
        mostrarBienvenida();
        interactuarConUsuario();
        mostrarDespedida();
    }
}
