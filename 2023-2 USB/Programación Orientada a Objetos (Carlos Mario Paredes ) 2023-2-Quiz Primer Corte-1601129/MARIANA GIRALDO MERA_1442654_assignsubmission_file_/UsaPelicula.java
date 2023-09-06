
package quiz;


public class UsaPelicula {
    
    
    public void gestionarPelicula1(){
        String nombre;
        String director;
        String genero;
        int duracion;
        int año;
        double calificacion;
    
        nombre = IO.obtenerEntrada("Ingrese el nombre de la Pelicula 1: ");
        director = IO.obtenerEntrada("Ingrese el nombre del director de la Pelicula 1: ");
        genero = IO.obtenerEntrada("Ingrese el género de la Pelicula 1: ");
        duracion = IO.obtenerEntero("Ingrese la duración de la Pelicula 1: ");
        año = IO.obtenerEntero("Ingrese el año de la Pelicula 1: ");
        calificacion = IO.obtenerDecimal("ingrese la calificación en decimales de la película 1");

        Pelicula p1 = new Pelicula (nombre, director, genero, duracion, año,  calificacion);
    
        
        
        
    }
    
    
}
