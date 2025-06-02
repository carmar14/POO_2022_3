public class Main {
    public static void main(String[] args) {
        Laberinto laberinto = new Laberinto(2, 2);  // Define la salida del laberinto
        Juego juego = new Juego(2, laberinto);  // Crea un juego para 2 jugadores
        juego.iniciarJuego();  // Inicia el juego
    }
}
