package Tema5.Colecciones2;

import java.util.Random;

public class Proceso {
    private String id;
    private double tiempoRestante;
    public static final String ID_BASE = "";
    Random rand = new Random();

    public Proceso() {
        id = ID_BASE;
        this.tiempoRestante = rand.nextInt(4) + 1;
    }

    public Proceso(String id) {
        this.id = id;
        this.tiempoRestante = rand.nextInt(4) + 1;
    }

    @Override
    public String toString() {
        return id + " " + tiempoRestante;
    }

    public void restarTiempo(double tiempo) {
        this.tiempoRestante = this.tiempoRestante - tiempo;
    }

    public String getId() {
        return id;
    }

    public double getTiempoRestante() {
        return tiempoRestante;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTiempoRestante(double tiempoRestante) {
        this.tiempoRestante = tiempoRestante;
    }
}