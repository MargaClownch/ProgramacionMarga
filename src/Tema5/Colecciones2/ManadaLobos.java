package Tema5.Colecciones2;

public class ManadaLobos extends Avistamiento{
    private int numeroLobos;
    private String observaciones;
    public static final int NUMERO_LOBOS_BASE = 2;
    public static final String OBSERVACIONES_BASE = "Grandes";

    public ManadaLobos(){
        super(HORA_BASE);
        numeroLobos = NUMERO_LOBOS_BASE;
        observaciones = OBSERVACIONES_BASE;
    }

    public ManadaLobos(int hora, int numeroLobos, String observaciones){
        super(hora);
        this.numeroLobos = numeroLobos;
        this.observaciones = observaciones;
    }

    @Override
    public String toString(){
        return "Lobos [Numero de lobos: " + numeroLobos + ", Observaciones: " + observaciones + "m, Hora: " + getHora() + "h]";
    }

    public int getNumeroLobos() {
        return numeroLobos;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setNumeroLobos(int numeroLobos) {
        this.numeroLobos = numeroLobos;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
