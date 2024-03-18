package ecosistemas.simulador;

import java.util.Random;

public class Simulador {
    private Random random;
    private double tasaCrecimiento; // Tasa de crecimiento como porcentaje (por ejemplo, 0.1 representa el 10%)
    private double probabilidadEvento; // Probabilidad de que ocurra un evento aleatorio (por ejemplo, 0.1 representa el 10%)

    public Simulador(double tasaCrecimiento, double probabilidadEvento) {
        this.random = new Random();
        this.tasaCrecimiento = tasaCrecimiento;
        this.probabilidadEvento = probabilidadEvento;
    }

    public void simularCrecimientoYReproduccion(Ambiente ambiente) {
        int poblacionActual = ambiente.getPoblacion();
        int nuevaPoblacion = (int) (poblacionActual * (1 + tasaCrecimiento)); // Aumento de la población según la tasa de crecimiento configurada
        ambiente.setPoblacion(nuevaPoblacion);
        System.out.println("Simulando crecimiento y reproducción... Nueva población: " + nuevaPoblacion);
    }

    public void simularEventosAleatorios(Ambiente ambiente) {
        if (random.nextDouble() < probabilidadEvento) { // Comprobamos si ocurre un evento aleatorio según la probabilidad configurada
            int poblacionActual = ambiente.getPoblacion();
            int reduccion = random.nextInt(Math.min(poblacionActual, 10)); // Reducción de hasta el 10% de la población actual
            int nuevaPoblacion = poblacionActual - reduccion;
            ambiente.setPoblacion(nuevaPoblacion);
            System.out.println("Se ha producido un evento aleatorio. Población actual: " + nuevaPoblacion);
        } else {
            System.out.println("No ha ocurrido ningún evento aleatorio.");
        }
    }

    public void verResultadosSimulacion(Ambiente ambiente) {
        System.out.println("Resultados de la simulación:");
        System.out.println("Población actual: " + ambiente.getPoblacion());
    }
}