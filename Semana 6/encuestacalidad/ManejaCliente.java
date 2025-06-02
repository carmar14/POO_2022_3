package encuestacalidad;
public class ManejaCliente {
    private Cliente cli1;
    private Cliente cli2;
    
    public ManejaCliente(){
        cli1 = new Cliente();
        cli2 = new Cliente();
    }
    
    private void leerClientes(){
        String nom;
        int atven, calprod, soposven;
        
        nom      = IO.readString("Por favor digite el nombre del cliente 1:");
        atven    = IO.readInt("Cliente 1. Califique de 0 a 5 la atención durante la venta:");
        calprod  = IO.readInt("Cliente 1. Califique de 0 a 5 la calidad del producto recibido:");
        soposven = IO.readInt("Cliente 1. Califique de 0 a 5 el soporte post venta:");
        
        cli1.asignarNombre(nom);
        cli1.asignarAtencionVenta(atven);
        cli1.asignarCalidadProducto(calprod);
        cli1.asignarSoportePostVenta(soposven);

        nom      = IO.readString("Por favor digite el nombre del cliente 2:");
        atven    = IO.readInt("Cliente 2. Califique de 0 a 5 la atención durante la venta:");
        calprod  = IO.readInt("Cliente 2. Califique de 0 a 5 la calidad del producto recibido:");
        soposven = IO.readInt("Cliente 2. Califique de 0 a 5 el soporte post venta:");
        
        cli2.asignarNombre(nom);
        cli2.asignarAtencionVenta(atven);
        cli2.asignarCalidadProducto(calprod);
        cli2.asignarSoportePostVenta(soposven);
    }
    
    private void calcularYMostrarInformacion(){
        double prom1, prom2;
        
        prom1 = cli1.promediarCalificacion();
        prom2 = cli2.promediarCalificacion();
        
        String peor_promedio = "El peor promedio lo registró: ";
        if(prom1>prom2)
            peor_promedio += cli2.obtenerNombre();
        else
            if(prom2>prom1)
                peor_promedio += cli1.obtenerNombre();
            else
                peor_promedio = "Los dos clientes registraron igual promedio";
        
        IO.show("El cliente "+cli1.obtenerNombre()+" registró un promedio de "+prom1
               +"\n y el cliente "+cli2.obtenerNombre()+" registró un promedio de "+prom2
               +".\n"+peor_promedio+".");
    }
    
    public void gestionar(){
        leerClientes();
        calcularYMostrarInformacion();
    }
}
