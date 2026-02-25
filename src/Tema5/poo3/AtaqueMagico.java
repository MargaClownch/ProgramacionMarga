package Tema5.poo3;

public class AtaqueMagico implements Ataque {
    private String nombre;
    private int costeMana;
    private int danioMagico;

    public AtaqueMagico() {
    }

    public AtaqueMagico(String nombre, int costeMana, int danioMagico) {
        this.nombre = nombre;
        this.costeMana = costeMana;
        this.danioMagico = danioMagico;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    @Override
    public void lanzar() {
        System.out.println("✨ Lanzando hechizo: " + nombre);
    }

    @Override
    public int coste() {
        return costeMana;
    }

    @Override
    public int danioInfligido() {
        return danioMagico;
    }
}