public class Jugador {
    private int posicionX;
    private int posicionY;

    public Jugador(int x, int y) {
        this.posicionX = x;
        this.posicionY = y;
    }

    public void moverArriba() {
        this.posicionX--;
    }

    public void moverAbajo() {
        this.posicionX++;
    }

    public void moverIzquierda() {
        this.posicionY--;
    }

    public void moverDerecha() {
        this.posicionY++;
    }

    public int getPosicionX() {
        return posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }
}
