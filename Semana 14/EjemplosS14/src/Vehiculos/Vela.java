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
* Esta interfaz denominada Vela modela una superficie utilizada para
* propulsar una embarcación mediante la acción del viento sobre ella.
* La interfaz será implementada por la clase Acuático
* @version 1.2/2020
*/
public interface Vela {
/**
* Método abstracto que recomienda una determinada velocidad del
* vehículo de acuerdo a la velocidad del viento
* @param velocidadViento Parámetro que define la velocidad del
* viento que influenciará en la velocidad actual del vehículo
*/
public void recomendarVelocidad(int velocidadViento);
}