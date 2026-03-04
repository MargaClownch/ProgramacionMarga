public class Tarjeta implements Dinero {

    private String numero;
    private double saldo;
    private double credito;
    public static final String NUMER_BASE = "1";
    public static final double SALDO_BASE = 100;
    public static final double CREDITO_BASE = 100;

    public Tarjeta(){
        this.numero = NUMER_BASE;
        this.saldo = SALDO_BASE;
        this.credito = CREDITO_BASE;
    }

    public Tarjeta(String numero, double saldo, double credito){
        this.numero = numero;
        this.saldo = saldo;
        this.credito = credito;
    }

    @Override
    public void valor() {
        System.out.println("El valor de la tarjeta es de: " + saldo + "en saldo y " + credito + "de crédito || El total de la suma es" + (saldo + credito));
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumero() {
        return numero;
    }

    public double getCredito() {
        return credito;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}
