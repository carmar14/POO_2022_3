package supermercado;
public class Producto {
    protected String nombre; //El nombre específico del producto
    protected String marca;  //Todo producto tiene una marca (empresa que lo produce)
    protected int cantidad;  //Cantidad en bodega

    public Producto(){
        nombre   = "";
        marca    = "";
        cantidad = 0;
    }

    public Producto(String n,String m){
        nombre   = n;
        marca    = m;
        cantidad = 0;
    }

    public void asignarNombre(String n){
        nombre = n;
    }

    public void asignarMarca(String m){
        marca = m;
    }

    public void asignarCantidad(int c){
        cantidad = c;
    }

    public String obtenerNombre(){
        return nombre;
    }

    public String obtenerMarca(){
        return marca;
    }

    public int obtenerCantidad(){
        return cantidad;
    }

    public void comprarAProveedor(int cantidad_compra){
        cantidad += cantidad_compra;
    }

    public void venderACliente(int cantidad_venta){
        cantidad -= cantidad_venta;
    }

    @Override
    public String toString(){
        String msg;

        msg = "Nombre:"+nombre+"\n"+
              "Marca:"+marca+"\n"+
              "Cantidad:"+cantidad;

        return msg;
    }
}
