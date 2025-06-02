/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pelis;

/**
 *
 * @author dylan
 */
public class Pelicula {
    
   private String nombrePelicula; 
    private String directorPelicula;
    private String generoPelicula;
    private int duracionPelicula;
    private int añoPelicula;
    private double calificacionPelicula;
    public String compararPeliculas;

public Pelicula(){
    
    
    
    
}

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public String getDirectorPelicula() {
        return directorPelicula;
    }

    public void setDirectorPelicula(String directorPelicula) {
        this.directorPelicula = directorPelicula;
    }

    public String getGeneroPelicula() {
        return generoPelicula;
    }

    public void setGeneroPelicula(String generoPelicula) {
        this.generoPelicula = generoPelicula;
    }

    public int getDuracionPelicula() {
        return duracionPelicula;
    }

    public void setDuracionPelicula(int duracionPelicula) {
        
        if (this.duracionPelicula >= 10800){
            
        this.duracionPelicula = duracionPelicula;
        IO.show("Es una película Épica");
        } 
        else
        
        this.duracionPelicula = duracionPelicula;
    }
    

    public int getAñoPelicula() {
        return añoPelicula;
    }

    public void setAñoPelicula(int añoPelicula) {
        this.añoPelicula = añoPelicula;
    }

    public double getCalificacionPelicula() {
        return calificacionPelicula;
    }

    public void setCalificacionPelicula(double calificacionPelicula) {
        
        if (this.calificacionPelicula <=2){
            
            IO.show("La pelicula es muy mala");
            this.calificacionPelicula = calificacionPelicula;
        }
        if (this.calificacionPelicula <= 5){
            
            IO.show("La pelicula es mala");
            this.calificacionPelicula = calificacionPelicula;
        }
        if (this.calificacionPelicula <=7){
            
            IO.show("La pelicula es muy regular");
            this.calificacionPelicula = calificacionPelicula;
        }
        
        if (this.calificacionPelicula <=8){
            
            IO.show("La pelicula es buena");
            this.calificacionPelicula = calificacionPelicula;
        }
        if (this.calificacionPelicula >=8){
            
            IO.show("La pelicula excelente");
            this.calificacionPelicula = calificacionPelicula;
        }
        
        
        this.calificacionPelicula = calificacionPelicula;
    }
    

    public String getCompararPeliculas() {
        return compararPeliculas;
    }

    public void setCompararPeliculas(String compararPeliculas) {
        this.compararPeliculas = compararPeliculas;
    }
    
    

    public String informacionDeLaPelicula() {
        return "Pelicula" +"\n"+ 
                "Nombre de la pelicula: " + nombrePelicula + "\n" + 
                "Director de la pelicula: " + directorPelicula + "\n" + 
                "Genero de la pelicula: " + generoPelicula + "\n "
                + "Duracion de la pelicula. " + duracionPelicula + "\n" +
                "Año de la pelicula: " + añoPelicula + "\n" + 
                "Calificacion de la pelicula: " + calificacionPelicula;
        
        
    }

  
}
