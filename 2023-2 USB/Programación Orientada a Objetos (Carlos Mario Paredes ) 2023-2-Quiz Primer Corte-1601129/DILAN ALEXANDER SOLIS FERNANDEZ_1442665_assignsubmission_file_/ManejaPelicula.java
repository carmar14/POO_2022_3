/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pelis;

import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author dylan
 */
public class ManejaPelicula {
    
    private Pelicula peliculaUno;
    private Pelicula peliculaDos;
    
    
    public ManejaPelicula(){
        
        this.peliculaUno = new Pelicula ();
        this.peliculaDos = new Pelicula ();
        
    }
    
    public void mostrarBienvenida(){
    IO.show("Bienvenido!\n"
                + "Programa que Gestiona Películas");
    
}
    
  int mostrarMenuYLeerOpcion(){
        int o;
        String menu = "Menú de Opciones\n"
                + "1. Gestionar información de Pelicula 1 \n"
                + "2. Gestionar información de Pelicula 2\n"
                + "3. Salir\n"
                + "Por favor digite la opción que desea:";
        o = IO.readInt(menu);
        //o = Integer.parseInt(JOptionPane.showInputDialog(menu));
        return o;
    }    
    
   public void interactuarConUsuario(){
        int opcion;
        do{
            opcion = mostrarMenuYLeerOpcion();
            ejecutarOpcion(opcion);
        }while(opcion!=3);//
    }
   
   public void ejecutarOpcion(int opc){
        switch(opc){
            case 1:
                submenu(peliculaUno);
        break;   
            case 2:
                submenu(peliculaDos);
            break;
            
            case 3:
                 IO.show("El programa terminará");
                //JOptionPane.showMessageDialog(null, "El programa terminará");
            break;
            default:
                 IO.show("El programa terminará");
                //JOptionPane.showMessageDialog(null,
                        //"Ha presionado una opción no valida, por favor inténtelo de nuevo");
        }
    }

 public void gestionarNombrePelicula(Pelicula n){
    String nombrePelicula;
    nombrePelicula = IO.readString("Por favor escriba el nombre de la película: ");
    IO.show( "Dato guardado con Exito!\n"); 
    n.setNombrePelicula(nombrePelicula);
                 
}
public void gestionarDirectorPelicula(Pelicula d){
    String director;
    director = IO.readString("Por favor escriba el nombre de el director: ");
    IO.show( "Dato guardado con Exito!\n"); 
    d.setDirectorPelicula(director);
}

public void gestionarGeneroPelicula(Pelicula g){
    String genero;
    genero = IO.readString("Por favor escriba el genero de la película: ");
IO.show( "Dato guardado con Exito!\n");
g.setGeneroPelicula(genero);

}

public void gestionarDuracionPelicula(Pelicula r){
    int duracion;
    duracion = IO.readInt("Por favor digite la duración de la película: ");
IO.show( "Dato guardado con Exito!\n");
    r.setDuracionPelicula(duracion);
    
   
}

public void gestionarAñoPelicula(Pelicula s){
    int añoPelicula;
    añoPelicula = IO.readInt("En qué año se hizo la película?: ");
s.setAñoPelicula(añoPelicula);    
}

public void gestionarCalificacionPelicula(Pelicula j){
    double calificacionPelicula;
    calificacionPelicula = IO.readDouble("Cuál es la calificación de la película? :");
j.setCalificacionPelicula(calificacionPelicula);    
}

public void gestionarCompararPeliculas(Pelicula k){



}

void gestionarInformacionDeLaPelicula(Pelicula w){
    JOptionPane.showMessageDialog(null,w.informacionDeLaPelicula(),
            "Gracias por utilizar nuestro programa!\n",JOptionPane.INFORMATION_MESSAGE);
}
   
   
   
   
   
   
   public void submenu(Pelicula a){
int o;
                do{
                
        String menu = "Menú de Opciones\n"
                + "1. Modificar el Nombre de la pelicula \n"
                + "2. Modificar el Nombre de el Director\n"
                + "3. Modificar el Género de la película (Acción, Comedia, Drama, Suspenso)\n"
                + "4. Modificar la Duración de la película (Segundos) \n"
                + "5. Modificar el año de la película\n"
                + "6. Modificar la calificación de la película\n"
                + "7. Mostrar Información de la Vivienda \n"
                + "8. Comparar películas \n"
                + "9. Volver al Menú Principal";
        o = IO.readInt(menu);
                switch(o){
            case 1:
                gestionarNombrePelicula(a);
            break;
            case 2:
                gestionarDirectorPelicula(a);
            break;
            case 3:
               // gestionarEstrato();
                gestionarGeneroPelicula(a);
            break;
            case 4:
                gestionarDuracionPelicula(a);
            break;
            case 5:
                gestionarAñoPelicula(a);
            break;
            case 6:
                gestionarCalificacionPelicula(a);
            break;
            case 7:
                gestionarInformacionDeLaPelicula(a);
            break;
            case 8:
                gestionarCompararPeliculas(a);
               
                break;
            case 9:
                 IO.show("volviendo al menú principal");
                //JOptionPane.showMessageDialog(null, "El programa terminará");
            break;
            default:
                IO.show("Ha presionado una opción no valida, por favor inténtelo de nuevo");
                //JOptionPane.showMessageDialog(null,
                        //"Ha presionado una opción no valida, por favor inténtelo de nuevo");
        }
                
            }while(o!=9);
}

   
   
   
   
   
   
   
   public void mostrarDespedida(){
        IO.show( "Gracias por utilizar nuestro programa!\n"
                + "Hasta Pronto!");
    }
       
public void gestionar(){
        mostrarBienvenida();
        //while(true){
            interactuarConUsuario();
   
    
}
}