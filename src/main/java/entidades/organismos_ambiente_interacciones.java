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
    }

