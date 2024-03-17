package ecosistemas.endidades;

import java.util.Random;

 class Organismo {
    protected int posicionX;
    protected int posicionY;
    protected int salud;
    protected int edad;
    protected boolean estadoReproductivo;
    protected String nombreEspecie;
    protected boolean estaVivo;
    protected boolean esDepredador;

    public Organismo(int posX, int posY, String nombreEspecie, boolean esDepredador) {
        this.posicionX = posX;
        this.posicionY = posY;
        this.salud = 100; // Salud inicial
        this.edad = 0; // Edad inicial
        this.estadoReproductivo = false; // No reproductivo al inicio
        this.nombreEspecie = nombreEspecie;
        this.estaVivo = true; // El organismo está vivo al inicio
        this.esDepredador = esDepredador; // Se asigna si es depredador o no
    }

    public boolean estaVivo() {
        return estaVivo;
    }

    public boolean esDepredador() {
        return esDepredador;
    }

    public void mover(int nuevaPosX, int nuevaPosY) {
        this.posicionX = nuevaPosX;
        this.posicionY = nuevaPosY;
        System.out.println("El organismo se ha movido a (" + this.posicionX + ", " + this.posicionY + ")");
    }

    public void envejecer() {
        this.edad++;
        if (this.edad >= 5) { // Por ejemplo, consideremos que el estado reproductivo inicia a los 5 años
            this.estadoReproductivo = true;
        }
    }

    public void morir() {
        this.estaVivo = false;
        System.out.println("El organismo ha muerto en (" + this.posicionX + ", " + this.posicionY + ")");
    }

    public void interactuar(Ambiente ambiente) {
        // Método para que los organismos interactúen con el ambiente
    }
}

class Ambiente {
    private String clima;
    private String tipoTerreno;
    private int recursosDisponibles;
    private int maxPosX;
    private int maxPosY;

    public Ambiente(String clima, String tipoTerreno, int recursos, int maxPosX, int maxPosY) {
        this.clima = clima;
        this.tipoTerreno = tipoTerreno;
        this.recursosDisponibles = recursos;
        this.maxPosX = maxPosX;
        this.maxPosY = maxPosY;
    }

    public void agregarOrganismo(Organismo organismo) {
        // Lógica para agregar un organismo al ambiente
    }

    public void pasoDelTiempo() {
        // Simular interacciones entre los organismos y el ambiente
    }

    public void simularPredacion(Organismo depredador, Organismo presa) {
        // Simulación básica: el depredador reduce la salud de la presa
        presa.salud -= 20;
        if (presa.salud <= 0) {
            presa.morir(); // La presa muere
        }
    }

    public void simularCompetenciaRecursos(Organismo organismo1, Organismo organismo2) {
        // Simulación básica: ambos organismos compiten por los recursos
    }

    public void simularPolinizacion(Organismo planta, Organismo polinizador) {
        // Simulación básica: el polinizador ayuda en la polinización de la planta
    }

    public int obtenerRecursos(int cantidad) {
        // Método para que los organismos obtengan recursos del ambiente
        return recursosDisponibles >= cantidad ? cantidad : recursosDisponibles;
    }

    public boolean validarPosicion(int posX, int posY) {
        // Método para verificar si una posición está dentro de los límites del ambiente
        return posX >= 0 && posX < maxPosX && posY >= 0 && posY < maxPosY;
    }

    public int buscarComida(Animal animal) {
        // Método para simular la búsqueda de comida por parte de un animal
        // Devuelve la cantidad de recursos encontrados
        return new Random().nextInt(21); // Se simula encontrando una cantidad aleatoria entre 0 y 20
    }

    // Otros métodos necesarios para el ambiente
}