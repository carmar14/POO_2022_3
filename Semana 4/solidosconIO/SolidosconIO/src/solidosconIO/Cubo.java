package solidosconIO;
public class Cubo {
    private double arista;
    
    void asignarArista(double a){
        arista = a;
    }

    public double calcularArea(){
        double area;
        area = 6*arista*arista;
        return area;
    }

    public double calcularVolumen(){
        double volumen;
        volumen = arista*arista*arista;
        return volumen;
    }
}
