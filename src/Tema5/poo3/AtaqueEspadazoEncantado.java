package Tema5.poo3;

public class AtaqueEspadazoEncantado implements AtaqueAvanzado {
    private int costeMana;
    private int esfuerzoFisico;
    private int danioMagico;
    private int danioFisico;

    public AtaqueEspadazoEncantado() {
    }

    public AtaqueEspadazoEncantado(int costeMana, int esfuerzoFisico, int danioMagico, int danioFisico) {
        this.costeMana = costeMana;
        this.esfuerzoFisico = esfuerzoFisico;
        this.danioMagico = danioMagico;
        this.danioFisico = danioFisico;
    }

    public int getCosteMana() { return costeMana; }
    public void setCosteMana(int costeMana) { this.costeMana = costeMana; }
    public int getEsfuerzoFisico() { return esfuerzoFisico; }
    public void setEsfuerzoFisico(int esfuerzoFisico) { this.esfuerzoFisico = esfuerzoFisico; }
    public int getDanioMagico() { return danioMagico; }
    public void setDanioMagico(int danioMagico) { this.danioMagico = danioMagico; }
    public int getDanioFisico() { return danioFisico; }
    public void setDanioFisico(int danioFisico) { this.danioFisico = danioFisico; }

    @Override
    public void lanzar() {
        System.out.println("Espadazo envuelto en llamas mágicas");
    }

    @Override
    public int[] coste() {
        // Gastamos de los dos atributos
        return new int[] {costeMana, esfuerzoFisico};
    }

    @Override
    public int[] danioInfligido() {
        // Hacemos daño de los dos tipos
        return new int[] {danioMagico, danioFisico};
    }
}