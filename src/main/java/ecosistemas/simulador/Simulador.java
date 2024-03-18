package ecosistemas.simulador;

import java.util.Random;

public class Simulador {
    private Random random;
    private double tasaCrecimiento;
    private double probabilidadEvento;

    public Simulador(double tasaCrecimiento, double probabilidadEvento) {
        this.random = new Random();
        this.tasaCrecimiento = tasaCrecimiento;
        this.probabilidadEvento = probabilidadEvento;
    }


    public void simularCrecimientoYReproduccion(Ambiente ambiente) {
        int poblacionActual = ambiente.getPoblacion();
        int nuevaPoblacion = (int) (poblacionActual * (1 + tasaCrecimiento));
        ambiente.setPoblacion(nuevaPoblacion);
        System.out.println("Simulando crecimiento y reproducción... Nueva población: " + nuevaPoblacion);
    }

    public void simularEventosAleatorios(Ambiente ambiente) {
        if (random.nextDouble() < probabilidadEvento) {
            int poblacionActual = ambiente.getPoblacion();
            int reduccion = random.nextInt(Math.min(poblacionActual, 10));
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

