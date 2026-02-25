package Tema5.poo3;

public class Gato extends Animal {
    public Gato() {}

    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void comer() { System.out.println(getNombre() + " está comiendo atún."); }

    @Override
    public void dormir() { System.out.println(getNombre() + " duerme encima del teclado."); }

    @Override
    public void hacerRuido() { System.out.println("¡Miau!"); }

    public void aranarMuebles() { System.out.println(getNombre() + " está destrozando el sofá."); }
}