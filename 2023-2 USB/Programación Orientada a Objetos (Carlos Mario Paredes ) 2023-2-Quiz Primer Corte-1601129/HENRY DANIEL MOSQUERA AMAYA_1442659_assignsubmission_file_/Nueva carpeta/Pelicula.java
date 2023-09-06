/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peliculas;

/**
 *
 * @author salas
 */
public class Pelicula {
     private String nombre;
    private String director;
    private String genero;
    private int duracion;
    private int año;
    private double calificacion;

    public Pelicula() {
      
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String no) {
        this.nombre = no;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String di) {
        this.director = di;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String ge) {
        this.genero = ge;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int du) {
        this.duracion = du;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int a) {
        this.año = a;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double cal) {
        this.calificacion = cal;
    }

    
    public String InformacionDeLaPelicula() {
        return "Pelicula{" + "nombre=" + nombre +"\n" +
                "director=" + director +"\n" + 
                "genero=" + genero +"\n" +
                "duracion=" + duracion +"\n" +
                " a\u00f1o=" + año +"\n" +
                " calificacion=" + calificacion + "";
    }

  
    
    public String calcularValoracion(int calificacion) {
        if (calificacion >= 8 && calificacion<10) {
            return "Excelente";
        } else if (calificacion >= 7&& calificacion<8) {
            return "Buena";
        } else if (calificacion >= 5&& calificacion<7) {
            return "Regular";
        }else if (calificacion >= 2&& calificacion<5) {
            return "Mala";
        }
        else {
            return "Muy Mala";
        }
    }
    public boolean compararPeliculas(Pelicula peliculaDos) {
        return genero.equals(peliculaDos.genero) && calificacion == peliculaDos.calificacion;
    }
    /*
    public static void main(String[] args) {
        // Ejemplo de uso
        Pelicula pelicula1 = new Pelicula("Titanic", "James Cameron", "DRAMA", 195, 1997, 8.5);
        Pelicula pelicula2 = new Pelicula("Matrix", "Lana Wachowski", "ACCION", 136, 1999, 9.2);

        pelicula1.imprimir();
        System.out.println("¿Es épica? " + pelicula1.esEpica());
        System.out.println("Valoración: " + pelicula1.calcularValoracion());

        System.out.println();

        pelicula2.//imprimir();
        System.out.println("¿Es épica? " + pelicula2.esEpica());
        System.out.println("Valoración: " + pelicula2.calcularValoracion());

        System.out.println();

        System.out.println("¿Misma valoración y género? " + pelicula1.compararPeliculas(pelicula2));
    }
}*/
}
