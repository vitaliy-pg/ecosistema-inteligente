package ecosistemas.simulador_poblaciones;
import java.util.ArrayList;
import java.util.Random;
public class Especie {
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
    public void crecer() {
        // Suponemos un crecimiento constante del 5% cada año
        this.poblacion += this.poblacion * 0.05;
    }
    public void reproducirse() {
        // Cada individuo puede reproducirse y tener una descendencia
        this.poblacion += this.poblacion * 0.1;
    }
    public void morir() {
        // Suponemos una tasa de mortalidad del 2% cada año
        this.poblacion -= this.poblacion * 0.02;
    }
    public void eventoAleatorio() {
        Random random = new Random();
        int probabilidad = random.nextInt(100);

        // Simulamos diferentes eventos aleatorios con diferentes probabilidades
        if (probabilidad < 10) { // 10% de probabilidad de desastre natural
            this.poblacion -= this.poblacion * 0.3; // Reducción del 30% de la población
        } else if (probabilidad < 30) { // 20% de probabilidad de enfermedad
            this.poblacion -= this.poblacion * 0.1; // Reducción del 10% de la población
        } else if (probabilidad < 50) { // 20% de probabilidad de cambio climático
            this.poblacion -= this.poblacion * 0.2; // Reducción del 20% de la población
        }
    }
}

public class Ecosistema {
    private ArrayList<Especie> especies;

    public Ecosistema() {
        this.especies = new ArrayList<>();
    }
    public void agregarEspecie(Especie especie) {
        this.especies.add(especie);
        }

    public void pasoDeAnio() {
        // Simulamos el crecimiento y la reproducción de cada especie
        for (Especie especie : especies) {
            especie.crecer();
            especie.reproducirse();
            especie.eventoAleatorio();
        }
    }
    public int calcularPoblacionTotal() {
        int poblacionTotal = 0;
        for (Especie especie : especies) {
            poblacionTotal += especie.getPoblacion();
        }
        return poblacionTotal;
    }
    public int calcularPoblacionEspecie(String nombreEspecie) {
        for (Especie especie : especies) {
            if (especie.getNombre().equals(nombreEspecie)) {
                return especie.getPoblacion();
            }
        }
        return 0; // Si no se encuentra la especie, se retorna 0
    }
}