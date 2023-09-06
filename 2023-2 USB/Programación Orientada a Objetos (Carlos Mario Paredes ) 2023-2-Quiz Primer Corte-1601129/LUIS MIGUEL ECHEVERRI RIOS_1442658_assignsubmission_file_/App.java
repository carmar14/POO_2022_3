public class App {
    public static void main(String[] args) {
        Pelicula pelicula1 = new Pelicula("Titanic", "James Cameron", "DRAMA", 195, 1997, 7.8);
        Pelicula pelicula2 = new Pelicula("Avatar", "James Cameron", "ACCIÓN", 162, 2009, 7.8);

        GestorPeliculas gestor = new GestorPeliculas(pelicula1, pelicula2);
        gestor.mostrarInformacionPeliculas();
        gestor.sonEpicas();
        gestor.valoracionesSubjetivas();
        gestor.compararPeliculas();
    }
}
