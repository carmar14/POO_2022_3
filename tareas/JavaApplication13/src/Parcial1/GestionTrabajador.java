/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parciall;

/**
 *
 * @author MyNotebook
 */
public class GestionTrabajador {
    private Trabajador trabajador1;
    private Trabajador trabajador2;

    public GestionTrabajador() {
        trabajador1 = new Trabajador ("", 0, 0.0);
        trabajador2 = new Trabajador ("", 0, 0.0);
    }

    public Trabajador getTrabajador1() {
        return trabajador1;
    }

    public void setTrabajador1(Trabajador trabajador1) {
        this.trabajador1 = trabajador1;
    }

    public Trabajador getTrabajador2() {
        return trabajador2;
    }

    public void setTrabajador2(Trabajador trabajador2) {
        this.trabajador2 = trabajador2;
    }

    void gestionar() {
        gestionarTrabajador ();
        compararSalario (trabajador1, trabajador2);
    }

    private void gestionarTrabajador() {
        String nombre1 = IO.readString("Escribe el nombre del trabajador 1: ");
        int horas1 = IO.readInt("Ingrese las horas trabajadas: ");
        double valor1 = IO.readDouble("Ingresa el valor por hora: "); 
        trabajador1.setNombre(nombre1);
        trabajador1.setHorasTrabajadas(horas1);
        trabajador1.setValorHoras(valor1);
        double salario1 = trabajador1.calcularSalario();
        if (salario1<1335000)IO.show (salario1+" El salario es menor al salario minimo");
        else if (salario1>1335000)IO.show (salario1+" El salario es mayor al salario minimo");
        else IO.show(salario1+" El salario es igual al minimo");

        String nombre2 = IO.readString(" Escribe el nombre del trabajador 2: ");
        int horas2 = IO.readInt("Ingrese las horas trabajadas: ");
        double valor2 = IO.readDouble("Ingresa el valor por hora: "); 
        trabajador2.setNombre(nombre2);
        trabajador2.setHorasTrabajadas(horas2);
        trabajador2.setValorHoras(valor2);
        double salario2 = trabajador2.calcularSalario();
        if (salario2<1335000)IO.show (salario2+" El salario es menor al salario minimo");
        else if (salario2>1335000)IO.show (salario2+" El salario es mayor al salario minimo");
        else IO.show(salario2+" El salario es igual al minimo");
        
        
        String msg = compararSalario (trabajador1, trabajador2);
        IO.show (msg);
        
    
    }

    private String compararSalario(Trabajador t1, Trabajador t2){
        String msg =" ";
       if (t1.calcularSalario()>t2.calcularSalario())
           
        return msg = " El trabajador 1 ganó un mayor salario ";
       else 
           return msg = " El Trabajador 2 tuvo mayor salario";
    }
    
}
