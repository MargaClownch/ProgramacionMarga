import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GestorDeLibros {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Libro> libros = new ArrayList<>();
    public static void main(String[] args) {
        int opcion = -1;

        do {
            try {
                showMenu();
                opcion = sc.nextInt();
                sc.nextLine();
                switch (opcion){
                    case 1:
                        introducirLibro();
                        break;
                    case 2:
                        mostrarInfo();
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        System.out.println("!Gracias por usar el programa!");
                        break;
                    default:
                        System.out.println("Número introducido no válido, introduce del 1 al 5");
                        sc.nextLine();
                }
            } catch (InputMismatchException e){
                System.out.println("Error: Introduce solo números");
            }
        } while (opcion!=5);
    }
    public static void showMenu(){
        System.out.println("----GESTOR DE LIBROS----");
        System.out.println("1: Introducir Libro.");
        System.out.println("2: Mostrar información de un libro por ISBN");
        System.out.println("3: Modificar el genero de un libro por ISBN");
        System.out.println("4: Mostrar todos los libros de un autor");
        System.out.println("5: Salir");
    }
    public static void introducirLibro(){
        System.out.println("Introduce el ISBN");
        String isbn = sc.nextLine();
        System.out.println("Introduce el Nombre");
        String nombre = sc.nextLine();
        System.out.println("Introduce el Autor");
        String autor = sc.nextLine();
        libros.add(new Libro(isbn,nombre,autor));
    }

    // Se me ha olvidado completamente cómo se hacían búsquedas :/

    public static void mostrarInfo(){
        System.out.println("Introduce el ISBN del libro que quieras ver");
        String isbn = sc.nextLine();
        for (int i =0; i< libros.size(); i++){
            if (libros.contains(isbn)){
                System.out.println(libros);
            }
        }
    }
    public static void modificarGenero(){
        System.out.println("Introduce el ISBN: ");
        String isbn = sc.nextLine();
        System.out.println("Introduce el nuevo Género: ");
        String genero = sc.nextLine();

    }
}
