package Tema5.poo3;

public class Pajaro extends Animal {
    public Pajaro() {}

    public Pajaro(String nombre) {
        super(nombre);
    }

    @Override
    public void comer() { System.out.println(getNombre() + " está comiendo alpiste."); }

    @Override
    public void dormir() { System.out.println(getNombre() + " duerme en su nido."); }

    @Override
    public void hacerRuido() { System.out.println("¡Pío, pío!"); }

    public void volar() { System.out.println(getNombre() + " está volando libremente."); }
}