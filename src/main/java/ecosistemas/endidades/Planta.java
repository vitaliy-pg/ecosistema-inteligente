package ecosistemas.endidades;

public class Planta extends Organismo {
    public Planta(int posX, int posY) {
        super(posX, posY, "Planta", false); // Las plantas no son depredadoras
    }

    @Override
    public void interactuar(Ambiente ambiente) {
        // Las plantas interactúan absorbiendo recursos del ambiente y realizando fotosíntesis
        // Aquí puedes implementar la lógica específica para las plantas

        // Por ejemplo, una planta podría absorber recursos del ambiente y aumentar su salud
        this.salud += ambiente.obtenerRecursos(10); // Supongamos que absorbe 10 unidades de recursos

        // Además, la planta podría propagarse si alcanza ciertas condiciones
        if (this.estadoReproductivo && this.salud >= 80) {
            Planta nuevaPlanta = new Planta(this.posicionX, this.posicionY);
            ambiente.agregarOrganismo(nuevaPlanta);
            System.out.println("¡Una nueva planta ha brotado en (" + this.posicionX + ", " + this.posicionY + ")!");
        }
    }
}
