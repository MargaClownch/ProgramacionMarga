package Tema5.poo3;

public class DVD extends Ficha {
    private String director;
    private int anyo;
    private String tipo;

    public DVD() {
    }

    public DVD(int numero, String titulo, String director, int anyo, String tipo) {
        super(numero, titulo);
        this.director = director;
        this.anyo = anyo;
        this.tipo = tipo;
    }

    public String getDirector() { return director; }
    public void setDirector(String director) { this.director = director; }

    public int getAnyo() { return anyo; }
    public void setAnyo(int anyo) { this.anyo = anyo; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    @Override
    public String toString() {
        return super.toString() + " -> [DVD] Director: " + director + " | Año: " + anyo + " | Género: " + tipo;
    }
}