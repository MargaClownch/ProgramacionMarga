package Tema4;

public class PersonaCuenta {

    // Atributos

    private String dni;
    private int [] cuentas = new int[3];
    private int cuenta;
    public static final int CUENTA_BASE = 1001;
    public static final String DNI_BASE = "X0000000";


    // Constructores

    public PersonaCuenta() {
        dni = DNI_BASE;
        cuenta = CUENTA_BASE;
    }
    public PersonaCuenta(String dni, int cuenta) {
        this.dni = dni;
        this.cuenta = cuenta;
    }

    // Métodos

    public void moroso(){

    }
    public void addCuenta(int cuenta){
        if(cuenta < 3){
        cuentas[cuenta]++;
        }
    }

    // Setters y getters

    public String getDni() {
        return dni;
    }

    public int getCuenta() {
        return cuenta;
    }

    public int[] getCuentas() {
        return cuentas;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setCuentas(int[] cuentas) {
        this.cuentas = cuentas;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }
}
