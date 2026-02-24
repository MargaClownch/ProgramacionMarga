package Tema5.Colecciones2;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class AcortadorURL {

    static Scanner sc = new Scanner(System.in);
    static HashMap<String, String> url = new HashMap<>();

    public static void main(String[] args) {
        int opcion = 0;

        do {
            showMenu();
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    crearRegistro();
                    break;
                case 2:
                    resolverDireccion();
                    break;
                case 3:
                    borrarRegistro();
                    break;
                case 4:
                    mostrarRegistros();
                    break;
                case 5:
                    System.out.println("Cerrando acortador...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }
    public static void showMenu(){
        System.out.println("Elige una opción: ");
        System.out.println("1. Crear un nuevo registro (Acortar URL)");
        System.out.println("2. Resolver dirección (Buscar URL)");
        System.out.println("3. Borrar un registro");
        System.out.println("4. Mostrar todos los registros");
        System.out.println("5. Salir");
    }
    public static void crearRegistro() {
        System.out.print("Introduce la URL completa (ej. youtubr.com/HGHGHGHGHGHHGHG): ");
        String urlLarga = sc.nextLine();
        String clave = generarClaveAleatoria();

        url.put(clave, urlLarga);

        System.out.println("URL acortada con éxito.");
        System.out.println("Tu enlace corto es: https://short.es/" + clave);
    }
    public static void resolverDireccion() {
        System.out.print("Introduce la cadena única (ej. FQp7Y): ");
        String clave = sc.nextLine();

        String urlEncontrada = url.get(clave);

        if (urlEncontrada != null) {
            System.out.println("Redirigiendo a: " + urlEncontrada);
        } else {
            System.out.println("Error. No existe ninguna URL asociada a esa cadena.");
        }
    }
    public static void borrarRegistro() {
        System.out.print("Introduce la cadena única de la URL que quieres borrar: ");
        String clave = sc.nextLine();

        if (url.containsKey(clave)) {
            url.remove(clave);
            System.out.println("Registro borrado correctamente.");
        } else {
            System.out.println("No se ha encontrado esa cadena.");
        }
    }
    public static void mostrarRegistros() {
        if (url.isEmpty()) {
            System.out.println("El diccionario está vacío.");
            return;
        }
        System.out.println("LISTA DE URLs");

        for (String clave : url.keySet()) {
            String valor = url.get(clave);
            System.out.println("https://short.es/" + clave + " ---> " + valor);
        }
    }
    public static String generarClaveAleatoria() {
        Random rand = new Random();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String clave = "";

        for (int i = 0; i < 5; i++) {
            int posicionRand = rand.nextInt(caracteres.length());
            clave = clave + caracteres.charAt(posicionRand);
        }
        return clave;
    }

}
