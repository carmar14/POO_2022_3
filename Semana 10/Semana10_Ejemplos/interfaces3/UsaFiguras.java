package interfaces3;
import javax.swing.JOptionPane;
public class UsaFiguras {

    void mostrarMenu(){
        int opcion=0;

        while(opcion!=3){
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "Menú Figuras\n"+
                    "Digite la opción que desea:\n"+
                    "1. Revisar la funcionalidad del cuadrado\n"+
                    "2. Revisar la funcionalidad del triángulo\n"+
                    "3. Salir\n"));
            ejecutarOperacion(opcion);
        }
    }

    void ejecutarOperacion(int opcion){
        switch(opcion){
            case 1: usarCuadrado(); break;
            case 2: usarTriangulo(); break;
            case 3: JOptionPane.showMessageDialog(null, "Hasta luego!");
        }
    }

    void usarCuadrado(){
        Cuadrado  c = new Cuadrado();

        double lado = Double.parseDouble(
                JOptionPane.showInputDialog("Digite el lado:"));
        c.asignarLado(lado);

        c.calcularLongitud();
        c.calcularArea();

        c.imprimirLongitud();
        c.imprimirArea();
    }

    void usarTriangulo(){
        Triangulo  t = new Triangulo();

        double lado1 = Double.parseDouble(
                JOptionPane.showInputDialog("Digite el lado 1:"));
        double lado2 = Double.parseDouble(
                JOptionPane.showInputDialog("Digite el lado 2:"));
        double lado3 = Double.parseDouble(
                JOptionPane.showInputDialog("Digite el lado 3:"));
        t.asignarLado1(lado1);
        t.asignarLado2(lado2);
        t.asignarLado3(lado3);

        t.calcularLongitud();
        t.calcularArea();

        t.imprimirLongitud();
        t.imprimirArea();
    }

    public static void main(String args[]){
        UsaFiguras uf = new UsaFiguras();
        uf.mostrarMenu();
    }
}
