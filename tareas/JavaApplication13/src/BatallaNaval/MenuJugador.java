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
public class MenuJugador extends Menu {
    private Jugador j1;
    private Jugador j2;
    private MenuJuego mj;
    
    public MenuJugador(){
        
    }
    
    public MenuJugador(String bienvenida, String despedida) {
        super(bienvenida, despedida);
    }

    public Jugador getJ1() {
        return j1;
    }

    public Jugador getJ2() {
        return j2;
    }

    public MenuJuego getMj() {
        return mj;
    }

    
    public void setJ1(Jugador j1) {
        this.j1 = j1;
    }

    public void setJ2(Jugador j2) {
        this.j2 = j2;
    }

    public void setMj(MenuJuego mj) {
        this.mj = mj;
    }
    
    

    public void interactuarConUsuario(int qb, char[][] campodeJuego){
        int opcion;
        String msg = "Menu Jugador \n"
                + "1. Gestionar jugador 1\n"
                + "2. Gestionar jugador 2\n"
                + "3. Realizar Jugada\n"
                + "4. Salir";
        do{
            opcion=mostrarMenuYLeerOpcion(msg);
            ejecutarOperacion(opcion, qb,campodeJuego);
        }while(opcion!=4);
    }
    
    private void ejecutarOperacion(int opc, int qb,char[][] campodeJuego){
        switch(opc){
            case 1:
                gestionarJugador(j1,qb,campodeJuego);//definirCampoJuego();
            break;
            case 2:
                gestionarJugador(j2,qb,campodeJuego);//definirCantBarcos();
            break;
            case 3:
                //gestionarJugador();
            break;
            case 4:
                //mostrarCampodeJuego();
            break;
           
            
        }
    }
    
    private void gestionarJugador(Jugador j, int qb, char[][] campodeJuego){
        String nombre = new String();
        if (j==j1) nombre = ES.readCadena("Digite el nombre del jugador 1");
        else nombre = ES.readCadena("Digite el nombre del jugador 2");
        j = new Jugador(nombre);
        char [][] tipoBarco = new char[qb][];
        int tb;
        for (int i=0; i<tipoBarco.length; i++){
            tb = ES.leerEntero("Digite tipo de barco: 1,2,3,4 o 5 ");
            switch(tb){
            case 1:                
            tipoBarco[i]= new char[2];  
            break;
            case 2:                
            tipoBarco[i]= new char[3];  
            break;
            case 3:                
            tipoBarco[i]= new char[4];  
            break;
            case 4:                
            tipoBarco[i]= new char[6];  
            break;            
            case 5:                
            tipoBarco[i]= new char[10];  
            break;               
            }
            
            
        }
        char[][] barcos = crearBarco(tipoBarco,j);
        mostrarBarcos(barcos);
        definirPosBarco(qb,campodeJuego, barcos);
        setJ1(j1);
        setJ2(j2);
        setMj(mj);       
        
    }
    
    private char[][] crearBarco(char[][] tb, Jugador jug){
        char [][] barco = new char [tb.length][];
        //String campoBarco = new String();
        for (int i=0 ; i< tb.length ; i++){
            barco[i] = new char[tb[i].length];
	for (int j=0 ; j< tb[i].length ; j++){
                
		barco[i][j] = '*';
                //campoBarco += String.valueOf(barco[i][j]) + " ";
            }
            //campoBarco += "\n";
        }
        jug.setBarco(barco);
        //ES.mostrar(campoBarco);
        return barco;
    }
    
    private void mostrarBarcos(char[][] barco){        
        String campoBarco = new String();
        for (int i=0 ; i< barco.length ; i++){
	for (int j=0 ; j< barco[i].length ; j++){
                //ES.mostrar("El barco es: " + barco[i][j]);
                campoBarco += String.valueOf(barco[i][j]) + " ";		
            }
            campoBarco += "\n";            
        }        
        ES.mostrar(campoBarco);
        
    }
    
    private void definirPosBarco(int qb, char[][] campodeJuego, char[][] barcos){         
        mj = new MenuJuego();
        char[][] campo = campodeJuego;
        //ES.mostrar("El tamaño del campo es " + campo.length + " por " + campo[1].length);
        mj.setCampodeJuego(campo);
        //mj.mostrarCampodeJuego();
        int posx;// = campo.length;
        int posy;//= campo[1].length;
        int ori;
        //String campoBarco = new String();
        int ban =0;
        int tb=0;
        int ban2;
        while( ban < qb){
            posx = ES.leerEntero("Digite la posición inicial en x del barco " + (ban+1));
            posy = ES.leerEntero("Digite la posición inicial en y del barco " + (ban+1));
            ori = ES.leerEntero("Digite la orientación del barco " + (ban+1) + " 1: Horizontal, 2: Vertical");
            
            ban2 = 0 ;
            
            while (ban2 < barcos[tb].length){
                if (ori==1){
                    ES.mostrar("Estoy en "+ posx + " " + posy);
                    campo[posx][posy]='*';
                    posy +=1;
                    //tb +=1;
                }
                if (ori==2){
                    ES.mostrar("Estoy en "+ posx + " " + posy);
                    campo[posx][posy]='*';
                    posx +=1;
                    //tb +=1;
                }
                ban2 +=1;
            }
            
            tb += 1;
            ban +=1;
        }       
        //ES.mostrar(campoBarco);
        mj.setCampodeJuego(campo);
        //mj.mostrarCampodeJuego();
        
    }
    
    private void realizarJugada(){
        
    }
    
    public void gestionar(int qb,char[][] campodeJuego){
        interactuarConUsuario(qb, campodeJuego);
    }
    
    
    
    
    
}
