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
public class Contrarrelojista extends Ciclista{
    private double velMax;

    public Contrarrelojista() {
        this.velMax = 0.0;
    }

    public double getVelMax() {
        return velMax;
    }

    public void setVelMax(double velMax) {
        this.velMax = velMax;
    }

    @Override
    public String toString() {
        String msg = super.toString();
        msg += "\n Contrarrelojista{" + "velMax=" + velMax + '}';
        return msg;
    }
    
    
    
    
}
