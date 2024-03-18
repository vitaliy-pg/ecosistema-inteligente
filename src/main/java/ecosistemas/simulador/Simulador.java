package ecosistemas.simulador;

import java.util.Random;

public class Simulador {
    private static Random random;
    private static double tasaCrecimiento; // Tasa de crecimiento como porcentaje (por ejemplo, 0.1 representa el 10%)
    private static double probabilidadEvento; // Probabilidad de que ocurra un evento aleatorio (por ejemplo, 0.1 representa el 10%)

    // Método constructor estático para inicializar los atributos estáticos
    static {
        random = new Random();
        tasaCrecimiento = 0.1; // Tasa de crecimiento por defecto (10%)
        probabilidadEvento = 0.1; // Probabilidad de evento aleatorio por defecto (10%)
    }

    public Simulador(double tasaCrecimiento, double probabilidadEvento) {
        this.random = new Random();
        this.tasaCrecimiento = tasaCrecimiento;
        this.probabilidadEvento = probabilidadEvento;
    }

    // Método setter estático para configurar la tasa de crecimiento
    public static void setTasaCrecimiento(double tasa) {
        tasaCrecimiento = tasa;
    }

    // Método setter estático para configurar la probabilidad de evento aleatorio
    public static void setProbabilidadEvento(double probabilidad) {
        probabilidadEvento = probabilidad;
    }

    // Método para simular el crecimiento y la reproducción de la población en el ambiente
    public static void simularCrecimientoYReproduccion(Ambiente ambiente) {
        int poblacionActual = ambiente.getPoblacion();
        int nuevaPoblacion = (int) (poblacionActual * (1 + tasaCrecimiento)); // Aumento de la población según la tasa de crecimiento configurada
        ambiente.setPoblacion(nuevaPoblacion);
        System.out.println("Simulando crecimiento y reproducción... Nueva población: " + nuevaPoblacion);
    }

    // Método para simular eventos aleatorios que afectan a la población
    public static void simularEventosAleatorios(Ambiente ambiente) {
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

    // Método para calcular y presentar estadísticas sobre la salud del ecosistema y las tendencias poblacionales
    public static void verResultadosSimulacion(Ambiente ambiente) {
        System.out.println("Resultados de la simulación:");
        System.out.println("Población actual: " + ambiente.getPoblacion());
    }
}