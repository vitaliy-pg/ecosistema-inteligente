package ecosistemas.simulador;

import java.util.Random;

// Definición de la clase Ambiente
public class Ambiente {
    private String clima;
    private String tipoTerreno;
    private int recursosDisponibles;
    private int maxPosX;
    private int maxPosY;
    private Random random;

    public Ambiente(String clima, String tipoTerreno, int recursos, int maxPosX, int maxPosY) {
        this.clima = clima;
        this.tipoTerreno = tipoTerreno;
        this.recursosDisponibles = recursos;
        this.maxPosX = maxPosX;
        this.maxPosY = maxPosY;
        this.random = new Random();
    }

    // Métodos para acceder y modificar los atributos
    // ...

    public int obtenerRecursos(int cantidad) {
        // Simular la obtención de recursos del ambiente
        int recursosObtenidos = random.nextInt(recursosDisponibles + 1);
        recursosDisponibles -= recursosObtenidos;
        return recursosObtenidos;
    }

    public boolean validarPosicion(int posX, int posY) {
        // Verificar si una posición está dentro de los límites del ambiente
        return posX >= 0 && posX <= maxPosX && posY >= 0 && posY <= maxPosY;
    }

    // Otros métodos necesarios para el ambiente
}

