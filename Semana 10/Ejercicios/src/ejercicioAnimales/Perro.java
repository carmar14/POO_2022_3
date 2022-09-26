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
public class Perro extends Canidos{

    @Override
    public String getSonidos() {
        return "Ladrido";
    }
    
    @Override
    public String getAlimentos() {
        return "Carnivoros";
    }

    @Override
    public String getHabitat() {
        return "Doméstico";
    }
    
    @Override
    public String getNombreCientifico() {
        return "Canis lupus familiaris";
    }
    
}
