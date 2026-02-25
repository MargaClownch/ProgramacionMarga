package Tema5.poo3;

public class Ciclomotor extends Vehiculo {
    private int cilindrada;
    public static final int CILINDRADA_BASE = 120;

    public Ciclomotor(){
        super();
        cilindrada = CILINDRADA_BASE;
    }

    public Ciclomotor(String matricula, String marca, String modelo, int cilindrada) {
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }

    public boolean necesitaCarnet() {
        return this.cilindrada >= 125;
    }

    @Override
    public String toString() {
        String carnet = necesitaCarnet() ? "Sí necesita carnet" : "No necesita carnet";
        return super.toString() + " -> Ciclomotor: " + cilindrada + "cc (" + carnet + ")";
    }

    public int getCilindrada() { return cilindrada; }
    public void setCilindrada(int cilindrada) { this.cilindrada = cilindrada; }

}