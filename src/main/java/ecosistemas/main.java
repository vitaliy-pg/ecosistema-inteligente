package ecosistemas;

import ecosistemas.gestion_simulaciones.InterfazUsuario;
import ecosistemas.simulador_poblaciones.crecimiento_eventos_resultados;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InterfazUsuario interfazUsuario = new InterfazUsuario();
        crecimiento_eventos_resultados ecosistema = new crecimiento_eventos_resultados ();

        System.out.println("¡Bienvenido al Simulador de Ecosistemas!");

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
                    // Aquí podrías agregar la lógica para configurar la simulación
                    break;
                case 3:
                    // Aquí podrías agregar la lógica para iniciar la simulación
                    break;
                case 4:
                    // Aquí podrías agregar la lógica para visualizar los resultados
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