package Tema7.Serializacion;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2 {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("Resources/usuario.txt"))) {
            String linea;

            // br.readLine() lee una línea entera. Cuando llega al final del archivo, devuelve null.
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

            System.out.println("\nLectura completada con éxito.");

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}