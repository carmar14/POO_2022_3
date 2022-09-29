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
public class Jugador {
    private String nombre;
    private char[][] barco;

    public Jugador(String nombre){//, char[] tipoBarco) {
        this.nombre = nombre;
        //this.tipoBarco = tipoBarco;
    }

    public String getNombre() {
        return nombre;
    }

    public char[][] getBarco() {
        return barco;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setBarco(char[][] barco) {
        this.barco = barco;
    }
    
    
    
}
