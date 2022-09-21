package figurasplanasmasdespliegue;

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
        String msg = "Menú\n"
                + "1. Gestionar Cuadrado\n"
                + "2. Gestionar Rectángulo\n"
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
        String d = obtenerDibujoEnTexto(unCuadrado);
        ES.mostrar("El perímetro del cuadrado es: "+p+" y su área es: "+a+
                   "\nSu dibujo en texto es:\n"+d);
    }

    private void gestionarRectangulo(){
        double ladoA = ES.leerReal("Digite la altura:");
        double ladoB = ES.leerReal("Digite la base:");
        unRectangulo.asignarLadoA(ladoA);
        unRectangulo.asignarLadoB(ladoB);
        double p = unRectangulo.calcularPerimetro();
        double a = unRectangulo.calcularArea();
        String d = obtenerDibujoEnTexto(unRectangulo);
        ES.mostrar("El perímetro del rectangulo es: "+p+" y su área es: "+a+
                   "\nSu dibujo en texto es:\n"+d);
    }

    public String obtenerDibujoEnTexto(Rectangulo r){
        String dibujo = "";

        int ladoA = (int)r.obtenerLadoA();
        int ladoB = (int)r.obtenerLadoB();

        for(int i=0;i<ladoA;i++){
            for(int j=0;j<ladoB;j++){
                dibujo += "O";
            }
            dibujo += "\n";
        }

        return dibujo;
    }
}
