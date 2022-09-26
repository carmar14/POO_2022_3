package interfaces1;
//Interface para todo lo que necesite
//pocisionarse en el plano cartesiano
public interface Posicionable {
    public void asignarCoordenadas(double x, double y);
    public double obtenerAbscisa();  //Coordenada x
    public double obtenerOrdenada(); //Coordenada y
    public void mostrarCoordenadas();
    public double obtenerDistanciaAlOrigen();
}
