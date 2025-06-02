/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class GestionVehiculos {

    private ArrayList<Vehiculo> vehiculos;

    public GestionVehiculos() {
        vehiculos = new ArrayList<Vehiculo>();
    }

    public void gestionar() {
        leerVehiculos();
        mostrarVehiculos();
        ordenar_Vel_Actual(); 
    }

    private void leerVehiculos() {
        char seguir;
        do {
            int tv = ES.leerEntero("Digite el tipo de vehiculo: 1=terrestre o 0=acuatico ");
            if (tv == 0) {
                int velmax = ES.leerEntero("Digite la velocidad maxima del vehiculo acuatico");
                int velact = ES.leerEntero("Digite la velocidad actual de vehiculo acuactico");
                Acuatico va = new Acuatico(velact, velmax);
                char acelerar = ES.leerCaracter("Desea acelerar el vehiculo, S=si, N=no? ");
                while (acelerar == 'S') {
                    int vel = ES.leerEntero("Digite el incremento de velocidad");
                    va.acelerar(vel);                    
                    acelerar = ES.leerCaracter("Desea seguir acelerando el vehiculo, S=si, N=no? ");
                }

                char frenar = ES.leerCaracter("Desea frenar el vehiculo, S=si, N=no? ");
                while (frenar == 'S') {
                    int vel = ES.leerEntero("Digite el decremento de velocidad");
                    va.frenar(vel);
                    frenar = ES.leerCaracter("Desea seguir frenando el vehiculo, S=si, N=no? ");
                }

                vehiculos.add(va);
            }

            if (tv == 1) {
                int velmax = ES.leerEntero("Digite la velocidad maxima del vehiculo terrestre");
                int velact = ES.leerEntero("Digite la velocidad actual de vehiculo terrestre");
                Terrestre t = new Terrestre(velact, velmax);
                char acelerar = ES.leerCaracter("Desea acelerar el vehiculo, S=si, N=no? ");
                while (acelerar == 'S') {
                    int vel = ES.leerEntero("Digite el incremento de velocidad");
                    t.acelerar(vel);
                    acelerar = ES.leerCaracter("Desea seguir acelerando el vehiculo, S=si, N=no? ");
                }

                char frenar = ES.leerCaracter("Desea frenar el vehiculo, S=si, N=no? ");
                while (frenar == 'S') {
                    int vel = ES.leerEntero("Digite el decremento de velocidad");
                    t.frenar(vel);
                    frenar = ES.leerCaracter("Desea seguir frenando el vehiculo, S=si, N=no? ");
                }

                vehiculos.add(t);
            }

            seguir = ES.leerCaracter("Desea seguir?(S/N)");
        } while (seguir != 'N');
    }

    private void mostrarVehiculos() {
        String cad_veh = "";
        for (Vehiculo v : vehiculos) {
            /*
            cad_emp += "===================================\n";
            cad_emp += "Nombre: "+e.obtenerNombre()+"\n";
            cad_emp += "Nit: "+e.obtenerNit()+"\n";
            cad_emp += "Número Trabajadores: "+e.obtenerNumeroTrabajadores()+"\n";
            cad_emp += "Salario Promedio: "+e.obtenerSalarioPromedio()+"\n";
            cad_emp += "Porcentaje Aumento: "+e.obtenerPorcentajeAumento()+"\n";
            cad_emp += "Nuevo Salario Promedio: "+e.calcularNuevoSueldo()+"\n";
             */
            cad_veh += "============================\n";
            cad_veh += "La velocidad actual es : " + v.getVelocidadActual() + "\n";
            cad_veh += "La velocidad máxima es : " + v.getVelocidadMáxima() + "\n";
        }
        ES.mostrar("Los vehiculos tienen estas características:\n" + cad_veh);
    }

    private void ordenar_Vel_Actual() {
        boolean ordenado;
        int i = 0;
        int velocidades[] = new int[vehiculos.size()];
        for (Vehiculo v : vehiculos) {
            velocidades[i] = v.getVelocidadActual();
            i = i + 1;
        }

        do {
            ordenado = true;

            for (int j = 0; j < velocidades.length; j++) {
                if (velocidades[j] > velocidades[j + 1]) {
                    int aux = velocidades[i];
                    velocidades[j] = velocidades[j + 1];
                    velocidades[j + 1] = aux;
                    ordenado = false;
                }
            }
        } while (!ordenado);
        
        ES.mostrar("Velocidades ordenadas " + velocidades);
    }
}
