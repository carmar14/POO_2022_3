package solidosconIO;
public class ManejaSolidos {
    private Esfera unaEsfera;
    private Cubo   unCubo;
    private TetraedroRegular unTetraedro;

    public ManejaSolidos(){
        unaEsfera   = new Esfera();
        unCubo      = new Cubo();
        unTetraedro = new TetraedroRegular();
    }

    private void mostrarBienvenida(){
        IO.show("Bienvenido!\n"
                + "Programa que Gestiona Área y Volumen de diversos sólidos");
    }

    private int mostrarMenuYLeerOpcion(){
        int o;
        String menu = "Menú de Opciones\n"
                + "1. Calcular dimensiones de una Esfera\n"
                + "2. Calcular dimensiones de un Cubo\n"
                + "3. Calcular dimensiones de un Tetraedro Regular\n"
                + "4. Salir\n"
                + "Por favor digite la opción que desea:";
        
        o = IO.readInt(menu);
        return o;
    }

    private void interactuarConUsuario(){
        int opcion;
        do{
            opcion = mostrarMenuYLeerOpcion();
            realizarOperacion(opcion);
        }while(opcion!=4);
    }

    private void realizarOperacion(int opc){
        switch(opc){
            case 1:
                gestionarEsfera();
            break;
            case 2:
                gestionarCubo();
            break;
            case 3:
                gestionarTetraedroRegular();
            break;
            case 4:
                IO.show("El programa terminará");
            break;
            default:
                IO.show("Ha presionado una opción no valida, por favor inténtelo de nuevo");
        }
    }

    private void gestionarEsfera(){
        double radio, area, volumen;
        radio = IO.readDouble("Por favor digite el radio de la esfera:");
        unaEsfera.asignarRadio(radio);
        area = unaEsfera.calcularArea();
        volumen = unaEsfera.calcularVolumen();
        IO.show("El área de la esfera es: "+area+" y el volumen es: "+volumen);
    }

    private void gestionarCubo(){
        double arista, area, volumen;
        arista = IO.readDouble("Por favor digite la arista del cubo:");
        unCubo.asignarArista(arista);
        area = unCubo.calcularArea();
        volumen = unCubo.calcularVolumen();
        IO.show("El área del cubo es: "+area+" y el volumen es: "+volumen);
    }

    private void gestionarTetraedroRegular(){
        double arista, area, volumen;
        arista = IO.readDouble("Por favor digite la arista del tetraedro regular:");
        unTetraedro.asignarArista(arista);
        area = unTetraedro.calcularArea();
        volumen = unTetraedro.calcularVolumen();
        IO.show("El área del tetraedro regular es: "+area+" y el volumen es: "+volumen);
    }

    private void mostrarDespedida(){
        IO.show("Gracias por utilizar nuestro programa!\nHasta Pronto!");
    }

    public void gestionar(){
        mostrarBienvenida();
        interactuarConUsuario();
        mostrarDespedida();
    }
}
