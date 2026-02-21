package Tema5.Colecciones2;

public class Serpiente extends Avistamiento{

    private double longitud;
    private String especie;
    public static final double LONGITUD_BASE = 1.00;
    public static final String ESPECIE_BASE = "Verde";

    public Serpiente(){
        super(HORA_BASE);
        this.longitud = LONGITUD_BASE;
        this.especie = ESPECIE_BASE;
    }

    public Serpiente(int hora, double longitud, String especie){
        super(hora);
        this.longitud = longitud;
        this.especie = especie;
    }
    @Override
    public String toString(){
        return "Serpiente [Especie: " + especie + ", Longitud: " + longitud + "m, Hora: " + getHora() + "h]";
    }

    public double getLongitud() {
        return longitud;
    }

    public String getEspecie() {
        return especie;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
