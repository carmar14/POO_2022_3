package encuestacalidad;
public class Cliente {
    private String nombre;
    private int atencion_venta;
    private int calidad_producto;
    private int soporte_postventa;
    
    public Cliente(){
        nombre            = "";
        atencion_venta    = 0;
        calidad_producto  = 0;
        soporte_postventa = 0;
    }
    
    public void asignarNombre(String n){ nombre=n;}
    public void asignarAtencionVenta(int av){ atencion_venta=av;}
    public void asignarCalidadProducto(int cp){ calidad_producto=cp;}
    public void asignarSoportePostVenta(int sp){ soporte_postventa=sp;}
    
    public String obtenerNombre(){ return nombre;}
    public int obtenerAtencionVenta(){ return atencion_venta;}
    public int obtenerCalidadProducto(){ return calidad_producto;}
    public int obtenerSoportePostVenta(){ return soporte_postventa;}
    
    public double promediarCalificacion(){
        double promedio;
        promedio = (atencion_venta+calidad_producto+soporte_postventa)/3;
        return promedio;
    }
}
