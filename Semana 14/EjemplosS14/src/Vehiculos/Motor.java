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
* Esta interfaz denominada Motor modela un motor que será
* implementado por las clases Terrestre y Acuático
*/
public interface Motor {
    /**
* Método abstracto que permite calcular las revoluciones de un
* motor a partir de la fuerza y radio del motor
* @param fuerza Parámetro que define la fuerza del motor de un
* vehículo
* @param radio Parámetro que define el radio del motor de un
* vehículo
*/
public int calcularRevolucionesMotor(int fuerza, int radio);

}
