package Tema2;

import java.util.Scanner;
public class Tema2Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce 'D' para convertir euros a dólares o 'E' para convertir dólares a euros: ");
        char opcion = sc.next().charAt(0);
        System.out.println("Introduce la cantidad: ");
        double cantidad = sc.nextDouble();
        double resultado;
        double cambio = 1.16;

        if (opcion == 'D' || opcion == 'd') {
            resultado = cantidad * cambio;
            System.out.println(cantidad + " euros son " + resultado + " dólares.");
        } else if (opcion == 'E' || opcion == 'e') {
            resultado = cantidad / cambio;
            System.out.println(cantidad + " dólares son " + resultado + " euros.");
        } else {
            System.out.println("Opción no válida. Debe introducir 'D' o 'E'.");
        }
    }
}