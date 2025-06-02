/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject6;

/**
 *
 * @author salas
 */
public class Mavenproject6 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    public class Pelicula {
    private String nombre;
    private String director;
    private String genero;
    private int duracion;
    private int ano;
    private double calificacion;

    public Pelicula(String nombre, String director, String genero, int duracion, int ano, double calificacion) {
        this.nombre = nombre;
        this.director = director;
        this.genero = genero;
        this.duracion = duracion;
        this.ano = ano;
        this.calificacion = calificacion;
    }

    // Métodos get y set para cada atributo
    // ...

    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Director: " + director);
        System.out.println("Género: " + genero);
        System.out.println("Duración: " + duracion + " minutos");
        System.out.println("Año: " + ano);
        System.out.println("Calificación: " + calificacion);
    }

    public boolean esEpica() {
        return duracion >= 180; // 3 horas en minutos
    }

    public String calcularValoracion() {
        if (calificacion <= 2.0) {
            return "Muy mala";
        } else if (calificacion <= 5.0) {
            return "Mala";
        } else if (calificacion <= 7.0) {
            return "Regular";
        } else if (calificacion <= 8.0) {
            return "Buena";
        } else {
            return "Excelente";
        }
    }

    public boolean mismaValoracionYGenero(Pelicula otraPelicula) {
        return genero.equals(otraPelicula.genero) && calificacion == otraPelicula.calificacion;
    }
}
public class GestorPelicula {
    public static void main(String[] args) {
        Pelicula pelicula1 = new Pelicula("Pelicula1", "Director1", "ACCION", 120, 2023, 7.5);
        Pelicula pelicula2 = new Pelicula("Pelicula2", "Director2", "COMEDIA", 150, 2020, 6.8);

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
}
