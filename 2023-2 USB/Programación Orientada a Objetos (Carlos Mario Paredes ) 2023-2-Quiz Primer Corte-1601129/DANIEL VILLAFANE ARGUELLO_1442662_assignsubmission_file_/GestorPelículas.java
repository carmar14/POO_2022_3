package peliculas.corte.pkg1;


public class GestorPelículas {
    private Película película1;
    private Película película2;

    public GestorPelículas(Película película1, Película película2) {
        this.película1 = película1;
        this.película2 = película2;
    }

   
    public Película[] getPelículas() {
        return new Película[]{película1, película2};
    }
}