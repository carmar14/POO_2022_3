package supermercado;
public class Bebida extends Producto{
    private String fechaVencimiento;//fecha de la forma AAAA-MM-DD

    public Bebida(){
        fechaVencimiento="";
        cantidad = 500;
    }

    public void asignarFechaVencimiento(String fv){
        fechaVencimiento = fv;
    }

    public String obtenerFechaVencimiento(){
        return fechaVencimiento;
    }

    public boolean estaVencida(String fechaReferencia){
        if(fechaVencimiento.compareTo(fechaReferencia)>0){
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        String msg;

        msg  = super.toString();
        msg += "\n"+"Fecha Vencimiento:"+fechaVencimiento;

        return msg;
    }
}
