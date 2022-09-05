public class Cubo {
    private double arista;

    public void setArista(double a) {
        arista = a;
    }
    public double getArista(){
        return arista;
    }
    public double calcularArea(){
        return 6 * Math.pow(arista, 2);
    }
    public double calcularVolumen(){
        return Math.pow(arista,3);
    }
    public String cuboToSring(){
        return "Arista del cubo: "+ arista;
    }

}