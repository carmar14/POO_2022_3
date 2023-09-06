/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject5;

/**
 *
 * @author salas
 */
public class Mavenproject5 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    private static class pelicula {

        private Object genero;
        private double calificacion;

        public pelicula() {
        }

        private String calcularValoracion() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private String esEpica() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void imprimir() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
    public class Pelicula {
    private final String genero;
    private final int duracion;
    private final double calificacion;

    public Pelicula(String nombre, String director, String genero, int duracion, int ano, double calificacion) {
        this.genero = genero;
        this.duracion = duracion;
        this.calificacion = calificacion;
    }

    // Métodos get y set

    public void imprimir() {
        // Imprimir los atributos
    }

    public boolean esEpica() {
        return duracion >= 180; // 3 horas en minutos
    }

    public String calcularValoracion() {
        // Calcular valoración según la tabla
        return (null);
        // Calcular valoración según la tabla
    }

    public boolean mismaValoracionYGenero(pelicula otraPelicula) {
        return genero.equals(otraPelicula.genero) && calificacion == otraPelicula.calificacion;
    }




    }
public class GestorPelicula {
    public static void main(String[] args) {
        Pelicula pelicula1 = new Pelicula("Pelicula1", "Director1", "ACCION", 120, 2023, 7.5);
        pelicula pelicula2 = new Pelicula("Pelicula2", "Director2", "COMEDIA", 150, 2020, 6.8);

        pelicula1.imprimir();
        System.out.println("Es épica: " + pelicula1.esEpica());
        System.out.println("Valoración: " + pelicula1.calcularValoracion());

        System.out.println();

        pelicula2.imprimir();
        System.out.println("Es épica: " + pelicula2.esEpica());
        System.out.println("Valoración: " + pelicula2.calcularValoracion());

        System.out.println();

        if (pelicula1.mismaValoracionYGenero(pelicula2)) {
            System.out.println("Tienen la misma valoración y género.");
        } else {
            System.out.println("No tienen la misma valoración y género.");
        }
    }
}

}
