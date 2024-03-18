package ecosistemas.gestion;

import java.util.Scanner;

public class InterfazUsuario {

    public static void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- Interfaz de Usuario ---");
            System.out.println("1. Configurar Simulación");
            System.out.println("2. Iniciar Simulación");
            System.out.println("3. Detener Simulación");
            System.out.println("4. Volver al Menú Anterior");
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
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
                    break;
            }
        }

        scanner.close(); // Cerrar el Scanner al finalizar
    }

    private static void configurarSimulacion() {
        // Implementación de la configuración de simulación
        System.out.println("Configurando la simulación...");
    }

    private static void iniciarSimulacion() {
        // Implementación del inicio de la simulación
        System.out.println("Iniciando la simulación...");
    }

    private static void detenerSimulacion() {
        // Implementación de detener la simulación
        System.out.println("Deteniendo la simulación...");
    }
}