public class Pelicula {
    // Atributos privados
    private String nombre;
    private String director;
    private String genero;
    private int duracion;
    private int ano;
    private double calificacion;

    // Constructor
    public Pelicula(String nombre, String director, String genero, int duracion, int ano, double calificacion) {
        this.nombre = nombre;
        this.director = director;
        this.genero = genero;
        this.duracion = duracion;
        this.ano = ano;
        this.calificacion = calificacion;
    }

    // Métodos get y set
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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    // Método imprimir
    public void imprimir() {
        StringBuilder info = new StringBuilder();
        info.append("Nombre: ").append(nombre).append("\n");
        info.append("Director: ").append(director).append("\n");
        info.append("Genero: ").append(genero).append("\n");
        info.append("Duración: ").append(duracion).append(" minutos\n");
        info.append("Año: ").append(ano).append("\n");
        info.append("Calificación: ").append(calificacion);
        IO.show(info.toString());
    }

    // Método para determinar si una película es épica
    public boolean esEpica() {
        return duracion >= 180;
    }

    // Método para calcular una valoración basada en la Figura1
    public String valoracionSubjetiva() {
        if (calificacion <= 2) {
            return "Muy mala";
        } else if (calificacion <= 5) {
            return "Mala";
        } else if (calificacion <= 7) {
            return "Regular";
        } else if (calificacion <= 8) {
            return "Buena";
        } else {
            return "Excelente";
        }
    }

    // Método para comparar dos películas
    public boolean compararPeliculas(Pelicula otraPelicula) {
        return this.genero.equals(otraPelicula.getGenero()) && this.calificacion == otraPelicula.getCalificacion();
    }
}
