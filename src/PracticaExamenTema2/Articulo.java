package PracticaExamenTema2;

public abstract class Articulo {
    private String nombre;
    private double precio;

    public Articulo(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Método abstracto que cada hijo hará a su manera
    public abstract void mostrarDetalles();

    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
}