package entidades;
import java.util.ArrayList;
import java.util.Random;
abstract class Organismo {
    protected int posicionX;
    protected int posicionY;
    protected int salud;
    protected int edad;
    protected boolean estadoReproductivo;

    public Organismo(int posX, int posY) {
        this.posicionX = posX;
        this.posicionY = posY;
        this.salud = 100; // Salud inicial
        this.edad = 0; // Edad inicial
        this.estadoReproductivo = false; // No reproductivo al inicio
    }
    public void envejecer() {
        this.edad++;
        if (this.edad >= 5) { // Por ejemplo, consideremos que el estado reproductivo inicia a los 5 años
            this.estadoReproductivo = true;
        }
    }
    public abstract void interactuar(Ambiente ambiente);
}
class Planta extends Organismo {
    public Planta(int posX, int posY) {
        super(posX, posY);
    }

    public void interactuar(Ambiente ambiente) {
        // Las plantas pueden realizar fotosíntesis o propagarse, por ejemplo
        // Aquí podrías implementar la lógica específica para las plantas
    }
}
class Animal extends Organismo {
    public Animal(int posX, int posY) {
        super(posX, posY);
    }
    public void interactuar(Ambiente ambiente) {
        // Los animales pueden moverse, buscar comida, depredar, reproducirse, etc.
        // Aquí podrías implementar la lógica específica para los animales
    }
}
class Ambiente {
    private String clima;
    private String terreno;
    private int recursosDisponibles;
    private ArrayList<Organismo> organismos;

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