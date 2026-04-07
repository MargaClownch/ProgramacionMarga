package Tema7.Serializacion;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class Ejercicio5 {
    public static void main(String[] args) {
        String rutaArchivo = "Resources/persona.dat";

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(rutaArchivo))) {

            //He tenido que castear Persona dentro de objeto para que funcione
            Persona personaRecuperada = (Persona) ois.readObject();

            System.out.println("Persona conseguida");
            System.out.println("Datos de la persona: " + personaRecuperada.toString());

        } catch (IOException e) {
            System.out.println("Error de lectura." + e.getMessage());
        } catch (ClassNotFoundException e) {
            // Este catch es obligatorio siempre que leemos objetos.
            // Salta si Java lee el archivo, ve que es una "Persona", pero tú has borrado la clase Persona.java de tu proyecto.
            System.out.println("Error: No se reconoce la clase del objeto. " + e.getMessage());
        }
    }
}
