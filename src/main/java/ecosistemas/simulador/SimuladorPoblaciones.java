package ecosistemas.simulador;

import java.util.ArrayList;
import java.util.List;

public class SimuladorPoblaciones {
    private List<Poblacion> poblaciones;

    public SimuladorPoblaciones() {
        this.poblaciones = new ArrayList<> ();
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
