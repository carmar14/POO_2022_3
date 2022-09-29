/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BatallaNaval;

/**
 *
 * @author Acer
 */
public class Menu {
    protected String bienvenida;
    protected String opcionMenu;
    protected String despedida;
    
    public Menu(){
        this.bienvenida = getBienvenida();
        //this.opcionMenu = opcionMenu;
        this.despedida = getDespedida();
    }

    public Menu(String bienvenida, String despedida) {
        this.bienvenida = bienvenida;
        //this.opcionMenu = opcionMenu;
        this.despedida = despedida;
        
    }

    public String getBienvenida() {
        return bienvenida;
    }

    public String getOpcionMenu() {
        return opcionMenu;
    }

    public String getDespedida() {
        return despedida;
    }

    public void setBienvenida(String bienvenida) {
        this.bienvenida = bienvenida;
    }

    public void setOpcionMenu(String opcionMenu) {
        this.opcionMenu = opcionMenu;
    }

    public void setDespedida(String despedida) {
        this.despedida = despedida;
    }
    
    /*
    public void interactuarConUsuario(){
        int opcion;
        do{
            opcion = mostrarMenuYLeerOpcion(opcionMenu);
            ejecutarOperacion(opcion);
        }while(opcion!=3);
    }
    */

    protected int mostrarMenuYLeerOpcion(String msg){
        int opcion;
        /*
        String msg = "Menu\n"
                + "1. Calcular Área y Perimétro de Cuadrado\n"
                + "2. Calcular Área y Perímetro de Rectángulo\n"
                + "3. Salir";
        */
        opcion = ES.leerEntero(msg);
        return opcion;
    }
    
    protected void mostrarDespedida(){
        ES.mostrar(despedida);
    }
    
    protected void mostrarBienvenida(){
        ES.mostrar(bienvenida);
    }
    /*
    private void ejecutarOperacion(int opc){
        switch(opc){
            case 1:
                gestionarCuadrado();
            break;
            case 2:
                gestionarRectangulo();
            break;
        }
    }
*/
    
    
}
