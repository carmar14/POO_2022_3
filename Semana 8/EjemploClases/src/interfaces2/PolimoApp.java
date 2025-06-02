package interfaces2;
public class PolimoApp {
    public static void main(String[] args) {
        Gato mascota = new Gato();
        hazleHablar(mascota);

        RelojDePared reloj = new RelojDePared();
        hazleHablar(reloj);
    }

    public static void hazleHablar(Parlanchin sujeto){
        sujeto.hablar();
    }
}
