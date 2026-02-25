public class Pocion extends Articulo {
    private int nivelPocion;
    private int precio;

    public Pocion(String nombre, boolean gratis, int nivelPocion){
        super(nombre,gratis);
        this.nivelPocion = nivelPocion;
    }

    @Override
    public String tipoArticulo(){
        return "Nombre: " + nombre + " Esgratis?: " + gratis + " Nivel: " + nivelPocion;
    }
    @Override
    public int precioArticulo(){
        if (!gratis){
        return precio = 5 * nivelPocion;
        }else return 0;
    }

    public int getNivelPocion() {
        return nivelPocion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setNivelPocion(int nivelPocion) {
        this.nivelPocion = nivelPocion;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
