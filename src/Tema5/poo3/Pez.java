package Tema5.poo3;

public class Pez extends Animal {
    public Pez() {}

    public Pez(String nombre) {
        super(nombre);
    }

    @Override
    public void comer() { System.out.println(getNombre() + " come escamas de comida."); }

    @Override
    public void dormir() { System.out.println(getNombre() + " duerme con los ojos abiertos en el agua."); }

    @Override
    public void hacerRuido() { System.out.println("*Glub, glub*"); }

    public void nadar() { System.out.println(getNombre() + " está nadando por la pecera."); }
}