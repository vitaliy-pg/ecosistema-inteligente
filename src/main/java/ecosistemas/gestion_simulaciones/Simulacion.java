package ecosistemas.gestion_simulaciones;

public class Simulacion {
    private String nombre;
    private String configuracion;

    public Simulacion(String nombre, String configuracion) {
        this.nombre = nombre;
        this.configuracion = configuracion;
    }

    // Getters y setters
    // ...
    // Getter para el nombre de la simulación
    public String getNombre() {
        return nombre;
    }

    // Setter para el nombre de la simulación
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para la configuración de la simulación
    public String getConfiguracion() {
        return configuracion;
    }

    // Setter para la configuración de la simulación
    public void setConfiguracion(String configuracion) {
        this.configuracion = configuracion;
    }
}
