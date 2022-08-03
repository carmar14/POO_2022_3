package primobj1;
//Clase que define las dimensiones de toda esfera
public class Esfera {
    //Este es un atributo que tendrán los objetos
    //instanciados a partir de esta clase Esfera
    double radio=0;
    //Este método sirve para darle un valor al
    //atributo radio del objeto de la clase Esfera
    void asignarRadio(double r){
        radio = r;
    }
    //Método que calcula el área de una esfera
    double calcularArea(){
        double area;
        area = 4*Math.PI*radio*radio;
        return area;
    }
    //Método que calcula el volumen de una esfera
    double calcularVolumen(){
        double volumen;
        volumen = (4*Math.PI*radio*radio*radio)/3;
        return volumen;
    }
}
