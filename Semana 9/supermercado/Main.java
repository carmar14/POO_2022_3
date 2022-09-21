package supermercado;
public class Main {
    public static void main(String args[]){
        Bebida b;
        Juego j;

        b = new Bebida();
        b.asignarNombre("Leche");
        b.asignarMarca("Colanta");
        b.asignarFechaVencimiento("2011-03-20");
        
        j = new Juego("Parqués","Mattel",7);

        ES.mostrar(b);
        ES.mostrar(j);

        b.venderACliente(150);
        j.comprarAProveedor(230);
        j.comprarAProveedor(180);

        ES.mostrar("El supermercado hace algunas transacciones compras y ventas ...");

        ES.mostrar(b);
        ES.mostrar(j);
    }
}
