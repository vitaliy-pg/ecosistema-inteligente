package ecosistemas.simulador_poblaciones;
import java.util.ArrayList;
import java.util.Random;
class Especie {
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
        // Suponemos un evento que reduce la población en un 20%
        Random random = new Random();
        if (random.nextInt(100) < 20) {
            this.poblacion -= this.poblacion * 0.2;
        }
    }
}
class Ecosistema {
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