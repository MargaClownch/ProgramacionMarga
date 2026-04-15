package Tema7.Serializacion;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio3 {
    public static void main(String[] args) {

        String rutaArchivo = "Resources/texto.txt";
        int totalPalabras = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                // Limpiamos los espacios por delante y por detrás con nuestro amigo el trimmy
                linea = linea.trim();

                // Si la línea no está completamente vacía, contamos sus palabras
                if (!linea.isEmpty()) {
                    // split("\\s+") corta la frase usando cualquier cantidad de espacios como "tijera"
                    String[] palabrasArray = linea.split("\\s+");

                    // Sumamos la cantidad de trozos (palabras) que ha sacado
                    totalPalabras += palabrasArray.length;
                }
            }

            System.out.println("Lectura finalizada.");
            System.out.println("El fichero '" + rutaArchivo + "' tiene un total de: " + totalPalabras + " palabras.");

        } catch (IOException e) {
            System.out.println("Error al leer el archivo. Asegúrate de que 'texto.txt' existe en 'Resources/'. Detalles: " + e.getMessage());
        }
    }
}