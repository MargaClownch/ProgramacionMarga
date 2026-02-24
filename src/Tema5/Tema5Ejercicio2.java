package Tema5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tema5Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Introduce el dividendo (num1): ");
            int num1 = sc.nextInt();
            System.out.print("Introduce el divisor (num2): ");
            int num2 = sc.nextInt();

            int resultado = num1 / num2;
            System.out.println("Resultado: " + resultado);

        } catch (InputMismatchException e) {
            System.out.println("Error: Debes introducir números enteros.");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
            e.printStackTrace();
        }
    }
}