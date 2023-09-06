package pelicula;

public class GestionaPelicula {
   
    Pelicula pelicula1 = new Pelicula();
    Pelicula pelicula2 = new Pelicula();
    
    
    public void Informacion(){
     IO.mostrar("por favor digite la informacion de la pelicula 1");
     pelicula1.setNombre(IO.leerString("coloque el nombre:")); 
     pelicula1.setDirector(IO.leerString("coloque el director:"));
     pelicula1.setGenero(IO.leerString("coloque el genero:"));
     pelicula1.setDuracion(IO.leerEnt("coloque la duracion en minutos"));
     pelicula1.setAño(IO.leerEnt("coloque el año"));
     pelicula1.setCalificacion(IO.leerDou("coloque la calificacion"));
     IO.mostrar("ahora de la pelicula 2");
     pelicula2.setNombre(IO.leerString("coloque el nombre:")); 
     pelicula2.setDirector(IO.leerString("coloque el director:"));
     pelicula2.setGenero(IO.leerString("coloque el genero:"));
     pelicula2.setDuracion(IO.leerEnt("coloque la duracion en minutos"));
     pelicula2.setAño(IO.leerEnt("coloque el año"));
     pelicula2.setCalificacion(IO.leerDou("coloque la calificacion"));
    }
    
    
    
}
