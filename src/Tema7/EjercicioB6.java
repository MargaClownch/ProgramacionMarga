package Tema7;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EjercicioB6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rutaArchivo = "Resources/pi-million.txt";
        StringBuilder piBuilder = new StringBuilder();

        System.out.println("CARGANDO EL MILLÓN DE DECIMALES DE PI...");
        //Lectura de archivo
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            //Lo vamos leyendo y juntando todo, por si el archivo tiene saltos de línea
            while ((linea = br.readLine()) != null) {
                piBuilder.append(linea);
            }
        } catch (IOException e) {
            System.out.println("Error: No se ha encontrado el archivo '" + rutaArchivo + "'.");
            return; //Si no hay archivo cortamos
        }

        String piCompleto = piBuilder.toString();

        System.out.print("Introduce el número que quieres buscar: ");
        String numeroBuscado = sc.nextLine();

        //Busqueda manual
        //Convertimos todo a arrays de caracteres
        char[] piArray = piCompleto.toCharArray();
        char[] busquedaArray = numeroBuscado.toCharArray();

        boolean encontrado = false;
        int posicionEncontrada = -1;

        //Calculamos hasta dónde podemos buscar sin salirnos del array (IndexOutOfBounds)
        int limite = piArray.length - busquedaArray.length;

        System.out.println("Buscando...");

        //Algoritmo de busqueda
        for (int i = 0; i <= limite; i++) {
            boolean coincide = true;

            //Comprobamos si los caracteres coinciden
            for (int j = 0; j < busquedaArray.length; j++) {
                //Comparamos la letra actual de Pi (i + j) con la letra actual de nuestra búsqueda (j)
                if (piArray[i + j] != busquedaArray[j]) {
                    coincide = false; //Al primer fallo, sabemos que por aquí no es
                    break; //Rompemos este bucle interno para no perder tiempo y pasamos a la siguiente 'i'
                }
            }
            //Si el bucle interno terminó y sigue siendo true, se ha encontrado a la primera
            if (coincide) {
                encontrado = true;
                posicionEncontrada = i;
                break; //Rompemos el bucle general porque ya hemos terminado el trabajo
            }
        }

        if (encontrado) {
            System.out.println("El número '" + numeroBuscado + "' aparece.");
            System.out.println("Se encuentra a partir de la posición: " + posicionEncontrada);
        } else {
            System.out.println("El número '" + numeroBuscado + "' no aparece en este millón de decimales.");
        }
    }
}