package supermercado;
public class Juego extends Producto{
    private int edadMinima;

    public Juego(String n,String m,int em){
        super(n,m);
        edadMinima = em;
    }

    public void asignarEdadMinima(int em){
        edadMinima = em;
    }

    public int obtenerEdadMinima(){
        return edadMinima;
    }

    public boolean edadApta(int e){
        if(e>=edadMinima){
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        String msg;

        msg  = super.toString();
        msg += "\n"+"Edad Mínima:"+edadMinima;

        return msg;
    }
}
