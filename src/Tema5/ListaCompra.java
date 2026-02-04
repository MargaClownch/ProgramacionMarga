package Tema5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ListaCompra {
    public static void main(String[] args) {
        Set<String> compra = new HashSet<String>();
        int opcion;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Añadir objeto a la compra");
            System.out.println("2. Eliminar objeto de la compra");
            System.out.println("3. Mostrar lista de la compra");
            System.out.println("4. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce el objeto de la compra");
                    if (compra.add(sc.nextLine().toLowerCase()) == false) {
                        System.out.println("Error: el producto ya estaba en la lista (Producto duplicado).");
                    } else {
                        System.out.println("El producto ha sido añadido correctamente.");
                    }
                    break;

                case 2:
                    System.out.println("Introduce el objeto que quieras eliminar");
                    compra.remove(sc.nextLine());
                    break;

                case 3:
                    for (String c : compra) {
                        System.out.println(c);
                    }
                    System.out.println("Lista de la compra " + compra.size());
                    break;

                case 4:
                    System.out.println("Gracias por usar el programa!");
                    break;

                default:
                    System.out.println("Error opción no permitida");
            }
        } while (opcion != 4);
    }
}
