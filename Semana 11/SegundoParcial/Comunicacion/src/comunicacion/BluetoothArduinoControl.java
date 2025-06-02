/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comunicacion;

import com.fazecast.jSerialComm.SerialPort;
import java.io.IOException;
import java.util.Scanner;

public class BluetoothArduinoControl {

    private static final String NOMBRE_PUERTO = "COM9"; // Cambia esto por el puerto correcto
    private static final int BAUD_RATE = 9600;
    private static SerialPort arduinoPort;
    
    public void gestionar() {
        if (!conectarPuerto(NOMBRE_PUERTO)) {
            System.out.println("No se pudo establecer conexión con el puerto " + NOMBRE_PUERTO);
            return;
        }

        System.out.println("Conexión establecida con " + NOMBRE_PUERTO);
        interactuarConUsuario();
        cerrarPuerto();
    }

    // Método para buscar y conectar al puerto
    private boolean conectarPuerto(String nombrePuerto) {
        SerialPort[] puertosDisponibles = SerialPort.getCommPorts();

        for (SerialPort puerto : puertosDisponibles) {
            if (puerto.getSystemPortName().equalsIgnoreCase(nombrePuerto)) {
                arduinoPort = puerto;
                arduinoPort.setBaudRate(BAUD_RATE);
                return arduinoPort.openPort();
            }
        }

        return false;
    }

    // Método para enviar un comando al Arduino
    private void enviarComando(char comando) {
        try {
            arduinoPort.getOutputStream().write(comando);
            arduinoPort.getOutputStream().flush();
            System.out.println("Comando enviado: " + comando);
        } catch (IOException e) {
            System.out.println("Error al enviar el comando: " + e.getMessage());
        }
    }

    // Método para interactuar con el usuario
    private void interactuarConUsuario() {
        Scanner scanner = new Scanner(System.in);
        String entrada;

        System.out.println("Control del robot:");
        System.out.println("F: Adelante | B: Atrás | R: Derecha | L: Izquierda | S: Parar | Q: Salir");

        while (true) {
            System.out.print(">> ");
            entrada = scanner.nextLine().trim().toUpperCase();

            if (entrada.equals("Q")) {
                break;
            }

            if (entrada.length() == 1 && "FBRLS".contains(entrada)) {
                enviarComando(entrada.charAt(0));
            } else {
                System.out.println("Comando no válido.");
            }
        }

        scanner.close();
    }

    // Método para cerrar el puerto
    private void cerrarPuerto() {
        if (arduinoPort != null && arduinoPort.isOpen()) {
            arduinoPort.closePort();
            System.out.println("Puerto cerrado.");
        }
    }
}
