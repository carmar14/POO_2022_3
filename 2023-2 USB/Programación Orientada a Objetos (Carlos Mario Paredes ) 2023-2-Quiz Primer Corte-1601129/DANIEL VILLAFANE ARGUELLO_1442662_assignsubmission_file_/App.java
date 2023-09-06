package peliculas.corte.pkg1;


import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
    
        Película movie1 = new Película("Pelicula1", "Director1", "ACCIÓN", 120, 2021, 8.5);
        Película movie2 = new Película("Pelucla2", "Director2", "DRAMA", 150, 2020, 7.5);

        GestorPelículas gestor = new GestorPelículas(movie1, movie2);

     
        InterfazPelículas interfaz = new InterfazPelículas(gestor);
        interfaz.iniciar();
    }
}
