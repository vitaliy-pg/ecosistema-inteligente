import ecosistemas.gestion_simulaciones.InterfazUsuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InterfazUsuario interfazUsuario = new InterfazUsuario();

        System.out.println("¡Bienvenido al Simulador de Dinámicas Poblacionales!");

        while (true) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Crear Organismo");
            System.out.println("2. Configurar Simulación");
            System.out.println("3. Iniciar Simulación");
            System.out.println("4. Visualizar Resultados");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del organismo: ");
                    String nombreOrganismo = scanner.nextLine();
                    interfazUsuario.crearOrganismo(nombreOrganismo);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre de la simulación: ");
                    String nombreSimulacion = scanner.nextLine();
                    System.out.print("Ingrese la configuración de la simulación: ");
                    String configuracionSimulacion = scanner.nextLine();
                    interfazUsuario.configurarSimulacion(nombreSimulacion, configuracionSimulacion);
                    break;
                case 3:
                    System.out.print("Ingrese el nombre de la simulación a iniciar: ");
                    nombreSimulacion = scanner.nextLine();
                    interfazUsuario.iniciarSimulacion(nombreSimulacion);
                    break;
                case 4:
                    System.out.print("Ingrese el nombre de la simulación a visualizar: ");
                    nombreSimulacion = scanner.nextLine();
                    interfazUsuario.visualizarResultados(nombreSimulacion);
                    break;
                case 5:
                    System.out.println("Saliendo del simulador...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
                    break;
            }
        }
    }
}