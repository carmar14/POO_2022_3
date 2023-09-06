package pelicula;
public class Pelicula {
    //atributos
    private String nombre;
    private String Director;
    private String genero;      
    private int duracion;
    private int año;
    private double calificacion;       
    private boolean epico;
    //constructor
    public Pelicula() {
        this.nombre = "";
        this.Director = "";
        this.genero = "";
        this.duracion = 0;
        this.año = 0;
        this.calificacion = 0.0;
    }
    //setters 
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDirector(String Director) {
        this.Director = Director;
    }
    public void setEpico(boolean epico) {
        this.epico = epico;
    }
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    public void setAño(int año) {
        this.año = año;
    }
    //getters
    public String getDirector() {
        return Director;
    }
    public String getNombre() {
        return nombre;
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
    public boolean getEpico() {
        return epico;
    }
    
       //METODOS
         //muetra atributos
         public void muestraAtri(){
         getDirector();
         getNombre();
         getGenero();
         getGenero();
         getDuracion();
         getAño();
         getCalificacion();
         getEpico();
     }  
        //define si es epica o no
         public boolean epicidad(){
             if (duracion >= 180){
              this.epico = true;   
             }
             else if(duracion < 180){
               this.epico = false;
             }
           return epico;
         }
         //calcula valoracion de la tabla
         public String calculaValoracion(String Valoracion){
             if(calificacion >=0 || calificacion <=2){
                 Valoracion = "muy mala";
             }
             else if(calificacion >=2 || calificacion <=5){
                 Valoracion = "mala";
             }
             else if(calificacion >=5 || calificacion <=7){
                 Valoracion = "regular";
             }
             else if(calificacion >=7 || calificacion <=8){
                 Valoracion = "buena";
             }
             else if(calificacion >=8 || calificacion <=10){
                 Valoracion = "excelente";
             }
             return Valoracion;
         }       
}