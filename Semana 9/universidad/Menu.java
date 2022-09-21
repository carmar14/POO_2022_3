package universidad;
public class Menu {
    private Docente    doc;
    private Empleado   emp;
    private Estudiante est;

    public Menu(){
        doc = new Docente();
        emp = new Empleado();
        est = new Estudiante();
    }

    public void interactuarConUsuario(){
        int opcion;
        do{
            opcion = mostrarMenuYLeerOpcion();
            ejecutarOperacion(opcion);
        }while(opcion!=5);
    }

    private int mostrarMenuYLeerOpcion(){
        String menu;
        menu = "Menú\n"+
               "1. Modificar Docente\n"+
               "2. Modificar Empleado\n"+
               "3. Modificar Estudiante\n"+
               "4. Mostrar Información\n"+
               "5. Salir\n";
        int o = ES.leerEntero(menu);
        return o;
    }

    private void ejecutarOperacion(int o){
        switch(o){
            case 1:
                gestionarDocente();
            break;
            case 2:
                gestionarEmpleado();
            break;
            case 3:
                gestionarEstudiante();
            break;
            case 4:
                mostrarInformacion();
            break;
        }
    }

    private void gestionarDocente(){
        String nom, dir, tel;
        String are, niv, fac;

        ES.mostrar("A continuación se le solicitará la información del docente");

        //Se solicita la información común a toda persona
        nom = ES.leerCadena("Por favor digite el nombre:");
        dir = ES.leerCadena("Por favor digite la dirección:");
        tel = ES.leerCadena("Por favor digite el teléfono:");

        doc.asignarNombre(nom);
        doc.asignarDireccion(dir);
        doc.asignarTelefono(tel);

        //Se solicita la información específica del docente
        are = ES.leerCadena("Por favor digite el área de conocimiento:");
        niv = ES.leerCadena("Por favor digite el nivel de escolaridad:");
        fac = ES.leerCadena("Por favor digite la facultad a la que pertenece:");

        doc.asignarAreaConomiento(are);
        doc.asignarNivelEscolaridad(niv);
        doc.asignarFacultad(fac);
    }

    private void gestionarEmpleado(){
        String nom, dir, tel;
        String car,dep;

        ES.mostrar("A continuación se le solicitará la información del empleado");

        //Se solicita la información común a toda persona
        nom = ES.leerCadena("Por favor digite el nombre:");
        dir = ES.leerCadena("Por favor digite la dirección:");
        tel = ES.leerCadena("Por favor digite el teléfono:");

        emp.asignarNombre(nom);
        emp.asignarDireccion(dir);
        emp.asignarTelefono(tel);

        //Se solicita la información específica del empleado
        car = ES.leerCadena("Por favor digite el cargo:");
        dep = ES.leerCadena("Por favor digite el departamento:");

        emp.asignarCargo(car);
        emp.asignarDeparamento(dep);
    }

    private void gestionarEstudiante(){
        String nom, dir, tel;
        String cod;
        int sem;
        double pro;

        ES.mostrar("A continuación se le solicitará la información del estudiante");

        //Se solicita la información común a toda persona
        nom = ES.leerCadena("Por favor digite el nombre:");
        dir = ES.leerCadena("Por favor digite la dirección:");
        tel = ES.leerCadena("Por favor digite el teléfono:");

        est.asignarNombre(nom);
        est.asignarDireccion(dir);
        est.asignarTelefono(tel);

        //Se solicita la información específica del estudiante
        cod = ES.leerCadena("Por favor digite el código del semestre:");
        sem = ES.leerEntero("Por favor digite el número del semestre:");
        pro = ES.leerReal("Por favor digite el promedio acumulado:");

        est.asignarCodigoPrograma(cod);
        est.asignarNumeroSemestre(sem);
        est.asignarPromedioAcumulado(pro);
    }

    private void mostrarInformacion(){
        String msg = "";
        
        msg += "------------------------------------------\n"+
               "Docente\n"+
               "=======\n"+
               "Nombre:"+doc.obtenerNombre()+", "+
               "Dirección:"+doc.obtenerDireccion()+", "+
               "Telefono:"+doc.obtenerTelefono()+"\n"+
               "Àrea:"+doc.obtenerAreaConocimiento()+", "+
               "Nivel:"+doc.obtenerNivelEscolaridad()+", "+
               "Facultad:"+doc.obtenerFacultad()+"\n"+
               "------------------------------------------\n";

        msg += "------------------------------------------\n"+
               "Empleado\n"+
               "========\n"+
               "Nombre:"+emp.obtenerNombre()+", "+
               "Dirección:"+emp.obtenerDireccion()+", "+
               "Telefono:"+emp.obtenerTelefono()+"\n"+
               "Cargo:"+emp.obtenerCargo()+", "+
               "Departamento:"+emp.obtenerDepartamento()+"\n"+
               "------------------------------------------\n";

        msg += "------------------------------------------\n"+
               "Estudiante\n"+
               "==========\n"+
               "Nombre:"+est.obtenerNombre()+", "+
               "Dirección:"+est.obtenerDireccion()+", "+
               "Telefono:"+est.obtenerTelefono()+"\n"+
               "Código:"+est.obtenerCodigoPrograma()+", "+
               "Semestre:"+est.obtenerNumeroSemestre()+", "+
               "Promedio:"+est.obtenerPromedioAcumulado()+"\n"+
               "------------------------------------------\n";

        ES.mostrar(msg);
    }
}
