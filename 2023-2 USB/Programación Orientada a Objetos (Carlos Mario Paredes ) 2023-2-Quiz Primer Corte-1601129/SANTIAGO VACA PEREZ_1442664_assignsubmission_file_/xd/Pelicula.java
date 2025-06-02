
package quiz_1;


public class Pelicula {
    
    private String nombre;
    private String director;
    private String genero;
    private int  duracion;
    private int año;
    private double calificacion;
    
  //CONSTRUCTOR

    public Pelicula(String nombre, String director, String genero, int duracion, int anio, double calificacion) {
        this.nombre = nombre;
        this.director = director;
        this.genero = genero;
        this.duracion = duracion;
        this.año = anio;
        this.calificacion = calificacion;
    }

   
    
    //SETTERS Y GETTERS

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

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    
    
    
    
    
    
    
    //Metodos
    
    public void imprimirAtributos(){
        IO.mostrarMensaje("Nombre de la pélicula: "+ nombre);
        IO.mostrarMensaje("Director: "+ director);
        IO.mostrarMensaje("Genero: "+ genero);
        IO.mostrarMensaje("Duracion: "+ duracion + " Minutos");
        IO.mostrarMensaje("Año de estreno: "+ año);
        IO.mostrarMensaje("Calificacion: "+ calificacion);
        
     }
    
    
    public String calificarEpicidad(){
        String epicidad;
        if (duracion >= 120){
               epicidad = "La pelicula es EPICA :D";             
        }
        else {
            epicidad = "La pelicula NO es EPICA :(";}
        
        return epicidad; 
        
    }
    
    public String calcularValoracion(){
        String valoracion = " ";
        if ((calificacion >= 0)&&(calificacion <= 2)){
            valoracion = "Muy Mala";
        }
        else if ((calificacion > 2)&&(calificacion <= 5)){
            valoracion = "Mala";
        }
        else if ((calificacion > 5)&&(calificacion <= 7)){
            valoracion = "Regular";
        }
        else if ((calificacion > 7)&&(calificacion <= 8)){
            valoracion = "Buena";
        }
        else if ((calificacion > 8)&&(calificacion <= 10 )){
            valoracion = "Escelente";
        }
        return valoracion;
    }    
    
    
     
    
    
    
    
    
    
}
