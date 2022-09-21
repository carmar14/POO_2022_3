package figurasplanasmasdespliegue;
public class Paralelogramo {
    protected double ladoA;
    protected double ladoB;

    public Paralelogramo(){
        ladoA = 0;
        ladoB = 0;
    }

    public void asignarLadoA(double lA){
        ladoA = lA;
    }

    public void asignarLadoB(double lB){
        ladoB = lB;
    }

    public double obtenerLadoA(){
        return ladoA;
    }

    public double obtenerLadoB(){
        return ladoB;
    }

    public double calcularPerimetro(){
        double perimetro;
        perimetro = 2*ladoA + 2*ladoB;
        return perimetro;
    }
}
