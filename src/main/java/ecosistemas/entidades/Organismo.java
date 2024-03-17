package ecosistemas.entidades;

public abstract class Organismo {
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
