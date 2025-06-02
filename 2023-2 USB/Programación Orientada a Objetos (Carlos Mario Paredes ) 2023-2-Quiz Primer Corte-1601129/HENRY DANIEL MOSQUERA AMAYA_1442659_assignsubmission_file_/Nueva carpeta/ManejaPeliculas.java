/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peliculas;

import javax.swing.JOptionPane; //fue importada antes de crear la clase IO

/**
 *
 * @author salas
 */   
public class ManejaPeliculas {
    private  Pelicula peliculaUno;
    private  Pelicula peliculaDos;
    

    public ManejaPeliculas() {
        this.peliculaUno  = new Pelicula();
        this.peliculaDos  = new Pelicula();
    }
    
public void mostrarBienvenida(){
    IO_P.show("Bienvenido!\n"
                + "Programa que Gestiona peliculas");
        //JOptionPane.showMessageDialog(null, "Bienvenido!\n"
                //+ "Programa que Gestiona Viviendas");
    }
int mostrarMenuYLeerOpcion(){
        int o;
        String menu = "Menú de Opciones\n"
                + "1. Gestionar información de pelicula1 \n"
                + "2. Gestionar información de pelicula 2\n"
                + "4. Salir\n"
                + "Por favor digite la opción que desea:";
        o = IO_P.readInt(menu);
        //o = Integer.parseInt(JOptionPane.showInputDialog(menu));
        return o;
    }    

 public void interactuarConUsuario(){
        int opcion;
        do{
            opcion = mostrarMenuYLeerOpcion();
            ejecutarOpcion(opcion);
        }while(opcion!=4);//
    }
 
 
public void ejecutarOpcion(int opc){
        switch(opc){
            case 1:
                submenu(peliculaUno);
        break;   
            case 2:
                submenu(peliculaDos);
            break;
            
            case 4:
                 IO_P.show("El programa terminará");
                //JOptionPane.showMessageDialog(null, "El programa terminará");
            break;
            default:
                 IO_P.show("El programa terminará");
                //JOptionPane.showMessageDialog(null,
                        //"Ha presionado una opción no valida, por favor inténtelo de nuevo");
        }
    }


public void gestionarNombre(Pelicula n){
    String nombre;
    nombre = IO_P.readString("Por favor digite el nombre: ");
    IO_P.show( "Dato guardado con Exito!\n"); 
    n.setNombre(nombre);
                 
}
public void gestionarDirector(Pelicula d){
    String director;
    director = IO_P.readString("Por favor digite el nombre del director: ");
    IO_P.show( "Dato guardado con Exito!\n"); 
    d.setDirector(director);
}
public void gestionarGenero(Pelicula s){
    String genero;
    genero = IO_P.readString("Por favor el género de la pelicula: ");
s.setGenero(genero);
}
public void gestionarDuracion(Pelicula e){
    int duracion;
    duracion = IO_P.readInt("Por favor la duración de la pelicula: ");
IO_P.show( "Dato guardado con Exito!\n");
e.setDuracion(duracion);

}
public void gestionaraño(Pelicula a){
    int año;
    año = IO_P.readInt("Por favor el año de la pelicula: ");
IO_P.show( "Dato guardado con Exito!\n");
a.setAño(año);

}
public void gestionarClasificacion(Pelicula a){
    int clasificacion;
    clasificacion = IO_P.readInt("Por favor la clasificación de la pelicula: ");
IO_P.show( "Dato guardado con Exito!\n");
a.calcularValoracion(clasificacion);
a.setCalificacion(clasificacion);
}
  

void gestionarInformacionDeLaPelicula(Pelicula w){
    JOptionPane.showMessageDialog(null,w.InformacionDeLaPelicula(),
            "Gracias por utilizar nuestro programa!\n",JOptionPane.INFORMATION_MESSAGE);
}


public void submenu(Pelicula h){
int o;
                do{
                
        String menu = "Menú de Opciones\n"
                + "1. Modificar el Nombre \n"
                + "2. Modificar el Director\n"
                + "3. Modificar el género\n"
                + "4. Modificar la duración\n"
                + "5. Modificar el año\n"
                + "6. Indicar la clasificación\n"
                + "7. Mostrar información de la pelicula \n"
                + "8. Comparar las peliculas \n"
                + "9. Volver al Menú Principal";
        o = IO_P.readInt(menu);
                switch(o){
            case 1:
                gestionarNombre(h);
            break;
            case 2:
               gestionarDirector(h);
            break;
            case 3:
                gestionarGenero(h);
            break;
            case 4:
               gestionarDuracion(h);
            break;
            case 5:
                gestionaraño(h);
            break;
            case 6:
                gestionarClasificacion(h);
            break;
            case 7:
                gestionarInformacionDeLaPelicula(h);
            break;
            case 8:
                peliculaUno.compararPeliculas(peliculaDos);
            break;
            case 9:
                 IO_P.show("volviendo al menú principal");
                //JOptionPane.showMessageDialog(null, "El programa terminará");
            break;
            default:
                IO_P.show("Ha presionado una opción no valida, por favor inténtelo de nuevo");
                //JOptionPane.showMessageDialog(null,
                        //"Ha presionado una opción no valida, por favor inténtelo de nuevo");
        }
                
            }while(o!=8);
}


public void mostrarDespedida(){
        IO_P.show( "Gracias por utilizar nuestro programa!\n"
                + "Hasta Pronto!");
    }
       
public void gestionar(){
        mostrarBienvenida();
        //while(true){
            interactuarConUsuario();
       // }
        //mostrarDespedida();
    }
 
    }

 
