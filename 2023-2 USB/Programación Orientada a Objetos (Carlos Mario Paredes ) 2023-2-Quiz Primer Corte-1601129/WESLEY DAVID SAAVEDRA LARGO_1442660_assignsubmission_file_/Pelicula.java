/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Parcial;

/**
 *
 * @author salasa
 */
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

    Pelicula() {
    
    }
   public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getCalificacion() {
        return calificacion;
    } 
    
    
    public void mostrar(){
        IO.show("Nombre: "+nombre+"\n"
        +"Director: "+director+"\n"
        +"Genero: "+genero+"\n"
        +"Duracion: "+duracion+"\n"
        +"Año: "+ano+"\n"
        +"Calificacion: "+calificacion);
    }
    
    public boolean peliEpica(){
        
    return duracion >= 180; 
    
    }
    
    public String calcularValoracion() {
       if (calificacion >= 8.0){
       return "Excelente";            
       }
       else if (calificacion >= 7.0){
       return "Buena";     
       }
        else if (calificacion >= 5.0){
       return "Regular";     
       }
       else if (calificacion >= 3.0){
       return "Mala";            
       }
       else
       {
       return "Muy mala";
       }
    }

    public boolean compararPeliculas(Pelicula Pelicula2) {
    return genero.equals(Pelicula2.genero)&&calificacion==Pelicula2.calificacion;
    }
}
    
    
    
    /**
     * @param args the command line arguments
     */
   
    

