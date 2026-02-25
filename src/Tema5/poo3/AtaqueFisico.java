package Tema5.poo3;

public class AtaqueFisico implements Ataque {
    private String nombre;
    private int costeEstamina;
    private int danioFisico;

    public AtaqueFisico() {
    }

    public AtaqueFisico(String nombre, int costeEstamina, int danioFisico) {
        this.nombre = nombre;
        this.costeEstamina = costeEstamina;
        this.danioFisico = danioFisico;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }


    @Override
    public void lanzar() {
        System.out.println("Golpeando con fuerza física: " + nombre);
    }

    @Override
    public int coste() {
        return costeEstamina;
    }

    @Override
    public int danioInfligido() {
        return danioFisico;
    }
}