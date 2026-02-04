package Tema5;

public class UsuarioBanco {
   private String dni;
   private String nombre;
   private int edad;
   public static final String DNI_BASE = "1234";
   public static final String NOMBRE_BASE = "Diana";
   public static final int EDAD_BASE = 17;



    // Constructores

    public void UsuarioBanco(){
        this.dni = DNI_BASE;
        this.nombre = NOMBRE_BASE;
        this.edad = EDAD_BASE;
    }
    public UsuarioBanco(String dni, String nombre, int edad) {

        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }

    // Metodos

    @Override
    public String toString(){
        return "Usuario{" + " nombre=" + nombre + ", edad=" + edad + "dni=" + dni + '}';
    }

    // Setters y Getters


    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
