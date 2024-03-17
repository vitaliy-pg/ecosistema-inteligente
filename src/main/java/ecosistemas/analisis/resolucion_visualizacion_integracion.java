package ecosistemas.analisis;

import java.util.HashMap;
import java.util.Map;
class Simulacion {
    private String nombre;
    private String configuracion;
    private Map<String, Double> resultados;

    public Simulacion(String nombre, String configuracion) {
        this.nombre = nombre;
        this.configuracion = configuracion;
        this.resultados = new HashMap<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

