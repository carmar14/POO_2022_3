/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

/**
 *
 * @author Acer
 */
/**
* Esta clase abstracta denominada Vehículo modela un medio de
* locomoción que permite el traslado de un lugar a otro de personas o
* cosas. Cuenta con atributos como velocidad actual y velocidad máxima.
*/
public abstract class Vehiculo {

    protected int velocidadActual;
    /* Atributo que identifica la velocidad actual de
    un vehículo */
    protected int velocidadMáxima;

    /* Atributo que identifica la velocidad máxima
    permitida a un vehículo */

    /**
     * Constructor de la clase Vehículo
     *
     * @param velocidadActual Parámetro que define la velocidad actual de un
     * vehículo
     * @param velocidadMáxima Parámetro que define la velocidad máxima permitida
     * a un vehículo
     */
    public Vehiculo(int velocidadActual, int velocidadMáxima) {
        this.velocidadActual = velocidadActual;
        this.velocidadMáxima = velocidadMáxima;
    }
    
    /* Setters y getters*/
    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public int getVelocidadMáxima() {
        return velocidadMáxima;
    }

    public void setVelocidadMáxima(int velocidadMáxima) {
        this.velocidadMáxima = velocidadMáxima;
    }

    
    /**
     * Método que muestra en pantalla los datos de un vehículo
     */
    public void imprimir() {
        System.out.println("Velocidad actual = " + velocidadActual);
        System.out.println("Velocidad máxima = " + velocidadMáxima);
    }

    /**
     * Método abstracto que permite incrementar la velocidad de un vehículo
     *
     * @param velocidad Parámetro que define el incremento de la velocidad de un
     * vehículo
     */
    public abstract void acelerar(int velocidad);

    /**
     * Método abstracto que permite decrementar la velocidad de un vehículo
     *
     * @param velocidad Parámetro que define el decremento de la velocidad de un
     * vehículo
     */
    public abstract void frenar(int velocidad);

}
