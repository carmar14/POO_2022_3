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
 * Esta clase denominada Terrestre modela un tipo de Vehículo que funciona en el
 * medio terrestre y que implementa la interfaz Motor.
 */
public class Terrestre extends Vehiculo implements Motor {

    /**
     * Constructor de la clase Terrestre
     *
     * @param velocidadActual Parámetro que define la velocidad actual de un
     * vehículo terrestre
     * @param velocidadMáxima Parámetro que define la velocidad máxima permitida
     * para un vehículo terrestre
     */
    public Terrestre(int velocidadActual, int velocidadMáxima) {
// Invoca al constructor de la clase padre
        super(velocidadActual, velocidadMáxima);
    }

    /**
     * Implementación del método abstracto acelerar heredado de Vehículo que
     * permite incrementar la velocidad de un vehículo terrestre
     *
     * @param velocidad Parámetro que define el incremento de la velocidad de un
     * vehículo terrestre
     */
    public void acelerar(int velocidad) {
        int vel = velocidadActual + velocidad;
        if (vel > velocidadMáxima) {
            /* La velocidad actualizada no puede
superar la velocidad máxima */
            System.out.println(
                    "Supera la velocidad máxima permitida");
        } else {
            /* Si no supera la velocidad máxima, se actualiza la
velocidad actual */
            velocidadActual = vel;
        }
    }

    /**
     * Implementación del método abstracto frenar heredado de Vehículo que
     * permite decrementar la velocidad de un vehículo terrestre
     *
     * @param velocidad Parámetro que define el decremento de la velocidad de un
     * vehículo terrestre
     */
    public void frenar(int velocidad) {
        int vel = velocidadActual - velocidad;
        if (vel < 0) { // La velocidad actualizada no puede ser negativa
            System.out.println(
                    "La velocidad no puede ser negativa");
        } else {
            /* Si la velocidad no se vuelve negativa, se actualiza la
velocidad actual */
            velocidadActual = vel;
        }
    }

    /**
     * Implementación del método abstracto calcularRevolucionesMotor heredado de
     * Vehículo que calcula las revoluciones de un motor como la multiplicación
     * de su fuerza por su radio
     *
     * @param fuerza Parámetro que define la fuerza del motor de un vehículo
     * @param radio Parámetro que define el radio del motor de un vehículo
     */
    public int calcularRevolucionesMotor(int fuerza, int radio) {
        return (fuerza * radio);
    }

}
