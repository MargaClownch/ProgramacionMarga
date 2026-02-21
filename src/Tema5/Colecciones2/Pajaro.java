package Tema5.Colecciones2;

public class Pajaro extends Avistamiento{
    private double peso;
    private String especie;
    public static final double PESO_BASE = 1.00;
    public static final String ESPECIE_BASE = "Pajaro";

    public Pajaro(){
        super(HORA_BASE);
        this.peso = PESO_BASE;
        this.especie = ESPECIE_BASE;
    }

    public Pajaro(int hora, double peso, String especie){
        super(hora);
        this.peso = peso;
        this.especie = especie;
    }

    @Override
    public String toString(){
        return "Pajaro [Especie: " + especie + ", peso: " + peso + "m, Hora: " + getHora() + "h]";
    }

    public double getPeso() {
        return peso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
