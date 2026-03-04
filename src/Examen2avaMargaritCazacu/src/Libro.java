public class Libro {
    private String isbn;
    private String nombre;
    private String autor;
    private int numPaginas;
    private String genero;
    private String formato;
    private int peso;

    public Libro(String isbn, String nombre, String autor){
        this.isbn = isbn;
        this.nombre = nombre;
        this.autor = autor;
        this.numPaginas = 100;
        this.genero = "Terror";
        this.formato = "tapa dura";
    }
    @Override
    public String toString(){
        return "Nombre " + this.nombre + " Autor " + this.autor + " Peso: " ;
    }
    public void pesoGramos(){
        if (this.formato.equals("tapa dura")){
            peso = 50;
        } else if (this.formato.equals("tapa blanda")) {
            peso = 20;
        }else {
            peso = 10;
        }
    }

    public String getIsbn() {
        return isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public String getGenero() {
        return genero;
    }

    public String getFormato() {
        return formato;
    }

    public int getPeso() {
        return peso;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
