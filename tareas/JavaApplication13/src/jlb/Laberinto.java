public class Laberinto {
    private int salidaX;
    private int salidaY;

    public Laberinto(int salidaX, int salidaY) {
        this.salidaX = salidaX;
        this.salidaY = salidaY;
    }

    public boolean esPasillo(int x, int y) {
        // Definir el laberinto de manera simplificada
        return (x != 0 && y != 0);  // Asumir que las esquinas (0, 0) son paredes
    }

    public boolean esPared(int x, int y) {
        return !esPasillo(x, y);
    }

    public boolean esSalida(int x, int y) {
        return (x == salidaX && y == salidaY);
    }
}
