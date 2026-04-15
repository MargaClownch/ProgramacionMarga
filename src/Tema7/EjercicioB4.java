package Tema7;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class EjercicioB4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cuántos nombres deseas generar?: ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        System.out.print("A qué archivo quieres añadirlos? (Ej: usa_personas.txt): ");
        String archivoSalida = sc.nextLine();

        List<String> listaNombres = leerArchivo("Resources/usa_nombres.txt");
        List<String> listaApellidos = leerArchivo("Resources/usa_apellidos.txt");

        if (listaNombres.isEmpty() || listaApellidos.isEmpty()) {
            System.out.println("Error: No se han encontrado nombres o apellidos para combinar.");
            return;
        }
        Random rand = new Random();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoSalida, true))) {

            for (int i = 0; i < cantidad; i++) {
                //Sacamos un índice aleatorio para el nombre y otro para el apellido
                int indiceNombre = rand.nextInt(listaNombres.size());
                int indiceApellido = rand.nextInt(listaApellidos.size());

                //Los juntamos
                String nombreCompleto = listaNombres.get(indiceNombre) + " " + listaApellidos.get(indiceApellido);

                //Lo escribimos en el archivo
                bw.write(nombreCompleto);
                bw.newLine();
            }

            System.out.println("Se han añadido " + cantidad + " nombres al archivo '" + archivoSalida + "'.");

        } catch (IOException e) {
            System.out.println("Error al intentar escribir en el archivo: " + e.getMessage());
        }
    }

    //Le pasas el nombre de un archivo y te devuelve una Lista con todas sus líneas
    public static List<String> leerArchivo(String rutaArchivo) {
        List<String> lineas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lineas.add(linea.trim()); //trim() para quyitar los espacios
            }
        } catch (IOException e) {
            System.out.println("No se pudo leer el archivo '" + rutaArchivo + "'.");
        }
        return lineas;
    }
}