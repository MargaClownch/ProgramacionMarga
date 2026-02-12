package Tema5;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Tema5Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Tamaño aleatorio entre 1 y 100
        int n = rand.nextInt(100) + 1;
        int[] vector = new int[n];

        // Rellenamos con valores aleatorios (1-10)
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rand.nextInt(10) + 1;
        }

        System.out.println("Se ha creado un vector de tamaño " + n);

        int posicion = 0;

        // Bucle hasta que ponga negativo
        do {
            try {
                System.out.print("Qué posición quieres ver? (Negativo para salir): ");
                posicion = sc.nextInt();

                if (posicion >= 0) {
                    System.out.println("Valor en la posición " + posicion + ": " + vector[posicion]);
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Introduce un número entero.");
                sc.next();
                e.printStackTrace();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Esa posición no existe en el vector (Tamaño actual: " + n + ").");
                e.printStackTrace();
            }

        } while (posicion >= 0);

        System.out.println("Gracias por usar mi programa!!!");
    }
}