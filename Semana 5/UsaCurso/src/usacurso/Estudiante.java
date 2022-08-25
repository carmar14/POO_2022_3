/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usacurso;

/**
 *
 * @author Acer
 */
public class Estudiante {
    private int cod;
    private double calif;
    private char genero;
    private String nombre;
    private String apellido;
    
    public Estudiante(){
        cod = 0;
        calif = 0.0;
        genero = ' ';
        nombre = "";
        apellido ="";        
        
    }
    
    
    public Estudiante(int cod, double calif, String nombre, String apellido, char genero){
         
        setCodigo(cod);
        setCalificacion(calif);
        setNombre(nombre);
        setApellido(apellido);
        setGenero(genero);
    
    }
    
    
    public void setCodigo(int cod){
        this.cod=cod;
    }
    
    public void setCalificacion(double calif){
        this.calif=calif;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public void setGenero(char genero){
        this.genero=genero;
    }
    
    public int getCodigo(){
        return cod;
    }
    
    public double getCalificacion(){
        return calif;
    }
   
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public char getGenero(){
        return genero;
    }
    
    
    
}
