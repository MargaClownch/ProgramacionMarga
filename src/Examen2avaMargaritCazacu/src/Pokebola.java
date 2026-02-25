public class Pokebola extends Articulo{

    private String tipo;


    public Pokebola(String nombre, boolean gratis, String tipo) {
        super(nombre, gratis);
        this.tipo = tipo;
    }

    @Override
    public String tipoArticulo(){
        return "Nombre: " + nombre + " Esgratis? : " + gratis + " Tipo: " + tipo;
    }
    @Override
    public int precioArticulo(){
        if (gratis){
           return 0;
        }else {
            if (tipo.equals("pokeball")){
                return  2;
            } else if (tipo.equals("great ball")) {
                return  5;
            }else{
                return  10;
            }
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
