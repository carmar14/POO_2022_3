/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2_2025_1;

/**
 *
 * @author Acer
 */
public class Ciclista {
    protected int identificador;
    protected double tiempoAcu;
    protected String nombre;

    public Ciclista() {
        this.identificador = 0;
        this.tiempoAcu = 0.0;
        this.nombre = "";
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public double getTiempoAcu() {
        return tiempoAcu;
    }

    public void setTiempoAcu(double tiempoAcu) {
        this.tiempoAcu = tiempoAcu;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Ciclista{" + "identificadorm=" + identificador + ", tiempoAcu=" + tiempoAcu + ", nombre=" + nombre + '}';
    }
    
    
    
}
