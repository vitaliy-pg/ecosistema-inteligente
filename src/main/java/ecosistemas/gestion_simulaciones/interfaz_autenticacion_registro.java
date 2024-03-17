package ecosistemas.gestion_simulaciones;
import java.util.HashMap;
import java.util.Map;


public class interfaz_autenticacion_registro {
    private Map<String, Simulacion> simulaciones;

    public interfaz_autenticacion_registro () {
        this.simulaciones = new HashMap<>();
    }
    public void registrarSimulacion(String nombreSimulacion, String configuracion) {
        simulaciones.put(nombreSimulacion, new Simulacion(nombreSimulacion, configuracion));
    }
    public Simulacion obtenerSimulacion(String nombreSimulacion) {
        return simulaciones.get(nombreSimulacion);
    }
}
