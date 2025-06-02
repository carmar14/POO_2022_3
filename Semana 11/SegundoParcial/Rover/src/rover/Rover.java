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
public class Rover {
    private double posX;
    private double posY;

    public Rover() {
        posX = 0.0;
        posX = 0.0;
    }

    public double getPosX() {
        return posX;
    }

    public void setPosX(double x) {
        posX = x;
    }

    public double getPosY() {
        return posY;
    }

    public void setPosY(double y) {
        posY = y;
    }

    
    public String toString() {
        return "Rover{" + "posX=" + posX + ", posY=" + posY + '}';
    }
    
    public void moverArriba(){
        double newY = posY+0.5;
        setPosY(newY);
    }
    
    public void moverAbajo(){
        double newY = posY-0.5;
        setPosY(newY);
    }
    
    public void moverDerecha(){
        double newX = posX+0.5;
        setPosX(newX);
    }
    
    public void moverIzquierda(){
        double newX = posX-0.5;
        setPosX(newX);
    }
    
    public void moverRover(double dx, double dy){
        if(dx>=0 && dy >=0){
            moverIzquierda();
            moverAbajo();
        }else if (dx>=0 && dy<=0){
            moverIzquierda();
            moverArriba();
        }else if (dx<=0 && dy<=0){
            moverDerecha();
            moverArriba();
        }else{
            moverDerecha();
            moverAbajo();
        }
    }
}
    