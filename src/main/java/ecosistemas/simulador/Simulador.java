package ecosistemas.simulador;

import java.util.Random;

public class Simulador {
    private static Random random;
    private double tasaCrecimiento;
    private static double probabilidadEvento = 0.8;

    public Simulador(double tasaCrecimiento, double probabilidadEvento) {
        this.random = new Random();
        this.tasaCrecimiento = tasaCrecimiento;
        this.probabilidadEvento = probabilidadEvento;
    }


    public void simularCrecimientoYReproduccion(Ambiente ambiente, double tasaCrecimiento, int limitePoblacion) {
        int poblacionActual = ambiente.getPoblacion();
        double crecimiento = poblacionActual * tasaCrecimiento;
        int nuevaPoblacion = poblacionActual + (int) crecimiento;

        if (nuevaPoblacion < 0) {
            System.out.println("Error: La población resultante sería negativa. La simulación no puede continuar.");
        } else if (nuevaPoblacion > limitePoblacion) {
            nuevaPoblacion = limitePoblacion;
            System.out.println("Advertencia: La población alcanzó el límite máximo permitido de " + limitePoblacion + ". La simulación continúa con este límite.");
        }

        ambiente.setPoblacion(nuevaPoblacion);
        System.out.println("Simulando crecimiento y reproducción... Nueva población: " + nuevaPoblacion);
    }

    {
        random = new Random();
        probabilidadEvento = 0.8; // Probabilidad de evento aleatorio por defecto (80%)
    }

    // Método setter estático para configurar la probabilidad de evento aleatorio
    public void setProbabilidadEvento(double probabilidad) {
        probabilidadEvento = probabilidad;
    }

    // Método para simular eventos aleatorios que afectan a la población

    public void simularEventosAleatorios(Ambiente ambiente) {
        if (random.nextDouble() < probabilidadEvento) {
            int poblacionActual = ambiente.getPoblacion();
            if (poblacionActual > 0) {
                int reduccion = random.nextInt(Math.min(poblacionActual, 10)); // Reducción de hasta el 10% de la población actual
                int nuevaPoblacion = poblacionActual - reduccion;
                ambiente.setPoblacion(nuevaPoblacion);
                System.out.println("Se ha producido un evento aleatorio. Población actual: " + nuevaPoblacion);
            } else {
                System.out.println("No ha ocurrido ningún evento aleatorio. La población actual es cero.");
            }
        } else {
            System.out.println("No ha ocurrido ningún evento aleatorio.");
        }
    }

    public void verResultadosSimulacion(Ambiente ambiente) {
        System.out.println("Resultados de la simulación:");
        System.out.println("Población actual: " + ambiente.getPoblacion());
    }
}





