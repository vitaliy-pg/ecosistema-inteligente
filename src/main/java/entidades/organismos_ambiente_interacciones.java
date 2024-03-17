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
