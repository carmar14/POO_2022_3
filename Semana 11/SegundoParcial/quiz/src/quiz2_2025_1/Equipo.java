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
public class Equipo {
    private String pais,nombreEquipo;
    private double tiempoCarrera;
    private Ciclista[][] equipo;

    public Equipo() {
        this.pais = "";
        this.nombreEquipo = "";
        this.tiempoCarrera = 0.0;
        this.equipo = new Ciclista[3][];
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public double getTiempoCarrera() {
        return tiempoCarrera;
    }

    public void setTiempoCarrera(double tiempoCarrera) {
        this.tiempoCarrera = tiempoCarrera;
    }

    public Ciclista[][] getEquipo() {
        return equipo;
    }

    public void setEquipo(Ciclista[][] equipo) {
        this.equipo = equipo;
    }
    
    public void definirCantidad(){
        int cantV = IO.readInt("Ingrese la cantidad de velocistas que tiene el equipo");
        int cantE = IO.readInt("Ingrese la cantidad de escaladores que tiene el equipo");
        int cantC = IO.readInt("Ingrese la cantidad de contrarrelojistas que tiene el equipo");
        equipo[0] = new Velocista[cantV];
        equipo[1] = new Escalador[cantE];
        equipo[2] = new Contrarrelojista[cantC];
    }
    
    public void llenarEquipo(){
        int k = 0;
        for(int i=0; i<equipo.length; i++){
            for(int j =0; j<equipo[i].length;j++){
                k++;
                if(i==0){
                    Velocista velocista = new Velocista();
                    gestionarCiclista(velocista,k);
                    gestionarVelocista(velocista);
                    equipo[i][j] = velocista;
                }
                
                if(i==1){
                    Escalador escalador = new Escalador();
                    gestionarCiclista(escalador,k);
                    gestionarEscalador(escalador);
                    equipo[i][j] = escalador;
                }
                
                if(i==2){
                    Contrarrelojista contrarrelojista = new Contrarrelojista();
                    gestionarCiclista(contrarrelojista,k);
                    gestionarContrarrelojista(contrarrelojista);
                    equipo[i][j] = contrarrelojista;
                }
            } 
        }
        
    }
    
    public void gestionarCiclista(Ciclista ciclista, int i){
        int id = IO.readInt("Ingresar el id del ciclista N°"+i);
        String nombre = IO.readString("Ingresar el nombre del ciclista N°"+i);
        double tiempo = IO.readDouble("Ingresar el tiempo acumulado del ciclista N°"+i);
        //Ciclista ciclista = new Ciclista();
        ciclista.setIdentificador(id);
        ciclista.setNombre(nombre);
        ciclista.setTiempoAcu(tiempo);
        //equipo[i][j] = ciclista;
    }
    
    public void gestionarVelocista(Velocista velocista){
        double potencia = IO.readDouble("Ingresar la potencia promedio del velocista");
        double velocidad = IO.readDouble("Ingresar la velocidad promedio del velocista");
        velocista.setPotenciaProm(potencia);
        velocista.setVelProm(velocidad);
        
    }
    
    public void gestionarEscalador(Escalador escalador){
        double aceleracion = IO.readDouble("Ingresar la aceleracion promedio del escalador");
        double gradoRampa = IO.readDouble("Ingresar el grado de la rampa del escalador");
        escalador.setAceleracionprom(aceleracion);
        escalador.setGradoRampa(gradoRampa);
        
    }
    
    public void gestionarContrarrelojista(Contrarrelojista contrarrelojista){
        double velMax = IO.readDouble("Ingresar la velocidad maxima del contrarrelojista");
        contrarrelojista.setVelMax(velMax);
        
    }
    
    public void calcularTiempoTotal(){
        for(int i=0; i<equipo.length; i++){
            for(int j =0; j<equipo[i].length;j++){
                tiempoCarrera += equipo[i][j].getTiempoAcu();
            }
        }
        IO.show("El tiempo total de la carrera es "+ tiempoCarrera + " minutos");
    }
    
    public void mostrarEquipo(){
        String msg = "";
        for(int i=0; i<equipo.length; i++){
            for(int j =0; j<equipo[i].length;j++){
                
                msg += equipo[i][j].toString()+"\n";
            }
        }
        IO.show(msg);
    }
    
    public void listarNombres(){
        String msg = "Estos son los nombres de los ciclistas\n";
        for(int i=0; i<equipo.length; i++){
            for(int j =0; j<equipo[i].length;j++){
                msg += equipo[i][j].getNombre()+"\n";
            }
        }
        IO.show(msg);
    }
    
    public void buscarCiclista(){
        int id = IO.readInt("Ingresar el id del ciclista a buscar ");
        String msg = "";
        for(int i=0; i<equipo.length; i++){
            for(int j =0; j<equipo[i].length;j++){
                if (id == equipo[i][j].getIdentificador()){
                    msg = "Jugador encontrado\n"+equipo[i][j].toString();
                    IO.show(msg);
                    break;
                }
            }
        }
        msg = "Jugador no encontrado";
    }
    
    public void mostrarMasRapido(){
        double tiempo = IO.readDouble("Ingresar el tiempo a comparar");
        int cant = 0;
        String msg = "";
        for(int i=0; i<equipo.length; i++){
            for(int j =0; j<equipo[i].length;j++){
                if (tiempo <= equipo[i][j].getTiempoAcu()){
                    cant++;
                    msg += equipo[i][j].toString()+"\n";
                }
            }
        }
        IO.show("Los ciclistas con un tiempo menor a "+ tiempo + "son\n"+msg);
    }
    
    public void gestionar(){
        definirCantidad();
        llenarEquipo();
        mostrarEquipo();
        calcularTiempoTotal();
        listarNombres();
        buscarCiclista();
        mostrarMasRapido();
    }
}
