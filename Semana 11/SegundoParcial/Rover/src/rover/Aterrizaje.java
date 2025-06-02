/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rover;

/**
 *
 * @author Acer
 */
public class Aterrizaje {
    private double h;
    private double k;
    private double r;

    public Aterrizaje() {
        h = 0.0;
        k = 0.0;
        r = 0.0;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getK() {
        return k;
    }

    public void setK(double k) {
        this.k = k;
    }
    
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String toString() {
        return "Centro de la zona de Aterrizaje{" + "h=" + h + ", k=" + k + "con radio:" +r+'}';
    }
    
    
}
