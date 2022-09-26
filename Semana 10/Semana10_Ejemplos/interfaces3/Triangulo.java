package interfaces3;
//import javax.swing.JOptionPane;
public class Triangulo extends Figura{
    private double lado1, lado2, lado3;

    //@Override
    //public void mostrarBienvenida(){
    //    JOptionPane.showMessageDialog(null,
    //            "Bienvenido a la Clase Cuadrado");
    //}

    public void asignarLado1(double l1) { lado1 = l1;}
    public void asignarLado2(double l2) { lado2 = l2;}
    public void asignarLado3(double l3) { lado3 = l3;}

    @Override
    public void calcularLongitud(){
        longitud = lado1 + lado2 + lado3;
    }

    @Override
    public void calcularArea(){
        double sp;
        sp = (lado1 + lado2 + lado3)/2;
        area = Math.sqrt(sp*(sp-lado1)*(sp-lado2)*(sp-lado3));
    }
}
