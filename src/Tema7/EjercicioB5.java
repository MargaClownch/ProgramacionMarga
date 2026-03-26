package Tema7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EjercicioB5 {

    public static void main(String[] args) {
        String archivoOrigen = "Resources/diccionario.txt";
        String nombreCarpeta = "Resources/Diccionario";

        System.out.println("INICIANDO CLASIFICADOR DE PALABRAS");

        //Crear carpeta
        File carpeta = new File(nombreCarpeta);
        if (!carpeta.exists()) {
            carpeta.mkdir();
            System.out.println("Carpeta '" + nombreCarpeta + "' creada con éxito.");
        }

        //Leer todas las palabras
        List<String> todasLasPalabras = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivoOrigen))) {
            String linea;
            System.out.println("Leyendo el archivo...");

            while ((linea = br.readLine()) != null) {
                //trim() quita los espacios y evitamos guardar líneas vacías
                if (!linea.trim().isEmpty()) {
                    todasLasPalabras.add(linea.trim());
                }
            }
        } catch (IOException e) {
            System.out.println("Error: No se ha encontrado el archivo '" + archivoOrigen + "'.");
            return; // Si no hay diccionario, cortamos el programa aquí
        }

        //Crear archivos de la A a la Z
        System.out.println("Ordenando y creando archivos...");

        // ¡Trucazo de Java! Puedes hacer un bucle for directamente con letras (char)
        for (char letra = 'A'; letra <= 'Z'; letra++) {

            //Le decimos que el archivo va dentro de la carpeta: "Resources/Diccionario/A.txt"
            File archivoDestino = new File(carpeta, letra + ".txt");

            //Abrimos el BufferedWriter para escribir en esa letra.
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoDestino))) {

                int contadorPalabras = 0; // Para saber cuántas metemos en cada letra

                // Recorremos nuestra lista buscando las que empiecen por la letra actual
                for (int i = 0; i < todasLasPalabras.size(); i++) {
                    String palabraActual = todasLasPalabras.get(i);

                    // Pasamos la palabra a mayúsculas para comparar bien (por si en el txt pone "árbol" o "Árbol")
                    // startsWith() comprueba si un String empieza por lo que le pases en el paréntesis
                    if (palabraActual.toUpperCase().startsWith(String.valueOf(letra))) {
                        bw.write(palabraActual);
                        bw.newLine();
                        contadorPalabras++;
                    }
                }

                // Un chivato en consola para ver que trabaja bien
                System.out.println("Archivo " + letra + ".txt creado con " + contadorPalabras + " palabras.");

            } catch (IOException e) {
                System.out.println("Error al escribir el archivo de la letra " + letra);
            }
        }

        System.out.println("¡CLASIFICACIÓN COMPLETADA!");
    }
}