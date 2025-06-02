
package quiz;


public class Pelicula {
    String nombre;
    String director;
    String genero;
    int duracion;
    int año;
    double calificacion;

    
    public Pelicula(String nombre, String director, String genero, int duracion, int año, double calificacion) {
        this.nombre = nombre;
        this.director = director;
        this.genero = genero;
        this.duracion = duracion;
        this.año = año;
        this.calificacion = calificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDirector(String director) {
   
        this.nombre = nombre;
      this.director = director;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDirector() {
        return director;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getAño() {
        return año;
    }

    public double getCalificacion() {
        return calificacion;
    }

    
    
    public void Imprimir(String mensaje){
        
       IO.mostrarMensaje("El nombre es: "+ nombre + "\nEl director es: "+ director + "\nEl género es: " + genero + "\nLa duración es: " + duracion + "\nEl año es: " + año + "Su calificación es "+ calificacion);
    }
    
   
    public String definirPelicula(String mensaje){
        String epico;
                
        if(duracion >= 180){
            epico = "Verdadero";
        }else{
            epico = "Falso";

        }
        return epico;
                
    }
    
    
    /*
    public static int calcularValoracion(String mensaje){
       if(calificacion >)
    }
    
   
    public static int compararPelicula(String mensaje){
       
    }
    
    */

}


