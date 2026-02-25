package Tema5.poo3;

public class Vaca extends Animal {
    public Vaca() {}

    public Vaca(String nombre) {
        super(nombre);
    }

    @Override
    public void comer() { System.out.println(getNombre() + " está pastando hierba."); }

    @Override
    public void dormir() { System.out.println(getNombre() + " duerme de pie en el prado."); }

    @Override
    public void hacerRuido() { System.out.println("¡Muuuuuu!"); }

    public void darLeche() { System.out.println(getNombre() + " está siendo ordeñada."); }
}