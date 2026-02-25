package Tema5.poo3;

public class AtaqueEspadazo implements AtaqueAvanzado {
    private int esfuerzoFisico;
    private int danioFisico;

    public AtaqueEspadazo() {
    }

    public AtaqueEspadazo(int esfuerzoFisico, int danioFisico) {
        this.esfuerzoFisico = esfuerzoFisico;
        this.danioFisico = danioFisico;
    }

    public int getEsfuerzoFisico() { return esfuerzoFisico; }
    public void setEsfuerzoFisico(int esfuerzoFisico) { this.esfuerzoFisico = esfuerzoFisico; }

    public int getDanioFisico() { return danioFisico; }
    public void setDanioFisico(int danioFisico) { this.danioFisico = danioFisico; }

    @Override
    public void lanzar() {
        System.out.println("Dando un espadazo letal");
    }

    @Override
    public int[] coste() {
        return new int[] {0, esfuerzoFisico};
    }

    @Override
    public int[] danioInfligido() {
        return new int[] {0, danioFisico};
    }
}