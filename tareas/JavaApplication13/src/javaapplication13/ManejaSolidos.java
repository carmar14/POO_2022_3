import javax.swing.JOptionPane;

public class ManejaSolidos {

    private Esfera unaEsfera;
    private Cubo unCubo;
    private TetraedroRegular unTetraedroRegular;

    public ManejaSolidos(){
        unaEsfera = new Esfera();

        unCubo = new Cubo();

        unTetraedroRegular = new TetraedroRegular();

    }
    public void gestionar(){
        mostrarBienvenida();
        interactuarConUsuario();
        mostrarDespedida();
    }
    public String solidosToString(){
        return unaEsfera.esferaToSring()+ "\n" + unCubo.cuboToSring()+ "\n" + unTetraedroRegular.tetraedroToSring();
    }

    private void mostrarBienvenida(){
        JOptionPane.showMessageDialog(null,"¡Bienvenido!\n"+
                "Este es el programa de manejo de sólidos");
    }
    private void mostrarDespedida(){
        JOptionPane.showMessageDialog(null,"¡Has salido del programa!");

    }
    private int mostrarMenuYLeerOpcion(){
        int opc;
   
        JOptionPane.showMessageDialog(null,"1: Gestionar un Cubo \n"+
                "2: Gestionar una Esfera \n"+
                "3: Gestionar un Tetrahedro regular \n"+
                "4: Salir del programa");

        opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecciona una opción"));
        return opc;
    }
    private void realizarOperacion(int opc){
        switch(opc){
            case 1: 
                gestionarCubo(); 
                break;
            case 2: 
                gestionarEsfera();
                break;
            case 3: 
                gestionarTR();
                break;
            case 4: 
                JOptionPane.showMessageDialog(null,"Saldrás del programa");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Por favor ingresa una opción válida");
                
        }
    }

    private void gestionarEsfera(){
        double r = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa un valor para el radio de la Esfera"));
        unaEsfera.setRadio(r);
        
        JOptionPane.showMessageDialog(null,"El area de la esfera es: " + unaEsfera.calcularArea() + "\n y su volumen es de: " + unaEsfera.calcularVolumen());

    }
    private void gestionarCubo(){
        double a = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa un valor para la arista del Cubo"));
        unCubo.setArista(a);
        JOptionPane.showMessageDialog(null,"El area del cubo es: " + unCubo.calcularArea() + "\n y su volumen es de: " + unCubo.calcularVolumen());
        
    }
    private void gestionarTR(){
        double a = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa un valor para la arista del Tetraedro Regular"));
        unTetraedroRegular.setArista(a);
        JOptionPane.showMessageDialog(null,"El area del tetrahedro regular es: " + unTetraedroRegular.calcularArea() + "\n y su volumen es de: " + unTetraedroRegular.calcularVolumen());
        
    }
    private void interactuarConUsuario(){

        int opc;
        do{
            opc = mostrarMenuYLeerOpcion();
            realizarOperacion(opc);
        }
        while(opc !=4);
    }

}