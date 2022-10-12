package empresasarraylist;
import java.util.ArrayList;
public class GestionEmpresas {
    private ArrayList<Empresa> empresas;

    public GestionEmpresas(){
        empresas = new ArrayList<Empresa>();
    }

    public void gestionar(){
        leerEmpresas();
        mostrar();
    }

    private void leerEmpresas(){
        char seguir;
        do{
            String nom = ES.leerCadena("Digite el nombre de la empresa "+(empresas.size()+1));
            String nit = ES.leerCadena("Digite el nit de la empresa "+nom);
            int nt     = ES.leerEntero("Digite el número de trabajadores de la empresa "+nom);
            double sp  = ES.leerReal("Digite el salario promedio de la empresa "+nom);
            double pa  = ES.leerReal("Digite el porcentaje aumento de la empresa "+nom);

            Empresa emp = new Empresa();

            emp.asignarNombre(nom);
            emp.asignarNit(nit);
            emp.asignarNumeroTrabajadores(nt);
            emp.asignarSalarioPromedio(sp);
            emp.asignarPorcentajeAumento(pa);

            empresas.add(emp);

            seguir = ES.leerCaracter("Desea seguir?(S/N)");
        }while(seguir!='N');
    }

    private void mostrar(){
        String cad_emp = "";
        for(Empresa e:empresas){
            cad_emp += "===================================\n";
            cad_emp += "Nombre: "+e.obtenerNombre()+"\n";
            cad_emp += "Nit: "+e.obtenerNit()+"\n";
            cad_emp += "Número Trabajadores: "+e.obtenerNumeroTrabajadores()+"\n";
            cad_emp += "Salario Promedio: "+e.obtenerSalarioPromedio()+"\n";
            cad_emp += "Porcentaje Aumento: "+e.obtenerPorcentajeAumento()+"\n";
            cad_emp += "Nuevo Salario Promedio: "+e.calcularNuevoSueldo()+"\n";
        }
        ES.mostrar("Las empresas son:\n"+cad_emp);
    }
}
