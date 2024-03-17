package ecosistemas.simulador_poblaciones;
import java.util.ArrayList;
import java.util.Random;
class Especie {
    private String nombre;
    private int poblacion;

    public Especie(String nombre, int poblacionInicial) {
        this.nombre = nombre;
        this.poblacion = poblacionInicial;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }