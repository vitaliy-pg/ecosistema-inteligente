package ecosistemas.gestion;

import java.util.Scanner;


import java.util.ArrayList;
import java.util.List;


public class InterfazUsuario {
    // Lista para almacenar los registros de simulaciones anteriores
    private static List<Simulacion> registrosSimulaciones = new ArrayList<>();
    private static void interfazUsuario() {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- Interfaz de Usuario ---");
            System.out.println("1. Configurar Simulación");
            System.out.println("2. Iniciar Simulación");
            System.out.println("3. Detener Simulación");
            System.out.println("4. Mostrar registros de actividades");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    configurarSimulacion();
                    break;
                case 2:
                    iniciarSimulacion();
                    break;
                case 3:
                    detenerSimulacion();
                    break;
                case 4:
                    registroActividades();
                    break;
                case 5:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
                    break;
            }
        }
        scanner.close(); // Cerrar el Scanner al finalizar
    }

    private static void configurarSimulacion() {
        System.out.println("Configurando la simulación...");
        // Aquí puedes permitir que los investigadores configuren los parámetros de la simulación
    }

    private static void iniciarSimulacion() {
        System.out.println("Iniciando la simulación...");
        // Aquí puedes iniciar la simulación con los parámetros configurados previamente
        // Después de iniciar la simulación, podrías registrar los detalles de la simulación actual
        registrosSimulaciones.add(new Simulacion(/* Aquí pasas los parámetros relevantes de la simulación */));
    }

    private static void detenerSimulacion() {
        System.out.println("Deteniendo la simulación...");
        // Aquí puedes detener la simulación en curso
    }

    public static void registroActividades () {
        System.out.println("Mostrando registros de actividades...");
        if (registrosSimulaciones.isEmpty()) {
            System.out.println("No hay registros de simulaciones anteriores.");
        } else {
            System.out.println("Registros de simulaciones anteriores:");
            for (Simulacion simulacion : registrosSimulaciones) {
                System.out.println(simulacion); // Aquí puedes personalizar cómo se muestra cada registro
            }
        }
    }
}

// Clase para representar una simulación
class Simulacion {
    private String detalles;

    public Simulacion() {
        this.detalles = detalles;
    }

    // Método toString para imprimir los detalles de la simulación
    @Override
    public String toString() {
        return "Detalles de la simulación: " + detalles;
    }
}