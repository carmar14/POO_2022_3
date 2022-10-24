package serializable;
import java.io.*;
public class Coche implements Serializable
{
    private String dueno;
    private String marca;
    private int modelo;

    public Coche ()
    {
        dueno = "Sin dueno";
        marca = "sin marca";
        modelo = 2003;
    }

    public Coche (String d, String m, int a)
    {
        dueno = d;
        marca = m;
        modelo = a;
    }

    public void escribir ()
    {
        System.out.println ("Dueño: " + dueno + "\nCoche: " + marca + " " + modelo);
    }
}