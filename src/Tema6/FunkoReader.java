package Tema6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class FunkoReader {
    static ArrayList<Funko> listaFunkos = new ArrayList<>();
    static String rutaArchivo = "Resources/funkos.csv";
    public static void main(String[] args) {
        cargarFunkos();
        int opcion;
        Scanner sc = new Scanner(System.in);
        do {
            showMenu();
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
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

                    Funko nuevoFunko = new Funko(cod, nombre, modelo, precio, fecha);
                    listaFunkos.add(nuevoFunko);
                    guardarFunkos();
                    System.out.println("Funko añadido y guardado con éxito!\n");
                    break;
                case 2:
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
                    break;
                case 3:
                    System.out.println("\n--- COLECCIÓN ACTUAL DE FUNKOS ---");

                        for (Funko f : listaFunkos) {
                            System.out.println(f.toString());
                        }
                        System.out.println("-----------------------------------");
                        System.out.println("Total en caja: " + listaFunkos.size() + " Funkos.\n");
                    break;
                case 4:
                    System.out.println("\n--- EL FUNKO MÁS CARO ---");

                    if (listaFunkos.isEmpty()) {
                        System.out.println("Tu colección está vacía.");
                    } else {
                        Funko funkoMasCaro = listaFunkos.get(0);

                        for (Funko f : listaFunkos) {
                            if (f.getPrecio() > funkoMasCaro.getPrecio()) {
                                funkoMasCaro = f;
                            }
                        }
                        System.out.println("El Funko más caro es:");
                        System.out.println(funkoMasCaro.toString() + "\n");
                    }
                    break;
                case 5:
                    System.out.println("\n--- 📈 MEDIA DE PRECIO ---");

                    if (listaFunkos.isEmpty()) {
                        System.out.println("Tu colección está vacía");
                    } else {
                        double sumaTotal = 0;
                        for (Funko f : listaFunkos) {
                            sumaTotal += f.getPrecio();
                        }
                        double media = sumaTotal / listaFunkos.size();
                        System.out.printf("El precio medio de tu colección es de: %.2f€\n\n", media);
                    }
                    break;
                case 6:
                    // No se la verdad como hacer esto, espero que no entre en el exámen
                    break;
                case 7:
                    System.out.println("\n--- NOVEDADES DEL 2023 ---");

                    if (listaFunkos.isEmpty()) {
                        System.out.println("Tu colección está vacía.");
                    } else {
                        boolean hayDel2023 = false;

                        for (Funko f : listaFunkos) {
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
                    break;
                case 0:
                    System.out.println("Gracias por usar mi programa!");
                    opcion = 0;
                    break;
                default:
                    System.out.println("Opción no válida");
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
    public static void guardarFunkos() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo))) {
            bw.write("COD,NOMBRE,MODELO,PRECIO,FECHA_LANZAMIENTO");
            bw.newLine();

            for (Funko f : listaFunkos) {
                bw.write(f.getCod() + "," + f.getNombre() + "," + f.getModelo() + "," + f.getPrecio() + "," + f.getFechaLanzamiento());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al guardar los datos en el CSV.");
        }
    }
}
