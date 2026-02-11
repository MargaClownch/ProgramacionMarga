package tema5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tema5Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Introduce un número entero: ");
            int num = sc.nextInt();
            System.out.println("Valor introducido: " + num);
        } catch (InputMismatchException e) {
            System.out.println("Valor introducido incorrecto");
            e.printStackTrace();
        }
    }
}