package Tema5;

public class Usuario {

    // Atributos

    private String nombre;
    private int edad;
    public static final String NOMBRE_BASE = "Diana";
    public static final int EDAD_BASE = 17;



    // Contructores

    public void Usuario() {
        this.nombre = NOMBRE_BASE;
        this.edad = EDAD_BASE;
    }
    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }

    // Setters y Getters

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
