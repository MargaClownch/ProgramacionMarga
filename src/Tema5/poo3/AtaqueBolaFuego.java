package Tema5.poo3;

public class AtaqueBolaFuego implements AtaqueAvanzado {
    private int costeMana;
    private int danioMagico;

    // Constructor vacío
    public AtaqueBolaFuego() {
    }

    public AtaqueBolaFuego(int costeMana, int danioMagico) {
        this.costeMana = costeMana;
        this.danioMagico = danioMagico;
    }

    public int getCosteMana() { return costeMana; }
    public void setCosteMana(int costeMana) { this.costeMana = costeMana; }

    public int getDanioMagico() { return danioMagico; }
    public void setDanioMagico(int danioMagico) { this.danioMagico = danioMagico; }

    @Override
    public void lanzar() {
        System.out.println("Lanzando una gigantesca Bola de Fuego");
    }

    @Override
    public int[] coste() {
        return new int[] {costeMana, 0};
    }

    @Override
    public int[] danioInfligido() {
        return new int[] {danioMagico, 0};
    }
}