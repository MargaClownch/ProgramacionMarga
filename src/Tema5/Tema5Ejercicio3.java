package tema5;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tema5Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] vector = new double[5];
        int cont = 0;

        System.out.println("Rellena el vector con 5 números:");

        while (cont < 5) {
            try {
                System.out.print("Introduce el valor para la posición " + cont + ": ");
                vector[cont] = sc.nextDouble();
                cont++;
            } catch (InputMismatchException e) {
                System.out.println("Error: Eso no es un número válido. Inténtalo de nuevo.");
                sc.next();
                e.printStackTrace();
            }
        }

        System.out.println("¡Vector rellenado!");
        System.out.println(Arrays.toString(vector));
    }
}