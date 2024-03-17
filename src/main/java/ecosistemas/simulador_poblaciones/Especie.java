package ecosistemas.simulador_poblaciones;

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
