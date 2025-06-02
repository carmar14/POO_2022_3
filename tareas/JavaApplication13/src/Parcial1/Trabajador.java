/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parciall;

/**
 *
 * @author MyNotebook
 */
public class Trabajador {
    private String nombre;
    private int horasTrabajadas;
    private double valorHoras;

    public Trabajador(String nombre, int horasTrabajadas, double valorHoras) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHoras = valorHoras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHoras() {
        return valorHoras;
    }

    public void setValorHoras(double valorHoras) {
        this.valorHoras = valorHoras;
    }

    @Override
    public String toString() {
        return "El nombre del trabajador es: "+nombre+" \nHoras trab: "+horasTrabajadas+"\nValor Horas"+valorHoras;
    }
    
    public double calcularSalario (){
        return horasTrabajadas * valorHoras;
    }
}
