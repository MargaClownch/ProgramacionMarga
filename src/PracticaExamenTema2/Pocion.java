package PracticaExamenTema2;

public class Pocion extends Articulo {
    private int puntosSalud;

    public Pocion(String nombre, double precio, int puntosSalud) {
        super(nombre, precio);
        this.puntosSalud = puntosSalud;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("🧪 Poción: " + getNombre() + " | Precio: " + getPrecio() + "¥ | Cura: " + puntosSalud + " PS");
    }
}