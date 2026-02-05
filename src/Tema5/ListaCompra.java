package Tema5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ListaCompra {
    public static void main(String[] args) {
        Set<String> compra = new HashSet<String>();
        Set<String> carro = new HashSet<String>();
        int opcion;
        Scanner sc = new Scanner(System.in);
        compra.add("macarrones");
        compra.add("pizza");
        compra.add("pimiento");

        do {
            System.out.println("1. Añadir objeto a la lista de la compra");
            System.out.println("2. Eliminar objeto de la lista de la compra");
            System.out.println("3. Mostrar lista de la compra");
            System.out.println("4. Añadir producto al carro");
            System.out.println("5. Mostrar productos faltantes");
            System.out.println("6. Salir");


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
                    for(String a: compra) {
                        System.out.println(a);
                    }


                    break;

                case 2:
                    System.out.println("Introduce el objeto que quieras eliminar");
                    compra.remove(sc.nextLine());
                    for(String a: compra) {
                        System.out.println(a);
                    }
                    break;

                case 3:
                    for (String c : compra) {
                        System.out.println(c);
                    }
                    System.out.println("Lista de la compra " + compra.size());
                    for(String a: compra) {
                        System.out.println(a);
                    }
                    break;

                case 4:
                    System.out.println("Introduce el objeto de la compra");
                    if (carro.add(sc.nextLine().toLowerCase()) == false) {
                        System.out.println("Error: el producto ya estaba en la lista (Producto duplicado).");
                    } else {
                        System.out.println("El producto ha sido añadido correctamente.");
                    }
                    for(String a: compra) {
                        System.out.println(a);
                    }
                    break;

                case 5:
                    Set<String> faltantes = new HashSet<>(compra);
                    faltantes.removeAll(carro);
                    for (String f : faltantes) {
                        System.out.println(f);
                    }
                    break;

                case 6:
                    System.out.println("Gracias por usar el programa!");
                    break;

                default:
                    System.out.println("Error opción no permitida");
            }
        } while (opcion != 6);
    }
}
