
package Parcial1;

public class Cine {
    
    public Pelicula peli1;
    public Pelicula peli2;
    public int opc;
    
    public void interactuarConUsuario(){   
    mostrarBienvenida();
    realizarOperacion();
 }

 private void realizarOperacion(){  
        
    int n=0;
    do {
        
        opc = mostrarMenuYLeerOpcion();
        IO.mostrarString(""+opc);
        switch(opc){
            case 1:
                gestionarInforPelicula1();
                break;
            case 2:
                gestionarInforPelicula2();
                break;
            case 3:
                
                break;
            case 4:
                IO.mostrarString("El programa terminado");
                n=1;
                break;
            default:
                IO.mostrarString("Ha presionado una opcion no valida, por favor intentelos de nuevo");                              
        }
    } while (n==0); 
}

 private void mostrarBienvenida(){
     IO.mostrarString("Bienvenido!");
 }
 
 private int mostrarMenuYLeerOpcion(){
     int o;
     String menu = "Menu de Opciones\n"
             + "1. Gestionar información de pelicula 1 \n"
             + "2. Gestionar información de pelicula 2 \n"
             + "3. Calcular valoracion de la pelicula \n"
             + "4. Definir epicidad de la pelicula \n"
             + "5. Mostrar inforacion de las pelicula \n"
             + "6. Salir.\n"
             + "Por favor digite la opción que desea: ";
     
     o = IO.leerEntero(menu);
    
     return o;
 }
 
 
 public void gestionarInforPelicula1(){
     
       String nom=IO.leerString("Digite el nombre de la pelicula 1 " );
       peli1.setNombre(nom);
       
       String dir=IO.leerString("Digite el director de la pelicula ");
       peli1.setDirector(dir);
       
       int genero=IO.leerEntero("Digite el genero de la pelicula\n" 
                        + " 1=Accion    2=Comedia   3=Drama   4=Suspenso");
               
       String p=peli1.difinirGenero(genero);
       peli1.setGenero(p);
       
       int dur=IO.leerEntero("Digite la duracion en minutos de la pelicula ");
       peli1.setDuracion(dur);
       
       int a=IO.leerEntero("Digite el añoñ de estreno de la pelicula ");
       peli1.setAño(a);
       
       double cal=IO.leerDouble("Digite la calificacion la pelicula ");
       String pe=peli1.calcularValoracion(cal);
       peli1.setCalificacion(pe);
 }
 
 public void gestionarInforPelicula2(){
     
       String nom=IO.leerString("Digite el nombre de la pelicula 1 " );
       peli2.setNombre(nom);
       
       String dir=IO.leerString("Digite el director de la pelicula ");
       peli2.setDirector(dir);
       
       int genero=IO.leerEntero("Digite el genero de la pelicula\n" 
                        + " 1=Accion    2=Comedia   3=Drama   4=Suspenso");
               
       String p=peli2.difinirGenero(genero);
       peli2.setGenero(p);
       
       int dur=IO.leerEntero("Digite la duracion en minutos de la pelicula ");
       peli2.setDuracion(dur);
       
       int a=IO.leerEntero("Digite el añoñ de estreno de la pelicula ");
       peli2.setAño(a);
       
       double cal=IO.leerDouble("Digite la calificacion la pelicula ");
       String pe=peli2.calcularValoracion(cal);
       peli2.setCalificacion(pe);
 }
}
