package serializable;
import java.io.*;
public class LeeArchivoCoches
{
    public static void main (String [] args)
    {
        try{
            FileInputStream entArch = new FileInputStream ("coches.dat");
            ObjectInputStream entStream = new ObjectInputStream (entArch);

            Coche c1 = (Coche) entStream.readObject ();
            c1.escribir();
            Coche c2 = (Coche) entStream.readObject ();
            c2.escribir();
        }catch(Exception e){
            System.out.println("No pueden leerse los objetos de disco");
	}
    }
}