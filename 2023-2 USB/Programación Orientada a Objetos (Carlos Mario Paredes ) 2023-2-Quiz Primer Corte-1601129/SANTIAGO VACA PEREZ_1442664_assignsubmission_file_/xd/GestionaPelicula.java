
package quiz_1;

public class GestionaPelicula {
    
    String ge1,ge2;
    double va1,va2;
 public void gestionarP1(){
        String nom,dir,gen;
        int dur,año;
        double calif;
        
       nom = IO.obtenerEntrada("Ingrese el nombre de la pelicula #1");
       dir = IO.obtenerEntrada("Ingrese el nombre del director");
       gen = IO.obtenerEntrada("Ingrese el genero");
       dur = IO.obtenerEntero("Ingrese la duracion de la pelicula en minutos");
       año = IO.obtenerEntero("Ingrese el año en que se estreno la pelicula");
       calif = IO.obtenerDecimal("Ingrese la calificacion en decimales que tiene la pelicula");
       
       ge1= gen;
       va1 = calif;
       
       Pelicula p1 = new Pelicula(nom,dir,gen,dur,año,calif);
       
       p1.imprimirAtributos();
       IO.mostrarMensaje("Epicidad de la pelicula: "+ p1.calificarEpicidad());
       IO.mostrarMensaje("Valoracion de la pelicula: "+ p1.calcularValoracion());
       
 }
 
 
     public void gestionarP2(){
         String nom,dir,gen;
        int dur,año;
        double calif;
        
       nom = IO.obtenerEntrada("Ingrese el nombre de la pelicula #2");
       dir = IO.obtenerEntrada("Ingrese el nombre del director");
       gen = IO.obtenerEntrada("Ingrese el genero");
       dur = IO.obtenerEntero("Ingrese la duracion de la pelicula en minutos");
       año = IO.obtenerEntero("Ingrese el año en que se estreno la pelicula");
       calif = IO.obtenerDecimal("Ingrese la calificacion en decimales que tiene la pelicula");
       
       ge2= gen;
       va2 = calif;
       
       Pelicula p2 = new Pelicula(nom,dir,gen,dur,año,calif);
       
        p2.imprimirAtributos();
       IO.mostrarMensaje("Epicidad de la pelicula: "+ p2.calificarEpicidad());
       IO.mostrarMensaje("Valoracion de la pelicula: "+ p2.calcularValoracion());
       
       
       
     }
     

     
 
  public void gestionar(){
      gestionarP1();
      gestionarP2();
 
  }
    
}
