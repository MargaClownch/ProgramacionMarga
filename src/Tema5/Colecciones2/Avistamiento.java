package Tema5.Colecciones2;

public class Avistamiento {
    private int hora;
    public static final int HORA_BASE = 8;

    public Avistamiento(){
        hora = HORA_BASE;
    }

    public Avistamiento(int hora){
        this.hora = hora;
    }

    @Override
    public String toString(){
        return "Hora del avistamiento" + hora;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
}
