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
}
