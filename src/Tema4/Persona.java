package Tema4;

public class Persona {
    // Atributos
    private final String dni;
    private String nombre;
    private String apellido;
    private int edad;
    public static final String DNIBASE = "00000000X";
    public static final String NOMBREBASE ="Marga";
    public static final String APELLIDOBASE = "Zaharía";
    public static final int EDADBASE = 26;
    public static final int ADULTAGE = 18;
    public static final int RETIREDAGE = 65;
    public static final int MAXDNILENGTH = 9;
    // Constructores
    public Persona(){
        this.dni=DNIBASE;
        this.nombre=NOMBREBASE;
        this.apellido=APELLIDOBASE;
        this.edad=EDADBASE;
    }
    public Persona(String dni,String nombre,String apellido,int edad){
        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
    }
    // Métodos
    public String toString(){
        return this.dni+" "+this.nombre+" "+this.apellido+" "+this.edad;
    }
    public void print(){
        System.out.println("Mi dni es " + this.dni);
        System.out.println("Mi nombre es " + this.nombre);
        System.out.println("Mi apellido es " + this.apellido);
        System.out.println("Mi edad es " + this.edad);
    }
    public boolean isAdult(){

        if(this.edad >= ADULTAGE){
            return true;
        } else{
            return false;
        }
        //return
        //return this.edad >= ADULTAGE;

    }


    public boolean isRetired(){
        if(this.edad >= RETIREDAGE){
            return true;
        } else{
            return false;
        }
    }
    public void ageDiference(Persona p){
        int diferencia = Math.abs(this.edad-p.edad);
        System.out.println("La diferencia de edad es " + diferencia);
    }
    public static void checkDNI(String dni){
        if(dni.length() == MAXDNILENGTH){
            System.out.println("El dni es valido");
        }else{
            System.out.println("El dni es invalido");
        }
    }
    // Setters y Getters
    public int getEdad(){
        return this.edad;
    }
    public String getDni(){
        return this.dni;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public void setEdad(int edad){
        if(edad >= 0 && this.edad <= 123){
        this.edad = edad;
        }else{
            System.out.println("La edad es invalida");
        }
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
}