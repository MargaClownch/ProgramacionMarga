public class Billete implements Dinero {
    private int valor;
    public static final int VALOR_BASE = 100;

    public Billete() {
        this.valor = VALOR_BASE;
    }

    public Billete(int valor){
        this.valor = valor;
    }

    @Override
    public void valor() {
        System.out.println("El valor del billete es: " + this.valor);
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
