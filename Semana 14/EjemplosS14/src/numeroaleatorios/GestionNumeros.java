package numeroaleatorios;
import java.awt.event.*;
public class GestionNumeros implements ActionListener{
    private VentanaNumeros vn;
    private int numeros[];

    public GestionNumeros(VentanaNumeros ventana){
        vn = ventana;
    }

    public void actionPerformed(ActionEvent e){
        String comando = e.getActionCommand();
        if(comando.equals("generar")){
            generarNrosAleatorios();
        }
        if(comando.equals("ordenar")){
            ordenarNumeros();
        }
        if(comando.equals("buscar")){
            buscarNumero();
        }
    }

    private void generarNrosAleatorios(){
        int cn = vn.obtenerCantidadNumeros();
        numeros = new int[cn];

        for(int i=0;i<numeros.length;i++){
            numeros[i] = 1+(int)(Math.random()*98);
        }

        vn.asignarSalidaNumeros(numeros);
    }
    
    private void ordenarNumeros(){
        ordenar(numeros);
        vn.asignarSalidaNumeros(numeros);
    }

    private void buscarNumero(){
        int nb = vn.obtenerNumeroBuscado();
        int resultado = buscar(nb);
        String msg = "";
        if(resultado<0){
            msg = "El número buscado ("+nb+"), NO se encuentra entre los generados.";
        }else{
            msg = "El número "+nb+" SI está entre los números generados y en la posición "+(resultado+1);
        }
        vn.mostrarResultadoBusqueda(msg);
    }

    private void ordenar(int nums[]){
        boolean ordenado;
        do{
            ordenado = true;
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]>nums[i+1]){
                    int temp  = nums[i];
                    nums[i]   = nums[i+1];
                    nums[i+1] = temp;
                    ordenado    = false;
                }
            }
        }while(!ordenado);
    }
    
    private int buscar(int nb){
        int posicion = -1;
        for(int i=0;i<numeros.length;i++){
            if(nb==numeros[i]){
                posicion = i;
            }
        }
        return posicion;
    }


}
