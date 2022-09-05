package Viviendas;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class V3{

    private String nombreP;
    private String direccion;
    private int estrato;
    private double area;
    private int servicios;
    private int calleP;
    
    V3(){
        nombreP = "";
        direccion = "";
        estrato = 0;
        area = 0;
        servicios = 0;
        calleP = 0;
    }
    
    
 public void setNombreP(String nombreP){
        this.nombreP = nombreP;
    }
    
    public String getNombreP(){
        return nombreP;
    }
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public void setEstrato(int estrato){
        this.estrato = estrato;
    }
    
    public int getEstrato(){
        return estrato;
    }
    
    public void setArea(double area){
        this.area = area;
    }
    
    public double getArea(){
        return area;
    }
    
    public void setServicios(int servicios){
        this.servicios = servicios;
    }
    
    public int getServicios(){
        return servicios;
    }
    
    public void setCalleP(int calleP){
        this.calleP = calleP;
    }
    
    public int getCalleP(){
        return calleP;
    }
    
    public V3(String nombreP, String direccion, int estrato, double area, int servicios, int calleP){
        this.nombreP=nombreP;
        this.direccion=direccion;
        this.estrato=estrato;
        this.area=area;
        this.servicios=servicios;
        this.calleP=calleP;
    }
    
    public void indicarServicios(){
        int ser;
        Scanner leer = new Scanner(System.in);
       
        JOptionPane.showMessageDialog(null,"Si cuenta con servicios digite 1, de lo contrario, digite un 2");
        ser = leer.nextInt();
        setServicios(servicios);
        
        do{
           JOptionPane.showMessageDialog(null,"Incorrecto, digite de nuevo el número por favor");
            ser = leer.nextInt();
        }while (ser<1);
        
        do{
           JOptionPane.showMessageDialog(null,"Incorrecto, digite de nuevo el número por favor");
            ser = leer.nextInt();
        }while (ser>2);
        
        if (ser == 1){
            JOptionPane.showMessageDialog(null,"La vivienda cuenta con servicios");
        }else{
            if (ser == 2){
                JOptionPane.showMessageDialog(null,"La vivienda no cuenta con servicios");
            }
        }
    }
    
    
    public void indicarCalleP(){
        int cll;
        Scanner leer = new Scanner(System.in);
        
        JOptionPane.showMessageDialog(null,"Si la calle de enfrente está pavimentada digite 1, de lo contrario, digite un 2");
        cll = leer.nextInt();
        setCalleP(calleP);
        
        do{
           JOptionPane.showMessageDialog(null,"Incorrecto, digite de nuevo el número por favor");
            cll = leer.nextInt();
        }while (cll<1);
        
        do{
           JOptionPane.showMessageDialog(null,"Incorrecto, digite de nuevo el número por favor");
            cll = leer.nextInt();
        }while (cll>2);
        
        if (cll == 1)
        {
            JOptionPane.showMessageDialog(null,"La vivienda cuenta con servicios");
        }
        else
        {
            if (cll == 2)
            {
               JOptionPane.showMessageDialog(null,"La vivienda no cuenta con servicios");
            }
        }
    }
    
    public void calcularCosto(){
        if (estrato==1){
            double costo = area*400000;
            JOptionPane.showMessageDialog(null,"Costo de la vivienda "+costo);
        }
        
        if (estrato==2){
            double costo = area*600000;
            JOptionPane.showMessageDialog(null,"Costo de la vivienda "+costo);
        }
        
        if (estrato==3){
            double costo = area*900000;
            JOptionPane.showMessageDialog(null,"Costo de la vivienda "+costo);
        }
        
        if (estrato==4){
            double costo = area*1350000;
            JOptionPane.showMessageDialog(null,"Costo de la vivienda "+costo);
        }
        
        if (estrato==5){
            double costo = area*2025000;
            JOptionPane.showMessageDialog(null,"Costo de la vivienda "+costo);
        }
        
        if (estrato==6){
            double costo = area*3037500;
            JOptionPane.showMessageDialog(null,"Costo de la vivienda "+costo);
        }
    }
    
    public void desplegarEstado(){
        JOptionPane.showMessageDialog(null,"Nombre del propietario: "+getNombreP()
                +"\nLa dirección de la vivienda es: "+getDireccion()
                +"\n El estrato de la vivienda es: "+getEstrato()
                +"\n El área de la vivienda es: "+getArea()
                +"\nCuenta con servicios: 1\nNo cuenta con servicios: 2\nSu estado es:"+getServicios()
                +"\nCalle de enfrente pavimentada: 1\nCalle de enfrente no pavimentada: 2\nSu estado es:"+getCalleP());
    }
    
}
