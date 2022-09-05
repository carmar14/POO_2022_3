public class TetraedroRegular {
    private double arista;

    public void setArista(double a) {
        arista = a;
    }
    public double getArista(){
        return arista;
    }
    public double calcularArea(){
        return Math.pow(arista,2)*Math.sqrt(3);
    }
    public double calcularVolumen(){
        return Math.pow(arista,3) * (Math.sqrt(2) / 12);
    }
    public String tetraedroToSring(){
        return "Arista del tetraedro: "+ arista;
    }
}