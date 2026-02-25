package Tema5.poo3;

public class Perro extends Animal {
    private String nombre;
    public static final String NOMBRE_BASE = "MAX";
    public Perro() {
        this.nombre = NOMBRE_BASE;
    }

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void comer() { System.out.println(getNombre() + " está comiendo pienso."); }

    @Override
    public void dormir() { System.out.println(getNombre() + " duerme en su cama."); }

    @Override
    public void hacerRuido() { System.out.println("¡Guau, guau!"); }

    public void pasear() { System.out.println(getNombre() + " está paseando por el parque."); }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
