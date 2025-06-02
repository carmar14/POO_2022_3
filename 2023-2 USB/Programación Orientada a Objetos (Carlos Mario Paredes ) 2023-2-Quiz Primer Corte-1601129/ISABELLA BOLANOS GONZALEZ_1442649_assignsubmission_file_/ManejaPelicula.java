/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quiz1;

/**
 *
 * @author Isa
 */
public class ManejaPelicula {
    private Pelicula peliculaUno;
    private Pelicula peliculaDos;
    
    public ManejaPelicula(){
        peliculaUno = new Pelicula();
        peliculaDos = new Pelicula();      
    }
    
    private void gestionarPelicula(Pelicula x){
        String nombre;
        nombre = IO.readString("Ingrese el nombre de la pelicula: ");
        x.setNombre(nombre);
        
        String director;
        director = IO.readString("Ingrese el nombre del director: ");
        x.setDirector(director);
        
        String genero;
        genero = IO.readString("Ingrese el genero de la pelicula: ");
        x.setGenero(genero);
        
        int duracion;
        duracion = IO.readInt("Ingrese la duracion de la pelicula en minutos: ");
        x.setDuracion(duracion);
        
        int año;
        año = IO.readInt("Ingrese el año de realizacion de la pelicula: ");
        x.setAño(año);
        
        double calificacion;
        calificacion = IO.readDouble("Ingrese la calificacion que le da a la pelicula: ");
        x.setCalificacion(calificacion);
    }
    
    private void gestionarInformacion(){
        
        peliculaUno.CompararPelicula(peliculaUno);
        peliculaUno.calcularValoracion();
        peliculaUno.definirPeliculaEpica();
        peliculaDos.CompararPelicula(peliculaUno);
        peliculaDos.calcularValoracion();
        peliculaDos.definirPeliculaEpica();
    }
    
    public void gestionar(){
        gestionarInformacion();
    }
        
    }
    
    

