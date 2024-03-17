package ecosistemas.gestion;
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class InterfazUsuario {
    private Scanner scanner;

    public InterfazUsuario() {
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenuPrincipal() {
        System.out.println("¡Bienvenido al Sistema de Gestión de Simulaciones!");
        System.out.println("1. Iniciar sesión");
        System.out.println("2. Salir");
    }

    public void mostrarMenuSimulaciones() {
        System.out.println("\n--- Menú de Simulaciones ---");
        System.out.println("1. Registrar Simulación");
        System.out.println("2. Ver Simulaciones Anteriores");
        System.out.println("3. Volver al Menú Principal");
    }

    public int obtenerOpcion() {
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public String solicitarCredenciales() {
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Ingrese su nombre de usuario: ");
        String usuario = scanner.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String contrasena = scanner.nextLine();
        return usuario + ":" + contrasena;
    }

    public void cerrarScanner() {
        scanner.close();
    }
}
public class RegistroActividades {
    private List<String> actividades;

    public RegistroActividades() {
        this.actividades = new ArrayList<>();
    }

    public void registrarActividad(String actividad) {
        actividades.add(actividad);
    }

    public void mostrarActividadesAnteriores() {
        System.out.println("\n--- Actividades Anteriores ---");
        if (actividades.isEmpty()) {
            System.out.println("No hay actividades registradas.");
        } else {
            for (String actividad : actividades) {
                System.out.println(actividad);
            }
        }
    }
}
