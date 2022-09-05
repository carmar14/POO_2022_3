package Viviendas;
import static Viviendas.Submenu1.submenu;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;


public class Submenu2 {
    private V1 vivienda1;
    private V2 vivienda2;
    private V3 vivienda3;
    
    Submenu2(){
        V1 v1 = new V1();
        V2 v2 = new V2();
        V3 v3 = new V3();
    }
    
    public static int submenu(){
            int o2;
            String menu = "Menú de Opciones\n"
                    + "1. Modificar el nombre del propietario\n"
                    + "2. Modificar la dirección de la vivienda\n"
                    + "3. Modificar estrato\n"
                    + "4. Modificar área en Mts Cuadrados\n"
                    + "5. Indicar si la vivienda cuenta con servicios públicos"
                    + "6. Indicar si la calle de enfrente está pavimentada"
                    + "7. Mostrar información de la vivienda"
                    + "8. Volver al menú principal"
                    + "Por favor digite la opción que desea:";
            o2 = Integer.parseInt(JOptionPane.showInputDialog(menu));
            return o2;
    }
    
    static void interactuarU2(){
        int opcion2;
        do{
            opcion2 = submenu();
            realizarO2(opcion2);
        }while(opcion2!=8);
    }
    
    static void realizarO2(int opc2){
        
        V2 v2 = new V2();
        
        switch(opc2){
            case 1:
                modificarNombre();
            break;
            case 2:
                modificarDireccion();
            break;
            case 3:
                modificarEstrato();
            break;
            case 4:
                modificarArea();
            break;
            case 5:
                v2.indicarServicios();
            break;
            case 6:
                v2.indicarCalleP();
            break;
            case 7:
                v2.desplegarEstado();
            case 8:
                MenuPrincipal.menuPrincipal();
            break;
            default:
                JOptionPane.showMessageDialog(null, "Opción incorrecta, intente de nuevo");
        }
    }
    
    
    
    public static void modificarNombre(){
        V2 v2 = new V2();
        String nombreP;
        nombreP = JOptionPane.showInputDialog("Por favor digite el nombre del propietario:");
        v2.setNombreP(nombreP);
        JOptionPane.showMessageDialog(null, "El nombre del propietario es: "+nombreP);
        submenu();
    }
    
    public static void modificarDireccion(){
        V2 v2 = new V2();
        String direccion;
        direccion = JOptionPane.showInputDialog("Por favor digite la direccion de la vivienda:");
        v2.setDireccion(direccion);
        JOptionPane.showMessageDialog(null, "La dirección de la vivienda es: "+direccion);
        submenu();
    }
    
    public static void modificarEstrato(){
        V2 v2 = new V2();
        int estrato;
        estrato = parseInt(JOptionPane.showInputDialog("Por favor digite el estrato de la vivienda:"));
        v2.setEstrato(estrato);
        JOptionPane.showMessageDialog(null, "El estrato de la vivienda es: "+estrato);
        submenu();
    }
    
    public static void modificarArea(){
        V2 v2 = new V2();
        double area;
        area = Double.parseDouble(JOptionPane.showInputDialog("Por favor digite el área de la vivienda en Mts Cuadrados:"));
        v2.setArea(area);
        JOptionPane.showMessageDialog(null, "El área de la vivienda es: "+area);
        submenu();
    }

}    
