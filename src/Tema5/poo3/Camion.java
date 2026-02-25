package Tema5.poo3;

public class Camion extends Vehiculo {
    private double pesoMaximo;
    private boolean mercanciaPeligrosa;
    public static final double PESOMAXIMO_BASE = 1000;
    public static final boolean MERCANCIAPELIGROSA_BASE = true;

    public Camion(){
        super();
        this.pesoMaximo = PESOMAXIMO_BASE;
        this.mercanciaPeligrosa = MERCANCIAPELIGROSA_BASE;
    }

    public Camion(String matricula, String marca, String modelo, double pesoMaximo, boolean mercanciaPeligrosa) {
        super(matricula, marca, modelo);
        this.pesoMaximo = pesoMaximo;
        this.mercanciaPeligrosa = mercanciaPeligrosa;
    }

    @Override
    public String toString() {
        String peligrosa = mercanciaPeligrosa ? "Sí" : "No";
        return super.toString() + " -> Camión: " + pesoMaximo + "kg máx, Mercancía peligrosa: " + peligrosa;
    }

    public double getPesoMaximo() { return pesoMaximo; }
    public void setPesoMaximo(double pesoMaximo) { this.pesoMaximo = pesoMaximo; }

    public boolean isMercanciaPeligrosa() { return mercanciaPeligrosa; }
    public void setMercanciaPeligrosa(boolean mercanciaPeligrosa) { this.mercanciaPeligrosa = mercanciaPeligrosa; }

}