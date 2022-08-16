package solidosconIO;
public class Esfera {
    private double radio=0;

    void asignarRadio(double r){
        radio = r;
    }
    
    public double calcularArea(){
        double area;
        area = 4*Math.PI*radio*radio;
        return area;
    }

    public double calcularVolumen(){
        double volumen;
        volumen = (4*Math.PI*radio*radio*radio)/3;
        return volumen;
    }
}
