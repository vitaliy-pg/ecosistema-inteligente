package ecosistemas.simulador;

// Definición de la clase Ambiente
public class Ambiente {
    private int poblacion;

    public Ambiente( String tropical, String selva, int i1, int i, int poblacionInicial) {
        this.poblacion = poblacionInicial;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        if (poblacion >= 0) {
            this.poblacion = poblacion;
        } else {
            System.out.println("Error: La población no puede ser negativa. La simulación no puede continuar.");
        }
    }

    public void aumentarPoblacion(int cantidad) {
        if (cantidad >= 0) {
            poblacion += cantidad;
        } else {
            System.out.println("Error: La cantidad de población a aumentar debe ser positiva.");
        }
    }

    public void reducirPoblacion(int cantidad) {
        if (cantidad >= 0) {
            poblacion -= cantidad;
            if (poblacion < 0) {
                poblacion = 0;
                System.out.println("Advertencia: La población ha llegado a cero.");
            }
        } else {
            System.out.println("Error: La cantidad de población a reducir debe ser positiva.");
        }
    }
}
