package Tema6;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class FunkoReaderSerializable {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<FunkoSerializable> listaFunkos = new ArrayList<>();
    static String rutaArchivo = "Resources/funkos.csv";
    static String rutaGuardado = "Resources/funkos.dat";
    public static void main(String[] args) {
        cargarFunkos();
        guardarFunkos();
        int opcion;
        do {
            showMenu();
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    addFunko();
                    break;
                case 2:
                    deleteFunko();
                    break;
                case 3:
                    seeFunkos();
                    break;
                case 4:
                    seeMostExpensiveFunko();
                    break;
                case 5:
                    avgPrice();
                    break;
                case 6:
                    break;
                case 7:
                    see2023();
                    break;
                case 0:
                    System.out.println("Funkos guardados! Gracias por usar el programa!");
                default:
                    System.out.println("Opción no válida");
            }
        } while(opcion !=0);

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
        System.out.println("----------------------------------------------------------------");
        System.out.println("Sacando todos los funkos de su caja para que pierdan su valor :)");
        System.out.println("----------------------------------------------------------------");

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))){
            String linea;
            br.readLine();

            while ((linea = br.readLine()) != null){
                String [] datos = linea.split(",");
                if (datos.length == 5) {
                    String cod = datos[0].trim();
                    String nombre = datos[1].trim();
                    String modelo = datos[2].trim();
                    double precio = Double.parseDouble(datos[3].trim());
                    LocalDate fechaLanzamiento = LocalDate.parse(datos[4].trim());
                    FunkoSerializable nuevoFunko = new FunkoSerializable(cod, nombre, modelo, precio, fechaLanzamiento);
                    listaFunkos.add(nuevoFunko);
                }
            }
            for (FunkoSerializable f: listaFunkos){
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
    public static void guardarFunkos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(rutaGuardado))) {
            oos.writeObject(listaFunkos);
            System.out.println("Funkos Guardados!");
        }catch (IOException e) {
            System.out.println("Error al guardar la lista: " + e.getMessage());
        }
    }
    public static void addFunko(){
        System.out.println("\n--- AÑADIR NUEVO FUNKO ---");
        System.out.print("Código (ej. F001): ");
        String cod = sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Modelo/Franquicia: ");
        String modelo = sc.nextLine();
        System.out.print("Precio: ");
        double precio = sc.nextDouble();
        sc.nextLine();
        System.out.print("Fecha de lanzamiento (YYYY-MM-DD): ");
        LocalDate fecha = LocalDate.parse(sc.nextLine());

        FunkoSerializable nuevoFunko = new FunkoSerializable(cod, nombre, modelo, precio, fecha);
        listaFunkos.add(nuevoFunko);
        guardarFunkos();
        System.out.println("Funko añadido y guardado con éxito!\n");
    }
    public static void deleteFunko(){
        System.out.println("\n--- BORRAR FUNKO ---");
        System.out.print("Introduce el CODIGO del Funko que quieres borrar: ");
        String codBorrar = sc.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < listaFunkos.size(); i++) {
            if (listaFunkos.get(i).getCod().equalsIgnoreCase(codBorrar.trim())) {
                System.out.println("Funko encontrado: " + listaFunkos.get(i).getNombre());
                listaFunkos.remove(i);
                encontrado = true;

                guardarFunkos();
                System.out.println("Funko destruido con éxito!\n");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No hay ningún Funko con el código '" + codBorrar + "'.\n");
        }
    }
    public static void seeFunkos(){
        System.out.println("\n--- COLECCIÓN ACTUAL DE FUNKOS ---");

        for (FunkoSerializable f : listaFunkos) {
            System.out.println(f.toString());
        }
        System.out.println("-----------------------------------");
        System.out.println("Total en caja: " + listaFunkos.size() + " Funkos.\n");
    }
    public static void seeMostExpensiveFunko(){
        System.out.println("\n--- EL FUNKO MÁS CARO ---");

        if (listaFunkos.isEmpty()) {
            System.out.println("Tu colección está vacía.");
        } else {
            FunkoSerializable funkoMasCaro = listaFunkos.get(0);

            for (FunkoSerializable f : listaFunkos) {
                if (f.getPrecio() > funkoMasCaro.getPrecio()) {
                    funkoMasCaro = f;
                }
            }
            System.out.println("El Funko más caro es:");
            System.out.println(funkoMasCaro.toString() + "\n");
        }
    }
    public static void avgPrice(){
        System.out.println("\n--- MEDIA DE PRECIO ---");

        if (listaFunkos.isEmpty()) {
            System.out.println("Tu colección está vacía");
        } else {
            double sumaTotal = 0;
            for (FunkoSerializable f : listaFunkos) {
                sumaTotal += f.getPrecio();
            }
            double media = sumaTotal / listaFunkos.size();
            System.out.printf("El precio medio de tu colección es de: %.2f€\n\n", media);
        }
    }
    public static void see2023(){
        System.out.println("\n--- NOVEDADES DEL 2023 ---");

        if (listaFunkos.isEmpty()) {
            System.out.println("Tu colección está vacía.");
        } else {
            boolean hayDel2023 = false;

            for (FunkoSerializable f : listaFunkos) {
                if (f.getFechaLanzamiento().getYear() == 2023) {
                    System.out.println(f.toString());
                    hayDel2023 = true;
                }
            }
            if (!hayDel2023) {
                System.out.println("No tienes ningún Funko lanzado en el año 2023.");
            }
        }
        System.out.println();
    }
}
