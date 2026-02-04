package Tema5;

import java.util.HashMap;
import java.util.Scanner;

public class ColaBanco {
    public static void main(String[] args) {
        int opcion;
        int posicion = 0;
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, UsuarioBanco> miembro = new HashMap<Integer, UsuarioBanco>();

        do {
            System.out.println("1. Añadir al último a la cola");
            System.out.println("2. Quitar al primero de la cola");
            System.out.println("3. Quitar a alguien de la cola");
            System.out.println("4. Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce el DNI del usuario");
                    String dni = sc.nextLine();
                    System.out.println("Introduce el Nombre del usuario");
                    String nombre = sc.nextLine();
                    System.out.println("Introduce la edad del usuario");
                    int edad = sc.nextInt();
                    UsuarioBanco nuevoUsuario = new UsuarioBanco(dni, nombre, edad);
                    miembro.put(posicion, nuevoUsuario);
                    posicion++;
                    System.out.println("El usuario ha sido añadido a la cola en la posicion " + posicion);
                    break;

                case 2:
                    System.out.println("El primer usuario ha abandonado la cola");
                    miembro.remove(1);
                    posicion--;
                    break;
                case 3:
                    System.out.println("introduce el numero de cola que ha abandonado: ");
                    if (sc.nextInt() <= posicion) {
                    miembro.remove(sc.nextInt());
                        System.out.println("El usuario ha abandonado la cola");
                    }else {
                        System.out.println("No hay ningún miembro en esa cola");
                    }
                    break;

                case 4:
                    System.out.println("Gracias por usar nuestro programa!");
                    break;

                default:
                    System.out.println("ERROR: Opción no valida");
            }
        } while (opcion != 4);
    }
}
