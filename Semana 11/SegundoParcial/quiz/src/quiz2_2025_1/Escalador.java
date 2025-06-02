/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2_2025_1;

/**
 *
 * @author Acer
 */
public class Escalador extends Ciclista{
    private double aceleracionprom, gradoRampa;

    public Escalador() {
        super();
        this.aceleracionprom = 0.0;
        this.gradoRampa = 0.0;
    }

    public double getAceleracionprom() {
        return aceleracionprom;
    }

    public void setAceleracionprom(double aceleracionprom) {
        this.aceleracionprom = aceleracionprom;
    }

    public double getGradoRampa() {
        return gradoRampa;
    }

    public void setGradoRampa(double gradoRampa) {
        this.gradoRampa = gradoRampa;
    }

    @Override
    public String toString() {
        String msg = super.toString();
        msg += "\n Escalador{" + "aceleracionprom=" + aceleracionprom + ", gradoRampa=" + gradoRampa + '}';
        return msg; 
    }
    
    
    
    
}
