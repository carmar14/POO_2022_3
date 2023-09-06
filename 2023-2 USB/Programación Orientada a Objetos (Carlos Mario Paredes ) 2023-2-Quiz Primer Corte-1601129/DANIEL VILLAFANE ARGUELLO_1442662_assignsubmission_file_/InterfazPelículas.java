package peliculas.corte.pkg1;


import javax.swing.JOptionPane;

public class InterfazPelículas {
    private GestorPelículas gestor;

    public InterfazPelículas(GestorPelículas gestor) {
        this.gestor = gestor;
    }

    public void iniciar() {
        while (true) {
            String[] opciones = {"Añadir Película", "Mostrar Películas", "Salir"};
            int elección = JOptionPane.showOptionDialog(null, 
                                                      "Elija una opción", 
                                                      "Gestor de Películas", 
                                                      JOptionPane.DEFAULT_OPTION, 
                                                      JOptionPane.INFORMATION_MESSAGE, 
                                                      null, 
                                                      opciones, 
                                                      opciones[0]);

            switch (elección) {
                case 0:  // Añadir Película
                    añadirPelícula();
                    break;
                case 1:  // Mostrar Películas
                    mostrarPelículas();
                    break;
                case 2:  // Salir
                    System.exit(0);
            }
        }
    }

    private void añadirPelícula() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la película:");
        String director = JOptionPane.showInputDialog("Ingrese el nombre del director:");
        String género = JOptionPane.showInputDialog("Ingrese el género de la película (ACCIÓN, COMEDIA, DRAMA, SUSPENSO):");
        int duración = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la duración de la película (en minutos):"));
        int año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de lanzamiento de la película:"));
        double calificación = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificación de la película (0.0 a 10.0):"));
        
        Película nuevaPelícula = new Película(nombre, director, género, duración, año, calificación);
        
        
    }

    private void mostrarPelículas() {
    
    }
}