public abstract class Articulo {
    protected String nombre;
    protected boolean gratis;


    public Articulo(String nombre, boolean gratis){
        this.nombre = nombre;
        this.gratis = gratis;
    }
    public String tipoArticulo(){
        return "";
    }
    public int precioArticulo(){
        return 0;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isGratis() {
        return gratis;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGratis(boolean gratis) {
        this.gratis = gratis;
    }
}
