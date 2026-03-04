import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TiendaPokemonTPV {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Articulo> inventario = new ArrayList<>();
    public static int total = 0;

    public static void main(String[] args) {
        int opcion = -1;

        do {
            try {
                showMenu();
                opcion = sc.nextInt();
                sc.nextLine();
                switch (opcion){
                    case 1:
                        addPocion();
                        break;
                    case 2:
                        addPokebola();
                        break;
                    case 3:
                        addAccesorio();
                        break;
                    case 4:
                        borrarArticulo();
                        break;
                    case 5:
                        mostrarTodo();
                        break;
                    case 6:
                        mostrarTotal();
                        break;
                    case 7:
                        System.out.println("!Gracias por usar el programa!");
                        break;
                    default:
                        System.out.println("Número introducido no válido, introduce del 1 al 5");
                        sc.nextLine();
                }
            } catch (InputMismatchException e){
                System.out.println("Error: Introduce solo números");
            }
        } while (opcion!=7);
    }
    public static void showMenu(){
        System.out.println("----GESTOR DE Tienda----");
        System.out.println("1: Añadir poción.");
        System.out.println("2: Añadir pokebola");
        System.out.println("3: Añadir accesorio");
        System.out.println("4: Borrar artículo por posición");
        System.out.println("5: Mostrar todo");
        System.out.println("6: Mostrar precio total");
        System.out.println("7: Salir");
    }
    public static void addPocion(){
        System.out.println("Introduce el nivel de la poción: ");
        int nivel = sc.nextInt();
        inventario.add(new Pocion("Pocion",false,nivel));
    }
    public static void addPokebola(){
        System.out.println("Introduce el tipo de pokebola: (pokeball, great ball, ultra ball");
        String tipo = sc.nextLine().toLowerCase();
        inventario.add(new Pokebola("Pokebola",false,tipo));
    }
    public static void addAccesorio(){
        System.out.println("Introduce el nombre del accesorio:");
        String accesorio = sc.nextLine();
        inventario.add(new Accesorio(accesorio,false,accesorio));
    }
    public static void borrarArticulo(){
        System.out.println("Dí el número del articulo a borrar: ");
        int indice = sc.nextInt();
        inventario.remove(indice);
    }
    public static void mostrarTodo(){
        for (int i=0; i< inventario.size();i++){
            System.out.println(i+ ". " + inventario.get(i).tipoArticulo());
        }
    }
    public static void mostrarTotal(){
        for (Articulo a: inventario){
            total = total + a.precioArticulo();
        }
        System.out.println("Coste total = " + total + "€");
    }
}

