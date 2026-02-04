package Tema4;

public class Cuenta {
    // Atributos
    private String numeroCuenta;
    private double saldo;
    public static final String NUMERO_CUENTA_BASE = "1012";
    public static final double SALDO_BASE = 0.01;
    public static final double ABONO_MINIMO = 0.19;
    public static final double RECIBO_MINIMO = 0.00;

    // Constructores

    public Cuenta() {
        this.saldo = SALDO_BASE;
        this.numeroCuenta = NUMERO_CUENTA_BASE;
    }

    public Cuenta(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    // Metodos

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + '}';
    }

    public void recibirAbono(double abono) {
        if (abono > ABONO_MINIMO) {
            this.saldo = this.saldo + abono;
        }else {
            System.out.println("El abono no puede ser inferior a 0,20€");
        }
    }
    public void pagarRecibo(double recibo) {
        if (recibo <= RECIBO_MINIMO) {
            System.out.println("El recibo no puede ser inferior o igual a " + RECIBO_MINIMO + " €");
        }
        if (recibo > this.saldo) {
            System.out.println("No tienes saldo suficiente para pagar el recibo");
        } else {
            this.saldo = this.saldo - recibo;
        }
    }

    // Setters y Getters


    public double getSaldo() {
        return saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
