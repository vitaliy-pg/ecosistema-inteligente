package ecosistemas.endidades;

public class Animal extends Organismo {
    public Animal(int posX, int posY) {
        super(posX, posY, "Animal", true); // Los animales son depredadores
    }

    @Override
    public void interactuar(Ambiente ambiente) {
        // Los animales interactúan buscando comida, depredando, moviéndose, reproduciéndose, etc.
        // Aquí puedes implementar la lógica específica para los animales

        // Por ejemplo, un animal podría buscar comida y, si encuentra, aumentar su salud
        int recursosEncontrados = ambiente.buscarComida(this);
        if (recursosEncontrados > 0) {
            this.salud += recursosEncontrados;
        }

        // También podrían moverse aleatoriamente por el ambiente
        moverseAleatoriamente(ambiente);
    }

    private void moverseAleatoriamente(Ambiente ambiente) {
        // Método para simular el movimiento aleatorio de un animal en el ambiente
        int newX = this.posicionX + (int) (Math.random() * 3) - 1; // Mover en el rango [-1, 1]
        int newY = this.posicionY + (int) (Math.random() * 3) - 1; // Mover en el rango [-1, 1]

        // Verificar si la nueva posición está dentro de los límites del ambiente
        if (ambiente.validarPosicion(newX, newY)) {
            this.posicionX = newX;
            this.posicionY = newY;
            System.out.println("El animal se ha movido a (" + this.posicionX + ", " + this.posicionY + ")");
        }
    }
}
