package peliculas.corte.pkg1;


public class Película {
    private String nombre;
    private String director;
    private String género;
    private int duración;
    private int año;
    private double calificación;

   
    public Película(String nombre, String director, String género, int duración, int año, double calificación) {
        this.nombre = nombre;
        this.director = director;
        this.género = género;
        this.duración = duración;
        this.año = año;
        this.calificación = calificación;
    }


    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Director: " + director);
        System.out.println("Género: " + género);
        System.out.println("Duración: " + duración + " minutos");
        System.out.println("Año: " + año);
        System.out.println("Calificación: " + calificación);
    }

    
    public boolean esÉpica() {
        return duración >= 180;  
    }

    
    public double calcularValoración() {
        
        return 0;
    }


    public boolean comparar(Película otraPelícula) {
        return this.género.equals(otraPelícula.género) && this.calificación == otraPelícula.calificación;
    }
}
