package primobj3;
import javax.swing.JOptionPane;
public class ManejaEsfera {
    Esfera e;

    ManejaEsfera(){
        e = new Esfera();
    }

    void mostrarBienvenida(){
        JOptionPane.showMessageDialog(null, "Bienvenido!\n"
                + "Programa que Gestiona Área y Volumen de una Esfera");
    }

    int mostrarMenuYLeerOpcion(){
        int o;
        String menu = "Menú de Opciones\n"
                + "1. Especificar radio de la Esfera\n"
                + "2. Calcular y mostrar Área\n"
                + "3. Calcular y mostrar Volumen\n"
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
                leerRadio();
            break;
            case 2:
                gestionarArea();
            break;
            case 3:
                gestionarVolumen();
            break;
            case 4:
                JOptionPane.showMessageDialog(null, "El programa terminará");
            break;
            default:
                JOptionPane.showMessageDialog(null,
                        "Ha presionado una opción no valida, por favor inténtelo de nuevo");
        }
    }

    void leerRadio(){
        double radio;
        radio = Double.parseDouble(
                    JOptionPane.showInputDialog("Por favor digite el radio de la esfera:"));
        e.asignarRadio(radio);
    }

    void gestionarArea(){
        double area;
        area = e.calcularArea();
        JOptionPane.showMessageDialog(null, "El área de la esfera es: "+area);
    }

    void gestionarVolumen(){
        double volumen;
        volumen = e.calcularVolumen();
        JOptionPane.showMessageDialog(null, "El volumen de la esfera es: "+volumen);
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
