package Tema7.Serializacion;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class Ejercicio4 {
    public static void main(String[] args) {

        Persona p1 = new Persona("Ximo", 25);
        String rutaArchivo = "Resources/persona.dat";

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(rutaArchivo))) {

            oos.writeObject(p1);

            System.out.println("El objeto se ha serializado y guardado en '" + rutaArchivo + "'.");
            System.out.println("Objeto guardado: " + p1.toString());

        } catch (IOException e) {
            System.out.println("Error al guardar el objeto: " + e.getMessage());
        }
    }
}