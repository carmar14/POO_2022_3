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
public class Leon extends Felinos{

    @Override
    public String getSonidos() {
        return "Rugido";
    }

    @Override
    public String getAlimentos() {
        return "Carnivoros";
    }

    @Override
    public String getHabitat() {
        return "Pradera";
    }

    @Override
    public String getNombreCientifico() {
        return "Panthera Leo";
    }
    
}
