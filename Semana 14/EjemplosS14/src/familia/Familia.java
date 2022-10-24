package familia;

public class Familia {
    private Persona integrantes[];

    public Familia(){}

    private void preguntarCantidadIngegrantes(){
        int ci = ES.leerEntero("Digite la cantidad de integrantes de su familia");
        
        integrantes = new Persona[ci];

        for(int i=0;i<integrantes.length;i++){
            integrantes[i] = new Persona();
        }
    }

    private void leerDatosIntegrantes(){
        for(int i=0;i<integrantes.length;i++){
            String nom = ES.leerCadena("Por favor digite el nombre del integrante "+(i+1));
            int edad = ES.leerEntero("Por favor digite la edad de "+nom);

            integrantes[i].setNombre(nom);
            integrantes[i].setEdad(edad);
        }
    }

    private Persona obtenerPersonaMayor(){
        Persona viejito = integrantes[0];

        for(int i=1;i<integrantes.length;i++){
            if(integrantes[i].getEdad() > viejito.getEdad()){
                viejito = integrantes[i];
            }
        }
        return viejito;
    }

    private void mostrarFamilia(){
        String msg = "Familia:";
        for(Persona familiar:integrantes){
            msg += "\n*************************";
            msg += "\nNombre: "+familiar.getNombre();
            msg += "\nEdad: "+familiar.getEdad();
            msg += "\n*************************";
        }
        ES.mostrar(msg);
    }

    public void gestionar(){
        preguntarCantidadIngegrantes();
        leerDatosIntegrantes();
        Persona mayor = obtenerPersonaMayor();
        mostrarFamilia();
        ES.mostrar("La persona de mayor edad es:\n"+mayor.toString());
    }
}
