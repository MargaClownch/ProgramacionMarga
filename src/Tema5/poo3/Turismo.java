package Tema5.poo3;

public class Turismo extends Vehiculo {
    private int numPlazas;
    private String tipoUso;
    public static final int NUMPLAZAS_BASE = 4;
    public static final String TIPO_USO_BASE = "Profesional";

    public Turismo(){
        super();
        this.numPlazas = NUMPLAZAS_BASE;
        this.tipoUso = TIPO_USO_BASE;
    }

    public Turismo(String matricula, String marca, String modelo, int numPlazas, String tipoUso) {
        super(matricula, marca, modelo); // Pasamos los datos al padre
        this.numPlazas = numPlazas;
        this.tipoUso = tipoUso;
    }

    @Override
    public String toString() {
        return super.toString() + " -> Turismo: " + numPlazas + " plazas, Uso: " + tipoUso;
    }

    public int getNumPlazas() { return numPlazas; }
    public void setNumPlazas(int numPlazas) { this.numPlazas = numPlazas; }

    public String getTipoUso() { return tipoUso; }
    public void setTipoUso(String tipoUso) { this.tipoUso = tipoUso; }

}