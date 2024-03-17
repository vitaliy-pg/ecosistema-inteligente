package ecosistemas.simulador_poblaciones;
import java.util.ArrayList;

public class crecimiento_eventos_resultados {
    private ArrayList<Especie> especies;

    public crecimiento_eventos_resultados () {
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