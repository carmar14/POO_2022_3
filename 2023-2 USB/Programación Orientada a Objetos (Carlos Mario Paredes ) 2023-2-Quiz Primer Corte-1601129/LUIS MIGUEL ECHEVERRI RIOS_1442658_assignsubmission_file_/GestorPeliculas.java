public class GestorPeliculas {
    private Pelicula pelicula1;
    private Pelicula pelicula2;

    public GestorPeliculas(Pelicula pelicula1, Pelicula pelicula2) {
        this.pelicula1 = pelicula1;
        this.pelicula2 = pelicula2;
    }

    public void mostrarInformacionPeliculas() {
        IO.show("Información Película 1:");
        pelicula1.imprimir();
        IO.show("Información Película 2:");
        pelicula2.imprimir();
    }

    public void compararPeliculas() {
        if (pelicula1.compararPeliculas(pelicula2)) {
            IO.show("Las películas son del mismo género y tienen la misma calificación.");
        } else {
            IO.show("Las películas son diferentes en género o calificación.");
        }
    }

    public void sonEpicas() {
        if (pelicula1.esEpica()) {
            IO.show("La Película 1 es épica.");
        } else {
            IO.show("La Película 1 no es épica.");
        }

        if (pelicula2.esEpica()) {
            IO.show("La Película 2 es épica.");
        } else {
            IO.show("La Película 2 no es épica.");
        }
    }

    public void valoracionesSubjetivas() {
        IO.show("Valoración subjetiva Película 1: " + pelicula1.valoracionSubjetiva());
        IO.show("Valoración subjetiva Película 2: " + pelicula2.valoracionSubjetiva());
    }
}
