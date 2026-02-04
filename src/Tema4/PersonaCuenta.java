package Tema4;

public class PersonaCuenta {

    // Atributos

    private String dni;
    private Cuenta [] cuentas ;
    private int contadorCuentas;
    public static final int CUENTA_BASE = 1001;
    public static final String DNI_BASE = "X0000000";


    // Constructores

    public PersonaCuenta() {
        dni = DNI_BASE;

    }
    public PersonaCuenta(String dni) {
        this.dni = dni;
        this.cuentas = new Cuenta[3];
        this.contadorCuentas = 0;
    }

    // Métodos

    public boolean esMorosa() {
        for (int i = 0; i < contadorCuentas; i++) {
            if (cuentas[i].getSaldo() < 0) {
                return true;
            }
        }
        return false;
    }
    public void anadirCuenta(Cuenta newCuenta) {
        if (contadorCuentas < 3) {
            cuentas[contadorCuentas] = newCuenta;
            contadorCuentas++;
            System.out.println("Cuenta añadida con éxito.");
        } else {
            System.out.println("Error: Esta persona ya tiene el máximo de 3 cuentas.");
        }
    }
    @Override
    public String toString() {
        String info = "Cliente DNI: " + dni + "\n";
        for (int i = 0; i < contadorCuentas; i++) {
            info += " --> " + cuentas[i].toString() + "\n";
        }
        return info;
    }

    // Setters y getters


    public String getDni() {
        return dni;
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }

    public int getContadorCuentas() {
        return contadorCuentas;
    }

    public void setCuentas(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setContadorCuentas(int contadorCuentas) {
        this.contadorCuentas = contadorCuentas;
    }
}
