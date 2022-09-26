/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioAnimales;

/**
 *
 * @author Acer
 */
public abstract class Animal {
    protected String sonidos, alimentos, habitat, nombreCientifico;

    public abstract String getSonidos();

    public abstract String getAlimentos();
    
    public abstract String getHabitat();

    public abstract String getNombreCientifico();
    
    
    
}
