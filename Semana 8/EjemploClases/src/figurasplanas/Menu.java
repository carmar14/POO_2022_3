package figurasplanas;

public class Menu {
    private Cuadrado unCuadrado;
    private Rectangulo unRectangulo;

    public Menu(){
        unCuadrado = new Cuadrado();
        unRectangulo = new Rectangulo();
    }

    public void interactuarConUsuario(){
        int opcion;
        do{
            opcion = mostrarMenuYLeerOpcion();
            ejecutarOperacion(opcion);
        }while(opcion!=3);
    }

    private int mostrarMenuYLeerOpcion(){
        int opcion;
        String msg = "Menu\n"
                + "1. Calcular Área y Perimétro de Cuadrado\n"
                + "2. Calcular Área y Perímetro de Rectángulo\n"
                + "3. Salir";
        opcion = ES.leerEntero(msg);
        return opcion;
    }

    private void ejecutarOperacion(int opc){
        switch(opc){
            case 1:
                gestionarCuadrado();
            break;
            case 2:
                gestionarRectangulo();
            break;
        }
    }

    private void gestionarCuadrado(){
        double lado = ES.leerReal("Digite el lado:");
        unCuadrado.asignarLado(lado);
        double p = unCuadrado.calcularPerimetro();
        double a = unCuadrado.calcularArea();
        ES.mostrar("El perímetro del cuadrado es: "+p+" y su área es: "+a);
    }

    private void gestionarRectangulo(){
        double ladoA = ES.leerReal("Digite la base:");
        double ladoB = ES.leerReal("Digite la altura:");
        unRectangulo.asignarLadoA(ladoA);
        unRectangulo.asignarLadoB(ladoB);
        double p = unRectangulo.calcularPerimetro();
        double a = unRectangulo.calcularArea();
        ES.mostrar("El perímetro del rectangulo es: "+p+" y su área es: "+a);
    }
}
