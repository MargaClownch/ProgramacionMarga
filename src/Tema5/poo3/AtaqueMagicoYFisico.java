package Tema5.poo3;

public class AtaqueMagicoYFisico implements Ataque {
    private String nombre;
    private int costeTotal;
    private int danioTotal;

    public AtaqueMagicoYFisico() {
    }

    public AtaqueMagicoYFisico(String nombre, int costeTotal, int danioTotal) {
        this.nombre = nombre;
        this.costeTotal = costeTotal;
        this.danioTotal = danioTotal;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    @Override
    public void lanzar() {
        System.out.println("Ataque combinado: " + nombre);
    }

    @Override
    public int coste() {
        return costeTotal;
    }

    @Override
    public int danioInfligido() {
        return danioTotal;
    }
}