public class Accesorio extends Articulo{

    private final String nombre;

    public Accesorio(String nombre, boolean gratis, String nombreA) {
        super(nombre, gratis);
        this.nombre = nombreA;
    }

    @Override
    public String tipoArticulo(){
        return "Nombre: " + nombre + " Esgratis?: " + gratis;
    }
    @Override
    public int precioArticulo(){
        if (!gratis){
            return 7;
        }else return 0;
    }

}
