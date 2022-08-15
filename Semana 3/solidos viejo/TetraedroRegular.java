package solidos;
public class TetraedroRegular {
    private double arista;

    void asignarArista(double a){
        arista = a;
    }

    public double calcularArea(){
        double area;
        area = 1.732*arista*arista;
        return area;
    }

    public double calcularVolumen(){
        double volumen;
        volumen = 0.1179*arista*arista*arista;
        return volumen;
    }
}
