package Tema5;

public class Gato {
    private String nombre;
    private int edad;
    public static final String NOMBRE_BASE = "Diana";
    public static final int EDAD_BASE = 17;
    public static final int EDAD_MINIMA = 0;
    public static final int LONGITUD_NOMBRE_MINIMA = 3;

    // Constructores
    public Gato(){
        this.nombre = NOMBRE_BASE;
        this.edad = EDAD_BASE;
    }
    public Gato(String nombre, int edad) throws Exception {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos
    public void imprimir() {
        System.out.println("Gato: " + nombre + ", Edad: " + edad);
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if (nombre.length() < LONGITUD_NOMBRE_MINIMA) {
            throw new Exception("El nombre debe tener al menos " + LONGITUD_NOMBRE_MINIMA + " caracteres.");
        }
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if (edad < EDAD_MINIMA) {
            throw new Exception("La edad no puede ser negativa.");
        }
        this.edad = edad;
    }

}