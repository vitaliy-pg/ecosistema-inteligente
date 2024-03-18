package ecosistemas.simulador;

import java.util.Random;

public class Simulador {
    private Random random;

    public Simulador() {
        this.random = new Random();
    }

    public void simularCrecimientoYReproduccion(Ambiente ambiente) {
        // Lógica para simular el crecimiento y la reproducción de la población en el ambiente
        // Esto puede implicar aumentar la cantidad de organismos, calcular tasas de reproducción, etc.
        // Ejemplo:
        System.out.println("Simulando crecimiento y reproducción...");
        int nuevaPoblacion = ambiente.getPoblacion() + random.nextInt(10); // Incrementar la población aleatoriamente
        ambiente.setPoblacion(nuevaPoblacion);
    }

    public void simularEventosAleatorios(Ambiente ambiente) {
        // Lógica para simular eventos aleatorios en el ambiente
        // Esto puede incluir desastres naturales, cambios climáticos, etc.
        // Ejemplo:
        System.out.println("Simulando eventos aleatorios...");
        if (random.nextDouble() < 0.2) { // Hay un 20% de probabilidad de que ocurra un evento
            // Disminuir la población aleatoriamente
            int poblacionActual = ambiente.getPoblacion();
            int nuevaPoblacion = poblacionActual - random.nextInt(Math.min(poblacionActual, 5)); // Reducir la población en hasta 5 organismos
            ambiente.setPoblacion(nuevaPoblacion);
            System.out.println("Se ha producido un evento aleatorio. Población actual: " + nuevaPoblacion);
        } else {
            System.out.println("No ha ocurrido ningún evento aleatorio.");
        }
    }

    public void verResultadosSimulacion(Ambiente ambiente) {
        // Lógica para mostrar los resultados de la simulación
        // Esto puede incluir la visualización de estadísticas, gráficos, etc.
        // En esta implementación de ejemplo, simplemente imprimimos un mensaje.
        System.out.println("Mostrando resultados de la simulación...");
        System.out.println("Los resultados se mostrarían aquí.");
    }
}