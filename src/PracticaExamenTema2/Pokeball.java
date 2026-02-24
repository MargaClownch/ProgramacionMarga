package PracticaExamenTema2;

public class Pokeball extends Articulo {
    private double ratioCaptura;

    public Pokeball(String nombre, double precio, double ratioCaptura) {
        super(nombre, precio);
        this.ratioCaptura = ratioCaptura;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("🔴 Pokeball: " + getNombre() + " | Precio: " + getPrecio() + "¥ | Ratio: x" + ratioCaptura);
    }
}