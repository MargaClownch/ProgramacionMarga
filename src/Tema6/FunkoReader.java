package Tema6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class FunkoReader {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        cargarFunkos();
        int opcion;

        do {
            showMenu();
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 0:
                    break;
                default:
                    break;
            }
        } while (opcion !=0);
    }
    public static void showMenu(){
        System.out.println("1. Añadir Funko");
        System.out.println("2. Borrar Funko");
        System.out.println("3. Mostrar todos los Funkos");
        System.out.println("4. Mostrar el Funko más caro");
        System.out.println("5. Mostrar la media de precio");
        System.out.println("6. Mostrar funkos agrupados por modelos");
        System.out.println("7. Mostrar los funkos del 2023");
        System.out.println("0. Salir");

    }
    public static void cargarFunkos(){
        String rutaArchivo = "Resources/funkos.csv";
        ArrayList<Funko> listaFunkos = new ArrayList<>();
        System.out.println("----------------------------------------------------------------");
        System.out.println("Sacando todos los funkos de su caja para que pierdan su valor :)");
        System.out.println("----------------------------------------------------------------");

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

            for (Funko f : listaFunkos) {
                System.out.println(f.toString());
                System.out.println("--------------------------------------------------------------------------------------------------------------");
            }
            System.out.println("------------------------------------");
            System.out.println("Todos los funkos fuera de sus cajas!");
            System.out.println("------------------------------------");
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
    public static void addFunko(){
        String cod = sc.nextLine();
        String nombre = sc.nextLine();
        String modelo = sc.nextLine();
        double precio = Double.parseDouble(datos[3].trim());
        LocalDate fechaLanzamiento = LocalDate.parse(datos[4].trim());
        Funko nuevoFunko = new Funko(cod, nombre, modelo, precio, fechaLanzamiento);
        listaFunkos.add(nuevoFunko);
    }
}
