package programasiniciales;
import javax.swing.JOptionPane;
public class FraseDelDia1 {

    public static void main(String args[]){
       String frase = "";
       int nro_frase = 0;

       JOptionPane.showMessageDialog(null,
                "Programa que muestra una frase aleatoriamente.\n" +
                "Desarrollado para el curso Informática 2.\n");


        nro_frase = (int)Math.round(Math.random()*4)+1;

        switch(nro_frase){
            case 1:
                frase = "El sabio no dice todo lo que piensa,\n" +
                        "pero siempre piensa todo lo que dice.\n" +
                        "                        - Aristóteles";
            break;
            case 2:
                frase = "Nunca consideres el estudio como una obligación,\n" +
                        "sino como una oportunidad para penetrar en el bello\n" +
                        "y maravilloso mundo del saber.\n" +
                        "                                  - Einstein";
            break;
            case 3:
                frase = "Lo que me preocupa no es que me hayas mentido, sino\n" +
                        "que, de ahora en adelante, ya no podré creer en ti.\n" +
                        "                                  - Nietzsche";
            break;
            case 4:
                frase = "La ociosidad camina con lentitud, por eso todos\n" +
                        "los vicios la alcanzan.\n" +
                        "                                  - San Agustín";
            break;
            case 5:
                frase = "Si ya sabes lo que tienes que hacer y no lo haces\n" +
                        "entonces estás peor que antes.\n" +
                        "                                  - Confucio";
            break;
        }

       JOptionPane.showMessageDialog(null, frase);

       JOptionPane.showMessageDialog(null,
                "Muchas gracias por utilizar este programa.\n" +
                "Hasta luego!\n");
    }
}
