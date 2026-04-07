package Tema7.Serializacion;

import java.io.Serializable;

//implements Serializable para que funcione esto
public class Persona implements Serializable {

    //Me ha dicho chatyipiti que le meta un numero de versiones a esto para que java no se lie si lo modifico
    //No lo voy a modificar pero bueno es algo curioso y lo pongo
    private static final long serialVersionUID = 1L;

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    @Override
    public String toString() {
        return "Persona [Nombre=" + nombre + ", Edad=" + edad + "]";
    }
}