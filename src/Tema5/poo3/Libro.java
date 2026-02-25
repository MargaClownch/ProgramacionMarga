package Tema5.poo3;

public class Libro extends Ficha {
    private String autor;
    private String editorial;

    public Libro() {
    }

    public Libro(int numero, String titulo, String autor, String editorial) {
        super(numero, titulo);
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public String getEditorial() { return editorial; }
    public void setEditorial(String editorial) { this.editorial = editorial; }

    @Override
    public String toString() {
        return super.toString() + " -> [LIBRO] Autor: " + autor + " | Editorial: " + editorial;
    }
}