/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usacurso;

/**
 *
 * @author Acer
 */
public class Curso {
    private String nombreApellidoMax;
    private String nombreApellidoMin;
    private double calificacionMax;
    private double calificacionMin;
    private int cantGanan;
    private int cantPierden;
    private double promedioCurso;   
    private Estudiante[] est_;
    
    //-------------constructor-----------------
    /*
    public Curso(){
        estudiante = new Estudiante();
    }
    */
    
    public Curso(){
        nombreApellidoMax= "";
        nombreApellidoMin = "";
        calificacionMax = 0.0;
        calificacionMin = 5.0;
        cantGanan = 0;
        cantPierden = 0;
        promedioCurso = 0-0;
        
    
    }
    //-------------constructor-----------------    
    
    
    //-------------getter-----------------
    public String getNombreApellidoMax(){
          return nombreApellidoMax;
    }
    
    public String getNombreApellidoMin(){
          return nombreApellidoMin;
    }
    
    public double getCalificacionMax(){
          return calificacionMax;
    }
    
    public double getCalificacionMin(){
          return calificacionMin;
    }
    
    public int getCantGanan(){
          return cantGanan;
    }
    
    public int getCantPierden(){
          return cantPierden;
    }
    
    public double getPromedioCurso(){
          return promedioCurso;
    }
    //-------------getter-----------------
    
    //-------------setter-----------------
    public void setNombreApellidoMax(String nomapeMax){
          nombreApellidoMax = nomapeMax;
    }
    
    public void setNombreApellidoMin(String nomapeMin){
          nombreApellidoMin = nomapeMin;
    }
    
    public void setCalificacionMax(double calMax){
          calificacionMax = calMax;
    }
    
    public void setCalificacionMin(double calMin){
          calificacionMin = calMin;
    }
    
    public void setCantGanan(int qtGan){
          cantGanan = qtGan;
    }
    
    public void setCantPierden(int qtPier){
          cantPierden = qtPier;
    }
    
    public void setPromedioCurso(double promCurso){
          promedioCurso = promCurso;
    }
    //-------------setter-----------------
    
    public int definirCantEstu(){    
        int cantEstu=IO.readInt("Digite la cantidad de estudiantes del curso");
        return cantEstu;    
    }
    
    public void gestionarEstudiante(int nEst){
        int cod;
        double calif;
        char genero;
        String nombre;
        String apellido;
        est_ = new Estudiante[nEst];
        //Curso[] estudi = new Curso[nEst];
        //IO.show("LA CANTIDAD DE ESTUDIANTES SON: " + est[0].getCodigo());
        for (int i = 0; i< nEst; i++ ){
            Estudiante est;
            nombre = IO.readString("Digite el nombre del estudiante " + (i+1));
            apellido = IO.readString("Digite el apellido del estudiante " + (i+1));
            genero = IO.readChar("Digite el genero del estudiante "+ nombre + " " + apellido);
            cod = IO.readInt("Digite el codigo del estudiante "+ nombre + " " + apellido);
            calif = IO.readDouble("Digite la calificacion del estudiante "+ nombre + " " + apellido);
            est= new Estudiante(cod,calif,nombre,apellido,genero);
            
            est.setCodigo(cod);
            est.setCalificacion(calif);
            est.setNombre(nombre);
            est.setApellido(apellido);
            est.setGenero(genero);
            
            est_[i] = est;
        }
    
    }
    
    public void calcularNotaMax(int n_Est){
        double notaMax=0.0;
        double nMax= 0.0;
        String apellidoMax = " ";
        String nombreMax = " ";
        for (int i = 0; i< n_Est; i++ ){
            notaMax = getCalificacionMax();
            nMax = est_[i].getCalificacion();
            if (nMax > notaMax){
                notaMax = nMax;
                setCalificacionMax(notaMax);
                apellidoMax = est_[i].getApellido();
                nombreMax = est_[i].getNombre();                
                setNombreApellidoMax(nombreMax + " "+ apellidoMax);
            }            
        }        
    }
    
    public void calcularNotaMin(int n_Est){
        double notaMin=5.0;
        double nMin= 5.0;
        String apellidoMin = " ";
        String nombreMin = " ";
        for (int i = 0; i< n_Est; i++ ){
            notaMin = getCalificacionMin();
            nMin = est_[i].getCalificacion();
            if (nMin < notaMin){
                notaMin = nMin;
                setCalificacionMin(notaMin);
                apellidoMin = est_[i].getApellido();
                nombreMin = est_[i].getNombre();                
                setNombreApellidoMin(nombreMin + " "+ apellidoMin);
            }            
        }        
    }
    
    
    
    public void contarCantGan(int n_Est){
        int contGan=0;
        double nota;
        for (int i = 0; i< n_Est; i++ ){
            nota = est_[i].getCalificacion();
            if (nota >= 3.0){
                contGan ++;
                setCantGanan(contGan);
            }            
        }
    }
    
    public void contarCantPier(int n_Est){
        int contPier=0;
        double nota;
        for (int i = 0; i< n_Est; i++ ){
            nota = est_[i].getCalificacion();
            if (nota < 3.0){
                contPier ++;
                setCantPierden(contPier);
            }            
        }
    }
    
   
    
    public String mostrarResultado(){
        
        String msg = "La mayor nota es " + calificacionMax + " y pertenece al estudiante " +nombreApellidoMax+ "\n" +
                     "La menor nota es " + calificacionMin + " y pertenece al estudiante " +nombreApellidoMin + "\n" +
                     "el promedio del curso es " + promedioCurso + "\n" +
                     "Cantidad que perdieron " + cantPierden + "\n" +
                     "Cantidad que ganaron " + cantGanan;             
                        
        return msg;
    }
    
    public void gestionar(){
        int n_Est = definirCantEstu();
        gestionarEstudiante(n_Est);
        calcularNotaMax(n_Est);
        calcularNotaMin(n_Est);        
        contarCantGan(n_Est);
        contarCantPier(n_Est);
        String msg = mostrarResultado();        
        IO.show(msg);
        
    }
    
}
