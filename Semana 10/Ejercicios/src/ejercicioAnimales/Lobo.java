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
public class Lobo extends Canidos{

    @Override
    public String getSonidos() {
        return "Aullido";
    }

    @Override
    public String getAlimentos() {
        return "Carnívoro";
    }

    @Override
    public String getHabitat() {
        return "Bosque";
    }

    @Override
    public String getNombreCientifico() {
        return "Canis lupus";
    }
    
}
