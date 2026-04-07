package Tema7.Serializacion;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Ejercicio6_Guardar {
    public static void main(String[] args) {
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Ximo", 25));
        listaPersonas.add(new Persona("Ana", 32));
        listaPersonas.add(new Persona("Raquel", 33));

        String rutaArchivo = "Resources/personas.dat";
        //Esto guarda la lista entera
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(rutaArchivo))) {

            //Pasamos el ArrayList directamente
            oos.writeObject(listaPersonas);

            System.out.println("Se ha guardado la lista con " + listaPersonas.size() + " personas en '" + rutaArchivo + "'.");

        } catch (IOException e) {
            System.out.println("Error al guardar la lista: " + e.getMessage());
        }
    }
}
