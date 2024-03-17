package ecosistemas.endidades;

public class Organismo {
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
