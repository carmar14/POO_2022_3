package solidos;
import javax.swing.JOptionPane;
public class ManejaSolidos {
    private Esfera unaEsfera;
    private Cubo   unCubo;
    private TetraedroRegular unTetraedro;

    ManejaSolidos(){
        unaEsfera   = new Esfera();
        unCubo      = new Cubo();
        unTetraedro = new TetraedroRegular();
    }

    private void mostrarBienvenida(){
        JOptionPane.showMessageDialog(null, "Bienvenido!\n"
                + "Programa que Gestiona Área y Volumen de diversos sólidos");
    }

    int mostrarMenuYLeerOpcion(){
        int o;
        String menu = "Menú de Opciones\n"
                + "1. Calcular dimensiones de una Esfera\n"
                + "2. Calcular dimensiones de un Cubo\n"
                + "3. Calcular dimensiones de un Tetraedro Regular\n"
                + "4. Salir\n"
                + "Por favor digite la opción que desea:";
        
        o = Integer.parseInt(JOptionPane.showInputDialog(menu));
        return o;
    }

    void interactuarConUsuario(){
        int opcion;
        do{
            opcion = mostrarMenuYLeerOpcion();
            realizarOperacion(opcion);
        }while(opcion!=4);
    }

    void realizarOperacion(int opc){
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
                JOptionPane.showMessageDialog(null, "El programa terminará");
            break;
            default:
                JOptionPane.showMessageDialog(null,
                        "Ha presionado una opción no valida, por favor inténtelo de nuevo");
        }
    }

    void gestionarEsfera(){
        double radio, area, volumen;
        radio = Double.parseDouble(
                    JOptionPane.showInputDialog("Por favor digite el radio de la esfera:"));
        unaEsfera.asignarRadio(radio);
        area = unaEsfera.calcularArea();
        volumen = unaEsfera.calcularVolumen();
        JOptionPane.showMessageDialog(null, "El área de la esfera es: "+area+" y el volumen es: "+volumen);
    }

    void gestionarCubo(){
        double arista, area, volumen;
        arista = Double.parseDouble(
                    JOptionPane.showInputDialog("Por favor digite la arista del cubo:"));
        unCubo.asignarArista(arista);
        area = unCubo.calcularArea();
        volumen = unCubo.calcularVolumen();
        JOptionPane.showMessageDialog(null, "El área del cubo es: "+area+" y el volumen es: "+volumen);
    }

    void gestionarTetraedroRegular(){
        double arista, area, volumen;
        arista = Double.parseDouble(
                    JOptionPane.showInputDialog("Por favor digite la arista del tetraedro regular:"));
        unTetraedro.asignarArista(arista);
        area = unTetraedro.calcularArea();
        volumen = unTetraedro.calcularVolumen();
        JOptionPane.showMessageDialog(null, "El área del tetraedro regular es: "+area+" y el volumen es: "+volumen);
    }

    void mostrarDespedida(){
        JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestro programa!\n"
                + "Hasta Pronto!");
    }

    void gestionar(){
        mostrarBienvenida();
        interactuarConUsuario();
        mostrarDespedida();
    }
}
