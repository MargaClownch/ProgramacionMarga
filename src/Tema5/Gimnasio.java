package Tema5;
import java.util.HashMap;
import java.util.Scanner;

public class Gimnasio {
    public static void main(String[] args) {
        HashMap<String, Usuario> miembro = new HashMap<String, Usuario>();
        int opcion;
        String dni;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1. Dar de alta un Usuario");
            System.out.println("2. Dar de baja un Usuario");
            System.out.println("3. Mostrar datos de un usuario");
            System.out.println("4. Modificar datos de un usuario");
            System.out.println("5. Salir del programa");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce en DNI del usuario");
                    dni  = sc.nextLine();
                    System.out.println("Introduce el Nombre del usuario");
                    String nombre = sc.nextLine();
                    System.out.println("Introduce la edad del usuario");
                    int edad = sc.nextInt();
                    Usuario nuevoUsuario = new Usuario(nombre, edad);
                    miembro.put(dni, nuevoUsuario);
                    System.out.println("Datos de usuario guardados correctamente");
                    break;

                case 2:
                    System.out.println("Introduce el DNI del usuario que quieres eliminar");
                    dni = sc.nextLine();
                    miembro.remove(dni);
                    System.out.println("Datos de usuario eliminados correctamente");
                    break;

                case 3:
                    System.out.println("Introduce el DNI del usuario que quieres mostrar");
                    dni = sc.nextLine();
                    if(miembro.containsKey(dni)){
                        System.out.println(miembro.get(dni));
                    } else{
                        System.out.println("No existe el usuario que quieres mostrar");
                    }
                    break;

                case 4:
                    System.out.println("Introduce en DNI del usuario que quieres cambiar");
                    dni  = sc.nextLine();
                    System.out.println("Introduce el Nombre del usuario");
                    nombre = sc.nextLine();
                    System.out.println("Introduce la edad del usuario");
                    edad = sc.nextInt();
                    nuevoUsuario = new Usuario(nombre, edad);
                    miembro.put(dni, nuevoUsuario);
                    System.out.println("Datos de usuario cambiados correctamente");
                    break;

                case 5:
                    System.out.println("Muchas gracias por usar nuestro programa!");
                    break;

                default:
                    System.out.println("ERROR: Opcion no valida.");
            }
        } while (opcion != 5);
















    }
}
