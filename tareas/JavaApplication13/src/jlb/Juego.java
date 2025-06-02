public class Juego {
    private Jugador jugador1;
    private Jugador jugador2;
    private Jugador jugador3;
    private Jugador jugador4;
    private Laberinto laberinto;
    private int turnoActual;
    private int numeroJugadores;

    public Juego(int numeroJugadores, Laberinto laberinto) {
        this.numeroJugadores = numeroJugadores;
        this.laberinto = laberinto;
        this.jugador1 = new Jugador(0, 0);
        this.jugador2 = new Jugador(1, 0);
        if (numeroJugadores > 2) this.jugador3 = new Jugador(2, 0);
        if (numeroJugadores > 3) this.jugador4 = new Jugador(3, 0);
        this.turnoActual = 1;
    }

    public void iniciarJuego() {
        IO io = new IO();
        while (true) {
            Jugador jugadorActual = obtenerJugadorActual();
            io.mostrarMensaje(turnoActual);
            int direccion = io.leerInt();

            moverJugador(jugadorActual, direccion);

            if (verificarVictoria(jugadorActual)) {
                io.mostrarMensaje(turnoActual + 10);  // Mensaje especial de victoria
                break;
            }
            cambiarTurno();
            io.mostrarEstado(this);
        }
    }

    private Jugador obtenerJugadorActual() {
        switch (turnoActual) {
            case 1: return jugador1;
            case 2: return jugador2;
            case 3: return jugador3;
            case 4: return jugador4;
            default: return jugador1;
        }
    }

    public void cambiarTurno() {
        turnoActual++;
        if (turnoActual > numeroJugadores) {
            turnoActual = 1;
        }
    }

    public void moverJugador(Jugador jugador, int direccion) {
        switch (direccion) {
            case 1: jugador.moverArriba(); break;
            case 2: jugador.moverAbajo(); break;
            case 3: jugador.moverIzquierda(); break;
            case 4: jugador.moverDerecha(); break;
        }
    }

    public boolean verificarVictoria(Jugador jugador) {
        return laberinto.esSalida(jugador.getPosicionX(), jugador.getPosicionY());
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public Jugador getJugador3() {
        return jugador3;
    }

    public Jugador getJugador4() {
        return jugador4;
    }

    public int getNumeroJugadores() {
        return numeroJugadores;
    }
}
