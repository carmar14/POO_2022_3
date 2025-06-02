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
public class Simulacion {
    
    private Rover rover1,rover2,rover3,rover4;
    private Aterrizaje zona_aterrizaje;

    public Simulacion() {
        rover1 = new Rover();
        rover2 = new Rover();
        rover3 = new Rover();
        rover4 = new Rover();
        zona_aterrizaje = new Aterrizaje();
    }

    public Rover getRover1() {
        return rover1;
    }

    public void setRover1(Rover rover1) {
        this.rover1 = rover1;
    }

    public Rover getRover2() {
        return rover2;
    }

    public void setRover2(Rover rover2) {
        this.rover2 = rover2;
    }

    public Rover getRover3() {
        return rover3;
    }

    public void setRover3(Rover rover3) {
        this.rover3 = rover3;
    }

    public Rover getRover4() {
        return rover4;
    }

    public void setRover4(Rover rover4) {
        this.rover4 = rover4;
    }

    public Aterrizaje getZona_aterrizaje() {
        return zona_aterrizaje;
    }

    public void setZona_aterrizaje(Aterrizaje zona_aterrizaje) {
        this.zona_aterrizaje = zona_aterrizaje;
    }

    @Override
    public String toString() {
        return "Simulacion{" + "rover1=" + rover1 + ", rover2=" + rover2 + ", rover3=" + rover3 + ", rover4=" + rover4 + ", zona_aterrizaje=" + zona_aterrizaje + '}';
    }
    
    public void generarRover(Rover rover){
        double x = ES.leerReal("Ingresar posicion x del Rover ");
        double y = ES.leerReal("Ingresar posicion y del Rover ");
        rover.setPosX(x);
        rover.setPosY(y);
    }
    
    public void generarZonaAterrizaje(){
        double h = ES.leerReal("Ingresar posicion x de la zona de aterrizaje ");
        double k = ES.leerReal("Ingresar posicion y de la zona de aterrizaje ");
        double r = ES.leerReal("Ingresar radio de la zona de aterrizaje ");
        zona_aterrizaje.setH(h);
        zona_aterrizaje.setK(k);
        zona_aterrizaje.setR(r);
    }
    
    public double calcularDistancia(Rover rover){
       double deltaX = rover.getPosX()-zona_aterrizaje.getH();
       double deltaY = rover.getPosY()-zona_aterrizaje.getK();
       double distancia = Math.sqrt(deltaX*deltaX+deltaY*deltaY);
       return distancia;
    }
    
    public void verificarAterrizaje(Rover rover){
   
        double distancia = calcularDistancia(rover);
        double radio = zona_aterrizaje.getR();
        while(distancia>=.9*radio){
            distancia = corregirDistancia(rover);            
        }
        ES.mostrar("El rover a aterrizado correctamente");
    }
    
    public double corregirDistancia(Rover rover){
        double deltaX, deltaY;
        deltaX = rover.getPosX()-zona_aterrizaje.getH();
        deltaY = rover.getPosY()-zona_aterrizaje.getK();
        rover.moverRover(deltaX,deltaY);
        ES.mostrar("El rover se esta moviendo");
        double distancia = calcularDistancia(rover);
        ES.mostrar(rover.toString() + "y la distancia es: "+ distancia);
        return distancia;
        
    }
    
    public void gestionarAterrizaje(Rover rover){
        generarRover(rover);
        verificarAterrizaje(rover);
    }
    
    public void gestionarSimulacion(){
        
        gestionarAterrizaje(rover1);

        gestionarAterrizaje(rover2);

        gestionarAterrizaje(rover3);

        gestionarAterrizaje(rover4);
        
        organizarRoverxDistancia();        
        
    }
    
    public void organizarRoverxDistancia(){
        double d1 = calcularDistancia(rover1);
        double d2 = calcularDistancia(rover2);
        double d3 = calcularDistancia(rover3);
        double d4 = calcularDistancia(rover4);
        
        if (d1 >= d2 && d1 >= d3 && d1 >= d4) {
            if (d2 >= d3 && d2 >= d4) {
                if (d3 >= d4) {
                    ES.mostrar("El orden correcto es:\n " 
                    + rover1.toString()+ "y su distancia es: " +d1+"\n"
                    + rover2.toString()+ "y su distancia es: " +d2+"\n"
                    + rover3.toString()+ "y su distancia es: " +d3+"\n"
                    + rover4.toString()+ "y su distancia es: " +d4+"\n");
                } else {
                    ES.mostrar("El orden correcto es:\n " 
                    + rover1.toString()+ "y su distancia es: " +d1+"\n"
                    + rover2.toString()+ "y su distancia es: " +d2+"\n"
                    + rover4.toString()+ "y su distancia es: " +d4+"\n"
                    + rover3.toString()+ "y su distancia es: " +d3+"\n");
                }
            } else if (d3 >= d4) {
                if (d2 >= d4) {
                    ES.mostrar("El orden correcto es:\n " 
                    + rover1.toString()+ "y su distancia es: " +d1+"\n"
                    + rover3.toString()+ "y su distancia es: " +d3+"\n"
                    + rover2.toString()+ "y su distancia es: " +d2+"\n"
                    + rover4.toString()+ "y su distancia es: " +d4+"\n");
                } else {
                    ES.mostrar("El orden correcto es:\n " 
                    + rover1.toString()+ "y su distancia es: " +d1+"\n"
                    + rover3.toString()+ "y su distancia es: " +d3+"\n"
                    + rover4.toString()+ "y su distancia es: " +d4+"\n"
                    + rover2.toString()+ "y su distancia es: " +d2+"\n");
                }
            } else {
                if (d2 >= d3) {
                    ES.mostrar("El orden correcto es:\n " 
                    + rover1.toString()+ "y su distancia es: " +d1+"\n"
                    + rover4.toString()+ "y su distancia es: " +d4+"\n"
                    + rover2.toString()+ "y su distancia es: " +d2+"\n"
                    + rover3.toString()+ "y su distancia es: " +d3+"\n");
                } else {
                    ES.mostrar("El orden correcto es:\n " 
                    + rover1.toString()+ "y su distancia es: " +d1+"\n"
                    + rover4.toString()+ "y su distancia es: " +d4+"\n"
                    + rover3.toString()+ "y su distancia es: " +d3+"\n"
                    + rover2.toString()+ "y su distancia es: " +d2+"\n");
                }
            }
        } else if (d2 >= d1 && d2 >= d3 && d2 >= d4) {
            if (d1 >= d3 && d1 >= d4) {
                if (d3 >= d4) {
                    ES.mostrar("El orden correcto es:\n " 
                    + rover2.toString()+ "y su distancia es: " +d2+"\n"
                    + rover1.toString()+ "y su distancia es: " +d1+"\n"
                    + rover3.toString()+ "y su distancia es: " +d3+"\n"
                    + rover4.toString()+ "y su distancia es: " +d4+"\n");
                } else {
                    ES.mostrar("El orden correcto es:\n " 
                    + rover2.toString()+ "y su distancia es: " +d2+"\n"
                    + rover1.toString()+ "y su distancia es: " +d1+"\n"
                    + rover4.toString()+ "y su distancia es: " +d4+"\n"
                    + rover3.toString()+ "y su distancia es: " +d3+"\n");
                }
            } else if (d3 >= d4) {
                if (d1 >= d4) {
                    ES.mostrar("El orden correcto es:\n " 
                    + rover2.toString()+ "y su distancia es: " +d2+"\n"
                    + rover3.toString()+ "y su distancia es: " +d3+"\n"
                    + rover1.toString()+ "y su distancia es: " +d1+"\n"
                    + rover4.toString()+ "y su distancia es: " +d4+"\n");
                } else {
                    ES.mostrar("El orden correcto es:\n " 
                    + rover2.toString()+ "y su distancia es: " +d2+"\n"
                    + rover3.toString()+ "y su distancia es: " +d3+"\n"
                    + rover4.toString()+ "y su distancia es: " +d4+"\n"
                    + rover1.toString()+ "y su distancia es: " +d1+"\n");
                }
            } else {
                if (d1 >= d3) {
                    ES.mostrar("El orden correcto es:\n " 
                    + rover2.toString()+ "y su distancia es: " +d2+"\n"
                    + rover4.toString()+ "y su distancia es: " +d4+"\n"
                    + rover1.toString()+ "y su distancia es: " +d1+"\n"
                    + rover3.toString()+ "y su distancia es: " +d3+"\n");
                } else {
                    ES.mostrar("El orden correcto es:\n " 
                    + rover2.toString()+ "y su distancia es: " +d2+"\n"
                    + rover4.toString()+ "y su distancia es: " +d4+"\n"
                    + rover3.toString()+ "y su distancia es: " +d3+"\n"
                    + rover1.toString()+ "y su distancia es: " +d1+"\n");
                }
            }
        } else if (d3 >= d1 && d3 >= d2 && d3 >= d4) {
            if (d1 >= d2 && d1 >= d4) {
                if (d2 >= d4) {
                    ES.mostrar("El orden correcto es:\n " 
                    + rover3.toString()+ "y su distancia es: " +d3+"\n"
                    + rover1.toString()+ "y su distancia es: " +d1+"\n"
                    + rover2.toString()+ "y su distancia es: " +d2+"\n"
                    + rover4.toString()+ "y su distancia es: " +d4+"\n");
                } else {
                    ES.mostrar("El orden correcto es:\n " 
                    + rover3.toString()+ "y su distancia es: " +d3+"\n"
                    + rover1.toString()+ "y su distancia es: " +d1+"\n"
                    + rover4.toString()+ "y su distancia es: " +d4+"\n"
                    + rover2.toString()+ "y su distancia es: " +d2+"\n");
                }
            } else if (d2 >= d4) {
                if (d1 >= d4) {
                    ES.mostrar("El orden correcto es:\n " 
                    + rover3.toString()+ "y su distancia es: " +d3+"\n"
                    + rover2.toString()+ "y su distancia es: " +d2+"\n"
                    + rover1.toString()+ "y su distancia es: " +d1+"\n"
                    + rover4.toString()+ "y su distancia es: " +d4+"\n");
                } else {
                    ES.mostrar("El orden correcto es:\n " 
                    + rover3.toString()+ "y su distancia es: " +d3+"\n"
                    + rover2.toString()+ "y su distancia es: " +d2+"\n"
                    + rover4.toString()+ "y su distancia es: " +d4+"\n"
                    + rover1.toString()+ "y su distancia es: " +d1+"\n");
                }
            } else {
                if (d1 >= d2) {
                    ES.mostrar("El orden correcto es:\n " 
                    + rover3.toString()+ "y su distancia es: " +d3+"\n"
                    + rover4.toString()+ "y su distancia es: " +d4+"\n"
                    + rover1.toString()+ "y su distancia es: " +d1+"\n"
                    + rover2.toString()+ "y su distancia es: " +d2+"\n");
                } else {
                    ES.mostrar("El orden correcto es:\n " 
                    + rover3.toString()+ "y su distancia es: " +d3+"\n"
                    + rover4.toString()+ "y su distancia es: " +d4+"\n"
                    + rover2.toString()+ "y su distancia es: " +d2+"\n"
                    + rover1.toString()+ "y su distancia es: " +d1+"\n");
                }
            }
        } else {
            if (d1 >= d2 && d1 >= d3) {
                if (d2 >= d3) {
                    ES.mostrar("El orden correcto es:\n " 
                    + rover4.toString()+ "y su distancia es: " +d4+"\n"
                    + rover1.toString()+ "y su distancia es: " +d1+"\n"
                    + rover2.toString()+ "y su distancia es: " +d2+"\n"
                    + rover3.toString()+ "y su distancia es: " +d3+"\n");
                } else {
                    ES.mostrar("El orden correcto es:\n " 
                    + rover4.toString()+ "y su distancia es: " +d4+"\n"
                    + rover1.toString()+ "y su distancia es: " +d1+"\n"
                    + rover3.toString()+ "y su distancia es: " +d3+"\n"
                    + rover2.toString()+ "y su distancia es: " +d2+"\n");
                }
            } else if (d2 >= d3) {
                if (d1 >= d3) {
                    ES.mostrar("El orden correcto es:\n " 
                    + rover4.toString()+ "y su distancia es: " +d4+"\n"
                    + rover2.toString()+ "y su distancia es: " +d2+"\n"
                    + rover1.toString()+ "y su distancia es: " +d1+"\n"
                    + rover3.toString()+ "y su distancia es: " +d3+"\n");
                } else {
                    ES.mostrar("El orden correcto es:\n " 
                    + rover4.toString()+ "y su distancia es: " +d4+"\n"
                    + rover2.toString()+ "y su distancia es: " +d2+"\n"
                    + rover3.toString()+ "y su distancia es: " +d3+"\n"
                    + rover1.toString()+ "y su distancia es: " +d1+"\n");
                }
            } else {
                if (d1 >= d2) {
                    ES.mostrar("El orden correcto es:\n " 
                    + rover4.toString()+ "y su distancia es: " +d4+"\n"
                    + rover1.toString()+ "y su distancia es: " +d3+"\n"
                    + rover3.toString()+ "y su distancia es: " +d1+"\n"
                    + rover2.toString()+ "y su distancia es: " +d2+"\n");
                } else {
                    ES.mostrar("El orden correcto es:\n " 
                    + rover4.toString()+ "y su distancia es: " +d4+"\n"
                    + rover3.toString()+ "y su distancia es: " +d3+"\n"
                    + rover2.toString()+ "y su distancia es: " +d2+"\n"
                    + rover2.toString()+ "y su distancia es: " +d1+"\n");
                }
            }
        }
    }
        
    public void gestionar(){
        generarZonaAterrizaje();
        gestionarSimulacion();
        organizarRoverxDistancia();
        ES.mostrar("Saldrá de la simulacion");    
    }
    
}
