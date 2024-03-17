package ecosistemas.simulador;

import java.util.ArrayList;
import java.util.List;

class Especie {
    private String nombre;
    private int tasaCrecimiento;
    private int tasaReproduccion;

    public Especie(String nombre, int tasaCrecimiento, int tasaReproduccion) {
        this.nombre = nombre;
        this.tasaCrecimiento = tasaCrecimiento;
        this.tasaReproduccion = tasaReproduccion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTasaCrecimiento() {
        return tasaCrecimiento;
    }

    public int getTasaReproduccion() {
        return tasaReproduccion;
    }
}

class Poblacion {
    private Especie especie;
    private int cantidad;

    public Poblacion(Especie especie, int cantidad) {
        this.especie = especie;
        this.cantidad = cantidad;
    }

    public Especie getEspecie() {
        return especie;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void crecer() {
        // Simulamos el crecimiento de la población según la tasa de crecimiento de la especie
        cantidad += cantidad * especie.getTasaCrecimiento() / 100;
    }

    public void reproducirse() {
        // Simulamos la reproducción de la población según la tasa de reproducción de la especie
        cantidad += cantidad * especie.getTasaReproduccion() / 100;
    }
}

public class SimuladorPoblaciones {
    private List<Poblacion> poblaciones;

    public SimuladorPoblaciones() {
        this.poblaciones = new ArrayList<>();
    }

    public void agregarPoblacion(Especie especie, int cantidadInicial) {
        Poblacion poblacion = new Poblacion(especie, cantidadInicial);
        poblaciones.add(poblacion);
    }

    public void simularCrecimiento() {
        for (Poblacion poblacion : poblaciones) {
            poblacion.crecer();
        }
    }

    public void simularReproduccion() {
        for (Poblacion poblacion : poblaciones) {
            poblacion.reproducirse();
        }
    }

    public void mostrarPoblaciones() {
        System.out.println("Poblaciones:");
        for (Poblacion poblacion : poblaciones) {
            System.out.println(poblacion.getEspecie().getNombre() + ": " + poblacion.getCantidad());
        }
    }
}