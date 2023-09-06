
package Parcial1;

public class Pelicula {
    
    public String nombre;
    public String director;
    public String[] generos = {"Accion", "Comedia", "Drama", "Suspenso"};
    public String genero;
    public int duracion;
    public int año;
    public String calificacion;
    

    public Pelicula(String nombre, String director, String genero, int duracion, int año, String calificacion) {
        this.nombre = nombre;
        this.director = director;
        this.generos = new String[4];
        this.genero = genero;
        this.duracion = duracion;
        this.año = año;
        this.calificacion = calificacion;
        
    }
    
    public String difinirGenero(int num){
        String g="";
        if (num==1)
            g=generos[0];
        if (num==2)
            g=generos[1];
        if (num==3)
            g=generos[2];
        if (num==4)
            g=generos[3];
        return g;
    }
    
    public String calcularValoracion(double v){
        String vSub="";
        if (v>=0 && v<=2)
            vSub="Muy mala";
        if (v<2 && v<=5)
            vSub="Mala";
        if (v<5 && v<=7)
            vSub="Regular";
        if (v<7 && v<=8)
            vSub="Buena";
        if (v<8 && v<=9)
            vSub="Excelente";
        
        return vSub;
    }
    
    public String compararPeliculas(double v1, String g1, String g2, double v2){
        String valo= "Falso";
        if (v1==v2){
            if(g1.equals(g2)){
                valo= "Verdadero";
            }  
        }
        return valo;
    }
    
    public String definirEpicidad(){
        String epi= "Falso";
        if (duracion>=180){
            epi= "Verdadero";
        }
            return epi;
    }
    
    public void MostrarInformación(){
        
    }
    
    

    
    // Setters y getters
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    
    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    
    
}
