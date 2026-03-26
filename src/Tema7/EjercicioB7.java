package Tema7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EjercicioB7 {

    public static void main(String[] args) {
        String rutaArchivo = "Resources/Libros/lazarillo.txt";

        int numLineas = 0;
        int numPalabras = 0;
        int numCaracteres = 0;

        HashMap<String, Integer> diccionarioPalabras = new HashMap<>();

        System.out.println("Leyendo el libro y calculando estadísticas...\n");

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                numLineas++;
                //Contamos cuántos caracteres tiene la línea
                numCaracteres = numCaracteres + linea.length();
                //Pasamos todo a minúsculas para que cuenten como la misma palabra.
                //El replaceAll quita puntos, comas, exclamaciones... dejando solo letras y espacios.
                String lineaLimpia = linea.toLowerCase().replaceAll("[^a-záéíóúüñ]", " ");

                //Spliteamos los espacios
                String[] palabrasArray = lineaLimpia.split("\\s+");

                //Contador de palabras y hashmap
                for (int i = 0; i < palabrasArray.length; i++) {
                    String palabraActual = palabrasArray[i];

                    //Si no es un espacio en blanco la procesamos
                    if (!palabraActual.isEmpty()) {
                        numPalabras++;

                        //Si la palabra ya existe en el hashmap le sumamos 1 a su valor
                        if (diccionarioPalabras.containsKey(palabraActual)) {
                            int vecesQueHaSalido = diccionarioPalabras.get(palabraActual);
                            diccionarioPalabras.put(palabraActual, vecesQueHaSalido + 1);
                        } else {
                            //Si es la primera vez que vemos esta palabra la guardamos con un 1
                            diccionarioPalabras.put(palabraActual, 1);
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error: No se ha podido leer el archivo '" + rutaArchivo + "'.");
            return;
        }

        System.out.println("ESTADÍSTICAS GLOBALES ");
        System.out.println("- Total de líneas: " + numLineas);
        System.out.println("- Total de palabras: " + numPalabras);
        System.out.println("- Total de caracteres: " + numCaracteres);
        System.out.println("---------------------------\n");

        //Un HashMap NO se puede ordenar por su valor directamente.
        //El truco es pasar sus datos a un ArrayList y ordenarlo ahí.
        List<Map.Entry<String, Integer>> listaOrdenada = new ArrayList<>(diccionarioPalabras.entrySet());

        //Esta es una "receta mágica" de Java para ordenar de Mayor a Menor según el número (Valor)
        listaOrdenada.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        System.out.println("TOP 10 PALABRAS MÁS USADAS ");

        //Usamos Math.min para que el bucle dé 10 vueltas, o el tamaño de la lista si es menor por si da la casualidad de que el libro es muy corto.
        int limite = Math.min(10, listaOrdenada.size());

        for (int i = 0; i < limite; i++) {
            String palabra = listaOrdenada.get(i).getKey();
            int cantidad = listaOrdenada.get(i).getValue();
            System.out.println((i + 1) + ". '" + palabra + "' -> " + cantidad + " veces.");
        }
    }
}