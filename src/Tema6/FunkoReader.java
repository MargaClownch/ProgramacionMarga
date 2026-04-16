package Tema6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;

public class FunkoReader {
    public static void main(String[] args) {
        String rutaArchivo = "Resources/funkos.csv";
        ArrayList<Funko> listaFunkos = new ArrayList<>();

        System.out.println("Sacando todos los funkos de su caja para que pierdan su valor :)");
        System.out.println("------------------------------------");

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))){
            String linea;
            br.readLine();

            while ((linea = br.readLine()) != null) {
                String [] datos = linea.split(",");
                if (datos.length == 5) {
                    String cod = datos[0].trim();
                    String nombre = datos[1].trim();
                    String modelo = datos[2].trim();
                    double precio = Double.parseDouble(datos[3].trim());
                    LocalDate fechaLanzamiento = LocalDate.parse(datos[4].trim());
                    Funko nuevoFunko = new Funko(cod, nombre, modelo, precio, fechaLanzamiento);
                    listaFunkos.add(nuevoFunko);
                }
            }
            System.out.println("Todos los funkos fuera de sus cajas!");
            System.out.println("------------------------------------");
            for (Funko f : listaFunkos) {
                System.out.println(f.toString());
            }
        }
        catch (IOException e){
            System.out.println("Error al leer el funko");
        }
        catch (NumberFormatException e){
            System.out.println("Error en el precio csv");
        }
        catch (DateTimeParseException e){
            System.out.println("Error en la fecha del csv");
        }
    }
}
