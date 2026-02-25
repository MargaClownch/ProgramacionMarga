package Tema5.poo3;

public class Revista extends Ficha {
    private int numeroPublicacion;
    private int anyo;

    public Revista() {
    }

    public Revista(int numero, String titulo, int numeroPublicacion, int anyo) {
        super(numero, titulo);
        this.numeroPublicacion = numeroPublicacion;
        this.anyo = anyo;
    }

    public int getNumeroPublicacion() { return numeroPublicacion; }
    public void setNumeroPublicacion(int numeroPublicacion) { this.numeroPublicacion = numeroPublicacion; }

    public int getAnyo() { return anyo; }
    public void setAnyo(int anyo) { this.anyo = anyo; }

    @Override
    public String toString() {
        return super.toString() + " -> [REVISTA] Año: " + anyo + " | Nº Publicación: " + numeroPublicacion;
    }
}