import java.util.Scanner;

public class IO {
    private Scanner scanner = new Scanner(System.in);

    public int leerInt() {
        return scanner.nextInt();
    }

    public void mostrarMensaje(int mensaje) {
        System.out.println("Mensaje código: " + mensaje);
    }

    public void mostrarEstado(Juego juego) {
        mostrarPosicion(juego.getJugador1(), 1);
        mostrarPosicion(juego.getJugador2(), 2);
        if (juego.getNumeroJugadores() > 2) mostrarPosicion(juego.getJugador3(), 3);
        if (juego.getNumeroJugadores() > 3) mostrarPosicion(juego.getJugador4(), 4);
    }

    private void mostrarPosicion(Jugador jugador, int numero) {
        System.out.println("Jugador " + numero + " - X: " + jugador.getPosicionX() + " Y: " + jugador.getPosicionY());
    }
}
