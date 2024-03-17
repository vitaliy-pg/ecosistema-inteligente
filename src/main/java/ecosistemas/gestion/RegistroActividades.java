package ecosistemas.gestion;
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

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
