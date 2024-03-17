package ecosistemas;
//ahora hare el main lo mas jodido de todo
import ecosistemas.gestion_simulaciones.InterfazUsuario;
import ecosistemas.simulador_poblaciones.Ecosistema;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InterfazUsuario interfazUsuario = new InterfazUsuario();
        Ecosistema ecosistema = new Ecosistema();

        System.out.println("¡Bienvenido al Simulador de Dinámicas Poblacionales!");

        while (true) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Registrar Usuario");
            System.out.println("2. Iniciar Sesión");
            System.out.println("3. Configurar Simulación");
            System.out.println("4. Iniciar Simulación");
            System.out.println("5. Visualizar Resultados de Simulación");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un nombre de usuario: ");
                    String nombreUsuario = scanner.nextLine();
                    System.out.print("Ingrese una contraseña: ");
                    String contrasena = scanner.nextLine();
                    interfazUsuario.registrarUsuario(nombreUsuario, contrasena);
                    break;
                case 2:
                    System.out.print("Ingrese su nombre de usuario: ");
                    nombreUsuario = scanner.nextLine();
                    System.out.print("Ingrese su contraseña: ");
                    contrasena = scanner.nextLine();
                    if (interfazUsuario.autenticarUsuario(nombreUsuario, contrasena)) {
                        System.out.println("¡Inicio de sesión exitoso!");
                    } else {
                        System.out.println("Nombre de usuario o contraseña incorrectos.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el nombre de la simulación: ");
                    String nombreSimulacion = scanner.nextLine();
                    System.out.print("Ingrese la configuración de la simulación: ");
                    String configuracionSimulacion = scanner.nextLine();
                    interfazUsuario.iniciarSimulacion(nombreSimulacion, configuracionSimulacion);
                    break;
                case 4:
                    System.out.print("Ingrese el nombre de la simulación a iniciar: ");
                    nombreSimulacion = scanner.nextLine();
                    interfazUsuario.iniciarSimulacion(nombreSimulacion);
                    break;
                case 5:
                    System.out.print("Ingrese el nombre de la simulación a visualizar: ");
                    nombreSimulacion = scanner.nextLine();
                    interfazUsuario.visualizarResultados(nombreSimulacion);
                    break;
                case 6:
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