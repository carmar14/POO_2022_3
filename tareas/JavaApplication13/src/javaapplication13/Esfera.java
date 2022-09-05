public class Esfera {
    private double radio;

    public void setRadio(double r) {
        radio = r;
    }
    public double getRadio(){
        return radio;
    }

    public double calcularArea(){
        return 4 * Math.PI * radio;
    }

    public double calcularVolumen(){
        return 3/4 * Math.PI * Math.pow(radio,3);
    }
    public String esferaToSring(){
        return "Radio de la esfera: "+ radio;
    }
}