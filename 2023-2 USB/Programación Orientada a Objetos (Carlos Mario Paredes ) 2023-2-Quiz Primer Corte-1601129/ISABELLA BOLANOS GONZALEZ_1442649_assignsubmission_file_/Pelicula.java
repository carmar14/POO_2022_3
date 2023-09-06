/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quiz1;

/**
 *
 * @author Isa
 */
public class Pelicula {
    private String nombre;
    private String director;
    private String genero;
    private int duracion;
    private int año;
    private double calificacion;

    public Pelicula(){
        
    }
    
    public void setNombre(String n){
        nombre = n;
    }
    
    public void setDirector(String d){
        director = d;
    }
    
    public void setGenero(String g){
        genero = g ;
    }
    
    public void setDuracion(int u){
        duracion = u;
    }
    
    public void setAño(int a){
        año = a;
    }
    
    public void setCalificacion(double c){
        calificacion = c;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getDirector(){
        return director;
    }
    
    public String getGenero(){
        return genero;
    }
    
    public int getDuracion(){
        return duracion;
    }
    
    public int getAño(){
        return año;
    }
    
    public double getCalificacion(){
        return calificacion;
    }

    
    public String informacionPelicula() {
        return "Pelicula" 
                + "Nombre de la pelicula=" + nombre + "\n" 
                + "Director de la pelicula =" + director  + "\n" 
                + "Genero de la pelicula=" + genero + "\n" 
                + "Duración de la pelicula=" + duracion + "\n" 
                + "Año de realización de la pelicula=" + año + "\n" 
                + "Calificación del usuario=" + calificacion ;
    }
    
    public boolean definirPeliculaEpica(){
        return duracion >= 180;
    }
    
    public String calcularValoracion(){
        if (calificacion >=8 && calificacion <10){
            IO.show("Excelente");
        }else if (calificacion >=7 && calificacion <8){
            IO.show("Buena");
        }else if (calificacion >=5 && calificacion <7){
            IO.show("Regular");
        }else if (calificacion >=2 && calificacion <5){
            IO.show("MALA");
        }else{
           return "Muy mala";
        }
    }
   
    public boolean CompararPelicula(Pelicula peliculaUno){
        return genero.equals(peliculaUno.genero)&& calificacion == peliculaUno.calificacion;
    }
}

