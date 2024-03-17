package ecosistemas.simulador;

public class Especie {
    private String nombre;
    private int tasaCrecimiento;
    private int tasaReproduccion;

    public Especie(String nombre, int tasaCrecimiento, int tasaReproduccion) {
        this.nombre = nombre;
        this.tasaCrecimiento = tasaCrecimiento;
        this.tasaReproduccion = tasaReproduccion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTasaCrecimiento() {
        return tasaCrecimiento;
    }

    public int getTasaReproduccion() {
        return tasaReproduccion;
    }
}
