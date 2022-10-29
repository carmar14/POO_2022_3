package serializable;
import java.io.*;
public class EscribeArchivoCoches
{
    public static void main (String [] args)
    {
        Coche c1 = new Coche ("Pedro", "Chevrolet", 1999);
        Coche c2 = new Coche ("Luisa", "Hyundai", 2004);

        try{
            FileOutputStream salArch = new FileOutputStream ("src/serializable/coches.dat");
            ObjectOutputStream salStream = new ObjectOutputStream (salArch);

            salStream.writeObject (c1);
            salStream.writeObject (c2);
        }catch(Exception e){
            System.out.println("No pueden escribirse en disco los objetos");
	}
    }
}