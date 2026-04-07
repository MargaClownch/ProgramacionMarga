package Tema7.Serializacion;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Ejercicio6_Leer {
    public static void main(String[] args) {

        String rutaArchivo = "Resources/personas.dat";

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(rutaArchivo))) {

            //Leemos el objeto y le hacemos el casting a ArrayList<Persona>
            //Sale un error de aviso en el IDE indicando que es un casting no comprobado, dice yipiti que es algo normal y que ponga lo de abajo)
            @SuppressWarnings("unchecked")
            ArrayList<Persona> listaRecuperada = (ArrayList<Persona>) ois.readObject();

            System.out.println("Lista recuperada con éxito. Mostrando datos:");
            //Bucle para leer
            for (Persona p : listaRecuperada) {
                System.out.println("- " + p.toString());
            }

        } catch (IOException e) {
            System.out.println("Error de lectura: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error: No se reconoce la clase. " + e.getMessage());
        }
    }
}