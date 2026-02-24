package PracticaExamenTema2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TiendaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Articulo> inventario = new ArrayList<>();
        int opcion = -1;

        do {
            System.out.println("\n--- TIENDA POKÉMON ---");
            System.out.println("1. Añadir Pokeball");
            System.out.println("2. Añadir Poción");
            System.out.println("3. Borrar artículo");
            System.out.println("4. Mostrar todo");
            System.out.println("5. Mostrar coste total");
            System.out.println("0. Salir");
            System.out.print("Elige: ");

            // PRIMER TRY-CATCH: Evitar que explote el menú si meten letras
            try {
                opcion = sc.nextInt();
                sc.nextLine(); // Limpiar buffer

                switch (opcion) {
                    case 1:
                        System.out.print("Nombre de la Pokeball: ");
                        String nombrePoke = sc.nextLine();
                        System.out.print("Precio: ");
                        double precioPoke = sc.nextDouble();
                        System.out.print("Ratio de captura (ej. 1,5): ");
                        double ratio = sc.nextDouble();

                        inventario.add(new Pokeball(nombrePoke, precioPoke, ratio));
                        System.out.println("¡Pokeball añadida!");
                        break;

                    case 2:
                        System.out.print("Nombre de la Poción: ");
                        String nombrePocion = sc.nextLine();
                        System.out.print("Precio: ");
                        double precioPocion = sc.nextDouble();
                        System.out.print("Cuánto cura: ");
                        int cura = sc.nextInt();

                        inventario.add(new Pocion(nombrePocion, precioPocion, cura));
                        System.out.println("¡Poción añadida!");
                        break;

                    case 3:
                        if (inventario.isEmpty()) {
                            System.out.println("No hay nada que borrar.");
                            break;
                        }
                        System.out.print("Introduce el número del artículo a borrar (0 a " + (inventario.size() - 1) + "): ");

                        // SEGUNDO TRY-CATCH: Evitar error si ponen un índice que no existe
                        try {
                            int indice = sc.nextInt();
                            inventario.remove(indice);
                            System.out.println("Artículo borrado correctamente.");
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("Error: Ese número de artículo no existe en la lista.");
                        }
                        break;

                    case 4:
                        System.out.println("\n--- INVENTARIO ---");
                        for (int i = 0; i < inventario.size(); i++) {
                            System.out.print(i + ". ");
                            inventario.get(i).mostrarDetalles(); // Polimorfismo en acción
                        }
                        break;

                    case 5:
                        double total = 0;
                        for (Articulo a : inventario) {
                            total = total + a.getPrecio();
                        }
                        System.out.println("Coste total del inventario: " + total + "¥");
                        break;

                    case 0:
                        System.out.println("Saliendo de la tienda...");
                        break;

                    default:
                        System.out.println("Opción incorrecta.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Debes introducir un número válido, no letras.");
                sc.nextLine(); // Súper importante: limpiar la basura del scanner para que no se raye el bucle
            }

        } while (opcion != 0);
    }
}