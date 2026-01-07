package Tema4;

public class Persona {
    private String nombre;
    private int edad;
    public static final int edadBase = 0;
    public Persona(){
        this.nombre = "Marga";
        this.edad = edadBase;
    }
    public Persona(String nombre){
        this.nombre = nombre;
        this.edad = edadBase;
    }
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public void saludar() {
        System.out.println("Hola!");
    }
    public void presentarme() {
        System.out.println("Soy " + nombre + " " + edad + " años.");
    }
    public void saludarA(String nombre) {
        System.out.println("Hola " + nombre + "!");
    }
    public static void showInfo(){
        System.out.println("Las personas tienen edad y nombre");
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}