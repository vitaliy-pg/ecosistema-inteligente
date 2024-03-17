package ecosistemas.entidades;

import java.util.ArrayList;
import java.util.Random;

public class Ambiente {
    private String clima;
    private String terreno;
    private int recursosDisponibles;
    public ArrayList<Organismo> organismos;

    public Ambiente(String clima, String terreno, int recursos) {
        this.clima = clima;
        this.terreno = terreno;
        this.recursosDisponibles = recursos;
        this.organismos = new ArrayList<>();
    }
    public void agregarOrganismo(Organismo organismo) {
        this.organismos.add(organismo);
    }
    public void pasoDelTiempo() {
        // Simular interacciones entre los organismos y el ambiente
        for (Organismo organismo : organismos) {
            organismo.interactuar(this);
            organismo.envejecer();
        }
    }
    public void simularPredacion(Organismo depredador, Organismo presa) {
        // Simulación básica: el depredador reduce la salud de la presa
        presa.salud -= 20;
        if (presa.salud <= 0) {
            organismos.remove(presa); // La presa muere
        }
    }
    public void simularCompetenciaRecursos(Organismo organismo1, Organismo organismo2) {
        // Simulación básica: ambos organismos compiten por los recursos
        Random random = new Random();
        int probabilidad = random.nextInt(100);
        if (probabilidad < 50) { // Por ejemplo, 50% de probabilidad de que uno de los organismos pierda salud
            organismo1.salud -= 10;
        } else {
            organismo2.salud -= 10;
        }

        // Si algún organismo se queda sin salud, muere
        if (organismo1.salud <= 0) {
            organismos.remove(organismo1);
        }
        if (organismo2.salud <= 0) {
            organismos.remove(organismo2);
        }
    }
    public void simularPolinizacion(Organismo planta, Organismo polinizador) {
        // Simulación básica: el polinizador ayuda en la polinización de la planta
        // Aquí podrías implementar una lógica más elaborada para la polinización
    }
}
