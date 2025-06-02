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
public class Velocista extends Ciclista{
    private double potenciaProm, velProm;

    public Velocista() {
        this.potenciaProm = 0.0;
        this.velProm = 0.0;
    }

    public double getPotenciaProm() {
        return potenciaProm;
    }

    public void setPotenciaProm(double potenciaProm) {
        this.potenciaProm = potenciaProm;
    }

    public double getVelProm() {
        return velProm;
    }

    public void setVelProm(double velProm) {
        this.velProm = velProm;
    }

    @Override
    public String toString() {
        String msg = super.toString();
        msg+="\n Velocista{" + "potenciaProm=" + potenciaProm + ", velProm=" + velProm + '}';
        return msg;
    } 
    
}
