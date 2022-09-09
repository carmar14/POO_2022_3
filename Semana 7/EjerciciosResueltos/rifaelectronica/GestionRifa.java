package rifaelectronica;
public class GestionRifa {
    private String[] nombres;

    public void gestionar(){
        leerNroMaximoRifa();
        leerParticipantes();
        mostrarSuspenso();
        int nro_ganador = calcularNroGanador();
        mostrarGanador(nro_ganador);
    }

    private void leerNroMaximoRifa(){
        int n;
        n = ES.leerEntero("Por favor digite el número máximo posible en la rifa");
        nombres = new String[n+1];
    }

    private void leerParticipantes(){
        for(int i=0;i<nombres.length;i++){
            nombres[i] = ES.leerCadena("Por favor digite el nombre de la persona que registró el número "+i);
        }
    }

    private void mostrarSuspenso(){
        ES.mostrar("Taran taran ... redoble de tambores ...\nA continuación se efectuará la rifa!");
    }

    private int calcularNroGanador(){
        double n_gan;
        int num_gan;
        n_gan   = Math.random()*nombres.length;
        num_gan = (int)Math.round(n_gan);
        return num_gan;
    }

    private void mostrarGanador(int ganador){
        ES.mostrar("El número ganador de la rifa es "+ganador+" y le corresponde a "+nombres[ganador]);
    }
}
