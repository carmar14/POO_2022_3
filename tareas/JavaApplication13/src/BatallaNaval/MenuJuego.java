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
public class MenuJuego extends Menu {
    private int cantBarcos;
    //private char[] tipoBarcos;
    private char[][] campodeJuego;
    private MenuJugador mj;

    public MenuJuego(){
        this.cantBarcos = getCantBarcos();
        this.campodeJuego = getCampodeJuego();
    }

    public MenuJuego(String bienvenida, String despedida) {
        super(bienvenida, despedida);
        /*this.cantBarcos = cantBarcos;
        this.tipoBarcos = tipoBarcos;
        this.campodeJuego = campodeJuego;
        */
    }
    
    

    public int getCantBarcos() {
        return cantBarcos;
    }
/*
    public char[] getTipoBarcos() {
        return tipoBarcos;
    }
*/

    public MenuJugador getMj() {
        return mj;
    }
    

    public char[][] getCampodeJuego() {
        return campodeJuego;
    }

    public void setCantBarcos(int cantBarcos) {
        this.cantBarcos = cantBarcos;
    }
/*
    public void setTipoBarcos(char[] tipoBarcos) {
        this.tipoBarcos = tipoBarcos;
    }
*/
    public void setCampodeJuego(char[][] campodeJuego) {
        this.campodeJuego = campodeJuego;
    }

    public void setMj(MenuJugador mj) {
        this.mj = mj;
    }
    
    
    
    
    public void interactuarConUsuario(){
        int opcion;
        do{
            opcion=mostrarMenuYLeerOpcion(opcionMenu);
            ejecutarOperacion(opcion);
        }while(opcion!=6);
    }
    
    private void ejecutarOperacion(int opc){
        switch(opc){
            case 1:
                definirCampoJuego();
            break;
            case 2:
                definirCantBarcos();
            break;
            case 3:
                gestionarJugador();
            break;
            case 4:
                mostrarCampodeJuego();
            break;
            case 5:
                mostrarResultado();
            break;
            case 6:
                mostrarDespedida();
            break;
            
        }
    }
    
    private void definirCampoJuego(){
        int fila = ES.leerEntero("Definir cantidad de filas del campo de juego");
        int columna = ES.leerEntero("Definir cantidad de columnas del campo de juego");
        campodeJuego = new char[fila][columna];
        for (int i=0 ; i< campodeJuego.length ; i++){
	for (int j=0 ; j< campodeJuego[i].length ; j++){
		campodeJuego[i][j] = 'o';
            }
        }
        setCampodeJuego(campodeJuego);
    }
    
    private void definirCantBarcos(){
        int qtBarcos = ES.leerEntero("Digite la cantidad de barcos");
        setCantBarcos(qtBarcos);
    }
    
    private void gestionarJugador(){
        mj = new MenuJugador("Bienvenido jugadores", "Volverá al menú principal");
        mj.gestionar(cantBarcos, campodeJuego);
    }
    
    public void mostrarCampodeJuego(){
        String campo = new String();
        mj = new MenuJugador();
        Jugador J1 = mj.getJ1();
        Jugador J2 = mj.getJ2();
        //campodeJuego = mj.getMj();
        for (int i=0 ; i< campodeJuego.length ; i++){
	for (int j=0 ; j< campodeJuego[i].length ; j++){
                campo += String.valueOf(campodeJuego[i][j]) + " ";
		
            }
            campo += "\n";
        }
        ES.mostrar(campo);
    }
    
    private void mostrarResultado(){
    
        ES.mostrar("EL jugador es:");
    }
    
    public void gestionar(){
        mostrarBienvenida();
        String msg = "Menu\n"
                + "1. Definir campo de juego\n"
                + "2. Definir cantidad de barcos\n"
                + "3. Gestionar Jugador\n"
                + "4. Mostrar Campo de Juego de los jugadores\n"
                + "5. Mostrar Resultado\n"
                + "6. Salir";
                       
        setOpcionMenu(msg);
        interactuarConUsuario();
    //int cb = ES.leerEntero("Ingrese la cantidad de barcos")
    
    }
    
}
